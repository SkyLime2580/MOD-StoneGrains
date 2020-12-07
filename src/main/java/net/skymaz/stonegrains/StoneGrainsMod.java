package net.skymaz.stonegrains;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StoneGrainsMod implements ModInitializer
{
    @Override

    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "stone_grain"), STONE_GRAIN);
    }

    public static final Item STONE_GRAIN = new Item(new Item.Settings().maxCount(64));

    public static final ItemGroup STONE_GRAINS_GROUP = FabricItemGroupBuilder
            .create(new Identifier("stonegrains", "stonegrains"))
            .icon(() -> new ItemStack(STONE_GRAIN))
            .appendItems(stacks ->
                    {
                        stacks.add(new ItemStack(STONE_GRAIN));
                    }
            )
            .build();

}
