/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "123");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "321");
        Teacher t3 = new Teacher("Pasteure", "BIO", "567");
        //t1.print();

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3); 

        Student s1 = new Student("İnek Şaban", "555", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(40, 60, 70, 50, 60, 80);
        s1.printNote();
        s1.calcAverage();

    }
}