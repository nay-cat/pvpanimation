package nay.gmail.com.zo.utils;

import nay.gmail.com.zo.ZoWIP;
import org.bukkit.scheduler.BukkitRunnable;

public class DespawnTime extends BukkitRunnable {

    ZoWIP plugin;

    public DespawnTime(ZoWIP plugin) {
        this.plugin = plugin;
    }


    @Override
    public void run() {
        plugin.getStand().remove();
    }
}
