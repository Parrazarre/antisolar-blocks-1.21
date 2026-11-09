package net.parra.antisolarblocks.recipe;

import com.mojang.serialization.MapCodec;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.recipe.custom.PotteryKilnRecipe;

public class ModRecipeSerializers {

    public static final RecipeSerializer<PotteryKilnRecipe> POTTERY_KILN =
            Registry.register(
                    Registries.RECIPE_SERIALIZER,
                    Identifier.of(
                            AntisolarBlocks.MOD_ID,
                            "pottery_kiln"
                    ),
                    new RecipeSerializer<>() {

                        @Override
                        public MapCodec<PotteryKilnRecipe> codec() {
                            return PotteryKilnRecipe.CODEC;
                        }

                        @Override
                        public PacketCodec<RegistryByteBuf, PotteryKilnRecipe> packetCodec() {
                            return PacketCodec.tuple(
                                    PacketCodecs.collection(
                                            java.util.ArrayList::new,
                                            Ingredient.PACKET_CODEC
                                    ),
                                    PotteryKilnRecipe::getIngredientsList,

                                    ItemStack.PACKET_CODEC,
                                    PotteryKilnRecipe::getResultStack,

                                    PacketCodecs.VAR_INT,
                                    PotteryKilnRecipe::getCookingTime,

                                    PotteryKilnRecipe::new
                            );
                        }
                    }
            );

    public static void register() {
        AntisolarBlocks.LOGGER.info(
                "Registering Recipe Serializers for "
                        + AntisolarBlocks.MOD_ID
        );
    }
}