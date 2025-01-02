package javateam;

public class AgeValidation {
        public void getValidate(int age) throws InvalidAgeException
        {
            if(age>18)
            {
                System.out.println("Eligibel for Voting");
            }
            else
            {
                throw new InvalidAgeException("Not Eligible for Voting");
            }
        }
    }


