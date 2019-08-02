#include<stdio.h>
#include<math.h>
int main()
{
 int s,sum,i;
 scanf("%d",&s);
 int a[s];
 sum=0;
 for(i=1;i<=s;i++)
 {
   scanf("%d",&a[i]);
   if(a[i]==4)
   {
     printf("%d",a[i]);
   }  
}
 return 0;
}
