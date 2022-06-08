package santaworkshop;

public class ToyFactory extends Workshop {

    @Override
    public ToyProduct getToy(String toyName) {
        if(toyName == "workshop.Doll") {
            return new Doll();
        }
        if(toyName == "workshop.Bicycle") {
            return new Bicycle();
        }
        System.out.println("Unknown toy");
        return null;
    }
}
