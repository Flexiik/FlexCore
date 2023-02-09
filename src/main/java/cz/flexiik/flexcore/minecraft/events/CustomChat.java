package cz.flexiik.flexcore.minecraft.events;

import cz.flexiik.flexcore.FlexCore;
import cz.flexiik.flexcore.minecraft.commands.AdminPanelCommand;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public class CustomChat implements Listener {
    @EventHandler
    public void onChat(AsyncChatEvent e) {
        e.message(Component.text(e.getPlayer() + " " + e.originalMessage()));
    }
}
