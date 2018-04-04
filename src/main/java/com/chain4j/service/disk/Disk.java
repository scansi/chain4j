package com.chain4j.service.disk;


import com.chain4j.service.bean.Block;
import com.chain4j.service.bean.BlockIndex;

import java.io.*;

/**
 * Created by rz on 2018/3/26.
 */
public class Disk {

    private final static String basePath = "D://block//";

    private static Integer index = 0;

    public Long createBlock(Block block) {
        String fileName = basePath + "block" + index + ".dat";
        File file = new File(fileName);
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            if(file.length() > 94371840) {
                ++index;
                fileName = basePath + "block" + index + ".dat";
                file = new File(fileName);
                file.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            Long pos = raf.length();
            raf.seek(pos);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(block);
            raf.write(bos.toByteArray());
            return pos;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0L;
    }

    public Block findBlock(BlockIndex index) {
        String fileName = basePath + "block" + index.getFileIndex() + ".dat";
        File file = new File(fileName);
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek(index.getPos());
            byte[] bytes = new byte[32];
            raf.read(bytes);
            ByteArrayInputStream bis = new ByteArrayInputStream (bytes);
            ObjectInputStream ois = new ObjectInputStream (bis);
            Block block = (Block) ois.readObject();
            return block;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new Block();
    }

    public static void main(String[] args) {
        Disk disk = new Disk();
//        disk.createBlock(new Block());
        BlockIndex blockIndex = new BlockIndex();
        blockIndex.setFileIndex(0);
        blockIndex.setPos(0L);
        disk.findBlock(blockIndex);
    }
}
