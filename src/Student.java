public class Student {
    Course mat;
    Course edebiyat;
    Course kimya;
    String name;
    String stdNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name,String stdNo, int classes ,Course mat,Course edebiyat,Course kimya){
        this.name=name;
        this.stdNo=stdNo;
        this.classes=classes;
        this.mat=mat;
        this.edebiyat=edebiyat;
        this.kimya=kimya;
        boolean isPass=false;
        calculateAvg();
    }

    void addBulkExam(int mat, int edebiyat, int kimya){
        if(mat>=0&&mat<=100){
            this.mat.note=mat;
        }
        if(edebiyat>=0&&edebiyat<=100){
            this.edebiyat.note=edebiyat;
        }
        if(kimya>=0&&kimya<=100){
        this.kimya.note=kimya;
        }
    }
    void addBulkSozlu(int sozluMat, int sozluEdebiyat, int sozluKimya){
        this.mat.sozlu=sozluMat;
        this.edebiyat.sozlu=sozluEdebiyat;
        this.kimya.sozlu=sozluKimya;
    }
    void calculateAvg(){
        this.average=((mat.note*0.8+(mat.sozlu*0.2))+(edebiyat.note*0.8+(edebiyat.sozlu*0.2))+(kimya.note*0.8+(kimya.sozlu*0.2)))/3;
    }

    boolean isCheckPass(){
        calculateAvg();
        return this.average> 55;
    }
    void printNote(){
        System.out.println("===========================================");
        System.out.println("öğrenci : "+this.name);
        System.out.println("matematik notu: "+this.mat.note+"   matematik sözlüsü : "+this.mat.sozlu);
        System.out.println("edebiyat notu: "+this.edebiyat.note+"   edebiyat sözlüsü: "+this.edebiyat.sozlu);
        System.out.println("kimya notu: "+this.kimya.note+"   kimya sözlüsü: "+this.kimya.sozlu);
    }
    void isPass(){
        if(this.mat.note<0||this.mat.note>100||this.edebiyat.note<0||this.edebiyat.note>100||this.kimya.note<0||this.kimya.note>100){
            System.out.println("notları kontrol edin ve 0 la 100 arasında sayı girin");
        }else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("ortalamanız : "+ this.average);
            if (isPass){
                System.out.println("sınıf geçti");
            }else {
                System.out.println("hababam sınıfı sınıfta kaldı");
            }
        }
    }
}
