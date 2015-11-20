package com.bergerkiller.bukkit.tc.events;

import com.bergerkiller.bukkit.tc.TrainCarts;
import com.bergerkiller.bukkit.tc.controller.MinecartMember;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;

public class MemberCoalUsedEvent extends MemberEvent {
    private static final HandlerList handlers = new HandlerList();
    private boolean useCoal;
    private boolean refill;

    public MemberCoalUsedEvent(final MinecartMember<?> source) {
        super(source);
        this.useCoal = TrainCarts.useCoalFromStorageCart;
        this.refill = false;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public static MemberCoalUsedEvent call(final MinecartMember<?> member) {
    	MemberCoalUsedEvent event = new MemberCoalUsedEvent(member);
    	 Bukkit.getPluginManager().callEvent(event);
        return event;
    }

    public boolean useCoal() {
        return this.useCoal;
    }

    public boolean refill() {
        return this.refill;
    }

    public void setUseCoal(boolean use) {
        this.useCoal = use;
    }

    public void setRefill(boolean refill) {
        this.refill = refill;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
