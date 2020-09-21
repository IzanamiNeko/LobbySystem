package aut.izanamineko.lobbysystem.listener;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import aut.izanamineko.lobbysystem.main;

public class GeneralEvents implements Listener {
	
	static main plugin;
	  
	  public GeneralEvents(main instance) {
	    plugin = instance;
	  }
	
	public void onDrop(PlayerDropItemEvent dropItem) {
		Player p = dropItem.getPlayer();
		if(p.hasPermission("LobbySystem.DropItem") || this.plugin.getConfig().getString("Config.GeneralEvents.DropItem").equals("false"))
			return;
		dropItem.setCancelled(true);	
	}
	
	public void onPickup(PlayerPickupItemEvent pickupItem) {
		Player p = pickupItem.getPlayer();
		if(p.hasPermission("LobbySystem.PickupItem") || this.plugin.getConfig().getString("Config.GeneralEvents.pickupItem").equals("false"))
			return;
		pickupItem.setCancelled(true);
	}
	
	  public void onEntityDamage(EntityDamageEvent noDamage) {
		    if (!(noDamage.getEntity() instanceof Player))
		      return; 
		    if(noDamage.getCause().equals(EntityDamageEvent.DamageCause.FALL) || noDamage.getCause().equals(EntityDamageEvent.DamageCause.DROWNING) 
		    		&& ((Player)noDamage.getEntity()).hasPermission("LobbySystem.NoDamage"))
		    	noDamage.setCancelled(true); 
		  }
}
