
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playfield here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class Playfield extends World
{
    static GreenfootSound backgroundMusic = new GreenfootSound("InGame.mp3");
    public Playfield()
    {    
        super(350, 585, 1,false);
        backgroundMusic.setVolume(30);
        backgroundMusic.playLoop();
        setPaintOrder(Back.class,RedHearts.class,YellowHearts.class,TopScreen.class,BottomScreen.class,Car.class,ZebraCross.class,Road.class);
        prepare();
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
        //Hearts Yellow
        HatiYellowBeta HatiYel = new HatiYellowBeta();
        addObject(HatiYel,235,563);
        //Car
        Car mobil = new Car();
        addObject(mobil,getWidth()/2,getHeight()-150);

        //Moving Object
        int y = getHeight()/2;
        Road jalan = new Road();
        addObject(jalan,getWidth()/2,y);
        y = y - jalan.getImage().getHeight();
        Road jalan2 = new Road();
        addObject(jalan2, getWidth()/2,y);

        GenerateLamp lamp = new GenerateLamp();
        addObject(lamp, getWidth()/2,0-getHeight());

        //Button
        Back bck = new Back();
        addObject(bck,300,15);

    }
    
    public TrafficLight getCounter()
    {
        return TrafficLight;
    }
    
    
}
