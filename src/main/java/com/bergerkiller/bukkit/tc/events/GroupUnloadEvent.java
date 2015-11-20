package com.bergerkiller.bukkit.tc.events;

import com.bergerkiller.bukkit.tc.controller.MinecartGroup;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;

public class GroupUnloadEvent extends GroupEvent {
    private static final HandlerList handlers = new HandlerList();

    public GroupUnloadEvent(final MinecartGroup group) {
        super(group);
    }

    public static void call(final MinecartGroup group) {
        Bukkit.getPluginManager().callEvent(new GroupUnloadEvent(group));
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
