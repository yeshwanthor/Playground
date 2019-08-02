#include<stdio.h>
int main()
{
int s,sum=0,count,countodd,i;
int a[s];
scanf("%d",&s);
count=0;
countodd=0;
for(i=1;i<=s;i++)
{
  scanf("%d",&a[i]);
  sum=0;
  sum=sum+a[i];
  if(sum%2==0)
  {
    count++;  
  }
  else
  {
    countodd++;
   
  }
}
 printf("Odd: %d\n",countodd);
 printf("Even: %d\n",count);
}
