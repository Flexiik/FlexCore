package cz.flexiik.flexcore;

import cz.flexiik.flexcore.minecraft.commands.AdminPanelCommand;
import cz.flexiik.flexcore.minecraft.events.CustomChat;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlexCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("adminpanel").setExecutor(new AdminPanelCommand());
        getCommand("adminpanel").setTabCompleter(new AdminPanelCommand());
        getServer().getPluginManager().registerEvents(new CustomChat(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
