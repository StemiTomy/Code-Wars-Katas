package ocho_kyu_8;

public class Calculate_BMI {
  // la mejor practica:
  public static String bmi(double weight, double height) {
    double bmi = weight / (height * height);
    if (bmi <= 18.5) {
      return "Underweight";
    } else if (bmi <= 25.0) {
      return "Normal";
    } else if (bmi <= 30.0) {
      return "Overweight";
    }
    return "Obese";
  }
}