package com.cuboidcat.valoriaregen.chunks;

import com.cuboidcat.valoriaregen.ValoriaRegen;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.WorldBorder;

public class Runs {
    public Runs(int x, int y, int z) {
        Location loc = new Location(ValoriaRegen.getWorld(), x, y , z);
        Chunk chunk = loc.getChunk();
        int blockX1 = chunk.getX() << 4;
        int blockZ1 = chunk.getZ() << 4;
        int blockX2 = chunk.getX() >> 4;
        int blockZ2 = chunk.getZ() >> 4;
        Runnable chunks = new Runnable() {
            @Override
            public void run() {

            }
        };
        Bukkit.getScheduler().scheduleSyncRepeatingTask(ValoriaRegen.getInstance(), chunks, 60, 60);
    }
}
