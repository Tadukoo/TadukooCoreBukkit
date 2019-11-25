package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import java.util.logging.Level;

import com.gmail.realtadukoo.MinecraftAPI.ConsoleManager;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public class BukkitConsoleManager extends BukkitManager implements ConsoleManager{
	
	public BukkitConsoleManager(TadukooCorePlugin plugin){
		super(plugin);
	}
	
	@Override
	public void printMessage(String priority, Color color, Format[] otherFormatting, String message){
		String formattedMessage = formatMan.getFormattedMessage(color, otherFormatting, message);
		plugin.getLogger().log(Level.INFO, formattedMessage);
	}
}
