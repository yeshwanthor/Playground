#include<stdio.h>
int main()
{
  //fill your code
  int sal,loan,fees,food,par;
  int exp;
  scanf("%d%d%d%d%d",&sal,&loan,&fees,&food,&par);
  exp=loan+fees+food+par;
  if(sal>exp)
  {
    printf("He can save the money");
  }
  else if(sal<exp)
  {
    printf("He has to work hard");
  }
  else
  {
    printf("He can manage the expenses");
  }
    
}