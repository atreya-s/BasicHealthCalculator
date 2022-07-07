public class HealthCheck {
    
    private static double height;
    private static double weight;
    private static int age;
    private static String sex;

    public HealthCheck(double height, double weight, int age, String sex) {
        HealthCheck.height = height;
        HealthCheck.weight = weight;
        HealthCheck.age = age;
        HealthCheck.sex = sex;
    }
    public static double getHeight() {
        return height;
    }
    public static void setHeight(double height) {
        HealthCheck.height = height;
    }
    public static double getWeight() {
        return weight;
    }
    public static void setWeight(double weight) {
        HealthCheck.weight = weight;
    }
    public static int getAge(){
        return age;
    }
    public static void setAge(int age){
        HealthCheck.age = age;
    }

   
    public double BMI(double height, double weight) {
        
       double finalWeight =  (weight/(height * height))*10000 ; 
       return finalWeight;
    }

    public double BMR(double height, double weight, double age, String sex){
        if (sex == "female"){
          double womenBMR = (447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age));
          return womenBMR;
        }
       else{
        double manBMR = 88.362 + (13.397 * weight) + (4.799 * height ) - (5.677 * age);
        return manBMR;
       }
       
    }
    
   public static void main(String[] args){
    HealthCheck bmi = new HealthCheck(193, 96, 34, "female") ; 
    System.out.println(bmi.BMI(height, weight));
    System.out.println(bmi.BMR(height, weight, age, sex));

   }
    
   }
