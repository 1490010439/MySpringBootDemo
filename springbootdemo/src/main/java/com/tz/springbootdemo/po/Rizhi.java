package com.tz.springbootdemo.po;

import java.util.Date;

public class Rizhi {
    private Integer rizhiid;

    private String rizhitexthead;

    private String rizhiauthor;

    private String rizhizang;

    private Date rizhitime;

    private String rizhitext;

    public Integer getRizhiid() {
        return rizhiid;
    }

    public void setRizhiid(Integer rizhiid) {
        this.rizhiid = rizhiid;
    }

    public String getRizhitexthead() {
        return rizhitexthead;
    }

    public void setRizhitexthead(String rizhitexthead) {
        this.rizhitexthead = rizhitexthead == null ? null : rizhitexthead.trim();
    }

    public String getRizhiauthor() {
        return rizhiauthor;
    }

    public void setRizhiauthor(String rizhiauthor) {
        this.rizhiauthor = rizhiauthor == null ? null : rizhiauthor.trim();
    }

    public String getRizhizang() {
        return rizhizang;
    }

    public void setRizhizang(String rizhizang) {
        this.rizhizang = rizhizang == null ? null : rizhizang.trim();
    }

    public Date getRizhitime() {
        return rizhitime;
    }

    public void setRizhitime(Date rizhitime) {
        this.rizhitime = rizhitime;
    }

    public String getRizhitext() {
        return rizhitext;
    }

    public void setRizhitext(String rizhitext) {
        this.rizhitext = rizhitext == null ? null : rizhitext.trim();
    }
}