public class Student {
    private String firstName;
    private String lastName;
    private int fullAge;
    private boolean experience;
    private String learningObjective;
    private int groupNumber;
    private int countCompletedTask;
    private int countCompletedModules;

    public Student(String firstName, String lastName, int fullAge, boolean experience, String learningObjective, int groupNumber, int countCompletedTask, int countCompletedModules) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullAge = fullAge;
        this.experience = experience;
        this.learningObjective = learningObjective;
        this.groupNumber = groupNumber;
        this.countCompletedTask = countCompletedTask;
        this.countCompletedModules = countCompletedModules;
    }

    public Student(String firstName, String lastName, int fullAge) {
        this(firstName, lastName, fullAge, false, "",0, 0, 0);
    }

    private void doTask(){}

    private void askQuestion(){}

    private void passTheModule(){}

    private void writeToCurator(){}
}
