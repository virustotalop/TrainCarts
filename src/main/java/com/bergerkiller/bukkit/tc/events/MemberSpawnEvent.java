package com.bergerkiller.bukkit.tc.events;

import com.bergerkiller.bukkit.tc.controller.MinecartMember;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;

public class MemberSpawnEvent extends MemberEvent {
    private static final HandlerList handlers = new HandlerList();

    public MemberSpawnEvent(MinecartMember<?> member) {
        super(member);
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public static MemberSpawnEvent call(MinecartMember<?> member) {
    	MemberSpawnEvent event = new MemberSpawnEvent(member);
    	Bukkit.getPluginManager().callEvent(event);
        return event;
    }

    public void setMember(MinecartMember<?> member) {
        this.member = member;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
