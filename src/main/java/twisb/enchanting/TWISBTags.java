package twisb.enchanting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TWISBTags {
    public static final TagKey<Item> CATALYSTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("twisb-enchanting", "catalysts"));
    public static final TagKey<Enchantment> CATALYST_ABYSSAL = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_abyssal"));
    public static final TagKey<Enchantment> CATALYST_DIVINE = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_divine"));
    public static final TagKey<Enchantment> CATALYST_ENHANCING = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_enhancing"));
    public static final TagKey<Enchantment> CATALYST_EXPLOSIVE = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_explosive"));
    public static final TagKey<Enchantment> CATALYST_PLENTIFUL = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_plentiful"));
    public static final TagKey<Enchantment> CATALYST_PRESERVING = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_preserving"));
    public static final TagKey<Enchantment> CATALYST_SMOLDERING = TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("twisb-enchanting", "catalyst_smoldering"));

}
