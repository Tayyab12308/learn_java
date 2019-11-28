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
        List<Integer> left = new ArrayList<>(arr.subList(0, mid));
        List<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        List<Integer> left_sorted = merge_sort(left);
        List<Integer> right_sorted = merge_sort(right);

        return merge(left_sorted, right_sorted);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>(Arrays.asList());
        while (left.size() > 0 && right.size() > 0) {
            int left_el = left.get(0);
            int right_el = right.get(0);
            if (left_el < right_el) {
                merged.add(left_el);
                left.remove(0);
            } else {
                merged.add(right_el);
                right.remove(0);
            }
        }
        if (left.size() > 0) merged.addAll(left);
        if (right.size() > 0) merged.addAll(right);
        return merged;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(Integer score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        int feetInInches = feet * 12;
        int totalInches = inches + feetInInches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) return -1;
        int feet = inches / 12;
        int extraInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, extraInches);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid Value";
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid Value";
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return  getDurationString(minutes, remainingSeconds);
    }

    public static void printDayOfWeek(int day) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        switch (day) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println("Day of week was " + daysOfWeek[day]);
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }

    public static void main(String[] args) {
//        List<Integer> unsorted = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 6, 5));
//        System.out.println(merge_sort(unsorted));
//
//        System.out.println(calcFeetAndInchesToCentimeters(-2));
//        System.out.println(getDurationString(65, 45));
//        System.out.println(getDurationString(300));
//        printDayOfWeek(2);
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("i was " + i);
                sum += i;
                count += 1;
                if (count == 5) break;
            }
        }
        System.out.println("Sum was " + sum);
    }
}
