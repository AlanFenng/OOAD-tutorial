package com.thinking.OOAD.rick.model;

/**
 * Created by Administrator on 2016-11-30.
 */
public class GuitarSpec {
    private Builder builder;
    private Type type;
    private String model;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec otherSpec){
        if(builder != otherSpec.getBuilder())
            return false;
        String model = this.model.toLowerCase();
        if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel().toLowerCase())))
            return false;
        if(type != otherSpec.getType())
            return false;
        if(backWood != otherSpec.getBackWood())
            return false;
        if (topWood != otherSpec.getTopWood())
            return false;
        if (numStrings != otherSpec.getNumStrings())
            return false;
        return true;
    }
}
