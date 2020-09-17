package aut.izanamineko.lobbysystem.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import aut.izanamineko.lobbysystem.main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ChatFormat implements Listener {
	  main plugin;
	  
	  public ChatFormat(main instance) {
	    this.plugin = instance;
	  }
	  
	  public ChatFormat() {}
	  
	  @EventHandler(priority = EventPriority.HIGHEST)
	  public void onPlayerChat(AsyncPlayerChatEvent event) {
	    if (this.plugin.getConfig().getString("Config.ChatFormat.Enabled").equals("true"))
	      event.setFormat(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Config.ChatFormat.Format")
	              .replaceAll("%player%", event.getPlayer().getName())
	              .replaceAll("%displayname%", event.getPlayer().getDisplayName())
	              .replaceAll("%pex%", PermissionsEx.getUser(event.getPlayer()).getGroups()[0].getPrefix())
	              .replaceAll("%pex-suffix%", PermissionsEx.getUser(event.getPlayer()).getGroups()[0].getSuffix())
	              .replaceAll("&", "§"))) + event.getMessage()); 
	  }
	}
