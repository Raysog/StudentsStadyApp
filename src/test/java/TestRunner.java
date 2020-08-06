import tasks.Code;
import tasks.DragAndDrop;
import tasks.Task;
import tasks.Test;
import users.Mentor;
import users.Student;

import java.util.Random;

class TestRunner {

    public static void main(String[] arguments) {
        int countOfTasks = 40;
        Task[] tasks = createTasksArray(countOfTasks);
        Mentor m1 = new Mentor("Ivan", "Ivanov", 29);
        Mentor m2 = new Mentor("Petr", "Petrov", 32);
        Student s1 = new Student("Ira", "Irova", 19, m1, false);
        Student s2 = new Student("Vasia", "Vasin", 19, m2, false);
        Student s3 = new Student("Victor", "Victorov", 19, m1, true);
        Student s4 = new Student("Sasha", "Sashin", 19, m2, false);
        Student[] students = new Student[]{s1, s2, s3, s4};

        while (!isAllStudentsCompleteAllTasks(students)) {
            int countTasksNeedComplete = new Random().nextInt(countOfTasks);
            for (Student student : students) {
                System.out.println(student.getName() + " " + student.getSurname() + ": ");
                if (!student.isAllTasksComplete()) {
                    student.solveTasks(countTasksNeedComplete, tasks);
                } else {
                    System.out.println("Все задачи решены!");
                    continue;
                }
                System.out.println();
            }
        }
    }

    private static Task[] createTasksArray(int countOfTasks) {
        Task[] tasks = new Task[countOfTasks];
        int randomTaskType;
        for (int i = 0; i < countOfTasks; i++) {
            randomTaskType = new Random().nextInt(3);
            switch (randomTaskType) {
                case 0:
                    tasks[i] = new Test(i);
                    break;
                case 1:
                    tasks[i] = new DragAndDrop(i);
                    break;
                case 2:
                    tasks[i] = new Code(i);
                    break;
            }
        }
        return tasks;
    }

    private static boolean isAllStudentsCompleteAllTasks(Student[] students) {
        for (Student student : students) {
            if (!student.isAllTasksComplete()) {
                return false;
            }
        }
        return true;
    }
}