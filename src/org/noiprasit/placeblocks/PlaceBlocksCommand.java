package org.noiprasit.placeblocks;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlaceBlocksCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String sAlias,
			String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("This command can only be run by a player.");
			return false;
		} 
		
		Player player = (Player) sender;
		Location loc = player.getLocation();
		PlaceSomeBlocks(loc);
		return true;
	}
	
	private void PlaceSomeBlocks(Location loc) {
		Block block = loc.getBlock();
		// Your first task is to place a block of sandstone.
		block.setType(Material.SANDSTONE);
		// Second task:
		// Place 10 blocks of sandstones using absolute referencing method
		// Uncomment the following section and study it.
		/*
		for(int i=0;i!=10;++i) {
			block.getRelative(i, 0, 0).setType(Material.SANDSTONE);
		}
		*/
		// Third task:
		// Modify and experiment on place different types of blocks with absolute positioning x,y,z
 	}

}
