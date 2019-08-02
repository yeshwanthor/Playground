#include<stdio.h>
int main()
{
  int a,b,c,d;
 scanf("%d",&a);
 b=a/365;
  c=(a-(b*365))/7;
  d=a-((b*365)+(c*7));
  {
 printf("%d\n%d\n%d",b,c,d);   
  }
}
