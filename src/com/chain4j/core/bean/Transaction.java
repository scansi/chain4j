package com.chain4j.bean;

import java.util.List;

/**
 * Created by rocketz@aliyun.com on 2018/2/7.
 * 交易类
 */
public class Transaction {
    /**
     * 借入
     */
    private List<TranscationDebit> debits;
    /**
     * 贷出
     */
    private List<TranscationCredit> credits;

    public List<TranscationDebit> getDebits() {
        return debits;
    }

    public Transaction setDebits(List<TranscationDebit> debits) {
        this.debits = debits;
        return this;
    }

    public List<TranscationCredit> getCredits() {
        return credits;
    }

    public Transaction setCredits(List<TranscationCredit> credits) {
        this.credits = credits;
        return this;
    }
}
