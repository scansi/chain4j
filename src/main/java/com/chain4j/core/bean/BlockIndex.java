package com.chain4j.core.bean;

/**
 * Created by rz on 2018/2/7.
 */
public class BlockIndex {
    private Block block;
    private BlockIndex prev;
    private BlockIndex next;

    public Block getBlock() {
        return block;
    }

    public BlockIndex setBlock(Block block) {
        this.block = block;
        return this;
    }

    public BlockIndex getPrev() {
        return prev;
    }

    public BlockIndex setPrev(BlockIndex prev) {
        this.prev = prev;
        return this;
    }

    public BlockIndex getNext() {
        return next;
    }

    public BlockIndex setNext(BlockIndex next) {
        this.next = next;
        return this;
    }
}
