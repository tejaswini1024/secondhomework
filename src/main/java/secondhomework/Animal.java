package secondhomework;

public class Animal {
    int age;
    String[] features;
    double weight;
    String sound;
    public void printAnimalSound(){

        System.out.println(sound);
    }
    public void animalFeatures(){
        for(String i: features) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
