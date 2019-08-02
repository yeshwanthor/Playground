#include<stdio.h>
int main()
{
  //fill your code
  float wei,hei;
  scanf("%f%f",&wei,&hei);
  float bmi;
  bmi=wei/((hei*hei)/10000.0);
  if(bmi<18.5)
  {
    printf("You are underweight. Have an apple daily.");
  }
  else if(bmi>=18.5&&bmi<=24.9)
  {
    printf("You are normal. Go walking daily and maintain it.");
  }
  else
  {
    printf("You are obese. Go to doctor");
  }
}