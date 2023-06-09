import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] arr = {};
        int[] answer = new int[commands.length];
        for ( int i = 0; i < commands.length; i++) {
            arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}