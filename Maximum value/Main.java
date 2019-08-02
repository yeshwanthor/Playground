#include<stdio.h>
int main()
{
int j,i,largest;
int a[j];
scanf("%d",&j);
for(i=0;i<j;i++)
{
scanf("%d",&a[i]);
largest=a[0];
}
for(i=1;i<j;i++)
{
  if(largest<a[i])
  {
      largest=a[i];
     
  }
 
}
 printf("%d",largest);
  return 0;
}