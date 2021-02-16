package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;

public class FabricMinecartComparatorLogicRegistry {
	private static final Map<EntityType<?>, MinecartComparatorLogic<?>> logics = new HashMap<>();

	/* @Nullable */
	@SuppressWarnings("unchecked") // just to appease typechecker, we checked in the entity type builder that the type of the logic exactly matches the entity type
	public static MinecartComparatorLogic<AbstractMinecartEntity> getCustomComparatorLogic(EntityType<?> type) {
		return (MinecartComparatorLogic<AbstractMinecartEntity>) logics.get(type);
	}

	static void registerCustomLogic(EntityType<?> type, MinecartComparatorLogic<?> logic) {
		logics.put(type, logic);
	}
}
