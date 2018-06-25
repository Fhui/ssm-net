package com.harry.base;

import java.io.Serializable;

/**
 * Created on 2018/5/26.
 */
public class PagingParam implements Serializable {

    private String where = "1=1";
    private String sort;

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
