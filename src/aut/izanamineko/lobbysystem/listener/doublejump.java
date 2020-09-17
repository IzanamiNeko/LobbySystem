package aut.izanamineko.lobbysystem.listener;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import aut.izanamineko.lobbysystem.main;

public class doublejump implements Listener {
	  main plugin;
	  
	  public doublejump(main instance) {
	    this.plugin = instance;
	  }
	  
	  @EventHandler
	  public void onPlayerToggleFlight(PlayerToggleFlightEvent event) {
	    Player player = event.getPlayer();
	    if (player.getGameMode() == GameMode.CREATIVE)
	      return; 
	    event.setCancelled(true);
	    if(this.plugin.getConfig().getString("Config.DoubleJump.Enabled").equals("true"))
	    if (player.hasPermission("LobbySystem.DoubleJump"))
	      player.setAllowFlight(false); 
	    player.setFlying(false);
	    player.setVelocity(player.getLocation().getDirection().multiply(1.5D).setY(1));
	  }
	  
	  @EventHandler
	  public void onPlayerMove(PlayerMoveEvent event) {
	    Player player = event.getPlayer();
	    if(this.plugin.getConfig().getString("Config.DoubleJump.Enabled").equals("true"))
	    if (player.getGameMode() != GameMode.CREATIVE && player
	      .getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() != Material.AIR && 
	      !player.isFlying())
	      player.setAllowFlight(true); 
	  }
	}
