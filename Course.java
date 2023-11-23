public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
    }

    void addTeacher(Teacher teacher) {
        
           if(teacher.branch.equals(this.prefix)) {     
               this.teacher = teacher;
               printTeacher();
        } else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmamaktadır!");
        }
    }

    void printTeacher() {
       this.teacher.print();    
    }
}
