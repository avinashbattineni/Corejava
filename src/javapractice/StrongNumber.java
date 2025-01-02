package javapractice;

public class StrongNumber
{
        public static int factorial(int num) {
            int fact = 1;
            for (int i = 1; i <= num; i++)
            {
                fact =fact* i;
            }
            return fact;
        }

        public static void main(String[] args) {
            int number = 145;
            int originalNumber = number;
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum =sum+ factorial(digit);
                number=number/10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber + " is a Strong Number");
            } else {
                System.out.println(originalNumber + " is not a Strong Number");
            }
        }
    }


