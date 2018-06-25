
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playfield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playfield extends World
{

    /**
     * Constructor for objects of class Playfield.
     * 
     */
    static GreenfootSound backgroundMusic = new GreenfootSound("InGame.mp3");
    public Playfield()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(350, 585, 1,false);
        backgroundMusic.setVolume(30);
        backgroundMusic.playLoop();
        setPaintOrder(Back.class,RedHearts.class,YellowHearts.class,TopScreen.class,BottomScreen.class,Car.class,ZebraCross.class,Road.class);
        
        prepare();
        
          // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
      
        
    }

    private TrafficLight TrafficLight;
    
    public void prepare()
    {
        //Screen UI
        TopScreen Atas = new TopScreen();
        addObject(Atas,getWidth()/2,getHeight()-569);
        BottomScreen Bawah = new BottomScreen();
        addObject(Bawah,getWidth()/2,getHeight()-45);

        //Hearts Red
        HatiBeta Hati = new HatiBeta();
        addObject(Hati,getWidth()/2,510);
        /*
        RedHeartsKanan redkanan = new RedHeartsKanan();
        addObject(redkanan,210,510);
        RedHeartsTengah redtengah = new RedHeartsTengah();
        addObject(redtengah,getWidth()/2,510);
        RedHeartsKiri redkiri = new RedHeartsKiri();
        addObject(redkiri,getWidth()-210,510);
         */

        //Hearts Yellow
        HatiYellowBeta HatiYel = new HatiYellowBeta();
        addObject(HatiYel,235,563);
        /*
        YellowHearts yelkanan = new YellowHearts();
        addObject(yelkanan,245,563);
        YellowHearts yeltengah = new YellowHearts();
        addObject(yeltengah,230,563);
        YellowHearts yelkiri = new YellowHearts();
        addObject(yelkiri,215,563);
         */

        //Car
        Car mobil = new Car();
        addObject(mobil,getWidth()/2,getHeight()-150);

        //Moving Object
        Road jalan = new Road();
        addObject(jalan,getWidth()/2,getHeight()/2);
        Road jalan2 = new Road();
        addObject(jalan2, getWidth()/2,0-getHeight());
        Road jalan3 = new Road();
        addObject(jalan3, getWidth()/2,0-getHeight()-getHeight());
        Road jalan4 = new Road();
        addObject(jalan4, getWidth()/2,0-getHeight()-getHeight()-getHeight());
        GenerateLamp lamp = new GenerateLamp();
        addObject(lamp, getWidth()/2,0-getHeight());

        //Button
        Back bck = new Back();
        addObject(bck,300,15);

        //counter

    }
    
    public TrafficLight getCounter()
    {
        return TrafficLight;
    }
    
    
}
