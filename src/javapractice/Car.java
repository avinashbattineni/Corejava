package javapractice;

public class Car {
        private String company_name;
        private String model_name;
        private int year;
        private double mileage=29.8;

        public String getCompanyName() {
            return company_name;
        }

        public void setCompanyName(String company_name) {
            this.company_name = company_name;
        }

        public String getModelName() {
            return model_name;
        }

        public void setModelName(String model_name) {
            this.model_name = model_name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
                this.year = year;
            }

        public double getMileage() {
            return mileage;
        }
        public void displayCarInfo() {
            System.out.println("Company Name: " + company_name);
            System.out.println("Model Name: " + model_name);
            System.out.println("Year: " + year);
            System.out.println("Mileage: " + mileage + " miles");
        }

        public static void main(String[] args) {
            Car car = new Car();
            car.setCompanyName("Toyota");
            car.setModelName("Camry");
            car.setYear(2020);

            car.displayCarInfo();

            }
    }


