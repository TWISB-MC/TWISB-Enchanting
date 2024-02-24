package twisb.enchanting;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TWISBTags {
    public static final TagKey<Item> CATALYSTS = TagKey.of(RegistryKeys.ITEM, new Identifier("twisb-enchanting", "catalysts"));
}
