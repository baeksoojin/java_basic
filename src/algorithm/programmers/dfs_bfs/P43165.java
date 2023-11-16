package algorithm.programmers.dfs_bfs;

public class P43165 {

    public int answer = 0;

    public void dfs(int[] numbers, int value, int depth, int limit, int target){

        if(depth == limit){
            if(target == value) {
                answer += 1;
            }
            return;
        }

        // minus & plus calculate
        int minusCaseValue = value + numbers[depth] * (-1);
        int plusCaseValue = value + numbers[depth];

        // dfs
        dfs(numbers, minusCaseValue, depth + 1, limit, target);
        dfs(numbers, plusCaseValue, depth + 1, limit, target);
    }

    public int solution(int[] numbers, int target) {
        // 탐색을 진행. 더하거나 빼는 경우 2개의 경우에 대해서 숫자만큼의 깊이가 될 때까지 탐색한다.
        dfs(numbers, 0, 0, numbers.length, target);

        return answer;
    }

    public static void main(String[] args) {
        P43165 ex = new P43165();
        ex.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(ex.answer);
    }
}
