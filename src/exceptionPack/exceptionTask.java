package exceptionPack;

public class exceptionTask {
    public static void main(String[] args) {
        System.out.println("TASK 1 -----");
        task1(10, 0);

        System.out.println("TASK 2 -----");

        bankAccount bankAcc = new bankAccount();
        bankAcc.setBalance(1000);
        bankAcc.takeMoney(384);
        System.out.println(bankAcc.getBalance());

        System.out.println("TASK 3 -----");
        task3("123");
        task3("loading");
        task3("201d2");

        System.out.println("TASK 4 -----");

        StudentList studentList = new StudentList();

                studentList.addStudent("John");
                studentList.addStudent("Jane");
                studentList.addStudent("John"); // Спроба додати дублікат студента
                studentList.addStudent("Mark");
                studentList.addStudent("Maria");


        System.out.println("Student list: " + studentList.getStudents());

    }

    //TASK 1
    public static void task1(int num1, int num2) throws ArithmeticException{
        try{
            System.out.println(num1/num2);
        }catch (ArithmeticException e) {
            System.out.println("You can not divide by 0");
        }
    }


    //TASK 3
    public static void task3(String str) throws IllegalArgumentException{
        try{
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (IllegalArgumentException e) {
            System.out.println("You can not parse letters to integer");
        }
    }


}


