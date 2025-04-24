package com.disableend;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableEnd implements ModInitializer {
	public static final String MOD_ID = "disable_end";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final GameRules.Key<GameRules.BooleanRule> DISABLE_END = GameRuleRegistry.register("disableEnd", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(false));


	@Override
	public void onInitialize() {
	}

}