package labEx1;

public class LabEx1_2 {     //class Student {}
    private int studentId;
    private String studentName;
    private String city;
    private int marks1;
    private int marks2;
    private int marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setEligibleForScholarship(boolean eligibleForScholarship) {
        this.isEligibleForScholarship = eligibleForScholarship;
    }

    // methods
    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public float getAverage() {
        return getTotalMarks() / 3.0f;
    }

    public String getResult() {
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }
}

class TestMain {
    public static void main(String[] args) {
        LabEx1_2 s1 = new LabEx1_2();
        LabEx1_2 s2 = new LabEx1_2();
        LabEx1_2 s3 = new LabEx1_2();

        s1.setStudentName("Alice");
        s1.setStudentId(85);
        s1.setMarks2(78);
        s1.setMarks3(90);
        s1.setFeePerMonth(2000.0f);
        s1.setEligibleForScholarship(true);

        s2.setStudentName("Bob");
        s2.setMarks1(65);
        s2.setMarks2(70);
        s2.setMarks3(75);
        s2.setFeePerMonth(1500.0f);
        s2.setEligibleForScholarship(false);

        s3.setStudentName("Charlie");
        s3.setMarks1(55);
        s3.setMarks2(60);
        s3.setMarks3(65);
        s3.setFeePerMonth(1800.0f);
        s3.setEligibleForScholarship(false);

        LabEx1_2[] students = {s1, s2, s3};

        // Display the name of the Student who has the highest total marks

        LabEx1_2 highestScorer = students[0];

        for (LabEx1_2 s : students) {

            if (s.getTotalMarks() > highestScorer.getTotalMarks()) {
                highestScorer = s;
            }
        }
        System.out.println("Highest scorer: " + highestScorer.getStudentName());

        // Print the name and fee of the Student who pays the least monthly fee
        LabEx1_2 leastFeeStudent = students[0];
        for (LabEx1_2 student : students) {
            if (student.getFeePerMonth() < leastFeeStudent.getFeePerMonth()) {
                leastFeeStudent = student;
            }
        }
        System.out.println("Student with least fee: " + leastFeeStudent.getStudentName() + " pays " + leastFeeStudent.getFeePerMonth());

        // Print details for every student
        for (LabEx1_2 student : students) {
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Total Marks: " + student.getTotalMarks());
            System.out.println("Average Marks: " + student.getAverage());
            System.out.println("Result: " + student.getResult());
            System.out.println("Scholarship: " + (student.isEligibleForScholarship() ? "available" : "not available"));
        }
    }
}


