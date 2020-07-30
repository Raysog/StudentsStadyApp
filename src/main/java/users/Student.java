package users;

public class Student extends Person {

    private static final int MAX_MODULES_COUNT = 24;

    private static int countCompletedTasksByAllStudents;
    private static int maxCompletedModules;

    private String firstName;
    private String lastName;
    private int fullAge;
    private boolean experience;
    private String learningObjective;
    private int groupNumber;
    private int countCompletedTask;
    private int countCompletedModules;


    public Student(String firstName, String lastName, int fullAge, boolean experience, String learningObjective, int groupNumber, int countCompletedTask, int countCompletedModules) {
        super(firstName, lastName, fullAge);
        this.experience = experience;
        this.learningObjective = learningObjective;
        this.groupNumber = groupNumber;
        this.countCompletedTask = countCompletedTask;
        this.countCompletedModules = countCompletedModules;
    }

    public Student(String firstName, String lastName, int fullAge) {
        this(firstName, lastName, fullAge, false, "", 0, 0, 0);
    }

    private void doTask() {
        System.out.println("Task complete");
        this.countCompletedTask++;
        countCompletedTasksByAllStudents++;
    }

    private void askQuestion() {
    }

    private void passTheModule() {
        if (this.countCompletedModules < MAX_MODULES_COUNT) {
            this.countCompletedModules++;
        } else {
            System.out.println("All modules complete");
        }
    }

    private void writeToCurator() {
    }
}
