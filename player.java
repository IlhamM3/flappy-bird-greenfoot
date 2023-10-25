import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private final double FLAP = 1.8;
    private boolean oldSpace = false;
    private double yVel = 0;
    private double y = 300;
    private boolean oldTouchingPipe = false;
    private static boolean dead;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        yVel += 0.02;
        if(spacePressed()){
            yVel = -FLAP;
        }
        y += yVel;
        setLocation(getX(), y);
        setRotation((int)(yVel * 16));
        if(isAtEdge()){
            dead = true;
        }
        boolean touchingPipe = false;
        for(pipa pipe : getWorld().getObjects(pipa.class)){
            if(Math.abs(pipe.getX() - getX()) < 40){
                if(Math.abs(pipe.getY() + 30 - getY()) > 37){
                    dead = true;
                }
                touchingPipe = true;
            }
        }
        if (!oldTouchingPipe && touchingPipe && !dead) {
            score.add(5);
        }
        if (isTouching(buah.class)) {
            Greenfoot.playSound("ambil.wav");
            score.add(50);
            removeTouching(buah.class);
            newbuah();
        }
        oldTouchingPipe = touchingPipe;
        MyWorld myWorld = (MyWorld) getWorld();
        if(dead){
            myWorld.gameover();
            getWorld().removeObject(myWorld.getPlayer());
        }
        score scoreObject = myWorld.getScore();
        if (scoreObject.getScore() >= 100) {
            myWorld.finish();
            myWorld.removeObject(myWorld.getPlayer());
        }
        
    }
    public void newbuah() 
    {
        getWorld().addObject(new buah(), 300, 175);
    }

    public player(double yVel)
    {
        GreenfootImage image = getImage();
        image.scale(35, 24);
        dead = false;
        this.yVel = yVel;
    }
    public player(){
        this(0);
    }
    public boolean spacePressed(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("space")){
            if(!oldSpace){
                pressed = true;
                Greenfoot.playSound("lompat.WAV");
            }
            oldSpace = true;
        }
        else{
            oldSpace = false;
        }
        return pressed;
    }
    public static boolean isAlive(){
        return !dead;
    }
    public void setLocation(double x, double y){
        super.setLocation((int)x, (int)y);
    }
}
