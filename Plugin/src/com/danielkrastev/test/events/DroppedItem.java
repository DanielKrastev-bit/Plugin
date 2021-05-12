package com.danielkrastev.test.events;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DroppedItem implements Listener {

    @EventHandler
    public static void Item (PlayerDropItemEvent event) {

        Item item = event.getItemDrop();
        Player player = event.getPlayer();
        player.sendMessage("You have dropped your" + item);

    }
}
