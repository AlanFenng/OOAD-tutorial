package com.thinking.OOAD.rick.model;

/**
 * Created by Administrator on 2016-11-29.
 */
public enum Type {
    ACOUSTIC,ELECTRIC;

    public String toString() {
        switch (this){
            case ACOUSTIC:return "acoustic";
            case ELECTRIC:return "electric";
            default:return null;
        }
    }
}
