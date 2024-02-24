package twisb.enchanting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Catalysts {

    public static final HashMap<Item, List<Enchantment>> MAPPINGS = new HashMap<>() {
        {
            put(TWISBenchanting.CATALYST_PLENTIFUL, Arrays.asList(
                    Enchantments.FORTUNE,
                    Enchantments.LOOTING,
                    Enchantments.MULTISHOT,
                    Enchantments.LUCK_OF_THE_SEA));
            put(TWISBenchanting.CATALYST_SMOLDERING, Arrays.asList(
                    Enchantments.FIRE_ASPECT,
                    Enchantments.FIRE_PROTECTION,
                    Enchantments.FLAME));
            put(TWISBenchanting.CATALYST_ABYSSAL, Arrays.asList(
                    Enchantments.AQUA_AFFINITY,
                    Enchantments.DEPTH_STRIDER,
                    Enchantments.IMPALING,
                    Enchantments.RIPTIDE,
                    Enchantments.RESPIRATION,
                    Enchantments.LURE));
            put(TWISBenchanting.CATALYST_EXPLOSIVE, Arrays.asList(
                    Enchantments.KNOCKBACK,
                    Enchantments.PUNCH,
                    Enchantments.BLAST_PROTECTION));
            put(TWISBenchanting.CATALYST_DIVINE, Arrays.asList(
                    Enchantments.CHANNELING,
                    Enchantments.SMITE));
            put(TWISBenchanting.CATALYST_PRESERVING, Arrays.asList(
                    Enchantments.INFINITY,
                    Enchantments.LOYALTY,
                    Enchantments.SILK_TOUCH));
            put(TWISBenchanting.CATALYST_ENHANCING, Arrays.asList(
                    Enchantments.EFFICIENCY,
                    Enchantments.POWER,
                    Enchantments.SHARPNESS,
                    Enchantments.PROTECTION));
//            put(TWISBenchanting.CATALYST_STINGING, Arrays.asList(
//                    Enchantments.PIERCING,
//                    Enchantments.THORNS));
//            put(TWISBenchanting.CATALYST_DEFLECTING, Arrays.asList(
//                    Enchantments.PROJECTILE_PROTECTION));
//            put(TWISBenchanting.CATALYST_WEIGHTLESS, Arrays.asList(
//                    Enchantments.FEATHER_FALLING));
//            put(TWISBenchanting.CATALYST_RAPID, Arrays.asList(
//                    Enchantments.QUICK_CHARGE));
//            put(TWISBenchanting.CATALYST_SLICING, Arrays.asList(
//                    Enchantments.SWEEPING));
//            put(TWISBenchanting.CATALYST_STURDY, Arrays.asList(
//                    Enchantments.UNBREAKING));
        }
    };
}
