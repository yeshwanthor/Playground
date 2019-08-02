#include<stdio.h>
int main()
{
  //Fill your code
  int a=0,b=3,sum,n,i,c=0;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d ",a);
  for(i=0;i<n;i++)
  {
    sum=a+b;
    printf("%d ",sum);
    c++;
    if(c==n-1)
      break;
    a=sum;
    b=b+2;
  }
}