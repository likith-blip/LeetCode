import java.util.Arrays;
import java.util.Stack;

class dailyTemperatures { // Matched to your actual filename
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                // Fixed a slight logic bug here: it should be i - index, not 1 - index
                answer[index] = i - index;
            }
            stack.push(i);
        }
        return answer;
    }

    // ADD THIS MAIN METHOD TO RUN IT:
    public static void main(String[] args) {
        dailyTemperatures solver = new dailyTemperatures();

        // Test input
        int[] testInput = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = solver.dailyTemperatures(testInput);

        // Print the output to the console
        System.out.println(Arrays.toString(result));
    }
}