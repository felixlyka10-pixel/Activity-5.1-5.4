public class GradeExam {
    public static void main(String[] args) {
        // 2D array storing students' answers
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'A', 'C', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}
        };

        // Array storing the correct answer key
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Outer loop to iterate through each student
        for (int i = 0; i < answers.length; ++i) {
            int correctCount = 0;
            // Inner loop to compare answers with the key
            for (int j = 0; j < answers[i].length; ++j) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            // Display the result for each student
            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
    }
}
