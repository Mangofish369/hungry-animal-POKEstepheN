import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant can move.
 * 
 * Stephen Liu 
 * November 25, 2022
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound=new GreenfootSound("elephantcub.mp3");
    
    public Elephant()
    {
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+5);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            //play sound
            elephantSound.play();
            
            removeTouching(Apple.class);
            
            MyWorld myworld=(MyWorld) getWorld();
            myworld.increaseScore();
            myworld.spawnApple();
        }
    }
}
