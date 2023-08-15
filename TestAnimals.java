public class TestAnimals {
    public static void main(String[] args){

        Fish d = new Fish("Ronaldinho");
        d.getName();
        d.play();
        d.eat();
        System.out.println("----------");

        Cat c = new Cat("Fluffy");
        c.getName();
        c.play();
        c.eat();
        System.out.println("----------");

        Animal a = new Fish("Maria");
        Animal e = new Spider();
        e.eat();
        Pet p = new Cat("Joana");
        p.getName();
        p.play();
    }
}
