package twisb.enchanting.mixin;

import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.ForgingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(AnvilScreenHandler.class)
public abstract class AnvilScreenHandlerMixin extends ForgingScreenHandler {

    public AnvilScreenHandlerMixin(@Nullable ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(type, syncId, playerInventory, context);
    }

    @ModifyArgs(
            method="updateResult",
            at=@At(value="INVOKE", target="Lnet/minecraft/item/ItemStack;set(Lnet/minecraft/component/ComponentType;Ljava/lang/Object;)Ljava/lang/Object;")
    )
    private void modifyRepairCost(Args args) {
        ComponentType componentType = args.get(0);
        if (componentType.equals(DataComponentTypes.REPAIR_COST)) {
            int cost = (Integer) args.get(1);
            ItemStack item1 = this.input.getStack(0);
            ItemStack item2 = this.input.getStack(1);
            if (item1.isDamageable() && item1.getItem().canRepair(item1, item2)) {
                cost = ((int) Math.max(0, (cost-1) / 2));
            }
            args.set(1, cost);
        }
    }
}
