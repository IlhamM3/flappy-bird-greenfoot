import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buah extends Actor
{
    /**
     * Act - do whatever the buah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(player.isAlive()){
            setLocation(getX() - 1, getY());
        }
        if(getX() <= 1){
            setLocation(getX() + 150, 75 + Greenfoot.getRandomNumber(225));
        }
    }
    public buah(){
        GreenfootImage image = getImage();
        image.scale(30, 30);
    }
}
