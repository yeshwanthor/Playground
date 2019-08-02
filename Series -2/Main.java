#include<stdio.h>
int main()
{
  //Fill your code
  int i,a=1,b=2,sum,c=0,n;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d ",a);
  printf("%d ",b);
  for(i=0;i<n;i++)
  {
    sum=a+b;
    printf("%d ",sum);
    c++;
  if(c==n-2)
    break;
  
    a=b;
    b=sum;
  }
  
  
  return 0;
}