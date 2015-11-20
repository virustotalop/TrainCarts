package com.bergerkiller.bukkit.tc.events;

import com.bergerkiller.bukkit.tc.controller.MinecartGroup;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;

public class GroupForceUpdateEvent extends GroupEvent {
    private static final HandlerList handlers = new HandlerList();
    private double force;

    public GroupForceUpdateEvent(final MinecartGroup group, double force) {
        super(group);
        this.force = force;
    }

    public static double call(MinecartGroup group, double force) {
    	GroupForceUpdateEvent event = new GroupForceUpdateEvent(group, force);
    	Bukkit.getPluginManager().callEvent(event);
        return event.getForce();
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public double getForce() {
        return this.force;
    }

    public void setForce(double value) {
        this.force = value;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
