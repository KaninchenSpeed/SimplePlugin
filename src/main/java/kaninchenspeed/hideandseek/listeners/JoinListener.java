package kaninchenspeed.hideandseek.listeners;

import kaninchenspeed.hideandseek.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(Main.getPrefix() + ChatColor.GOLD + "Hallo und Herzlich willkommen bei Henries Hide and Seek.");
        event.setJoinMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.WHITE + " hat Hide and Seek betreten.");
    }

}

