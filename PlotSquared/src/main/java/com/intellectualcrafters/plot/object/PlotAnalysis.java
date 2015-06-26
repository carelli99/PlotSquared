package com.intellectualcrafters.plot.object;

public class PlotAnalysis {
    public final long diff;
    public final long variety;
    public final long verticies;
    public final long rotation;
    public final long height_sd;
    public final long regularity;
    
    public PlotAnalysis(int diff, int variety, int verticies, int rotation, int height_sd, int regularity) {
        this.diff = diff;
        this.variety = variety;
        this.verticies = verticies;
        this.rotation = rotation;
        this.height_sd = height_sd;
        this.regularity = regularity;
    }
}