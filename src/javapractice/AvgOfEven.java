package javapractice;

public class AvgOfEven {
    public static void main(String[] args) {
        int [] numbers={3,4,7,8,10,15};
        int sum=0;
        int count=0;
        for(int num:numbers)
        {
            if(num%2==0)
            {
                sum=sum+num;
                count++;
            }
        }
        if(count>0)
        {
            double average=(double)sum/count;
            System.out.println("The average of even numbers is"+average);
        }
        else {
            System.out.println("there were No even numbers");
        }
    }
}
