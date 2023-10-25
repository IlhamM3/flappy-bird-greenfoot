import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carabermain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carabermain extends World
{

    /**
     * Constructor for objects of class carabermain.
     * 
     */
    public carabermain()
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
        close close = new close();
        addObject(close,531,96);
        close.setLocation(526,101);
        close.setLocation(540,100);
    }
}
