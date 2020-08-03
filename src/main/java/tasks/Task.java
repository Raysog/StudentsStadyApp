package tasks;

public abstract class Task {
    private int number;
    private String text;

    public Task() {
        this.number = 0;
        this.text = "text";
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
}
