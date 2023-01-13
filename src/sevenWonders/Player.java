package sevenWonders;

class Player {
    private String name;
    private List<Card> hand;
    private List<Resource> resources;
    private Wonder wonder;

    public Player(String name) {
        this.name = name;
        // Initialize hand, resources, and wonder
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public Wonder getWonder() {
        return wonder;
    }

    public void playCard(Card card) {
        // Play a card from the player's hand
    }

    public void gainResource(Resource resource) {
        // Add a resource to the player's resources
    }
}
