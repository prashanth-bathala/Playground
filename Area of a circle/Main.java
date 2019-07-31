#include<stdio.h>
#define PI 3.14
int main()
{
  int d;
  float r, a;
  scanf("%d",&d);
  r=(float)d/2;
  a=PI*r*r;
  printf("%.2f",a);
  
  return 0;
}