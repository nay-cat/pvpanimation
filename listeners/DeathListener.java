package nay.gmail.com.zo.listeners;

import nay.gmail.com.zo.ZoWIP;
import nay.gmail.com.zo.managers.Particles;
import nay.gmail.com.zo.utils.Animation;
import net.minecraft.server.v1_12_R1.EnumParticle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class DeathListener implements Listener {

    private ZoWIP plugin;

    public DeathListener(ZoWIP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {

            Player deathPlayer = e.getEntity();
            Player killer = e.getEntity().getKiller();

            if (killer.hasPermission("zowip.honorkill")) {

                Animation a = new Animation();
                a.Animator(deathPlayer);
                Particles p = new Particles();
                p.ParticleSpawn(killer, EnumParticle.REDSTONE);
        }
    }



}
