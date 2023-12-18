package com.cuboidcat.valoriaregen;

import com.sk89q.worldedit.WorldEdit;
import org.apache.logging.log4j.CloseableThreadContext;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class ValoriaRegen extends JavaPlugin {
    private static Plugin instance;
    private static World world;


    @Override
    public void onEnable() {
        getCommand("regen").setExecutor(new regen());
        instance = this;
    }

    public static WorldEdit getWorldEdit() {
        WorldEdit we = WorldEdit.getInstance();
        return we;
    }
    public static Plugin getInstance(){
        return instance;
    }

    public static void setWorld(World main){
        world = main;
    }
    public static World getWorld() {
        return world;
    }
}
