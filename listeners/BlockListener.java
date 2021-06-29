package nay.gmail.com.zo.listeners;

import nay.gmail.com.zo.ZoWIP;
import nay.gmail.com.zo.managers.Particles;
import net.minecraft.server.v1_12_R1.EnumParticle;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BlockListener implements Listener {

    private ZoWIP plugin;

    public BlockListener(ZoWIP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDefense(EntityDamageByEntityEvent e) {
        if(e.getEntityType().equals(EntityType.PLAYER)) {

            Player pDamage = (Player) e.getEntity();
            Player enemy = (Player) e.getDamager();

            if (pDamage.isBlocking() && enemy.isOnGround()) {
                e.setDamage(0.25);
                enemy.setVelocity(enemy.getLocation().getDirection().multiply(-2));
                pDamage.playSound((pDamage).getLocation(), Sound.ITEM_SHIELD_BLOCK, 4.0F, 0.3F);
                Particles p = new Particles();
                p.ParticleSpawn(pDamage, EnumParticle.LAVA);
            } else {
                pDamage.damage(2.75);
                pDamage.setVelocity(enemy.getLocation().getDirection().multiply(-4));


            }
        }else{
           /* e.setDamage(e.getDamage());
            pDamage.playSound((pDamage).getLocation(), Sound.BLOCK_ANVIL_HIT, 4.0F, 0.3F); */
        }
    }
}
