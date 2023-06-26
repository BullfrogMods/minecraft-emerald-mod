
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.emeraldarmortools.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EmeraldArmorToolsModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_ARMOR_HELMET.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_ARMOR_CHESTPLATE.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_ARMOR_LEGGINGS.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_ARMOR_BOOTS.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_SWORD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_PICKAXE.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_SHOVEL.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_AXE.get());
			tabData.accept(EmeraldArmorToolsModItems.EMERALD_HOE.get());
		}
	}
}
