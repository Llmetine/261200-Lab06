public class Shark extends Fish{
    @Override
    void swim(){
        System.out.println("Shark is swimming fast!");
    }
    void eat(Fish fish) {
        System.out.println(this.toString() + " is eating " + fish.toString());
    }
}
