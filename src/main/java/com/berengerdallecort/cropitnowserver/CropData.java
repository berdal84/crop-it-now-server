package com.berengerdallecort.cropitnowserver;

public class CropData {

    private final String name;

    /* file content, string may not be the right type to do that, but i'll change it later */
    private final String fileContent;

    /* first corner UVs */
    private final float corner1_u;
    private final float corner1_v;

    /* second corner UVs */
    private final float corner2_u;
    private final float corner2_v;

    
    public CropData(String name, float corner1_u, float corner1_v, float corner2_u, float corner2_v) {
        this.name = name;

        /* default init */
        this.fileContent = "empty";

        this.corner1_u = corner1_u;
        this.corner1_v = corner1_v;

        this.corner2_u = corner2_u;
        this.corner2_v = corner2_v;
    }

    public String toString(){
        return String.format("CropData: name=\"%s\", corner1_u=%f, corner1_v=%f, corner2_u=%f, corner2_v=%f\n", this.name, this.corner1_u, this.corner1_v, this.corner2_u, this.corner2_v); 
    }

}