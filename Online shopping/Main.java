#include<stdio.h>
int main()
{
  //fill your code
  int a1,b1;
  int a2,b2;
  int a3,b3;
  int a,b,c;
  float dis1,dis2,dis3;
  scanf("%d%f%d%d%f%d%d%f%d",&a1,&dis1,&b1,&a2,&dis2,&b2,&a3,&dis3,&b3);
  b=a1 -((dis1/100.0)*a1)+b1;
  c=a2 -((dis2/100.0)*a2)+b2;
  a=a3 -((dis3/100.0)*a3)+b3;
  printf("In Flipkart: Rs.%d\n",b);
  printf("In Snapdeal: Rs.%d\n",c);
  printf("In Amazon: Rs.%d\n",a);
  if(a<b)
  {
    if(a<c)
    {
      printf("He will prefer Amazon");
    }
    else
    {
      printf("He will prefer Snapdeal");
    }
  }
  else if(b<c)
  {
    printf("He will prefer Flipkart");
  }
  else
  {
    printf("He will prefer Snapdeal");
      
  }
}
  
