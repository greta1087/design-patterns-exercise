package santaworkshop;

public class DeliverDollCommand implements Command {

    private Toys dolls;

    public DeliverDollCommand(Toys dolls) {
        this.dolls = dolls;
    }

    @Override
    public void execute() {
       this.dolls.deliverDoll();
    }
}
