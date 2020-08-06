package tasks;

public class Code extends Task {
    private String code;

    public Code() {
        super();
        this.code = "System.out.println(\"Hello, System\");";
    }

    public Code(int number) {
        super(number);
        this.code = "System.out.println(\"Hello, System\");";
    }
}
