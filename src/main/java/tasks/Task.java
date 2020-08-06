package tasks;

public abstract class Task {
    private int number;
    private String text;

    public Task() {
        this.number = 0;
        this.text = "text";
    }

    public Task(int number) {
        this.number = number;
        this.text = "text";
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Task{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
