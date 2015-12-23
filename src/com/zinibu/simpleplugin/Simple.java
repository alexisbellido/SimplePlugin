package com.zinibu.simpleplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Simple extends JavaPlugin {

    public static Logger log = Logger.getLogger("Minecraft");

    public void onEnable() {
        log.info("[Simple] start up");
    }
    public void onDisable() {
        log.info("[Simple] stopping");
    }

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("simple")) {
            if (sender instanceof Player) {
                Player me = (Player)sender;
                // Put your code after this line:
                // and finish your code before this line
                return true;
            }
        }
        return false;
    }

}
