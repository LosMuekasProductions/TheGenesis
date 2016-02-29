package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class PlayerHealth {

    private Texture healthpics[];
    private Texture usedHealthPic;


    private int health;

    public PlayerHealth(){
        health = 100;
        healthpics = new Texture[22];
        healthpics[0] = new Texture("healthbar/empty.png");
        for(int i = 1,  n = 0; i < 22; i++, n+=5){
            healthpics[i] = new Texture("healthbar/" +n + ".png");
        }
        usedHealthPic = healthpics[21];
        
    }


    public void takeDamage(int damage){
        health -= damage;
    }

    public Texture getHealthPic(){

        return usedHealthPic;

    }

    public void checkHealth(){
        if(this.health == 100){
            usedHealthPic = healthpics[21];

        }else if(this.health >= 95 && this.health < 100){
            usedHealthPic = healthpics[20];

        }else if(this.health >= 90 && this.health < 95){
            usedHealthPic = healthpics[19];

        }else if(this.health >= 85 && this.health < 90){
            usedHealthPic = healthpics[18];

        }else if(this.health >= 80 && this.health < 85){
            usedHealthPic = healthpics[17];

        }else if(this.health >= 75 && this.health < 80){
            usedHealthPic = healthpics[16];

        }else if(this.health >= 70 && this.health < 75){
            usedHealthPic = healthpics[15];

        }else if(this.health >= 65 && this.health < 70){
            usedHealthPic = healthpics[14];

        }else if(this.health >= 60 && this.health < 65){
            usedHealthPic = healthpics[13];

        }else if(this.health >= 55 && this.health < 60){
            usedHealthPic = healthpics[12];

        }else if(this.health >= 50 && this.health < 55){
            usedHealthPic = healthpics[11];

        }else if(this.health >= 45 && this.health < 50){
            usedHealthPic = healthpics[10];

        }else if(this.health >= 40 && this.health < 45){
            usedHealthPic = healthpics[9];

        }else if(this.health >= 35 && this.health < 40){
            usedHealthPic = healthpics[8];

        }else if(this.health >= 30 && this.health < 35){
            usedHealthPic = healthpics[7];

        }else if(this.health >= 25 && this.health < 30){
            usedHealthPic = healthpics[6];

        }else if(this.health >= 20 && this.health < 25){
            usedHealthPic = healthpics[5];

        }else if(this.health >= 15 && this.health < 20){
            usedHealthPic = healthpics[4];

        }else if(this.health >= 10 && this.health < 15){
            usedHealthPic = healthpics[3];

        }else if(this.health >= 5 && this.health < 10){
            usedHealthPic = healthpics[2];

        }else if(this.health > 2 && this.health < 5){
            usedHealthPic = healthpics[1];

        }else if(this.health >= 0 && this.health <= 2){
            usedHealthPic = healthpics[0];

        }

    }


}
