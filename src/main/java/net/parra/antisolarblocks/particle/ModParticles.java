package net.parra.antisolarblocks.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;

public class ModParticles {

    public static final SimpleParticleType FEATHER_PARTICLE =
            registerParticle("feather_particle", FabricParticleTypes.simple());

    public static final SimpleParticleType DARK_PLUME_PARTICLE =
            registerParticle("dark_plume_particle", FabricParticleTypes.simple());


    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
     return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(AntisolarBlocks.MOD_ID, name), particleType);
    }

    public static void registerModParticles() {
        AntisolarBlocks.LOGGER.info("Registering Particles for " + AntisolarBlocks.MOD_ID);
    }
}
