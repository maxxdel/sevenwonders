package sevenWonders;

class Board {
    private List<Card> availableCards;
    private List<Wonder> wonders;

    public Board(List<Card> availableCards, List<Wonder> wonders) {
        this.availableCards = availableCards;
        this.wonders = wonders;
    }

    public List<Card> getAvailableCards() {
        return availableCards;
    }

    public List<Wonder> getWonders() {
        return wonders;
    }

    public void addCard(Card card) {
        // Add a card to the board
    }

    public void removeCard(Card card) {
        // Remove a card from the board
    }
}
