#include<stdio.h>
int main()
{
  int n,a,b,c,d,x;
  scanf("%d",&n);
  a=n%10000;
  b=a%1000;
  c=b%100;
  d=c/10;
  printf("%d",d);
  
  return 0;
}