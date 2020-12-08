package net.skymaz.stonegrains;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class ItemStoneGrain extends net.minecraft.item.Item
{
    public ItemStoneGrain(Settings settings)
    {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context)
    {
        tooltip.add(new TranslatableText("tooltip.stonegrains.stone_grain"));
    }
}
