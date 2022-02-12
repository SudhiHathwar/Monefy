package Inputs;

public enum CategoryType {

    Bills("Bills"),
    Car("Car"),
    DEPOSITS("Deposits");
    private String text;

    CategoryType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
