package me.zax71.antisleep.events;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class PlayerInteractEvent implements Listener {

    @EventHandler
    public void onPlayerInteractEvent(org.bukkit.event.player.PlayerInteractEvent e) {
        if (e.getClickedBlock() instanceof org.bukkit.block.data.type.Bed) {
            e.setCancelled(true);
        }
    }
}
