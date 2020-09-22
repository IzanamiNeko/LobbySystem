package aut.izanamineko.lobbysystem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import aut.izanamineko.lobbysystem.main;

public class PlayerInformation implements CommandExecutor {
	
	static main plugin;
	  
	  public PlayerInformation(main instance) {
	    plugin = instance;
	  }
	  
	
	  public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
	    if (!(sender instanceof Player)) {
	      sender.sendMessage((this.plugin.getConfig().getString("Config.PlayerInfo.Console").replaceAll("<player>", sender.getName()).replace("&", "§")));
	      return true;
	    } 
	    Player player = (Player)sender;
	    if (cmd.getName().equals("playerinfo")) {
	      if (!sender.hasPermission("LobbySystem.PlayerInfo")) {
	        sender.sendMessage((this.plugin.getConfig().getString("Config.General.NoPerm").replaceAll("%player%", sender.getName()).replace("&", "§")));
	        return true;
	      } 
	      if (args.length == 0) {
	    	sender.sendMessage((this.plugin.getConfig().getString("Config.PlayerInfo.Line1").replaceAll("%player%", sender.getName()).replace("&", "§")));
	        
	        sender.sendMessage(String.valueOf((this.plugin.getConfig().getString("Config.PlayerInfo.PlayerName").replaceAll("<player>", sender.getName()).replace("&", "§")) + player.getName()));
	        sender.sendMessage(String.valueOf((this.plugin.getConfig().getString("Config.PlayerInfo.PlayerUUID").replaceAll("<player>", sender.getName()).replace("&", "§")) + player.getUniqueId()));
	        sender.sendMessage(String.valueOf((this.plugin.getConfig().getString("Config.PlayerInfo.PlayerIP").replaceAll("<player>", sender.getName()).replace("&", "§")) + player.getAddress()));
	        sender.sendMessage(String.valueOf((this.plugin.getConfig().getString("Config.PlayerInfo.PlayerIsOp").replaceAll("<player>", sender.getName()).replace("&", "§")) + player.isOp()));
	        sender.sendMessage(String.valueOf((this.plugin.getConfig().getString("Config.PlayerInfo.PlayerDisplayName").replaceAll("<player>", sender.getName()).replace("&", "§")) + player.getDisplayName()));
	        sender.sendMessage(String.valueOf((this.plugin.getConfig().getString("Config.PlayerInfo.PlayerIsFlying").replaceAll("<player>", sender.getName()).replace("&", "§")) + player.isFlying()));
	        sender.sendMessage((this.plugin.getConfig().getString("Config.PlayerInfo.Line2").replaceAll("%player%", sender.getName()).replace("&", "§")));
	        return true;
	      } 
	    } 
	    return false;
	  }
	}