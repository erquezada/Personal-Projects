#include<stdio.h>
int main() {
    float height;
    float weight;
    float bmi;  
    
    printf("Enter your height in meters: ");
    scanf ("%f", &height);

    printf("Enter your weight in kilograms: ");
    scanf("%f", &weight);

    bmi = weight / (height * height);

    printf("Your BMI is: %f\n", bmi);
    
    if(bmi <= 18.4) {
        printf("You are underweight");
        
    } else if(bmi >= 18.5 && bmi <= 24.9) {
        printf("You are normal");
        
    } else if(bmi >= 25.0 && bmi <= 29.9) {
        printf("You are overweight");
        
    } else printf("You are obese");
    
    return 0;
} 