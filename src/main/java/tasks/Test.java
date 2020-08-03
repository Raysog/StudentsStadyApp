package tasks;

public class Test extends Task implements Autocheckable{

    private String[] answer;

    public Test() {
        super();
        this.answer = new String[]{"a", "b", "c"};
    }

}
