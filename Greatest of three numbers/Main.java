#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if((a>b)&(a>c))
  {
    printf("%d is greater",a);
  }
  else if(b>c)
  {
    printf("%d is greater",b);
  }
  else
  {
    printf("%d is greater",c);
  }
}
