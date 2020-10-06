package me.hypersmc.jumpwatch.housing.Listeners;

import me.hypersmc.jumpwatch.housing.Gui.MainGUI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class Netherstaruse extends MainGUI implements Listener {

    @EventHandler
    public void onitemuse(PlayerInteractEvent event){
        Player p = event.getPlayer();
        if (Objects.requireNonNull(Objects.requireNonNull(event.getItem()).getItemMeta()).getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Housing Menu " + ChatColor.GRAY + "(Right Click)")) {
            maingui(p);
        }
    }
}
