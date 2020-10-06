package me.hypersmc.jumpwatch.housing;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class PlaceHolder extends PlaceholderExpansion {
    Main main = JavaPlugin.getPlugin(Main.class);


    @Override
    public boolean canRegister(){
        return true;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "playerhousing";
    }

    @Override
    public @NotNull String getAuthor() {
        return main.getDescription().getAuthors().toString();
    }

    @Override
    public @NotNull String getVersion() {
        return main.getDescription().getVersion();
    }
    @Override
    public String onRequest(OfflinePlayer player, String identifier){

        // %example_placeholder1%
        if(identifier.equals("placeholder1")){
            return "placeholder1 works";
        }

        // %example_placeholder2%
        if(identifier.equals("placeholder2")){
            return "placeholder2 works";
        }

        // We return null if an invalid placeholder (f.e. %example_placeholder3%)
        // was provided
        return null;
    }
}
