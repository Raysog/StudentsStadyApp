package users;

public interface Staff {
    void helpToStudent(Student student);
    default void getAdditionalMaterialsToStudent (){
        System.out.println("https://habr.com/");
    }
}
