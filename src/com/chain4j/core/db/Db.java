package com.chain4j.db;

import com.chain4j.bean.Block;
import com.chain4j.bean.BlockIndex;
import com.chain4j.bean.Transaction;

/**
 * Created by rocketz on 2018/2/7.
 */
public class Db {

    public Boolean createTransaction(Transaction transaction) {
        return true;
    }

    public Transaction findTransaction(String key) {
        return new Transaction();
    }

    public Boolean createBlockIndex(BlockIndex blockIndex) {
        return true;
    }

    public BlockIndex findBlockIndex(String key) {
        return new BlockIndex();
    }
}
