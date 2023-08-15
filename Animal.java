public abstract class Animal {

    protected int legs;

    public Animal(int legs2) {
    }

    protected void Animal (int legs){
        this.legs = legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.println("Anda com" + legs);
    }



}