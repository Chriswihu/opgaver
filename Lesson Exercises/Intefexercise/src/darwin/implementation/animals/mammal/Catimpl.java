package darwin.implementation.animals.mammal;

import darwin.model.animals.mammal.Cat;

public class Catimpl implements Cat {
    @Override
    public String feed() {
        return "The Cat eats the mouse";
    }

    @Override
    public String makeSound() {
        return "The Cat says Meoww!";
    }
}
