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
     * 编码
     */
    String code;

    /**
     * 卦辞
     */
    String detail;
    /**
     * 推断
     */
    String inference;
    /**
     * 大象
     */
    String daXiang;

    /**
     * 运势
     */
    String fortune;

    /**
     * 爱情
     */
    String love;

    /**
     * 疾病
     */
    String disease;
    /**
     * 失物
     */
    String lost;

    /**
     * 诉讼
     */
    String litigation;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInference() {
        return inference;
    }

    public void setInference(String inference) {
        this.inference = inference;
    }

    public String getDaXiang() {
        return daXiang;
    }

    public void setDaXiang(String daXiang) {
        this.daXiang = daXiang;
    }

    public String getFortune() {
        return fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getLost() {
        return lost;
    }

    public void setLost(String lost) {
        this.lost = lost;
    }

    public String getLitigation() {
        return litigation;
    }

    public void setLitigation(String litigation) {
        this.litigation = litigation;
    }

    public Gua(int id, String name, int indexGua, String descrip, String code, String detail,
               String inference, String daXiang, String fortune, String love, String disease,
               String lost, String litigation) {
        this.id = id;
        this.name = name;
        this.indexGua = indexGua;
        this.descrip = descrip;
        this.code = code;
        this.detail = detail;
        this.inference = inference;
        this.daXiang = daXiang;
        this.fortune = fortune;
        this.love = love;
        this.disease = disease;
        this.lost = lost;
        this.litigation = litigation;
    }

    @Override
    public String toString() {
        return "序号：" + id +
                "  卦名：" + name +
                "  第" + indexGua +
                "卦  " + descrip;
    }
}
