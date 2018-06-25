import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    static GreenfootSound backgroundMusic = new GreenfootSound("Main Menu.mp3");
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(350, 585, 1);
        backgroundMusic.setVolume(30);
        backgroundMusic.playLoop();
        prepare();
    }
    private PlayTutorial Play;
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back back = new Back();
        addObject(back,294,464);
        PlayTutorial playtutorial = new PlayTutorial();
        addObject(playtutorial,44,463);
        playtutorial.setLocation(45,463);

        BottomScreen Bawah = new BottomScreen();
        addObject(Bawah,getWidth()/2,getHeight()-45);

        Car mobil = new Car();
        addObject(mobil,getWidth()/2,getHeight()-150);

        //Hearts Yellow
        HatiYellowBeta HatiYel = new HatiYellowBeta();
        addObject(HatiYel,235,563);

        //Hearts Red
        HatiBeta Hati = new HatiBeta();
        addObject(Hati,getWidth()/2,510);
        Red red = new Red();
        addObject(red,184,230);
        red.setLocation(181,229);
        Green green = new Green();
        addObject(green,151,120);
        green.setLocation(180,129);
        Yellow yellow = new Yellow();
        addObject(yellow,182,331);
        removeObject(playtutorial);
    }


    public PlayTutorial getCounter()
    {
        return Play;
    }
}
