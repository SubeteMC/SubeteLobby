package uk.co.hubza.subetelobby;

import org.bukkit.Bukkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class subetelobby extends JavaPlugin {
	@Override
    public void onEnable() {
		getLogger().info("onEnable has been invoked! The SubeteLobby plugin is now active!");
        // TODO Insert logic to be performed when the plugin is enabled
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked! The SubeteLobby plugin is now shutting down.");
        // TODO Insert logic to be performed when the plugin is disabled
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("test")) { // If the player typed /basic then do the following, note: If you only registered this executor for one command, you don't need this
    		sender.sendMessage("Hey there, you found our secret command! Welp, here we go!");
    		sender.sendMessage("You, " + sender.getName() + ", have just ran the command /" + cmd.getName() + " : " + cmd);
    		return true;
    	} //If this has happened the function will return true. 
    	else if (cmd.getName().equalsIgnoreCase("subete")) {
    		sender.sendMessage(ChatColor.BLUE + "Thanks for playing on Subete! We hope you enjoy the server! Use /help SubeteLobby");
    		return true;
    	}
    	else if (cmd.getName().equalsIgnoreCase("subetepl")) {
    		sender.sendMessage(ChatColor.BLUE + "This server uses many plugins created by the spigot and bukkit community (see /pl) and also uses many plugins created by the Subete team. Complete credits will be available at subete.hubza.co.uk/pl but at the moment are not.");
    		return true;
    	}
    	else if (cmd.getName().equalsIgnoreCase("survival")) {
    		sender.sendMessage(ChatColor.BLUE + "Sending you to the Survival server!");
    		Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "server survival");
    		return true;
    	}
    	else if (cmd.getName().equalsIgnoreCase("anarchy")) {
    		sender.sendMessage(ChatColor.BLUE + "Sending you to the Anarchy server!");
    		Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "server anarchy");
    		return true;
    	}
            // If this hasn't happened the value of false will be returned.
    	return false; 
    }
}
