package twisb.enchanting;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TWISBenchanting implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("twisb-enchanting");

	// Catalysts
	public static final Item CATALYST_PLENTIFUL = new Item(new FabricItemSettings().rarity(Rarity.RARE));
	public static final Item CATALYST_SMOLDERING = new Item(new FabricItemSettings().rarity(Rarity.RARE));
	public static final Item CATALYST_ABYSSAL = new Item(new FabricItemSettings().rarity(Rarity.RARE));
	public static final Item CATALYST_EXPLOSIVE = new Item(new FabricItemSettings().rarity(Rarity.RARE));
	public static final Item CATALYST_DIVINE = new Item(new FabricItemSettings().rarity(Rarity.RARE));
	public static final Item CATALYST_PRESERVING = new Item(new FabricItemSettings().rarity(Rarity.RARE));
	public static final Item CATALYST_ENHANCING = new Item(new FabricItemSettings().rarity(Rarity.RARE));
//	public static final Item CATALYST_STINGING = new Item(new FabricItemSettings().rarity(Rarity.RARE));
//	public static final Item CATALYST_DEFLECTING = new Item(new FabricItemSettings().rarity(Rarity.RARE));
//	public static final Item CATALYST_WEIGHTLESS = new Item(new FabricItemSettings().rarity(Rarity.RARE));
//	public static final Item CATALYST_RAPID = new Item(new FabricItemSettings().rarity(Rarity.RARE));
//	public static final Item CATALYST_SLICING = new Item(new FabricItemSettings().rarity(Rarity.RARE));
//	public static final Item CATALYST_STURDY = new Item(new FabricItemSettings().rarity(Rarity.RARE));

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing");
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "plentiful_catalyst"), CATALYST_PLENTIFUL);
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "smoldering_catalyst"), CATALYST_SMOLDERING);
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "abyssal_catalyst"), CATALYST_ABYSSAL);
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "explosive_catalyst"), CATALYST_EXPLOSIVE);
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "divine_catalyst"), CATALYST_DIVINE);
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "preserving_catalyst"), CATALYST_PRESERVING);
		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "enhancing_catalyst"), CATALYST_ENHANCING);
//		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "stinging_catalyst"), CATALYST_STINGING);
//		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "deflecting_catalyst"), CATALYST_DEFLECTING);
//		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "weightless_catalyst"), CATALYST_WEIGHTLESS);
//		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "rapid_catalyst"), CATALYST_RAPID);
//		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "slicing_catalyst"), CATALYST_SLICING);
//		Registry.register(Registries.ITEM, new Identifier("twisb-enchanting", "sturdy_catalyst"), CATALYST_STURDY);
		// Group registrations
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_PLENTIFUL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_SMOLDERING);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_ABYSSAL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_EXPLOSIVE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_DIVINE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_PRESERVING);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_ENHANCING);});
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_STINGING);});
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_DEFLECTING);});
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_WEIGHTLESS);});
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_RAPID);});
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_SLICING);});
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(CATALYST_STURDY);});

		TWISBLootTables.modifyLootTables();
	}
}