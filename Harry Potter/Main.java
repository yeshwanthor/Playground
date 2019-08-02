#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d;
  scanf("%d%d%d",&a,&b,&c);
  b=a/1000;
  c=a%10;
  d=b+c;
  printf("%d",d);
}