import java.util.*;

public class Hello {

    public static boolean is_prime(Integer x) {
        for(int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        };
        return true;
    }

    public static List<Integer> primes(Integer x) {
        List<Integer> factors = new ArrayList<>(Arrays.asList());
        for (int i = 1; i < x; i++) {
            if (x % i == 0 && is_prime(i)) factors.add(i);
        }
        return factors;
    }

    public static List<Integer> merge_sort(List<Integer> arr) {
        if (arr.size() < 2) return arr;

        int mid = arr.size() / 2;
        List<Integer> left = arr.subList(0, mid);
        List<Integer> right = arr.subList(mid, arr.size() - 1);
        System.out.println("left" + left);
        System.out.println("right" + right);
        List<Integer> left_sorted = merge_sort(left);
        List<Integer> right_sorted = merge_sort(right);
        System.out.println("left sorted" + left_sorted);
        System.out.println("right sorted" + right_sorted);
        return merge(left_sorted, right_sorted);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>(Arrays.asList());
        System.out.println("left in merge" + left);
        System.out.println("right in merge" + right);
        while (left.size() > 0 && right.size() > 0) {
            int left_el = left.get(0);
            System.out.println("left_el" + left_el);
            int right_el = right.get(0);
            System.out.println("right_el" + right_el);
            if (left_el < right_el) {
                merged.add(left_el);
                left.remove(0);
                System.out.println("merged after if" + merged);
                System.out.println("left after remove" + left);
                System.out.println("size of left after remove" + left.size());
                System.out.println("right " + right);
            } else {
                merged.add(right_el);
                right.remove(0);
                System.out.println("merged after else" + merged);
                System.out.println("right after remove" + right);
                System.out.println("left" + left);
            }
        }
        System.out.println("reached out of while");
        if (left.size() > 0) merged.addAll(left);
        if (right.size() > 0) merged.addAll(right);
        return merged;
    }
    

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
