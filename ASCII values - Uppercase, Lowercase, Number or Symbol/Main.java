#include<stdio.h>
int main()
{
  //Fill your code
  char ch;
  scanf("%c",&ch);
  if(ch>='A'&&ch<='Z')
  {
    printf("Upper");
  }
  else if(ch>='a'&&ch>='z')
  {
    printf("Lower");
  }
  else if(ch>='0'&&ch>='10')
  {
    printf("number");
  }
  else
  {
    printf("Symbol");
  }
}