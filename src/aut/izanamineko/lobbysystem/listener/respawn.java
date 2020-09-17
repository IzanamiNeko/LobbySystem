package aut.izanamineko.lobbysystem.listener;

import aut.izanamineko.lobbysystem.main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import java.io.File;

public class respawn implements Listener {

    main plugin;

    public respawn(main instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e){

        Player p = e.getPlayer();
        String msg = this.plugin.getConfig().getString("Config.Spawnpoint.Respawn");
        msg = msg.replaceAll("&", "�");
        msg = msg.replaceAll("%player%", p.getDisplayName());


        File file = new File("plugins/LobbySystem/spawn.yml");
        if(!file.exists()) {
            return;
        }


        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        Location loc = p.getLocation();
        double x = cfg.getDouble("X");
        double y = cfg.getDouble("Y");
        double z = cfg.getDouble("Z");
        double yaw = cfg.getDouble("Yaw");
        double pitch = cfg.getDouble("Pitch");
        String worldname = cfg.getString("Worldname");
        World world = Bukkit.getWorld(worldname);

        loc.setX(x);
        loc.setY(y);
        loc.setZ(z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        loc.setWorld(world);



        e.setRespawnLocation(loc);
        p.sendMessage(msg);
    }




}
