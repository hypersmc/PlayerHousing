package me.hypersmc.jumpwatch.housing;

import me.hypersmc.jumpwatch.housing.Handler.EventHandler;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info("\n \n"+ ChatColor.DARK_GRAY + "[]=====["+ ChatColor.GRAY +"Enabling "+ getDescription().getName() + ChatColor.DARK_GRAY + "]=====[]\n" + ChatColor.DARK_GRAY + "| " + ChatColor.RED + "Logged info:\n"+ ChatColor.DARK_GRAY +"|   "+ ChatColor.RED +"Name: "+ ChatColor.GRAY +"Player Housing\n"+ ChatColor.DARK_GRAY +"|   "+ ChatColor.RED +"Developer: "+ ChatColor.GRAY +"" + this.getDescription().getAuthors() +"\n"+ ChatColor.DARK_GRAY +"|   "+ ChatColor.RED +"Version: "+ ChatColor.GRAY +"" + this.getDescription().getVersion() + "\n"+ ChatColor.DARK_GRAY +"|   "+ ChatColor.RED +"Plugins: "+ ChatColor.GRAY +"\n" + detechplugingPHAPI() + detechplugingWEAAWE());
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null){
            new PlaceHolder().register();
        }
        EventHandler.GetEvents();
    }

    public String detechplugingPHAPI(){
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            return ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.GREEN +"PlaceholderAPI\n";
        }else if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") == null){
            return ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.RED +"PlaceholderAPI\n";
        }

        return null;
    }
    public String detechplugingWEAAWE(){
        if ((Bukkit.getPluginManager().getPlugin("AsyncWorldEdit")) != null && (Bukkit.getPluginManager().getPlugin("WorldEdit")) != null) {
            return ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.GREEN +"WorldEdit\n" + ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.GREEN +"AsyncWorldEdit";
        }else if ((Bukkit.getPluginManager().getPlugin("AsyncWorldEdit")) == null && (Bukkit.getPluginManager().getPlugin("WorldEdit")) != null){
            return ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.GREEN +"WorldEdit\n" + ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.RED +"AsyncWorldEdit";
        }else if ((Bukkit.getPluginManager().getPlugin("AsyncWorldEdit")) == null && (Bukkit.getPluginManager().getPlugin("WorldEdit")) == null){
            return ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.RED +"WorldEdit\n" + ""+ ChatColor.DARK_GRAY +"| "+ ChatColor.RED +"AsyncWorldEdit";

        }
        return null;
    }

    @Override
    public void onDisable() {

    }
}
