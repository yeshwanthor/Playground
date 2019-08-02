#include<stdio.h>
int main()
{
  //fill your code
  int len,bre,len1,bre1,len2,bre2;
  int a,b;
  scanf("%d%d%d%d%d%d",&len,&bre,&len1,&bre1,&len2,&bre2);
  a=len*bre;
  b=(len1+bre1)+(len2+bre2);
  if(a>b)
  {
    printf("Raj can fix both painting");
  }
    else
    {
      printf("Raj cannot fix both painting");
    }
}