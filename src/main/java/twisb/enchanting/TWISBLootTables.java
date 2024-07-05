package twisb.enchanting;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class TWISBLootTables {

    private static final Identifier JUNGLE_TEMPLE_LOOT = Identifier.of("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_FORTRESS_LOOT = Identifier.of("minecraft", "chests/nether_bridge");
    private static final Identifier DESERT_PYRAMID_LOOT = Identifier.of("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_LOOT = Identifier.of("minecraft", "chests/end_city_treasure");
    private static final Identifier ANCIENT_CITY_LOOT = Identifier.of("minecraft", "chests/ancient_city");
    private static final Identifier SUS_SAND_WARM_LOOT = Identifier.of("minecraft", "archaeology/ocean_ruin_warm");
    private static final Identifier SUS_SAND_COLD_LOOT = Identifier.of("minecraft", "archaeology/ocean_ruin_cold");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {

            if (source.isBuiltin() && LootTables.JUNGLE_TEMPLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f))
                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_PLENTIFUL));
                tableBuilder.pool(poolBuilder);
            } else if (source.isBuiltin() && LootTables.NETHER_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_SMOLDERING));
                tableBuilder.pool(poolBuilder);
            } else if (source.isBuiltin() && LootTables.DESERT_PYRAMID_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // x4
                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_EXPLOSIVE));
                tableBuilder.pool(poolBuilder);
            } else if (source.isBuiltin() && LootTables.END_CITY_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_PRESERVING));
                tableBuilder.pool(poolBuilder);
            } else if (source.isBuiltin() && LootTables.ANCIENT_CITY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_ENHANCING));
                tableBuilder.pool(poolBuilder);
            }
        });
        // 1.20.4 version
//        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
//            if (source.isBuiltin() && JUNGLE_TEMPLE_LOOT.equals(id)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.4f))
//                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_PLENTIFUL));
//                tableBuilder.pool(poolBuilder);
//            } else if (source.isBuiltin() && NETHER_FORTRESS_LOOT.equals(id)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.1f))
//                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_SMOLDERING));
//                tableBuilder.pool(poolBuilder);
//            } else if (source.isBuiltin() && DESERT_PYRAMID_LOOT.equals(id)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // x4
//                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_EXPLOSIVE));
//                tableBuilder.pool(poolBuilder);
//            } else if (source.isBuiltin() && END_CITY_LOOT.equals(id)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.1f))
//                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_PRESERVING));
//                tableBuilder.pool(poolBuilder);
//            } else if (source.isBuiltin() && ANCIENT_CITY_LOOT.equals(id)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.2f))
//                        .with(ItemEntry.builder(TWISBenchanting.CATALYST_ENHANCING));
//                tableBuilder.pool(poolBuilder);
//            }
//        });

// Older version, wasn't working even in 1.20.4 so I overwrote at datapack level
//        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
//            if (source.isBuiltin() && SUS_SAND_WARM_LOOT.equals(id)) {
//                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
//                entries.add(ItemEntry.builder(TWISBenchanting.CATALYST_ABYSSAL).build());
//                entries.add(ItemEntry.builder(TWISBenchanting.CATALYST_ABYSSAL).build());
//
//                LootPool.Builder pool = LootPool.builder().with(entries);
//                return LootTable.builder().pool(pool).build();
//            } else if (source.isBuiltin() && SUS_SAND_COLD_LOOT.equals(id)) {
//                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
//                entries.add(ItemEntry.builder(TWISBenchanting.CATALYST_ABYSSAL).build());
//                entries.add(ItemEntry.builder(TWISBenchanting.CATALYST_ABYSSAL).build());
//
//                LootPool.Builder pool = LootPool.builder().with(entries);
//                return LootTable.builder().pool(pool).build();
//            }
//            return null;
//        });
    }
}
