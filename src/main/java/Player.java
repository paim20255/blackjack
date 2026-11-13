public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String toString() {
        return this.name + " " + this.hand.getValue() + " - " + this.hand.toString();
    }

    public void takeCard(Card card) {
        this.hand.addCard(card);
    }

}
