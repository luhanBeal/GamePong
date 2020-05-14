package com.luhan.mypackage;

import java.awt.*;

public class Enemy {
    // double pq a velocidade pode alterar
    public double x,y;
    public int width, height;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 10;
    }

    public void tick(){
        x+= (Game.ball.x - x -8) * 0.07;
    }

    public void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect((int)x,(int)y, width,height);
    }

}
