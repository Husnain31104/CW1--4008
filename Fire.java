import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * First of all I would Take integer to get score on screen 
 */
public class Fire extends Actor
{
     private int score = 0;
    /**
     * 
     */
    public void Fire()
    {
    }

    /**
     * Act - do whatever the Fire wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        eatBomb();
        eatBonus();
    }

    /**
     * I use Fire To make game intresting here like we can use it now
     */
    public void eatBomb()
    {
        if (isTouching(Bomb.class)) {
            removeTouching(Bomb.class);
        }
    }
    public void eatBonus()
    { 
    if(isTouching(Bonus.class)){
    removeTouching(Bonus.class);
    score = score + 1000;
    getWorld().showText("You win", 300, 200);
    }
    
    }
}
