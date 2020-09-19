package aut.izanamineko.lobbysystem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import aut.izanamineko.lobbysystem.main;

public class ReloadCMD implements CommandExecutor {

	main plugin;

    public ReloadCMD(main instance) {
        this.plugin = instance;
    }
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (command.getName().equalsIgnoreCase("lsreload")) {
        	Player p = (Player) sender;
        	String msg = this.plugin.getConfig().getString("Config.Reload.Success").replace("&", "§");
                if (sender.hasPermission("LobbySystem.Reload"))
                {

                    plugin.reloadConfig();
                    p.sendMessage(msg);
                    return true;
                }
            } else {

            	Player p = (Player) sender;
            	String nomsg = this.plugin.getConfig().getString("Config.Reload.Fail").replace("&", "§");
            	p.sendMessage(nomsg);
            }
        
        
		return false;
    }
}

