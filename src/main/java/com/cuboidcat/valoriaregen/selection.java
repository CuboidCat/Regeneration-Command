package com.cuboidcat.valoriaregen;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.LocalSession;
import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.function.mask.Mask;
import com.sk89q.worldedit.internal.annotation.Selection;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.CuboidRegion;

import com.sk89q.worldedit.regions.Region;
import com.sk89q.worldedit.regions.selector.CuboidRegionSelector;
import com.sk89q.worldedit.session.SessionManager;
import com.sk89q.worldedit.session.SessionOwner;
import com.sk89q.worldedit.world.RegenOptions;
import com.sk89q.worldedit.world.World;
import org.bukkit.entity.Player;
import org.bukkit.util.BlockVector;

public class selection {
    public static CuboidRegion region;
    public selection (Player player, int x1, int y1, int z1, int x2, int y2, int z2) {
        BlockVector3 pos1 = BlockVector3.at(x1, y1, z1);
        BlockVector3 pos2 = BlockVector3.at(x2, y2, z2);
        region = new CuboidRegion(BukkitAdapter.adapt(player.getWorld()), pos1, pos2);
        Region rg = region;
        EditSession es = ValoriaRegen.getWorldEdit().newEditSessionBuilder().world(rg.getWorld()).build();
        es.setMask(null);
        rg.getWorld().regenerate(rg, es);
        es.close();
        System.out.println(pos1);
        System.out.println(pos2);
    }
    public static CuboidRegion getCuboidRegion() {
        return region;
    }
}
