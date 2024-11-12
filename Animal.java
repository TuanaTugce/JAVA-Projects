class Animal
{
    private String name;
    public Animal(String name)
    {
       this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public void speaks()
    {
        System.out.println("the animal speaks");
    }
}

class Bird extends Animal
{
    public Bird(String name)
    {
        super(name);
    }

    @Override
    public void speaks()
    {
        System.out.println(getName()+" whistles");
    }
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void speaks()
    {
        System.out.println(getName()+" barks");
    }
}

class Horse extends Animal
{
    public Horse(String name)
    {
        super(name);
    }

    @Override
    public void speaks()
    {
        System.out.println(getName()+" neighs");
    }
}



public class Main{
    public static void speaktry(Animal animal)
    {
        animal.speaks();
    }


    public static void main(String[] args)
    {
        Animal animal = new Animal("animal");
        Bird bird = new Bird("boncuk");
        Dog dog = new Dog("Teddy");
        Horse horse = new Horse("Black");

        Animal animal2 = new Dog("lemon");
        animal2.speaks();

        animal.speaks();
        bird.speaks();
        dog.speaks();
        horse.speaks();

        speaktry(new Dog("karabas"));

    }
}
