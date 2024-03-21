package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.block.Block;

import java.lang.reflect.Array;

public class blockGrider {
    public static int[][][] gridIt(Block block, int size){
        int[][][] grid = new int[size][size][3];
        grid[size/2][size/2] = new int[]{block.getX(), block.getY(), block.getZ()};
        int i, e;
        for (e = 0; e<size;e++){
            for(i=0;i<size;i++){
                grid[i][e]= new  int[]{block.getX()-2+i, block.getY(), block.getZ()-2+e};
            }
        }
        return grid;
    }
}
