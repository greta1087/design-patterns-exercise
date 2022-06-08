package santaworkshop;

public class DeliverBicycleCommand implements Command {

    private Toys bicycles;

    public DeliverBicycleCommand(Toys bicycles) {
        this.bicycles = bicycles;
    }

    @Override
    public void execute() {
        this.bicycles.deliverBicycle();
    }
}
