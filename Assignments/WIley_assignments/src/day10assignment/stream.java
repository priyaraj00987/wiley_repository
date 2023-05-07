package Assignments.WIley_assignments.src.day10assignment;


public class stream {

        private int rollNo;
        private String name;
        private int problems_solved;
        private int grade;
        public stream(int rollNo, String name, int problems_solved, int grade) {
            super();
            this.rollNo = rollNo;
            this.name = name;
            this.problems_solved = problems_solved;
            if(problems_solved>18) {
                this.grade=90;
            } else if(problems_solved>15) {
                this.grade=80;
            } else {
                this.grade = 70;
            }
        }
        public int getRollNo() {
            return rollNo;
        }
        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getProblems_solved() {
            return problems_solved;
        }
        public void setProblems_solved(int problems_solved) {
            this.problems_solved = problems_solved;
        }
        public int getGrade() {
            return grade;
        }
        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

