import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends UI
{
    /**
     * Act - do whatever the Road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    public static float speed = 1;
    public static float velocity = 0f;
    public int count = 0;
    public int posY = 0;
    public void act() 
    {
        // Add your action code here.
       
        movement();
        //if(count==970)
        //{
         //   count = 0;
        //    resetRoad();
        //}
        
        if (getY() >= getWorld().getHeight()/2 + getImage().getHeight())
        {
            generateRoad();
            getWorld().removeObject(this);
            return;
        }
        if((getY()/2)==(getImage().getHeight()))
        {
            //generateRoad();
        }
        if(getX()>getWorld().getHeight())
        {
            getWorld().removeObject(this);
        }
        //count++;
    }
    public void generateRoad()
    {
        Road jalan = new Road();
        getWorld().addObject(jalan, getWorld().getWidth()/2,(getWorld().getHeight()/2) - getImage().getHeight());
        //jalan.setLocation(getWorld().getWidth()/2,(getWorld().getHeight()/2) - getImage().getHeight());
    }
    /*
    public void resetRoad()
    {
        
        Road jalan = new Road();
        getWorld().addObject(jalan, getWorld().getWidth()/2, 0);
        Road jalan2 = new Road();
        getWorld().addObject(jalan2, getWorld().getWidth()/2, 0-getWorld().getHeight());
    }*/
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
