package aut.izanamineko.lobbysystem.commands;

import aut.izanamineko.lobbysystem.main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class setSpawn implements CommandExecutor {


    main plugin;

    public setSpawn(main instance) {
        this.plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;
        String msg = this.plugin.getConfig().getString("Config.Spawnpoint.SetSpawn");
        String NoPerm = this.plugin.getConfig().getString("Config.Spawnpoint.NoPerm");
        NoPerm = NoPerm.replaceAll("&", "§");
        msg = msg.replaceAll("&", "§");
        msg = msg.replaceAll("%player%", p.getDisplayName());

        if(sender.hasPermission("LobbySystem.SetSpawn") && cmd.getName().equalsIgnoreCase("setspawn")) {
            
        
        if (!(sender instanceof Player)) {
            System.out.println("[System] The Command is only usable as a Player!");
            return true;
        }
        

        File ordner = new File("plugins/LobbySystem");
        File file = new File("plugins/LobbySystem/spawn.yml");

        if (!ordner.exists()) {
            ordner.mkdir();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                p.sendMessage(msg);
            }
        }
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        Location loc = p.getLocation();

        double x = loc.getX();
        double y = loc.getY();
        double z = loc.getZ();
        double yaw = loc.getYaw();
        double pitch = loc.getPitch();
        String worldname = loc.getWorld().getName();

        cfg.set("X", x);
        cfg.set("Y", y);
        cfg.set("Z", z);
        cfg.set("Yaw", yaw);
        cfg.set("Pitch", pitch);
        cfg.set("Worldname", worldname);

        try {
            cfg.save(file);
        } catch (IOException e){
           e.printStackTrace();
        }
        p.sendMessage(msg);
        
        } else {

        	p.sendMessage(NoPerm);
        }

        return true;

        
    }
}
