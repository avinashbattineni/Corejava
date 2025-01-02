package javateam;

public class AgevalidationDriver {

        public static void main(String[] args)
        {
            AgeValidation av=new AgeValidation();
            try {
                av.getValidate(17);
            }
            catch (InvalidAgeException e)
            {
                System.out.println(e.getMsg());
            }
        }
    }


