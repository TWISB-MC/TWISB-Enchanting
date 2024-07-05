package twisb.enchanting;

import com.google.common.collect.Lists;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Util;
import net.minecraft.util.collection.Weighting;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class BetterEnchantmentHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger("twisb-enchanting");

    public static List<EnchantmentLevelEntry> generateEnchantments(Random random, ItemStack stack, int level, ItemStack catalyst, Stream<RegistryEntry<Enchantment>> possibleEnchantments) {
        ArrayList<EnchantmentLevelEntry> list = Lists.newArrayList();
        Item item = stack.getItem();
        int i = item.getEnchantability();
        if (i <= 0) {
            return list;
        }
        level += 1 + random.nextInt(i / 4 + 1) + random.nextInt(i / 4 + 1);
        float f = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f;
        List<EnchantmentLevelEntry> list2 = EnchantmentHelper.getPossibleEntries(level = MathHelper.clamp(Math.round((float)level + (float)level * f), 1, Integer.MAX_VALUE), stack, possibleEnchantments);
        if (!list2.isEmpty()) {
            if (!catalyst.isEmpty()) {
                List<EnchantmentLevelEntry> filteredEntries = forceCatalyst(new ArrayList<>(list2), catalyst);
                if (filteredEntries.size() > 0) {
                    Weighting.getRandom(random, filteredEntries).ifPresent(list::add);
                } else {
                    Weighting.getRandom(random, list2).ifPresent(list::add);
                }
            } else {
                Weighting.getRandom(random, list2).ifPresent(list::add);
            }
            while (random.nextInt(50) <= level) {
                if (!list.isEmpty()) {
                    EnchantmentHelper.removeConflicts(list2, Util.getLast(list));
                }
                if (list2.isEmpty()) break;
                Weighting.getRandom(random, list2).ifPresent(list::add);
                level /= 2;
            }
        }
        return list;
    }

    public static List<EnchantmentLevelEntry> forceCatalyst(List<EnchantmentLevelEntry> in, ItemStack catalyst) {
        Iterator<EnchantmentLevelEntry> iter = in.iterator();
        while(iter.hasNext()) {
            EnchantmentLevelEntry entry = iter.next();
//            LOGGER.info(entry.enchantment.getKey().get().toString());
//            LOGGER.info(Catalysts.MAPPINGS.get(catalyst.getItem()).toString());
            if(!Catalysts.MAPPINGS.get(catalyst.getItem()).contains(entry.enchantment.getKey().get())) {
                iter.remove();
            }
        }
        return in;
    }
}
