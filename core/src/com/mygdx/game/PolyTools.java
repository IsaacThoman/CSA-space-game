package com.mygdx.game;

public class PolyTools {
    public static float[] mult(float[] f, double x, double y){
        for(int i = 0; i<f.length; i++) {
            if (i % 2 == 0)
                f[i] *= x;
            else
                f[i] *= y;
        }
        return f;
    }
    public static float[] shift(float[] f, int x, int y){
        for(int i = 0; i<f.length; i++) {
            if (i % 2 == 0)
                f[i] += x;
            else
                f[i] += y;
        }
        return f;
    }

}
