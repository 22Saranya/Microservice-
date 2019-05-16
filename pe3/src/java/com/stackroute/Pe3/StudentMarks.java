package com.stackroute.Pe3;

    import java.util.Scanner;
    public class StudentMarks {
        //private final int lowgrade  = 0;
        //private final int highgrade = 100;


        private int[]  stuGrades;

        private Scanner numOfStudents;


        public static void main(String[] args)
        {
            StudentMarks stud = new StudentMarks();
            stud.numOfStudents = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = stud.numOfStudents.nextInt();

            stud.run(numStudents);
        }

        private void run(int numStudents)
        {
            if (numStudents <= 0) {
                System.out.println("Invalid number of students.");
                return;
            }
            stuGrades= new int[numStudents];

            double sum = 0;
            int    i   = 0;
            while (i < numStudents) {
                System.out.printf("Enter the grade for student %d: ", (i + 1));
                int grade = numOfStudents.nextInt();
                if ((grade >= 0 && (grade <= 100))) {
                    stuGrades[i] = grade;
                    sum += grade;
                    i++;
                    continue;
                }
                System.out.println("Invalid grade, try again...");
            }
        }
    }

