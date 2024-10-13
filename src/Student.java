public class Student {
    private static int totalStudents = 0;
    private static int totalRating = 0;

    private int rating;
    private String name;

    public Student(String name) {
        this.name = name;
        this.rating = 0;
        totalStudents++;
    }

    public static double getAvgRating() {
        if (totalStudents == 0) {
            return 0.0;
        }
        return (double) totalRating / totalStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        totalRating += (rating - this.rating);
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        setRating(rating);
    }

    public static void removeStudent(Student student) {
        totalRating -= student.getRating();
        totalStudents--;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rating=" + rating + "}";
    }
}