package io.github.rastacode.wilandcraft.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WilandCraftCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
	        
		if (split.length < 1) {
			sender.sendMessage("No ingresaste ningun argumento!");
			return false;
		}
	        
		if(split[0].equalsIgnoreCase("reload")) {
			if (!sender.hasPermission("wld.reload")) return false;
			Bukkit.getServer().setWhitelist(true);
			for (Player player : Bukkit.getServer().getOnlinePlayers()) {
				if (!player.isOp() && !player.isWhitelisted()) {
	            	player.sendMessage(ChatColor.DARK_RED + "ATENCION! " + ChatColor.GRAY + "El servidor se esta recargando. Vuelve a ingresar en breve.");
	            	Bukkit.getServer().dispatchCommand(player.getServer().getConsoleSender(), "gate tpto GoServerLobby");
	            }
	        }
			Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "reload");
	        return true;
        }
		
		if(split[0].equalsIgnoreCase("restart")){
			if (!sender.hasPermission("wld.restart")) return false;
			Bukkit.getServer().setWhitelist(true);
			for (Player player : Bukkit.getServer().getOnlinePlayers()) {
				if (!player.isOp() && !player.isWhitelisted()) {
	            	player.sendMessage(ChatColor.DARK_RED + "ATENCION! " + ChatColor.GRAY + "El servidor se esta reiniciando. Vuelve a ingresar en breve.");
	            	Bukkit.getServer().dispatchCommand(player.getServer().getConsoleSender(), "gate tpto GoServerLobby");
	            }
	        }
			Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "restart");
			return true;
		}
 
        return false;
	}
}
