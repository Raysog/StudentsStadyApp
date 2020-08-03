package tasks;

public interface Autocheckable {
    default void checkAutomatically(){
        System.out.println("Задание выполнено!");
    }
}
