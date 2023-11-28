package com.oecklab.chinesecuisines.item;

import com.oecklab.chinesecuisines.ChineseCuisines;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHINESE_CUISINES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChineseCuisines.MOD_ID, "chinese_cuisine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chinese_cuisines"))
                    .icon(() -> new ItemStack(ModItems.BEAN_JUICE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BEAN_JUICE);
                        entries.add(ModItems.FRIED_RING);
                        entries.add(ModItems.SALTED_VEGETABLE);
                    }).build());
//    public static final ItemGroup CHINESE_CUISINES_GROUP = Registry.register(Registries.ITEM_GROUP,
//            new Identifier(ChineseCuisines.MOD_ID, "Chinese Cuisine"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chinese_cuisines"))
//                    .icon(() -> new ItemStack(ModItems.BEAN_JUICE)).entries((displayContext, entries) -> {
//                        entries.add(ModItems.BEAN_JUICE);
//                        entries.add(ModItems.FRIED_RING);
//                        entries.add(ModItems.SALTED_VEGETABLE);
//                    }).build());

    public static void registerItemGroups() {
        ChineseCuisines.LOGGER.info("Registering Item Groups for " +ChineseCuisines.MOD_ID);
    }
}
