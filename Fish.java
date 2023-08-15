public class Fish extends Animal implements Pet{
    
    
    public String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("Brinca Nada");
    }

    public void eat(){
        System.out.println("Ração");
    } 
    
}



