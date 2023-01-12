public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    int sozlu;

    Course (String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozlu=0;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
            System.out.println(this.name+" öğretmen atama işlemi başarılı");
        }else {
            System.out.println(teacher.name+" hoca bu dersi vermek için yetkin değil");
        }
    }

    void printTeacher(){
        if (this.teacher!=null){
            System.out.println("dersin öğretmeni :" + teacher.name);
        }else {
            System.out.println("derse öğretmen atanmamıştır");
        }
    }
}
