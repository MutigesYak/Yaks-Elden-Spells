package com.mutigesyak.yakseldenspells.item;

import com.mutigesyak.yakseldenspells.YaksEldenSpells;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YaksEldenSpells.MOD_ID);

    public static final DeferredItem<Item> ROWA_FRUIT = ITEMS.register("rowa_fruit",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}