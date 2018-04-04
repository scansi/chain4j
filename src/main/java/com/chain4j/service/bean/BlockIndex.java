package com.chain4j.service.bean;

/**
 * Created by rz on 2018/2/7.
 */
public class BlockIndex {
    private Integer fileIndex;
    private Long pos;
    private BlockIndex prev;
    private BlockIndex next;

    public Integer getFileIndex() {
        return fileIndex;
    }

    public BlockIndex setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }

    public Long getPos() {
        return pos;
    }

    public BlockIndex setPos(Long pos) {
        this.pos = pos;
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
