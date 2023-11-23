public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3,int sozlu1, int sozlu2, int sozlu3) {
        if(note1 >= 0 && note1 <= 100 && sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.note = note1;
            this.c1.sozlu = sozlu1;
        }
        if(note2 >= 0 && note2 <= 100 && sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.note = note2;
            this.c2.sozlu = sozlu2;
        }
        if(note3 >= 0 && note3 <= 100 && sozlu3 >= 0 && sozlu3 <= 100) {
              this.c3.note = note3;
              this.c3.sozlu = sozlu3;
        }
    }

    void printNote() {
        System.out.println("----------------------------------------------");
        System.out.println(this.name);
        System.out.println(this.c1.name + " Dersinin Notu: "+ this.c1.note);
        System.out.println(this.c1.name + " Dersinin Sözlüsü: "+ this.c1.sozlu);
        System.out.println(this.c2.name + " Dersinin Notu: "+ this.c2.note);
        System.out.println(this.c2.name + " Dersinin Sözlüsü: "+ this.c2.sozlu);
        System.out.println(this.c3.name + " Dersinin Notu: "+ this.c3.note);
        System.out.println(this.c3.name + " Dersinin Sözlüsü: "+ this.c3.sozlu);

    }

    void calcAverage() {
        this.average = ((this.c1.note*0.80 + this.c1.sozlu*0.20) + (this.c2.note*0.80 + this.c2.sozlu*0.20) + (this.c3.note*0.80 + this.c3.sozlu*0.20) ) / 3.0;
        System.out.println("Ortalama: " + this.average);

        if(this.average >= 55) {
            this.isPass = true;
            System.out.println("Tebrikler. Başarılı Oldunuz!");
        } else {
            System.out.println("Maalesef Kaldınız!");
        }
    }
}
