package com.ayrz;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

public class ItemDurabilityEvent implements Listener {

    @EventHandler
    public void function(BlockBreakEvent ev){
        Player player = ev.getPlayer();
        Item item = player.getInventory().getItemInHand();
        if(item instanceof ItemTool){
            player.sendPopup("Item Durability: "+(item.getMaxDurability()-item.getDamage()));
        }
    }
}
