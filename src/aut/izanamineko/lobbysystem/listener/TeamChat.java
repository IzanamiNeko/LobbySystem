package aut.izanamineko.lobbysystem.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.Plugin;

import aut.izanamineko.lobbysystem.main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class TeamChat implements Listener {
	  private main plugin;
	  
	  public TeamChat(main plugin) {
	    this.plugin = plugin;
	    this.plugin.getServer().getPluginManager().registerEvents(this, (Plugin)plugin);
	  }
	  
	  @EventHandler
	  public void onTC(PlayerChatEvent e) {
	    Player p = e.getPlayer();
	    String prefix = PermissionsEx.getUser(e.getPlayer()).getGroups()[0].getPrefix().replace("&", "§");
	    String gruppe = PermissionsEx.getUser(e.getPlayer()).getGroupNames()[0];
	    String tc = this.plugin.getConfig().getString("Config.TeamChat.Prefix").replace("&", "§");
	    
	    if (this.plugin.getConfig().getString("Config.TeamChat.Enabled").equals("true") && 
	      e.getMessage().startsWith("!") && p
	      .hasPermission("LobbySystem.TeamChat")) {
	      e.setCancelled(true);
	      for (Player players : Bukkit.getOnlinePlayers()) {
	        if (players.hasPermission("LobbySystem.TeamChat"))
	          players.sendMessage(String.valueOf(tc) + prefix + p
	              
	              .getName() + "" + e
	              .getMessage()
	              .replaceAll("!", "")); 
	      } 
	    } 
	  }
	}