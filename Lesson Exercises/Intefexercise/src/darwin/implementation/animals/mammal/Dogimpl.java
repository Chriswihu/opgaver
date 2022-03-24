package darwin.implementation.animals.mammal;

import darwin.model.animals.mammal.Dog;

public class Dogimpl implements Dog {
    @Override
    public String feed() {
        return "The Dog eats bones";
    }

    @Override
    public String makeSound() {
        return "The Dog says Woof!";
    }
}
