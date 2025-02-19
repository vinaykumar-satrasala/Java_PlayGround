import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println(combinationSum3(9, 45));
    }

    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<>(), k, 0, n);
        return ans;
    }

    static void combination(List<List<Integer>> ans, List<Integer> comb, int k, int start, int n) {

        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }

        
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(ans, comb, k, i + 1, n - i);
            comb.remove(comb.size() - 1);
        }
        return;
    }
}
