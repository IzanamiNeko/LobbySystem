package aut.izanamineko.lobbysystem.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import aut.izanamineko.lobbysystem.main;

public class CustomHelp implements CommandExecutor {
	  static main plugin;
	  
	  public CustomHelp(main instance) {
	    plugin = instance;
	  }
	  
	  
	  
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    Player p = (Player)sender;    	
	    	if (!(sender instanceof Player)) {
	            System.out.println("[System] The Command is only usable as a Player!");
	            return true;
	        }
	    	if(cmd.getName().equalsIgnoreCase("lobbysystem")) {
	    		if(!sender.hasPermission("LobbySystem.Help")) {
	    			if(!sender.hasPermission("LobbySystem.Reload")) {
	    			sender.sendMessage(this.plugin.getConfig().getString("Config.CustomHelp.NoPermissions".replace("&", "§")));
	    			return true;
	    		}
	    		}
	    if(args.length == 0) {	    	
	    p.sendMessage("§6<====================Lobbysystem====================>");
	    p.sendMessage("§9ChatClear: Used to Clear the Chat > §a/chatclear       ");
	    p.sendMessage("§9SetSpawn: Used to set the Spawnpoint > §a/setspawn     ");
	    p.sendMessage("§9Spawn: Used to get to the Spawnpoint Location > §a/spawn");
	    p.sendMessage("§9TeamChat: If you write §a'!Hello there' §9it will be send");
	    p.sendMessage("§9to the Team Chat                                     ");
	    p.sendMessage("§9Player Information: Used to get the Information Data ");
	    p.sendMessage("§9from a Player > §a/lobbysystem info <player>           ");
	    p.sendMessage("§6<====================Lobbysystem====================>");
	    return true;
	    }
	    if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            reloadConfig();
        	String msg = this.plugin.getConfig().getString("Config.Reload.Success").replace("&", "§");
            sender.sendMessage(msg);
            return true;
        }
        return false;
	    }
   	return false;
}
	private void reloadConfig() {            	           	
		this.plugin.reloadConfig();
		this.plugin.saveConfig();
	}
}