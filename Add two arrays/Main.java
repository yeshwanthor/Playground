#include<stdio.h>
int main()
{
 int s1,sum,i;
 scanf("%d",&s1);
 int a1[s1],a2[s1];
 sum=0;
 for(i=1;i<=s1;i++)
 {
   scanf("%d",&a1[i]);
 }
 for(i=1;i<=s1;i++)
 {
    scanf("%d",&a2[i]);
    sum=a1[i]+a2[i];
 printf("%d ",sum);
 }
 return 0;
}