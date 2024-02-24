package twisb.enchanting.mixin;

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

@Mixin(AnvilScreenHandler.class)
public abstract class AnvilScreenHandlerMixin extends ForgingScreenHandler {

    public AnvilScreenHandlerMixin(@Nullable ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(type, syncId, playerInventory, context);
    }

    @ModifyArg(
            method="updateResult",
            at=@At(value="INVOKE", target="Lnet/minecraft/item/ItemStack;setRepairCost(I)V")
    )
    private int modifyRepairCost(int t) {
        ItemStack item1 = this.input.getStack(0);
        ItemStack item2 = this.input.getStack(1);
        if (item1.isDamageable() && item1.getItem().canRepair(item1, item2)) {
            return ((int) Math.max(0, (t-1) / 2));
        }
        return t;
    }
}
