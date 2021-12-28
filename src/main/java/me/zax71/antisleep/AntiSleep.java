package me.zax71.antisleep;

import me.zax71.antisleep.events.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSleep extends JavaPlugin {

    @Override
    public void onEnable() {

        // Register events
        getServer().getPluginManager().registerEvents(new PlayerInteractEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
