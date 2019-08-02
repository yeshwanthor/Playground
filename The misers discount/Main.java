#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c,d,e,f,g;
  scanf("%f%f%f",&a,&b,&c);
  d=a+b;
  e=(c*d)/100;
  g=d-e;
  printf("%.2f\n%.2f\n%.2f",d,g,e);
}