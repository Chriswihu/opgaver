package darwin.implementation.animals.bird;

import darwin.model.animals.bird.Gull;

public class Gullimpl implements Gull
{
    @Override
    public String feed()
    {
        return "The Gull eats French Fries";
    }

    @Override
    public String makeSound()
    {
        return "The Gull says Cawww!";
    }
}
