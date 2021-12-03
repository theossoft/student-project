public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerStudent studAnswer = checkStudent(so);

        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }


    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Students is running");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){

    }

}
