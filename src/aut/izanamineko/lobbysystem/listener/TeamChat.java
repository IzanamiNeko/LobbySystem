package aut.izanamineko.lobbysystem.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.Plugin;

import aut.izanamineko.lobbysystem.main;

public class TeamChat implements Listener {
	  String tc = this.plugin.getConfig().getString("Config.TeamChat.Prefix");
	  
	  static main plugin;

	    public TeamChat(main instance) {
	        plugin = instance;
	    }

	  
	    @EventHandler
	    public void onTC(PlayerChatEvent e) {
	      Player p = e.getPlayer();
	      if (e.getMessage().startsWith("!!") && p
	        .hasPermission("LobbySystem.TeamChat")) {
	        e.setCancelled(true);
	        for (Player players : Bukkit.getOnlinePlayers()) {
	          if (players.hasPermission("LobbySystem.TeamChat"))
	            players.sendMessage(this.tc + p
	                
	                .getName() + " §r>> " + e
	                .getMessage()
	                .replaceAll("!", "")); 
	        } 
	      } 
	    }
	  }
