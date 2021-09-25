package Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Wall {
    List <Block> wall = new ArrayList<>();

    public  void placeBlock(Block block){
        String [] x = block.getAdjacent();
        for (String string: x) {
            if (string.equals(wall.get(wall.size() -1).toString())){
                wall.add(block);
            }else {
                System.out.println("Block " + block.getBlockType() + ("Can not be placed next to " + wall.get(wall.size() -1).toString()));
            }//At placing you must consider the transformation ability of the new block (if it has any)
        }
    }
    public void printStatus(){
        for (Block block: wall) {
            printStatus();
        }
    }
}

