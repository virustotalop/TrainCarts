package com.bergerkiller.bukkit.tc.events;

import com.bergerkiller.bukkit.tc.controller.MinecartGroup;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;

public class GroupCreateEvent extends GroupEvent {
    private static final HandlerList handlers = new HandlerList();

    public GroupCreateEvent(final MinecartGroup group) {
        super(group);
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public static void call(final MinecartGroup group) 
    {
        Bukkit.getPluginManager().callEvent(new GroupCreateEvent(group));
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
