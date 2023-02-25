public class Main{
    public static void main(String[] args){
        Fish d = new Fish();
        d.setName("Somename");
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println(d.getName());
        d.walk();
        d.eat();
        d.play();

        System.out.println("\nCat:");
        c.walk();
        c.eat();
        c.play();

        System.out.println("\nAnimal(fish):");
        a.walk();
        a.eat();

        System.out.println("\nAnimal(spider):");
        e.walk();
        e.eat();

        System.out.println("\nPet(cat):");
        p.play();
    }
}
