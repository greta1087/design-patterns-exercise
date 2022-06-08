package santaworkshop;

public class MagicBoard implements Observer {

    private String name;
    private Observable topic;

    public MagicBoard(String name) {
        this.name = name;
    }

    public void update() {

        String lastTopic = this.topic.getUpdate();
        System.out.println("Magic board: " + lastTopic);

        Workshop toyFactory = new ToyFactory();
        ToyProduct toy = toyFactory.prepareToy(lastTopic);
    }

    public void setTopic(Observable topic) {
        this.topic = topic;
    }
}
