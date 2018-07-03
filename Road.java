import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class Road extends UI
{
    private int counter = 0;
    public static float speed = 1;
    public static float velocity = 0f;
    public int posY = 0;
    public void act() 
    {
        movement();
        if (getY() >= getWorld().getHeight()/2 + getImage().getHeight())
        {
            generateRoad();
            getWorld().removeObject(this);
            return;
        }
        if(getX()>getWorld().getHeight())
        {
            getWorld().removeObject(this);
            return;
        }
    }
    public void generateRoad()
    {
        Road jalan = new Road();
        getWorld().addObject(jalan, getWorld().getWidth()/2,(getWorld().getHeight()/2) - getImage().getHeight());
    }
    private void movement()
    {
        setLocation(getX(),(int)(getY()+speed));
        speed+=velocity;
    }
    public static float getSpeed()
    {
        return speed;
    }

}
