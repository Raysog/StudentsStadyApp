package users;

import tasks.Task;

import java.util.Random;

public class Mentor extends Person implements Staff {

    private boolean mood;
    private static final int randomConst = new Random().nextInt();

    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        this.mood = true;
    }

    @Override
    public void helpToStudent(Student student) {
        System.out.println(student.getName() + ", все будет огонь!");
    }

    public boolean checkCode(Task task) {
        int mood = new Random().nextInt();
        this.mood = mood > 1000;
        if (this.mood) {
            System.out.println("Задача " + task.getNumber() + "успешно решена!");
            return true;
        } else {
            System.out.println("Задача " + task.getNumber() + "не решена, необходимо переделать!");
            return false;
        }
    }
}
