#include <stdio.h>
int main()
{
  float r, a, x;
  scanf("%f%f",&r,&a);
  x=(a/360)*2*3.14*r;
  printf("%.2f",x);
  return 0;
}