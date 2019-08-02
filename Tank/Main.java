#include<stdio.h>
int main()
{
  //fill your code
  int rad,hei,n;
  float x;
  scanf("%d%d%d%f",&rad,&hei,&n,&x);
  float v;
  v=(3.14*rad*rad*hei);
  if((v/n)>x)
     {
       printf("The tank cannot be filled within %.1f hours",x);
     }
     else
     {
       printf("The tank can be filled within %.1f hours",x);
     }
}