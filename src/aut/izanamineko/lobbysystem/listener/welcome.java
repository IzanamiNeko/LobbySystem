package aut.izanamineko.lobbysystem.listener;

import aut.izanamineko.lobbysystem.main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class welcome implements Listener {

    main plugin;

    public welcome(main instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onWelcome(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String msg = this.plugin.getConfig().getString("Config.Custom-Message.Join");
        msg = msg.replaceAll("&", "§");
        msg = msg.replaceAll("%player%", p.getDisplayName());
        if(this.plugin.getConfig().getString("Config.Custom-Message.ShowMsg").equals("true")) {
        	e.setJoinMessage(msg);
    	} else {
    	e.setJoinMessage("");
    	}


    }
    
    public void onLeave(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String msg = this.plugin.getConfig().getString("Config.Custom-Message.Leave");
        msg = msg.replaceAll("&", "§");
        msg = msg.replaceAll("%player%", p.getDisplayName());
        if(this.plugin.getConfig().getString("Config.Custom-Message.ShowMsg").equals("true")) {
        e.setJoinMessage(msg);	
        } else {
        	e.setJoinMessage("");
        }
        


    }


}