package org.cain.cfbanner;

import org.bukkit.plugin.java.JavaPlugin;
import org.cain.cfbanner.listeners.PlayerListener;

public class CFBanner extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents( new PlayerListener(), this );
		System.out.println("[CFBanner] CFBanner has been enabled!");
	}
	
	public void onDisable() {
		System.out.println("[CFBanner] CFBanner has been disabled!");
	}

}
