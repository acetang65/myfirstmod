package tang.myfirstmod.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import tang.myfirstmod.MyFirstMod;

import java.util.function.Function;

public class ModItems {

    public static final Item test_item = registerItem("test_item", Item::new);
    public static final Item test_item_ingot = registerItem("test_item_ingot", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> factory) {
        Identifier id = Identifier.fromNamespaceAndPath(MyFirstMod.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item item = factory.apply(new Item.Properties().setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void registerModItems() {
        MyFirstMod.LOGGER.info("Register Items");
    }
}
