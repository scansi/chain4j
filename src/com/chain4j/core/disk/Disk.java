package com.chain4j.disk;

import com.chain4j.bean.Block;
import com.chain4j.bean.BlockIndex;

import java.io.File;

/**
 * Created by TCLDUSER on 2018/3/26.
 */
public class Disk {

    private String basePath;

    public Boolean createBlock(Block block) {
        File file = new File(basePath);
        return true;
    }

    public Block findBlock(BlockIndex index) {
        return new Block();
    }
}
