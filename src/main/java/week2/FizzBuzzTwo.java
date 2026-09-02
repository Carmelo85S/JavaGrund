package week2;

public class FizzBuzzTwo {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    public static String getFizzBuzz(int n) {
        String answer = "";
        if (n % 3 == 0 && n % 5 == 0) {
            answer = "FizzBuzz";
        } else if (n % 3 == 0) {
            answer = "Fizz";
        } else if (n % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = String.valueOf(n);
        }
        return answer;
    }

}

