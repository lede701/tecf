
package net.mcreator.tecf.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.tecf.Tecf15ModElements;

@Tecf15ModElements.ModElement.Tag
public class DEToolaShovelHeadItemItem extends Tecf15ModElements.ModElement {
	@ObjectHolder("tecf15:de_toola_shovel_head_item")
	public static final Item block = null;
	public DEToolaShovelHeadItemItem(Tecf15ModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(1));
			setRegistryName("de_toola_shovel_head_item");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
