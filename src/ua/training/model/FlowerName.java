package ua.training.model;

public enum FlowerName  {

    ROSE("Троянда","Rose");

    private String ukrName;
    private String engName;

    FlowerName(String ukrName, String engName) {
        this.ukrName = ukrName;
        this.engName = engName;
    }

    public String getUkrName() {
        return ukrName;
    }

    public String getEngName() {
        return engName;
    }
}
