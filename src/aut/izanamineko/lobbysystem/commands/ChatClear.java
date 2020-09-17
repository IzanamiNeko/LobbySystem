package aut.izanamineko.lobbysystem.commands;

import aut.izanamineko.lobbysystem.main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class ChatClear implements CommandExecutor, Listener {
    static main plugin;

    public ChatClear(main instance) {
        plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if ((sender.hasPermission("LobbySystem.ChatClear") &&
                cmd.getName().equalsIgnoreCase("chatclear") || cmd.getName().equalsIgnoreCase("cc")))    {
            Player p = (Player) sender;
            String msg = this.plugin.getConfig().getString("Config.ChatClear.ChatClear");
            String NoPerm = this.plugin.getConfig().getString("Config.ChatClear.NoPerm");
            msg = msg.replaceAll("&", "§");
            msg = msg.replaceAll("%player%", p.getDisplayName());
            
        if(!sender.hasPermission("LobbySystem.ChatClear")) {
        	
        	p.sendMessage(NoPerm);
        	
        }

            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage(" ");
            if(this.plugin.getConfig().getString("Config.ChatClear.ShowMsg").equals("true"))
            Bukkit.getServer().broadcastMessage(msg);
        } else {
        	Player p = (Player) sender;
            String NoPerm = this.plugin.getConfig().getString("Config.ChatClear.NoPerm");
            NoPerm = NoPerm.replaceAll("&", "§");
        	p.sendMessage(NoPerm);
        	
        }
        return false;
    }
}
