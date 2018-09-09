package com.tz.springbootdemo.util;

public class AjaxResult {

    private int retcode = 1;
    private String retmsg = "操作成功";
    private Object data;
    private String ObjectName="data";
    private String dataResult;

    public AjaxResult(int retcode, String retmsg, Object data){
        this.retcode = retcode;
        this.retmsg = retmsg;
        this.data = data;
    }

    public AjaxResult(int retcode, String retmsg){
        this.retcode = retcode;
        this.retmsg = retmsg;
    }

    public AjaxResult(Object data){
        this.retmsg = "查询成功";
        this.data = data;
    }

    public AjaxResult(int retcode){
        this.retcode = retcode;
        this.retmsg = "操作失败";
    }

    public AjaxResult(String retmsg){
        this.retcode = 0;
        this.retmsg = retmsg;
    }

    public AjaxResult(String ObjectName,String dataresult){
        this.retcode = 1;
        this.retmsg = "查询成功";
        this.dataResult = dataresult;
        this.ObjectName = ObjectName;
    }


    public AjaxResult(){

    }

    public int getRetcode() {
        return retcode;
    }
    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }
    public String getRetmsg() {
        return retmsg;
    }
    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getObjectName() { return ObjectName; }
    public void setObjectName(String dataResult) {
        this.dataResult = dataResult;
    }
    public String getdataResult() { return dataResult; }
    public void setdataResult(String dataResult) {
        this.dataResult = dataResult;
    }

    @Override
    public String toString() {
        System.out.println(""+ObjectName);
        return "{\"retcode\":\"" + retcode + "\",\"retmsg\":\"" +retmsg+"\",\""+ObjectName+"\":" +dataResult + "}";
    }

}
