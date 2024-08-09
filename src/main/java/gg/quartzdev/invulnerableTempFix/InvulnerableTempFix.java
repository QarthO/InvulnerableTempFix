package gg.quartzdev.invulnerableTempFix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class InvulnerableTempFix extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ChatCanceller(), this);
    }

    public static class ChatCanceller implements Listener
    {
        @EventHandler(priority = EventPriority.LOWEST)
        public void onPlayerChat(PlayerJoinEvent e)
        {
            if(e.getPlayer().hasPermission("invulnerabletempfix.onjoin"))
                e.getPlayer().setInvulnerable(false);
        }
    }

}
