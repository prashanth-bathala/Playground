#include<stdio.h>
int main()
{
	long int n, fact=1;
    scanf("%lld",&n);
    for(int i=1;i<=n;i++)
    {
      fact*=i;
    }
  printf("%lld",fact);
  return 0;
}