package com.chain4j.service.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rz on 2018/2/7.
 */
public class Block implements Serializable{

    private BlockIndex blockIndex;
    private List<Transaction> transactionList = new ArrayList<Transaction>();
    private String hash;

    public BlockIndex getBlockIndex() {
        return blockIndex;
    }

    public Block setBlockIndex(BlockIndex blockIndex) {
        this.blockIndex = blockIndex;
        return this;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public Block setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public Block setHash(String hash) {
        this.hash = hash;
        return this;
    }
}
