package me.hypersmc.jumpwatch.housing.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Join implements Listener {

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        ItemStack netherstar = new ItemStack(Material.NETHER_STAR, 1);
        ItemStack bin = new ItemStack(Material.CAULDRON, 1);
        ItemMeta b = bin.getItemMeta();
        ItemMeta ns = netherstar.getItemMeta();
        ns.setDisplayName(ChatColor.LIGHT_PURPLE + "Housing Menu " + ChatColor.GRAY + "(Right Click)");
        b.setDisplayName(ChatColor.RED + "Bin");
        List<String> l = new ArrayList<String>();
        l.add(ChatColor.GRAY + "Brag items here to destroy them,");
        l.add(ChatColor.GRAY + "you can also just throw them out");
        l.add(ChatColor.GRAY + "of your inventory.");
        l.add(" ");
        l.add(ChatColor.GRAY + "Double click to clear your inventory.");
        Player p = event.getPlayer();
        p.getInventory().clear();
        netherstar.setItemMeta(ns);
        b.setLore(l);
        bin.setItemMeta(b);
        p.getInventory().setItem(8, netherstar);
        p.getInventory().setItem(35, bin);
    }
}
