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
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "money_sgc0001"), MONEY_SGC0001);
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "money_sgc0004"), MONEY_SGC0004);
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "money_sgc0016"), MONEY_SGC0016);
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "money_sgc0064"), MONEY_SGC0064);
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "money_sgc0256"), MONEY_SGC0256);
        Registry.register(Registry.ITEM, new Identifier("stonegrains", "money_sgc1024"), MONEY_SGC1024);
    }



    public static final Item STONE_GRAIN = new ItemStoneGrain(new Item.Settings().maxCount(64));
    public static final Item MONEY_SGC0001 = new ItemMoneySGC(new Item.Settings().maxCount(64));
    public static final Item MONEY_SGC0004 = new ItemMoneySGC(new Item.Settings().maxCount(64));
    public static final Item MONEY_SGC0016 = new ItemMoneySGC(new Item.Settings().maxCount(64));
    public static final Item MONEY_SGC0064 = new ItemMoneySGC(new Item.Settings().maxCount(64));
    public static final Item MONEY_SGC0256 = new ItemMoneySGC(new Item.Settings().maxCount(64));
    public static final Item MONEY_SGC1024 = new ItemMoneySGC(new Item.Settings().maxCount(64));



    public static final ItemGroup STONE_GRAINS_GROUP = FabricItemGroupBuilder
            .create(new Identifier("stonegrains", "stonegrains"))
            .icon(() -> new ItemStack(STONE_GRAIN))
            .appendItems(stacks ->
                    {
                        stacks.add(new ItemStack(STONE_GRAIN));
                        stacks.add(new ItemStack(MONEY_SGC0001));
                        stacks.add(new ItemStack(MONEY_SGC0004));
                        stacks.add(new ItemStack(MONEY_SGC0016));
                        stacks.add(new ItemStack(MONEY_SGC0064));
                        stacks.add(new ItemStack(MONEY_SGC0256));
                        stacks.add(new ItemStack(MONEY_SGC1024));
                    }
            )
            .build();

}
