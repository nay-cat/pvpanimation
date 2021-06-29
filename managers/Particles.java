package nay.gmail.com.zo.managers;


import net.minecraft.server.v1_12_R1.EnumParticle;
import net.minecraft.server.v1_12_R1.PacketPlayOutWorldParticles;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Particles {

    public void ParticleSpawn(Player p, EnumParticle type){

        //p.getWorld().spawnParticle(type, p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ(), 30, 0, 0, 0);
        PacketPlayOutWorldParticles pcketParticle = new PacketPlayOutWorldParticles(type, true, (float)p.getLocation().getX()+1, (float)p.getLocation().getY()+1, (float)p.getLocation().getZ()+1, 30, 20, 20, 20, 5);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(pcketParticle);
    }
}
