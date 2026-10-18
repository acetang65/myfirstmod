package tang.myfirstmod.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import tang.myfirstmod.MyFirstMod;
import tang.myfirstmod.block.ModBlocks;

public class ModItemGroups {

    public static final ResourceKey<CreativeModeTab> TEST_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), MyFirstMod.id("test_tab")
    );

    public static final CreativeModeTab TEST_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.test_block))
            .title(Component.translatable("creativeTab.myfirstmod.test_tab"))
            .displayItems((params, output) -> {
                output.accept(ModItems.test_item);
                output.accept(ModBlocks.test_block);
                output.accept(ModItems.test_item_ingot);
                output.accept(ModBlocks.test_item_ore);
            })
            .build();

    public static void registerModItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TEST_TAB_KEY, TEST_TAB);
        MyFirstMod.LOGGER.info("Register Item Groups");
    }
}
