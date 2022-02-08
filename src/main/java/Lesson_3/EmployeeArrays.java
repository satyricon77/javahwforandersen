package Lesson_3;

public class EmployeeArrays {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivan", "Zabirka", "Igorevich", "Senior QA", "zabirka123@ukr.net", 0675623232, 5000, 51);
        employeeArray[1] = new Employee("Vasiliy", "Utkin", "Igorevich", "Middle QA", "ukrin_go@ukr.net", 0634345334, 4000, 43);
        employeeArray[2] = new Employee("Serhii", "Klin", "Alekseevich", "Middle QA", "kills123@ukr.net", 0672332232, 3500, 39);
        employeeArray[3] = new Employee("Petro", "Sichnoy", "Mikhailovich", "Junior QA", "4qwerty@ukr.net", 0631234422, 2000, 29);
        employeeArray[4] = new Employee("Stanislav", "Vetkin", "Serhievich", "Trainee QA", "stasvetkin@ukr.net", 0631234423, 1000, 21);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                System.out.println(employeeArray[i].toString());
            }
        }
    }

}
