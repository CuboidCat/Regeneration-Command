package com.cuboidcat.valoriaregen;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class regen implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            Location loc = player.getLocation();
            Chunk chunk = loc.getChunk();
        int blockX1 = chunk.getX() << 4;
        int blockZ1 = chunk.getZ() << 4;
        int blockX2 =  blockX1+16;
        int blockZ2 = blockZ1+16;
        new selection(player,blockX1, 0, blockZ1, blockX2, -64, blockZ2);
    }
    return false;
    }
}
