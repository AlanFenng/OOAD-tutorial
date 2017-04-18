package com.thinking.OOAD.rick.model;

/**
 * Created by Administrator on 2016-11-28.
 * 业务实体
 */
public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
