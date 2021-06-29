package nay.gmail.com.zo;

import nay.gmail.com.zo.frames.AnimationFrames;
import nay.gmail.com.zo.frames.FrapUpdater;
import nay.gmail.com.zo.listeners.BlockListener;
import nay.gmail.com.zo.listeners.DeathListener;
import nay.gmail.com.zo.utils.DespawnTime;
import nay.gmail.com.zo.utils.Local;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class ZoWIP extends JavaPlugin {
    Entity standDespawn;
    Boolean animationstart = false;
    Entity standAnimationStart;
    Entity animationFrameUpdate;
    @Override
    public void onEnable() {

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new DeathListener(this), this);
        pm.registerEvents(new BlockListener(this), this);

        Local.logger("&cIniciado");
    }

    @Override
    public void onDisable() {

    }

    public static ZoWIP getPluginType() {

        return getPlugin(ZoWIP.class);

    }

    public void despawnArmorStand(Entity armorstand, int ticks){

        this.standDespawn = armorstand;
        BukkitTask Timer = new DespawnTime(this).runTaskLater(this, ticks);

    }

    public void setAnimationStart(Entity armorstand, int ticks){

        standAnimationStart = armorstand;
        animationstart = true;
        BukkitTask TimerSpawn = new AnimationFrames(this).runTaskLater(this, ticks);

    }

    public void setFramesStart(Entity armorstand){

        animationFrameUpdate = armorstand;
        BukkitTask counter = new FrapUpdater(this).runTaskTimer(this, 5, 20);

    }

    public Entity getStand(){

        return standDespawn;

    }

    public Entity getAnimation(){

        return standAnimationStart;

    }

    public Entity getAnimationFrameUpdate(){

        return animationFrameUpdate;

    }

}
