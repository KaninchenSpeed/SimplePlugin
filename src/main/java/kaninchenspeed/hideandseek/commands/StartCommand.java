package kaninchenspeed.hideandseek.commands;

import kaninchenspeed.hideandseek.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class StartCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        Bukkit.dispatchCommand(console, " /function example_pack:rundenstart");
        Bukkit.broadcastMessage(Main.getPrefix() + "Runde startet...");
        return false;
    }
}