package me.hypersmc.jumpwatch.housing.Handler;

import me.hypersmc.jumpwatch.housing.Events.Join;
import me.hypersmc.jumpwatch.housing.Listeners.Netherstaruse;
import me.hypersmc.jumpwatch.housing.Main;
import org.bukkit.plugin.java.JavaPlugin;

public class EventHandler {
    static Main main = JavaPlugin.getPlugin(Main.class);

    public static void GetEvents() {
        main.getServer().getPluginManager().registerEvents(new Join(), main);
        main.getServer().getPluginManager().registerEvents(new Netherstaruse(), main);
    }
}
