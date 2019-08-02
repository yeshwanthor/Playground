#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,c,d;
  scanf("%d%d",&a,&b);
  c=3.14*a*a;
  d=b*b;
  if(d>=c)
  {
    printf("circle can be inside a square");
  }
  else
  {
 printf("circle cannot be inside a Square");
  }
  
}