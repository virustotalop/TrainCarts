package com.bergerkiller.bukkit.tc.actions;

public class Action {
    private final Boolean started = new Boolean(false);

    public boolean doTick() {
        if (this.started) {
            this.start();
        }
        return this.update();
    }

    public boolean update() {
        return true;
    }

    /**
     * Called right after this Action is bound to a group or member
     */
    public void bind() {
    }

    public void start() {
        // Default implementation does nothing here
    }
}
