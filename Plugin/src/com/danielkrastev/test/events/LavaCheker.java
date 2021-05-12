package com.danielkrastev.test.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class LavaCheker implements Listener {

    @EventHandler
    public static void lavaCheck(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        Material block = player.getWorld().getBlockAt(x, y -2, z).getType();
        if (block == Material.LAVA) {
            player.sendMessage(ChatColor.YELLOW + "There is lava below you!");
        }
    }
}
