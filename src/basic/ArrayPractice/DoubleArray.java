package basic.ArrayPractice;

public class DoubleArray {
    public static void main(String[] args) {
        int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        double classTotal = 0.0;
        double classAVG;

        // 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        int stdNum = 1;

        for (int[] student_name : score) {

            int total = 0;

            for ( int student_subject_score : student_name){
                total += student_subject_score;
            }
            double avg = (double) total / student_name.length;
            System.out.printf("%d번의 평균 : %.1f ", stdNum , avg);
            System.out.println();
            stdNum++;
            classTotal += avg;
        }


        // 2. 각 과목의 평균을 출력해 보세요.

        // 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)

        classAVG = classTotal / score.length;
        System.out.printf("%.1f", classAVG);
    }
}
