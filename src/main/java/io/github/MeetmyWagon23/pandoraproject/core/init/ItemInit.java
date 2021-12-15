package io.github.MeetmyWagon23.pandoraproject.core.init;

import io.github.MeetmyWagon23.pandoraproject.PandoraProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			PandoraProject.MOD_ID);

}
