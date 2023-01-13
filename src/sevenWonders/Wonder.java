package sevenWonders;

class Wonder {
    private String name;
    private int stage;
    private int progress;

    public Wonder(String name) {
        this.name = name;
        this.stage = 1;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    public int getProgress() {
        return progress;
    }

    public void buildStage() {
        // Build the next stage of the wonder
    }
}

