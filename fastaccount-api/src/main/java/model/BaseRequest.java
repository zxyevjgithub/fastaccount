package model;

import java.util.Date;

public class BaseRequest {

    //业务系统发生业务时间
    private Date tradeTime;

    //交易码- root节点
    private String trcode;

    //发起机构
    private String br;


    private Long amt;


    private String ccy;

    //交易的发起人
    private String tlr;

}
