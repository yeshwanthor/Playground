#include<stdio.h>
int main()
{
  //fill your code
  int x1,x2,x3,y1,y2,y3;
  float a,b;
  scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
  a=(x1+x2+x3)/3.0;
  b=(y1+y2+y3)/3;
  printf("%.1f\n%.1f",a,b);
  
}