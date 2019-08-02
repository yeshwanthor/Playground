#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e,f,g,h;
  scanf("%d%d%d%d",&a,&b,&c);
  d=(a*b)/100;
  e=a-d;
  f=(e*c)/100;
  g=e-f;
  h=g/3;
  printf("%d\n%d\n%d\n",d,f,h);
}
