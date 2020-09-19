package aut.izanamineko.lobbysystem;

import aut.izanamineko.lobbysystem.commands.ChatClear;
import aut.izanamineko.lobbysystem.commands.CustomHelp;
import aut.izanamineko.lobbysystem.commands.ReloadCMD;
import aut.izanamineko.lobbysystem.commands.Spawn;
import aut.izanamineko.lobbysystem.commands.setSpawn;
import aut.izanamineko.lobbysystem.listener.AntiPlugin;
import aut.izanamineko.lobbysystem.listener.ChatFormat;
import aut.izanamineko.lobbysystem.listener.TeamChat;
import aut.izanamineko.lobbysystem.listener.doublejump;
import aut.izanamineko.lobbysystem.listener.respawn;
import aut.izanamineko.lobbysystem.listener.welcome;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener, CommandExecutor {
    private static main plugin;

    public static main getPlugin() {
        return plugin;
    }

	public Inventory inv;

    public void onEnable() {
        System.out.println("<---=== LobbySystem ===--->");
        System.out.println("  |  Status: Enabled     |");
        System.out.println("  |     Version: 0.7.5   |");
        System.out.println("  | Author: IzanamiNeko  |");
        System.out.println(" -=-=-=-=-=-=-=-=-=-=-=-=-");
        loadCommands();
        loadConfig();
        
    }

    private void loadCommands(){
               plugin = this;
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, (Plugin)this);
        getCommand("chatclear").setExecutor((CommandExecutor)new ChatClear(this));
        getCommand("cc").setExecutor((CommandExecutor)new ChatClear(this));
        this.getCommand("spawn").setExecutor(new Spawn(this));
        this.getCommand("setspawn").setExecutor(new setSpawn(this));
        getCommand("lobbysystem").setExecutor(new CustomHelp(this));
        getCommand("lsreload").setExecutor(new ReloadCMD(this));
        
        pm.registerEvents(new respawn(this), this);
        pm.registerEvents(new welcome(this), this);
        pm.registerEvents((Listener)new doublejump(this), (Plugin)this);
        pm.registerEvents((Listener)new TeamChat(this), (Plugin)this);
        pm.registerEvents((Listener)new ChatFormat(this), (Plugin)this);
        pm.registerEvents((Listener)new AntiPlugin(this), (Plugin)this);
        
    }

  private void loadConfig() {
    getConfig().options().header("Config by IzanamiNeko (Markus5K)");
    getConfig().addDefault("Config.Custom-Message.Join", "&8[&3System&8] &c%player% &7has joined the Server!");
    getConfig().addDefault("Config.Custom-Message.Quit", "&8[&3System&8] &c%player% &7has left the Server!");
    getConfig().addDefault("Config.Spawnpoint.Spawn", "&8[&3System&8] &7You have been teleported to the Spawn!");
    getConfig().addDefault("Config.Spawnpoint.SetSpawn", "&8[&3System&8] &7You have set the Spawnpoint!");
    getConfig().addDefault("Config.Spawnpoint.Respawn", "&8[&3System&8] &7After you died you will spawn at the Mainpoint or your own Spawnpoint!");
    getConfig().addDefault("Config.Spawnpoint.NoPerm", "&8[&3System&8] &7You dont have Permissions to set the main Spawnpoint!");
    getConfig().addDefault("Config.Spawnpoint.NoSpawnPerm", "&8[&3System&8] &7You dont have Permissions to teleport to the Spawn!");
    getConfig().addDefault("Config.ChatClear.NoPerm", "&8[&3System&8] &7You dont have Permissions to clear the Chat!");
    getConfig().addDefault("Config.ChatClear.ChatClear", "&8[&3System&8] &7The Chat has been cleared by &c%player%!");
    getConfig().addDefault("Config.Spawnpoint.ShowMsg", "true");
    getConfig().addDefault("Config.ChatClear.ShowMsg", "true");
    getConfig().addDefault("Config.Custom-Message.ShowMsg", "true");
    getConfig().addDefault("Config.TeamChat.Enabled", "true");
    getConfig().addDefault("Config.TeamChat.Prefix", "&8[&2Team&8] &7");
    getConfig().addDefault("Config.DoubleJump.Enabled", "true");
    getConfig().addDefault("Config.ChatFormat.Enabled", "true");
    getConfig().addDefault("Config.ChatFormat.Format", "%pex% %player% &4>>&r");
    getConfig().addDefault("Config.AntiPlugin.Enabled", "true");
    getConfig().addDefault("Config.AntiPlugin.Message", "&8[&3System&8] &7You dont have permissions... &4[ &c%player% &4]");
    getConfig().addDefault("Config.Reload.Success", "&8[&3System&8] &aLobbySystem has been reloaded!");
    getConfig().addDefault("Config.Reload.Fail", "&8[&3System&8] &cLobbySystem failed to reload the Config!");
    getConfig().options().copyDefaults(true);
    saveConfig();
    reloadConfig();
  }

    public void onDisable() {
        System.out.println("<---=== LobbySystem ===--->");
        System.out.println("  |  Status: Disabled    |");
        System.out.println("  |     Version: 0.7.5   |");
        System.out.println("  | Author: IzanamiNeko  |");
        System.out.println(" -=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    
}
    

