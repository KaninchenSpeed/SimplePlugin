package kaninchenspeed.hideandseek.commands;

import kaninchenspeed.hideandseek.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class InfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Main.getPrefix() + "§9Plugin made by KaninchenSpeed Github: §c§nhttps://github.com/KaninchenSpeed");
        sender.sendMessage(Main.getPrefix() + "§9Surce Code on GitHub: §c§nhttps://github.com/KaninchenSpeed/SimplePlugin");
        return false;
    }
}