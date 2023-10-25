import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homepage extends World
{
    public static GreenfootSound sound = new GreenfootSound("mulai.wav");
    /**
     * Constructor for objects of class homepage.
     * 
     */
    public homepage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start start = new start();
        addObject(start,296,252);
        help help = new help();
        addObject(help,340,279);
    }
    public void started(){
        sound.playLoop();
    }
}
