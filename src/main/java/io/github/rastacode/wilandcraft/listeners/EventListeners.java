package io.github.rastacode.wilandcraft.listeners;

import io.github.rastacode.wilandcraft.WilandCraft;

import org.bukkit.event.Listener;

public final class EventListeners  implements Listener{
	public WilandCraft plugin;
	
    public EventListeners(WilandCraft instance) {
        plugin = instance;
    }
}
