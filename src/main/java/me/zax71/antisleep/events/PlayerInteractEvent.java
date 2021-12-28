package me.zax71.antisleep.events;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Objects;


public class PlayerInteractEvent implements Listener {

    @EventHandler
    public void onPlayerInteractEvent(org.bukkit.event.player.PlayerInteractEvent e) {

        if (Objects.requireNonNull(e.getClickedBlock()).getBlockData() instanceof org.bukkit.block.data.type.Bed) {
            e.getPlayer().sendMessage(ChatColor.RED + "Sleeping is disabled on this server");
            e.setCancelled(true);
        }
    }
}
