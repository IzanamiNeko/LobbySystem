package aut.izanamineko.lobbysystem.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import aut.izanamineko.lobbysystem.main;

public class AntiPlugin implements Listener {
	
	static main plugin;
	  
	  public AntiPlugin(main instance) {
	    plugin = instance;
	  }

	  
	  
	  @EventHandler
	  public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
		if (this.plugin.getConfig().getString("Config.AntiPlugin.Enabled").equals("true"))
	    if (e.getMessage().equalsIgnoreCase("/plugins")) {
	      e.setCancelled(true);
	      String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	      e.getPlayer().sendMessage(messages);
	    }
	    if (e.getMessage().equalsIgnoreCase("plugins")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/pl")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("pl")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/?")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("?")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/ver")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("ver")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/version")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("version")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/help")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("help")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/bukkit:plugins")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("bukkit:plugins")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/bukkit:pl")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("bukkit:pl")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/bukkit:?")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("bukkit:?")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/bukkit:ver")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("bukkit:ver")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/bukkit:version")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("bukkit:version")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("/bukkit:help")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	      if (e.getMessage().equalsIgnoreCase("bukkit:help")) {
	        e.setCancelled(true);
	        String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	        e.getPlayer().sendMessage(messages);
	      } 
	    }
}
