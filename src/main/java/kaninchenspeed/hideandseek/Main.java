package kaninchenspeed.hideandseek;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


import kaninchenspeed.hideandseek.commands.InfoCommand;
import kaninchenspeed.hideandseek.commands.StartCommand;

import kaninchenspeed.hideandseek.listeners.JoinListener;
import kaninchenspeed.hideandseek.listeners.QuitListener;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().fine("Plugin wird aktiviert");

        listenerRegistration();
        commandRegistration();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine("Plugin wird deaktiviert");
    }

    public static String getPrefix() {
        return ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Hide and Seek" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY;
    }

    private void listenerRegistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
    }

    private void commandRegistration() {
        getCommand("info").setExecutor(new InfoCommand()); //Print Info
        getCommand("start").setExecutor(new StartCommand()); //Start Hide and Seek
    }
}