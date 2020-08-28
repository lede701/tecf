
package net.mcreator.tecf.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.tecf.Tecf15ModElements;

@Tecf15ModElements.ModElement.Tag
public class EmeraldAxeToolItem extends Tecf15ModElements.ModElement {
	@ObjectHolder("tecf15:emerald_axe_tool")
	public static final Item block = null;
	public EmeraldAxeToolItem(Tecf15ModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -1.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("emerald_axe_tool"));
	}
}