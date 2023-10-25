import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static GreenfootSound sound = new GreenfootSound("awal.wav");
    public static GreenfootSound soundfinish = new GreenfootSound("win.wav");
    public static GreenfootSound soundend = new GreenfootSound("gameover.wav");
    private score score;
    private player player;
    
    public MyWorld()
    {    
        super(600, 400, 1);
        player = new player(-1.3);
        score = new score();
        addObject(player, 70, 170);
        addObject(new pipa(), 300, 175);
        addObject(new pipa(), 600, 175);
        addObject(new buah(), 300, 175);
        addObject(score, 300, 100);
    }
    
    public score getScore() {
        return score;
    }
    
    public player getPlayer() {
        return player;
    }
    
    public void gameover(){
        soundend.play();
        addObject(new gameover(), 300, 200);
        addObject(new restart(), 300, 320);
    }
    
    public void finish()
    {
        soundfinish.play();
        addObject(new finish(), 300, 200);
        addObject(new restart(), 300, 320);
        addObject(new back(), 270, 320);
    }
}

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
