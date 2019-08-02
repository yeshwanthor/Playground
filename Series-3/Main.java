#include<stdio.h>
int main()
{
  //Fill your code
  int n,b=6,d=3,c=0,i,sum;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d ",b);
  for(i=0;i<n;i++)
  {
 sum=b+d;
    printf("%d ",sum);
    c++;
    if(c==n-1)
      break;
    b=sum;
    d=d+2;
    
  }
  return 0;
}