package nay.gmail.com.zo.frames;

import nay.gmail.com.zo.ZoWIP;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;

public class AnimationFrames extends BukkitRunnable {
    ZoWIP plugin;

    public AnimationFrames(ZoWIP plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        ArmorStand as = (ArmorStand) plugin.getAnimation();
        as.setLeftArmPose(new EulerAngle(35, 0, 0));
        as.setRightArmPose(new EulerAngle(-35, 0, 0));

        as.setLeftLegPose(new EulerAngle(20, 0, 0));
        as.setRightLegPose(new EulerAngle(20, 0, 0));

        as.teleport(new Location(as.getWorld(), as.getLocation().getX(), as.getLocation().getY()-0.45, as.getLocation().getZ()));

        int fps = 0;

/*
            double x = as.getHeadPose().getX();
            double y = as.getHeadPose().getY();
            double z = as.getHeadPose().getZ();
            */

            as.setHeadPose(new EulerAngle(-30, 0, 0));

            fps = fps+1;


        ZoWIP.getPluginType().setFramesStart(as);

    }
}
