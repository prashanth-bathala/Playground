#include<stdio.h>
int main()
{
  int n,a,b,c;
  scanf("%d",&n);
  a=n/100;
  b=n%100;
  c=b%10;
  printf("%d",a+c);
  return 0;
}