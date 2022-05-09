package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameObject {
    boolean[][] pixels;
    int res;
    double size = 1;

    public GameObject(){

    }
    public GameObject(int res){
        this.res = res;
        pixels = new boolean[res][res];

        for(int i = 0; i<res; i++)
            for(int j = 0; j<res; j++)
                pixels[i][j] = Math.sqrt(Math.pow((res/2)-i,2) + Math.pow((res/2)-j,2)) < res/3;




             for(int i = res/2; i<res; i++)
            for(int j=res/2; j<res; j++)
                pixels[i][j] = false;

//System.out.println("Hey!!");
//        for(int i = 0; i<res; i++){
//            for(int j = 0; j<res; j++){
//                if(pixels[i][j])
//                    System.out.print(1);
//                else
//                    System.out.print(0);
//            }
//            System.out.println();
//        }


    }


    public GameObject(int res, double size){
        this(res);
        this.size = size;
    }

    public void render(ShapeRenderer renderer){

    }
    public float[] toPolygon(int vertices){
        float[] out = new float[vertices*2];
        for(int i = 0; i<vertices; i++){
            double dir = i*2*Math.PI/vertices;
            int dist = 0;
            boolean hit = false;
            int farthest = 0;
            while(dist<res/2-1) {
                dist++;
                if(pixels[res/2 + (int)(dist*Math.cos(dir))][res/2 + (int)(dist*Math.sin(dir))]) {
                    hit = true;
                    farthest = dist;
                }
            }

            out[i*2] = (float)(farthest*Math.cos(dir)*size);
            out[i*2+1] = (float)(farthest*Math.sin(dir)*size);
        }
        return out;
    }

}
