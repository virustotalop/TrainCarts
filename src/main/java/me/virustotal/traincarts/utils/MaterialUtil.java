package me.virustotal.traincarts.utils;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class MaterialUtil {
	
	public static boolean isRail(Block block)
	{
		Material mat = block.getType();
		return mat == Material.RAILS || mat == Material.POWERED_RAIL;
	}

	public static int getTypeId(Material blockType) {
		// TODO Auto-generated method stub
		return 0;
	}

}
