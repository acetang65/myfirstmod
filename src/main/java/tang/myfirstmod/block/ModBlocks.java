package tang.myfirstmod.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import tang.myfirstmod.MyFirstMod;

import java.util.function.Function;

public class ModBlocks {
    public static final Block test_block = register("test_block",
            Block::new,
            BlockBehaviour.Properties.of().strength(3.0f, 6.0f).sound(SoundType.STONE));
    public static final Block test_item_ore = register("test_item_ore",
            Block::new,
            BlockBehaviour.Properties.of().strength(3.0f, 6.0f).sound(SoundType.STONE));


    /**
     * 注册方块，同时自动注册对应的方块物品（BlockItem）。
     * name 只写方块名（小写，如 "test_block"），会自动拼上 mod id。
     */
    private static Block register(String name,
                                  Function<BlockBehaviour.Properties, Block> blockFactory,
                                  BlockBehaviour.Properties properties) {
        Identifier id = MyFirstMod.id(name);

        // 注册方块本体
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        Block block = blockFactory.apply(properties.setId(blockKey));
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);

        // 注册方块物品（BlockItem 本质是 Item）
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);

        return block;
    }

    public static void initialize() {
    }
}
