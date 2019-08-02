#include<stdio.h>
int main()
{
  int c=0,a=7,n,b=5,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ",a);
    a++;
    c++;
    if(c==n)
      break;
    
printf("%d ",b);
    b++;
    c++;
    if(c==n)
      break;
       }
}