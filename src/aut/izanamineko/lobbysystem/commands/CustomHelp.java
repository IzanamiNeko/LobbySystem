package aut.izanamineko.lobbysystem.commands;

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
	    p.sendMessage("");
	    p.sendMessage("");
	    p.sendMessage("Reporte einen Bug und hilf uns!");
	    p.sendMessage("Reporte einen Bug und hilf uns!");
	    p.sendMessage("");
	    p.sendMessage("");
	    p.sendMessage("");
	    p.sendMessage("");
	    p.sendMessage("");
	    p.sendMessage("");
	    p.sendMessage("");
	    return true;
	  }
	}