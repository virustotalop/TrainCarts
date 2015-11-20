package me.virustotal.traincarts.utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.material.Directional;
import org.bukkit.material.Rails;

public class BlockUtil {
	
	public static BlockFace getFacing(Block directional)
	{
			Directional data = Directional.class.cast(directional.getType().getData());
	        return data == null ? BlockFace.NORTH : data.getFacing();
	}

	public static void setLeversAroundBlock(Block block, boolean down) 
	{
		// TODO Auto-generated method stub	
	}

	public static Sign getSign(Block signblock) 
	{
		return (Sign) signblock.getState();
	}
	
	public static boolean isSign(Block block)
	{
		return block.getType() == Material.SIGN_POST || block.getType() == Material.SIGN;
	}

	public static boolean equals(Block b1, Block b2) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public static int getManhattanDistance(Block startBlock, Block destination,
			boolean b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Rails getRails(Block current) {
		// TODO Auto-generated method stub
		return null;
	}
}
