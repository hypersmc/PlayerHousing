package me.hypersmc.jumpwatch.housing.Gui;

import me.hypersmc.jumpwatch.housing.Main;
import me.mattstudios.mfgui.gui.components.ItemBuilder;
import me.mattstudios.mfgui.gui.guis.Gui;
import me.mattstudios.mfgui.gui.guis.GuiItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGUI implements Listener {
    Main main = JavaPlugin.getPlugin(Main.class);
    Gui gui = new Gui(5, "Housing Menu");
    List<String> l = new ArrayList<String>();
    List<String> l2 = new ArrayList<String>();
    GuiItem noWorldEdit = ItemBuilder.from(Material.STICK).setName(ChatColor.GREEN + "Pro Tools").setLore(Arrays.asList(l.toString())).asGuiItem(event -> {
        // Handle your click action here
        event.setCancelled(true);
    });
    GuiItem WorldEdit = ItemBuilder.from(Material.STICK).setName(ChatColor.GREEN + "Pro Tools").setLore(Arrays.asList(l2.toString())).asGuiItem(event -> {
        // Handle your click action here
        event.setCancelled(true);
    });


    public void maingui(Player player) {
        l.add(ChatColor.GREEN + "Pro Tools");
        l.add(ChatColor.GRAY + "Utilize more advanced");
        l.add(ChatColor.GRAY + "building tools specific to");
        l.add(ChatColor.GRAY + "Pro mode such as copying");
        l.add(ChatColor.GRAY + "and pasting regions.");
        l.add(" ");
        l.add(ChatColor.RED + "WorldEdit OR AsyncWorldEdit Is missing from the server!");
        l2.add(ChatColor.GREEN + "Pro Tools");
        l2.add(ChatColor.GRAY + "Utilize more advanced");
        l2.add(ChatColor.GRAY + "building tools specific to");
        l2.add(ChatColor.GRAY + "Pro mode such as copying");
        l2.add(ChatColor.GRAY + "and pasting regions.");
        l2.add(" ");
        l2.add(ChatColor.YELLOW + "Click to browse!");
        gui.open(player);
        if (main.getServer().getPluginManager().getPlugin("WorldEdit") != null || main.getServer().getPluginManager().getPlugin("AsyncWorldEdit") != null) {
            gui.setItem(0, WorldEdit);
        }else {
            gui.setItem(0, noWorldEdit);
        }
    }

}
