import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZebraCross here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class ZebraCross extends Actor
{
    /**
     * Act - do whatever the ZebraCross wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static float speed = 0f;
    public int state = 0;
    public int score = 0;
    int cek = 0;
    private Actor car;
    public TrafficLight tl;
    public ZebraCross zc;
    
    public ZebraCross(int state)
    {
        this.state = state;
    }
    public int setState(int state)
    {
        return this.state = state;
    }
    public void act() 
    {
        // Add your action code here.
        tl = (TrafficLight)getOneObjectAtOffset(100, 0, TrafficLight.class);
        if(tl!=null)
        { 
            state=tl.getState();
        } 
        speed = Road.getSpeed();
        setLocation(getX(),(int)(getY()+speed));
        if (cek == 0)
        {
            if(isTouching(Car.class))
            {
     
                if(getState() == 1) //Kuning
                {
                    //System.out.println("Kuning"+ state);
                    //Merah.play();
                }
                if(getState() == 2) //Hijau
                {
                    //System.out.println("Hijau"+ state);
                    //Hijau.play();
                }
                if(getState()== 0) //Merah
                {
                    //System.out.println("Merah"+ state);
                    //Merah.play();
                }
            }
            //if (isTouching(ZebraCross.class))
            //{
            //    getWorld().removeObject(this);
            //}
            
        }
        if(getY()>585)
        {
            getWorld().removeObject(this);
            cek++;
        }
        /*zc = (ZebraCross)getOneObjectAtOffset(0, 10, ZebraCross.class);
        if (zc != null)
        {
            getWorld().removeObject(this);
        }*/  
    }
    
    public int getState()
    {
        return state;
    }
    public int State()
    {
        return state;
    }
}
