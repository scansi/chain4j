package com.chain4j.main;

import com.chain4j.bean.Key;
import com.chain4j.bean.Transaction;
import com.chain4j.bean.TranscationCredit;
import com.chain4j.utils.HashUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rocketz@aliyun.com on 2018/3/7.
 */
public class main {
    private Map<String, String> mapKeys = new HashMap<String, String>();
    private Map<String, String> mapPubKeys = new HashMap<String, String>();

    public Boolean addKey(Key key) throws Exception {
        mapKeys.put(key.getPublicKey(), key.getPrivateKey());
        mapPubKeys.put(HashUtil.md5(key.getPublicKey()), key.getPublicKey());
        return true;
    }

    public String generateNewKey() throws Exception {
        Key key = new Key();
        key.makeNewKey();
        return key.getPublicKey();
    }

    public Boolean sendMoney(String acceptPublicKey, Integer fee) {

        Transaction transaction = new Transaction();
        List<TranscationCredit> transcationCredits = new ArrayList<TranscationCredit>();
        //记贷出
        transcationCredits.add(new TranscationCredit().setAcceptPublicKey(acceptPublicKey));
        //记借入

        //提交到伯克利db，key是hash，value是交易对象

        return null;
    }

    public Boolean createTransaction(Integer fee) {
        //复式记账法，有借必有贷，借贷必相等
        //获取所有指向自己的Out

        //遍历所有指向自己的Out，找到一笔Out的金额大于等于fee

        //创建一个Out，存入Out数组

        //如果该Out金额大于fee，超出部分再创建一个指向自己的Out，存入Out数组，比如Out金额为101，支付100，退回1，Out数组length为2，支付100和退回1

        //根据Out数组创建In数组，Out数组表示所有的贷，In标识所有的借，根据复式记账法A到B支付101，B到A退回1，A记贷101，B记借101，B记贷1，A记借1
        //A贷101，借1，B贷1，借101，贷两笔A贷101，B贷1，Out数组两条记录，借两笔A借1，B借101，In数组两条记录
        //Debit债务翻译为借，Credit信用翻译为贷，翻译者为福泽谕吉（一万日元上的头像），借的意思是借入，形成了债务，贷的意思是贷出，贷出资产得到了对方支付的信用

        //交易手续费的计算，先预估一个金额，最后如果实际大于预估重新计算

        //交易创建完成后提交，交易创建的过程实际上就是一个复式记账的过程


        return false;
    }

    public Boolean selectCoins(Integer fee) {
        //取钱包所有借入迭代
        //进入跌代
        //取当前金额n，小于0 进入下一次迭代
        //金额n小于支付金额F，把当前数据存入备份集合A，累加金额S
        //金额n等于支付金额F，把当前数据存入结果集合B，返回true
        //如果以上都不符合，金额n肯定大于F，判断金额n是否小于最低可支付金额l，更新最低可支付金额l，保存最低可支付金额数据L，目的是在所有大于支付金额的数据里找到最小的一条用于支付
        //跳出跌代

        //如果累加金额S小于支付金额F，如果最低可支付数据L为null，说明没有大于F的n，返回false，否则，将最低可支付数据L存入结果集合，返回true

        //以上代码处理大于等于的场景，小于累加的场景通过以下代码处理
        //第一层迭代0到999，第二层0或1，第三层循环备份集合A中所有小于的金额
        //累加nt，如果nt小于F进入下一次循环，计算最佳累加bt

        //金额大于里的最小和小于的累加里的最佳哪个与支付金额差额小选哪个，返回true

        return false;
    }
}
