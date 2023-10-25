import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pipa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pipa extends Actor
{
    /**
     * Act - do whatever the pipa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pipa(){
        GreenfootImage image = getImage();
        image.scale(512, 900);
    }
    public void act() 
    {
        if(player.isAlive()){
            setLocation(getX() - 1, getY());
        }
        if(getX() <= 1){
            setLocation(getX() + 700, 75 + Greenfoot.getRandomNumber(225));
        }
    }
}
