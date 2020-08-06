package users;

import tasks.Autocheckable;
import tasks.DragAndDrop;
import tasks.Task;
import tasks.Test;

public class Student extends Person {

    private static int countCompletedTasksByAllStudents;


    private int countCompletedTask;
    private Mentor mentor;
    private boolean isAllTasksComplete;

    public Student(String name, String surname, int age, Mentor mentor, boolean isAllTasksComplete) {
        super(name, surname, age);
        this.countCompletedTask = 0;
        this.mentor = mentor;
        this.isAllTasksComplete = isAllTasksComplete;
    }

    public static int getCountCompletedTasksByAllStudents() {
        return countCompletedTasksByAllStudents;
    }

    public int getCountCompletedTask() {
        return countCompletedTask;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public boolean isAllTasksComplete() {
        return isAllTasksComplete;
    }

    public static void setCountCompletedTasksByAllStudents(int countCompletedTasksByAllStudents) {
        Student.countCompletedTasksByAllStudents = countCompletedTasksByAllStudents;
    }

    public void setCountCompletedTask(int countCompletedTask) {
        this.countCompletedTask = countCompletedTask;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setAllTasksComplete(boolean allTasksComplete) {
        isAllTasksComplete = allTasksComplete;
    }

    public void solveTasks(int countOfTasks, Task[] tasksToSolve) {
        for (Task task : tasksToSolve) {
            this.solveCurrentTask(task);
        }
        if (countCompletedTask == tasksToSolve.length) {
            System.out.println("all tasks complete");
            isAllTasksComplete = true;
        } else if (countCompletedTask < tasksToSolve.length) {
            System.out.println("not all tasks complete");
            isAllTasksComplete = false;
        }
    }

    private void solveCurrentTask(Task task) {
        if (task instanceof DragAndDrop || task instanceof Test) {
            System.out.print("Задача " + (task.getNumber() + 1) + ": ");
            ((Autocheckable) task).checkAutomatically();
        } else {
            while (!mentor.checkCode(task)) ;
        }
        countCompletedTasksByAllStudents++;
        countCompletedTask++;
    }
}
