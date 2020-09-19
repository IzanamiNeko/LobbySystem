package aut.izanamineko.lobbysystem.listener;

import org.bukkit.entity.Player;
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
		  Player p = e.getPlayer();
		if (this.plugin.getConfig().getString("Config.AntiPlugin.Enabled").equals("true"))

		      
		    	 
	    if (e.getMessage().equalsIgnoreCase("/plugins") || e.getMessage().equalsIgnoreCase("plugins") 
	    		|| e.getMessage().equalsIgnoreCase("/pl") || e.getMessage().equalsIgnoreCase("pl") 
	    		|| e.getMessage().equalsIgnoreCase("/?") || e.getMessage().equalsIgnoreCase("?") 
	    		|| e.getMessage().equalsIgnoreCase("/ver") || e.getMessage().equalsIgnoreCase("ver")
	    		|| e.getMessage().equalsIgnoreCase("/version") || e.getMessage().equalsIgnoreCase("version")
	    		|| e.getMessage().equalsIgnoreCase("/help") || e.getMessage().equalsIgnoreCase("help")
	    		|| e.getMessage().equalsIgnoreCase("/bukkit:plugins") || e.getMessage().equalsIgnoreCase("bukkit:plugins")
	    		|| e.getMessage().equalsIgnoreCase("/bukkit:pl") || e.getMessage().equalsIgnoreCase("bukkit:pl")
	    		|| e.getMessage().equalsIgnoreCase("/bukkit:?") || e.getMessage().equalsIgnoreCase("bukkit:?")
	    		|| e.getMessage().equalsIgnoreCase("/bukkit:ver") || e.getMessage().equalsIgnoreCase("bukkit:ver")
	    		|| e.getMessage().equalsIgnoreCase("/bukkit:version") || e.getMessage().equalsIgnoreCase("bukkit:version")
	    		|| e.getMessage().equalsIgnoreCase("/bukkit:help") || e.getMessage().equalsIgnoreCase("bukkit:help"))  {
	      e.setCancelled(true);
	      String messages = this.plugin.getConfig().getString("Config.AntiPlugin.Message").replace("&", "§").replaceAll("%player%", e.getPlayer().getPlayerListName());
	      e.getPlayer().sendMessage(messages);
	    } else {
	    	e.setCancelled(false);
	    }
	}
}
