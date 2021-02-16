package net.fabricmc.fabric.api.object.builder.v1.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface MinecartComparatorLogic<T extends AbstractMinecartEntity> {
	/**
	 * Compute the comparator output of a detector rail when a minecart is resting
	 * on top of it.
	 * @param minecart The minecart on the rail
	 * @param state BlockState of the rail
	 * @param pos Position of the rail
	 * @return A redstone power value >= 0 to use, else a value < 0 to run vanilla's logic
	 */
	int getComparatorValue(T minecart, BlockState state, World world, BlockPos pos);
}
