package com.zds.zhouyi;

import java.io.Serializable;

/**
 * @Author: ZDS
 * @Date:2023/10/24
 * @Desc:卦 实体
 */
public class Gua implements Serializable {
    /**
     * 卦数字
     */
    int id;
    /**
     * 卦名
     */
    String name;
    /**
     * 卦序号
     */
    int indexGua;
    /**
     * 描述
     */
    String descrip;


    /**
     * 详情
     */
    String detail;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexGua() {
        return indexGua;
    }

    public void setIndexGua(int indexGua) {
        this.indexGua = indexGua;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Gua() {
    }

    public Gua(int id, String name, int indexGua, String descrip) {
        this.id = id;
        this.name = name;
        this.indexGua = indexGua;
        this.descrip = descrip;
    }

    public Gua(int id, String name, int indexGua, String descrip, String detail) {
        this.id = id;
        this.name = name;
        this.indexGua = indexGua;
        this.descrip = descrip;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "序号：" + id +
                "  卦名：" + name +
                "  第" + indexGua +
                "卦  " + descrip;
    }
}
