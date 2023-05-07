package Assignments.WIley_assignments.src.day10assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreams {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<stream> students = new ArrayList<>();
        students.add(new stream(1, "Priya", 20, 80));
        students.add(new stream(2, "abcd", 10, 10));
        students.add(new stream(3, "efhgn ", 21, 85));
        students.add(new stream(4, "yfvE", 15, 60));
        students.add(new stream(5, "fvcIJ", 18, 70));
        students.add(new stream(6, "opj", 16, 65));
        students.add(new stream(7, "jihk", 15, 60));

        List<stream> returnQuery = (List<stream>) students.stream()
                .filter(p -> p.getProblems_solved() > 15)
                .limit(5)
                .sorted((a, b) -> b.getGrade() - a.getGrade())
                .collect(Collectors.toList());
        System.out.println("Rollno\tName\tProblems Solved\tGrade");
        for (stream s : returnQuery) {
            System.out.println(s.getRollNo() + "\t" + s.getName() + "\t" + s.getProblems_solved() + "\t" + s.getGrade());
        }
    }
}
