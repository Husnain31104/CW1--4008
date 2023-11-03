import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bomb extends Actor
{

    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
            move(Greenfoot.getRandomNumber(10) - 5);
        }
        else {
        }
        eatBug();
        eatFire();
    }

    /**
    I am trying to use class in which when bomb will with bug class it would remove.
    **/
    public void eatBug()
    {
        if (isTouching(Bug.class)) {
            removeTouching(Bug.class);
            getWorld().showText("You Lose", 300, 200);
        }
    }
    
    /**
     * I tried to use to remove fire what if Bomb touch fire by it self
     */
    public void eatFire()
    {
        if (isTouching(Fire.class)){
            removeTouching(Fire.class);
        }
    }
}
