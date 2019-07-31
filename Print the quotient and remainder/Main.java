#include<stdio.h>
int main()
{
  int n=365,x,y;
  x=n/4;
  y=n%4;
  printf("Quotient: %d\n",x);
  printf("Remainder: %d\n",y);
  return 0;
}