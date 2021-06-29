package nay.gmail.com.zo.frames;

import nay.gmail.com.zo.ZoWIP;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;

public class FrapUpdater extends BukkitRunnable {

    ZoWIP plugin;
    private int counter = 10;
    public FrapUpdater(ZoWIP plugin) {
        this.plugin = plugin;
    }



    @Override
    public void run() {
        ArmorStand as = (ArmorStand) ZoWIP.getPluginType().getAnimationFrameUpdate();
        double x = as.getHeadPose().getX();
        double y = as.getHeadPose().getY();
        double z = as.getHeadPose().getZ();

        as.setHeadPose(new EulerAngle(x-counter, y, z));
        if (counter > 0) {
            plugin.getServer().broadcastMessage("FPS: " + counter--);
        } else {
            plugin.getServer().broadcastMessage("Animación terminada, despawneando...");
            as.setHelmet(null);
            ZoWIP.getPluginType().despawnArmorStand(as, 50);
            this.cancel();
        }
    }

}