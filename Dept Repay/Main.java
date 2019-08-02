#include<stdio.h>
int main()
{
  //fill your code
  int x,y,r; 
  float si,total_amount,discount,fin;
  scanf("%d%d%d",&x,&y,&r);
  si= (x*y*r)/100;
  total_amount = si+x;
  discount = 0.02*si;
  fin = total_amount-discount;
  printf("%.2f\n%.2f\n%.2f\n%.2f",si,total_amount,discount,fin);
}