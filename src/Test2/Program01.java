package Test2;

import java.util.Scanner;

public class Program01 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter marks for subject 1: ");
            int subject1Marks = scanner.nextInt();

            System.out.print("Enter marks for subject 2: ");
            int subject2Marks = scanner.nextInt();

            System.out.print("Enter marks for subject 3: ");
            int subject3Marks = scanner.nextInt();

            MarksCalculator m1 = new MarksCalculator(subject1Marks, subject2Marks, subject3Marks);

            int totalMarks =m1.calculateTotalMarks();
            double percentageMarks = m1.calculatePercentageMarks();

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage Marks: " + percentageMarks + "%");


        }
    }


