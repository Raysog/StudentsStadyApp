package tasks;

public class DragAndDrop extends Task implements Autocheckable {
    private String[][] options;

    public DragAndDrop() {
        super();
        this.options = new String[][]{{"1", "2", "3"}, {"3", "2", "1"}, {"2", "1", "3"}};
    }

    public DragAndDrop(int number) {
        super(number);
        this.options = new String[][]{{"1", "2", "3"}, {"3", "2", "1"}, {"2", "1", "3"}};
    }
}
