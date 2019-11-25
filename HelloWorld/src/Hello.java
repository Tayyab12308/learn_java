public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Tayyab");

        int num = 5;
        int num2 = 12;
        int num3 = 6;
        int total = num + num2 + num3;
        int lastTotal = total - 1000;
        System.out.println(lastTotal);

        byte firstNum = 10;
        short secondNum = 100;
        int thirdNum = 400;
        long fourthNum = 50000 + (10 * (firstNum + secondNum + thirdNum));
        System.out.println(fourthNum);

        int pounds = 10;
        double poundsToKilos = 0.45359237;
        System.out.println(pounds * poundsToKilos);


        double firstVar = 20.00;
        double secondVar = 80.00;
        double thirdVar = (firstVar + secondVar) * 100;
        double remainder = thirdVar % 40.00;
        boolean noRemainder = remainder == 0 ? true : false;
        System.out.println(noRemainder);
        if (noRemainder) System.out.println("Got no remainder");
    }
}
