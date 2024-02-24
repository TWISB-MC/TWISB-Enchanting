package twisb.enchanting;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class TWISBenchantingDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
//		FabricDataGenerator.Pack pack = generator.createPack();
//
//		pack.addProvider(MyTagGenerator::new);
	}

//	private static class MyTagGenerator extends FabricTagProvider.ItemTagProvider {

//		private static final TagKey<Item> CATALYSTS = TagKey.of(RegistryKeys.ITEM, new Identifier("twisb-enchanting:catalysts"));
//
//		public MyTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
//			super(output, completableFuture);
//		}
//
//		@Override
//		protected void configure(RegistryWrapper.WrapperLookup arg) {
//			getOrCreateTagBuilder(CATALYSTS)
//					.add(TWISBenchanting.CATALYST_PLENTIFUL)
//					.add(TWISBenchanting.CATALYST_SMOLDERING)
//					.add(TWISBenchanting.CATALYST_ABYSSAL)
//					.add(TWISBenchanting.CATALYST_EXPLOSIVE)
//					.add(TWISBenchanting.CATALYST_DIVINE)
//					.add(TWISBenchanting.CATALYST_PRESERVING)
//					.add(TWISBenchanting.CATALYST_ENHANCING)
//					.add(TWISBenchanting.CATALYST_STINGING)
//					.add(TWISBenchanting.CATALYST_DEFLECTING)
//					.add(TWISBenchanting.CATALYST_WEIGHTLESS)
//					.add(TWISBenchanting.CATALYST_RAPID)
//					.add(TWISBenchanting.CATALYST_SLICING)
//					.add(TWISBenchanting.CATALYST_STURDY);
//		}
//	}
}
