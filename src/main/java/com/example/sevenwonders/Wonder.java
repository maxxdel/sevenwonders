package com.example.sevenwonders;

import javafx.scene.image.Image;

public class Wonder {
    private String name;
    private String description;
    private Image image;
    private int[] resourceCost;
    private int[] victoryPoints;

    public static final Wonder Alexandrie = new Wonder("Alexandrie", "Une grande bibliothèque et un phare", new Image(Wonder.class.getResource("/Assets/images/wonders/alexandrie/alexandrieFull.png").toExternalForm()), new int[]{3, 2, 1, 0}, new int[]{7, 0, 0, 0});
    public static final Wonder Halicarnasse = new Wonder("Halicarnasse", "Un mausolée prestigieux", new Image(Wonder.class.getResource("/Assets/images/wonders/halicarnasse/halicarnasseFull.png").toExternalForm()), new int[]{2, 0, 3, 1}, new int[]{7, 0, 0, 0});
    public static final Wonder Ephese = new Wonder("Ephese", "Un grand temple dédié à Artémis", new Image(Wonder.class.getResource("/Assets/images/wonders/ephese/epheseFull.png").toExternalForm()), new int[]{1, 3, 2, 0}, new int[]{7, 0, 0, 0});
    public static final Wonder Olympie = new Wonder("Olympie", "Un stade pour les jeux olympiques", new Image(Wonder.class.getResource("/Assets/images/wonders/olympie/olympieFull.png").toExternalForm()), new int[]{0, 2, 3, 1}, new int[]{7, 0, 0, 0});
    public static final Wonder Babylone = new Wonder("Babylone", "Une tour grandiose", new Image(Wonder.class.getResource("/Assets/images/wonders/babylon/babylonFull.png").toExternalForm()), new int[]{1, 0, 2, 3}, new int[]{7, 0, 0, 0});
    public static final Wonder Rhodes = new Wonder("Rhodes", "Un colosse de Rhodes", new Image(Wonder.class.getResource("/Assets/images/wonders/rhodes/rhodesFull.png").toExternalForm()), new int[]{0, 1, 3, 2}, new int[]{7, 0, 0, 0});

    public static final Wonder Gizeh = new Wonder("Gizeh", "Les pyramides de Gizeh", new Image("/Assets/images/wonders/giseh/gizehFull.png"), new int[]{1, 3, 2, 0}, new int[]{7, 0, 0, 0});

    private Wonder(String name, String description, Image image, int[] resourceCost, int[] victoryPoints) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.resourceCost = resourceCost;
        this.victoryPoints = victoryPoints;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Image getImage() {
        return image;
    }

    public int[] getResourceCost() {
        return resourceCost;
    }

    public int[] getVictoryPoints() {
        return victoryPoints;
    }
}
