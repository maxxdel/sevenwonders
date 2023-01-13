package sevenWonders;

class Card {
    private String name;
    private List<Resource> cost;
    private List<Effect> effects;

    public Card(String name, List<Resource> cost, List<Effect> effects) {
        this.name = name;
        this.cost = cost;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public List<Resource> getCost() {
        return cost;
    }

    public List<Effect> getEffects() {
        return effects;
    }
}
