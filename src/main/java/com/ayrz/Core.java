package com.ayrz;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Core extends PluginBase implements Listener {

    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(new ItemDurabilityEvent(),this);
        this.getServer().getLogger().info("Plugin Enable");
    }
}
