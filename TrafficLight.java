import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrafficLight here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public  class TrafficLight extends Clickable
{
    public int state = 0;
    public int counter = 0,counter2 = 0;
    public static float speed = 0f;
    public boolean a;
    public ZebraCross z;
    public TrafficLight tl;
    public int GetRemove()
    {
        return counter2;
    }
    public int GetCoor()
    {
        int A = 0;
        if(!getWorld().getObjects(Car.class).isEmpty())
        {
            Actor Car = (Actor)getWorld().getObjects(Car.class).get(0);
            A = Car.getY();
        }  
        return A;
    }
    public void act() 
    {
        // Add your action code here.     
        if (counter==0)
        {
            state = Greenfoot.getRandomNumber(3);
            firstState();  
            counter++;
        }
        speed = Road.getSpeed();
        setLocation(getX(),(int)(getY()+speed));
        if(getY()>585)
        {
            getWorld().removeObject(this);
            counter++;
        }
        if(Greenfoot.mouseClicked(this))
        {
           changeState();
        }
        if(counter == 1)
        {
            if (isTouching(TrafficLight.class))
            {
                getWorld().removeObject(this);
            }
        }
    }    
    public void firstState()
    {
        
        if(state==1)
        {
            //Kuning
            setImage("YellowLight.png");
        }
        else if(state == 2)
        {
            //Hijau
            setImage("GreenLight.png");
        }
        else if(state == 0)
        {
            setImage("RedLight.png");
        }
    }
    public void changeState()
    {
        
        if(state==0)
        {
            //Lampu Merah jadi Kuning
            state = 1;
            setImage("YellowLight.png");
        }
        else if(state == 1)
        {
            //Lampu Kuning jadi Hijau
            state = 2;
            setImage("GreenLight.png");
        }
        else if(state == 2)
        {
            state = 0;
            setImage("RedLight.png");
        }
    }
    public void setState(int number)
    {
        state = number;
    }
    public int getState()
    {
        return state;
    }
    public int States()
    {
        int test;
        test = state;
        return test;
    }
    public int GetState()
    {
        return States();
    }
    public boolean CheckTouch()
    {       
        return a;
    }
}
