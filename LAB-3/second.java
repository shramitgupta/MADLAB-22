
interface MAD {
    void learnCoding();

    void learnProgrammingLanguage();

    void contribute();
}

abstract class Student implements MAD {
    @Override
    public void learnCoding() {
        System.out.println(
                "Hi");
    }

    @Override
    public void learnProgrammingLanguage() {
        System.out.println(
                "JUET");
    }
}

class Mobile extends Student {
    @Override
    public void contribute() {
        System.out.println(
                "MAD LAB");
    }
}

public class second {
    public static void main(String[] args) {
        Mobile gfgStudent = new Mobile();
        gfgStudent.learnCoding();
        gfgStudent.learnProgrammingLanguage();
        gfgStudent.contribute();
    }
}
