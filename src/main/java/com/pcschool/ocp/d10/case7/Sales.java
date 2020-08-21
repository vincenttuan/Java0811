package com.pcschool.ocp.d10.case7;

import java.util.Date;

public class Sales {

    private String region;
    private String country;
    private String itemtype;
    private String saleschannel;
    private String orderpriority;
    private Date orderdate;
    private int orderid;
    private Date shipdate;
    private int unitssold;
    private double unitprice;
    private double unitcost;
    private double totalrevenue;
    private double totalcost;
    private int totalprofit;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public String getSaleschannel() {
        return saleschannel;
    }

    public void setSaleschannel(String saleschannel) {
        this.saleschannel = saleschannel;
    }

    public String getOrderpriority() {
        return orderpriority;
    }

    public void setOrderpriority(String orderpriority) {
        this.orderpriority = orderpriority;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public int getUnitssold() {
        return unitssold;
    }

    public void setUnitssold(int unitssold) {
        this.unitssold = unitssold;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(double unitcost) {
        this.unitcost = unitcost;
    }

    public double getTotalrevenue() {
        return totalrevenue;
    }

    public void setTotalrevenue(double totalrevenue) {
        this.totalrevenue = totalrevenue;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(double totalcost) {
        this.totalcost = totalcost;
    }

    public int getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(int totalprofit) {
        this.totalprofit = totalprofit;
    }

    @Override
    public String toString() {
        return "Sales{" + "region=" + region + ", country=" + country + ", itemtype=" + itemtype + ", saleschannel=" + saleschannel + ", orderpriority=" + orderpriority + ", orderdate=" + orderdate + ", orderid=" + orderid + ", shipdate=" + shipdate + ", unitssold=" + unitssold + ", unitprice=" + unitprice + ", unitcost=" + unitcost + ", totalrevenue=" + totalrevenue + ", totalcost=" + totalcost + ", totalprofit=" + totalprofit + '}';
    }
    
}
