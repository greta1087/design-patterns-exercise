package santaworkshop;

public class Toys {

    Topic topic = new Topic();
    Observer elf = new MagicBoard("Elf");

    public void deliverDoll() {
    topic.subscribe(elf);
    topic.setTopic("workshop.Doll");

    }

    public void deliverBicycle() {
        topic.subscribe(elf);
        topic.setTopic("workshop.Bicycle");
    }
}
