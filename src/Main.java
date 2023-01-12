public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut ","565465","EDB");
        Teacher t2= new Teacher("Gıyaseddin","656","MAT");
        Teacher t3= new Teacher("Genç komunist hoca","154","KİMYA");

        Course c1 =new Course("EDEBİYAT","EDB101","EDB");
        Course c2 =new Course("MATEMATİK","MAT101","MAT");
        Course c3 =new Course("KİMYA","KMY101","KİMYA");

        Student s1 = new Student("İnek şaban","4103",4,c2,c1,c3);
        s1.addBulkExam(53,80,25);
        s1.isPass();
        Student s2 = new Student("düdük necmi","4201",4,c2,c1,c3);
        s2.addBulkExam(33,72,75);
        s2.isPass();

        Student s3 = new Student("çalışkan ahmet","4305",4,c2,c1,c3);






        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);



    }
}