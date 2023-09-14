package secondhomework;


public class Main{
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal cow = new Animal();

        dog.age = 3;
        dog.sound = "Bow Bow";
        dog.weight = 65.5;
        dog.features=new String[]{"Golden Retriver","friendly"};



        cat.age = 5;
        cat.sound = "meow meow";
        cat.weight = 15.7;
        cat.features=new String[]{"Persian","aloof"};

        cow.age = 10;
        cow.sound = "moo moo";
        cow.weight = 100.7;
        cow.features=new String[]{"white","big"};

        dog.printAnimalSound();
        dog.animalFeatures();
        cat.printAnimalSound();
        cat.animalFeatures();
        cow.printAnimalSound();
        cow.animalFeatures();


    }
}