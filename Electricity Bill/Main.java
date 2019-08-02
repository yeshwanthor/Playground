#include<stdio.h>
int main()
{
  //fill your code
  int a;
  float b;
  
  scanf("%d",&a);
  if(a<=200)
  {
    b=(a*0.5);
     // printf("Rs.%f",b);

  }
  else if(a<=400)
  {
    b=(float)a*0.65+100;
      

  }
  else if(a<=600)
  {
    b=a*0.80+200;
      //printf("Rs.%d",b);

  }
  else
  {
    b=(a*1.25)+425;
  }
  
  printf("Rs.%.f",round(b));
  
}