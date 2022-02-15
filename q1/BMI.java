public class BMI{

    private double weight;
    private double height;
    private double bmi;
    private String interpration;
    public static final double POUNDTOKG = 0.45359237;
    public static final double INCHTOMETERS = 0.0254;


    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void getBMI(){

        //this.bmi = this.weight/(height * height)*703;
        this.weight *= POUNDTOKG;
        this.height *= INCHTOMETERS;
        this.bmi = (weight/Math.pow(height, 2));

        if(this.bmi < 18.5){
            interpration = "Underweight";
        }
        else if(this.bmi < 25.0)
        {
            interpration = "Normal";
        }
        else if (this.bmi < 30)
        {
            interpration = "Overweight";
        }
        else
        {
            interpration = "Obese";
        }

    }
    public double getBmi2() {
        return bmi;
    }
    public String getInterpration() {
        return interpration;
    }
    
    


}