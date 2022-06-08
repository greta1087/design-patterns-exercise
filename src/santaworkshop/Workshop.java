package santaworkshop;

public abstract class Workshop {
    public abstract ToyProduct getToy(String toyName);

    public ToyProduct prepareToy(String toyName) {
        ToyProduct toy = getToy(toyName);
        toy.deliver();
        return toy;
    }
}
