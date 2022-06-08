package santaworkshop;

public class SantaClaus {

    private static SantaClaus instance;
    private Command command;

    private SantaClaus() {

    }

    public static SantaClaus getInstance() {

        if(instance == null) {
            instance = new SantaClaus();
        }

        return instance;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void chooseToy() {
        if(this.command == null) {
            System.out.println("No command set");
            return;
        }
        this.command.execute();
    }

}
