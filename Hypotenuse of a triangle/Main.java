#include<stdio.h>
#include <math.h>
int main()
{
  float op, ad, hyp;
  scanf("%f%f",&op,&ad);
  hyp=sqrt(op*op+ad*ad);
  printf("%.2f",hyp);
  return 0;
}