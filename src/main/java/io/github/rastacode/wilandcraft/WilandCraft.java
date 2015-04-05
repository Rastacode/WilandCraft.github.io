package io.github.rastacode.wilandcraft;

import io.github.rastacode.wilandcraft.commands.WilandCraftCommand;
import io.github.rastacode.wilandcraft.listeners.EventListeners;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WilandCraft extends JavaPlugin {
    @Override
    public void onEnable() {
        //Todas las funciones para activar.
    	if(Bukkit.getServer().hasWhitelist()){
    		Bukkit.getServer().setWhitelist(false);
    	}
    	RegistrarEventos();
    	getCommand("wld").setExecutor(new WilandCraftCommand());
    	getLogger().info("Plugin iniciado con exito!");
    }
 
    @Override
    public void onDisable() {
        //Todas las funciones para desactivar.
    }

    private void RegistrarEventos(){
    	getServer().getPluginManager().registerEvents(new EventListeners(this), this);
    }

}