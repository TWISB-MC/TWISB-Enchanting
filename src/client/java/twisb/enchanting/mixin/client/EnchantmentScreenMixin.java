package twisb.enchanting.mixin.client;

import net.minecraft.client.gui.screen.ingame.EnchantmentScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.EnchantmentScreenHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EnchantmentScreen.class)
public abstract class EnchantmentScreenMixin extends HandledScreen<EnchantmentScreenHandler> {

    public int NEW_X = 66;
//    protected int backgroundWidth = 182;

    public EnchantmentScreenMixin(EnchantmentScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);

    }

    @ModifyConstant(
            method = "drawBackground",
            constant = @Constant(intValue = 60)
    )
    private int shiftBackground(int x) {
        return NEW_X;
    }

    @ModifyArg(
            method = "drawBackground",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/DrawContext;drawTexture(Lnet/minecraft/util/Identifier;IIIIII)V"),
            index = 5
    )
    private int expandBackground(int x) { return 182; }

    @ModifyArg(
            method = "drawBackground",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/screen/ingame/EnchantmentScreen;drawBook(Lnet/minecraft/client/gui/DrawContext;IIF)V"),
            index = 1
    )
    private int shiftBook(int x) { return x+1; }

    @ModifyConstant(
            method = "render",
            constant = @Constant(intValue = 60, ordinal=0)
    )
    private int shiftMouseover(int x) {
        return NEW_X;
    }

    @ModifyConstant(
            method = "mouseClicked",
            constant = @Constant(intValue = 60, ordinal=0)
    )
    private int shiftMouseclick(int x) {
        return NEW_X;
    }
}
