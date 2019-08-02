#include<stdio.h>
int main()
{
  //Fill your code	 
  int a,b,c,d,e,f,g;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  e=a%d;
  f=b%d;
  g=c%d;
  if(e==0)
  {
    printf("Car 1 goes into road A");
  }
  else if(f==0)
  {
    printf("Car 1 goes into road B");
  }
  else if(g==0)
  {
    printf("Car 1 goes into road C");
  }
else
{
  printf("No path exist");
}
}