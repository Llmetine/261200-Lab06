public class FlyingShark extends Shark implements Flyable{
    public void fly(){
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }
    void eat(Fish fish){
        super.eat(fish);

    }
    void eat(Flyable Fly){
        System.out.println("FlyingShark caught a flying creature!");
    }
}
