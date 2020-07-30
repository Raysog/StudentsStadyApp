package tasks;

public class Test extends Task implements Autocheckable{
    public boolean checkAutomatically() {
        return false;
    }
}
