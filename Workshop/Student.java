class Student {
    int id;
    String name;
    int age;

    void displayDetails() {
        String status = "Active";
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Aadhya";
        s1.age = 19;

        s1.displayDetails();
    }
}
