package aut.izanamineko.lobbysystem.commands;

import aut.izanamineko.lobbysystem.main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class Spawn implements CommandExecutor {


    main plugin;

    public Spawn(main instance) {
        this.plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;
        String msg = this.plugin.getConfig().getString("Config.Spawnpoint.Spawn");
        msg = msg.replaceAll("&", "§");
        msg = msg.replaceAll("%player%", p.getDisplayName());
        
        if(sender.hasPermission("LobbySystem.Spawn") && cmd.getName().equalsIgnoreCase("spawn")) {

        if (!(sender instanceof Player)) {
            System.out.println("[System] The Command is only usable as a Player!");
            return true;
        }

        File file = new File("plugins/LobbySystem/spawn.yml");
        if(!file.exists()){
            p.sendMessage(msg);
            return true;
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
        
        p.teleport(loc);
        if(this.plugin.getConfig().getString("Config.Spawnpoint.ShowMsg").equals("true"))
        p.sendMessage(msg);      	
        
        } else {
        	String NoPerm = this.plugin.getConfig().getString("Config.Spawnpoint.NoSpawnPerm");
            NoPerm = NoPerm.replaceAll("&", "§");
            p.sendMessage(NoPerm);
        }
        return true;
        
    }
}
