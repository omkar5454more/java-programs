package Test2;
import java.util.Scanner;

class MarksCalculator {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public MarksCalculator(int subject1Marks, int subject2Marks, int subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public int calculateTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks;
    }

    public double calculatePercentageMarks() {
        int totalMarks = calculateTotalMarks();
        return (totalMarks / 150.0) * 100;
    }
}








