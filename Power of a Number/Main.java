#include <stdio.h>
int main()
{
  	int b, p, x=1;
    scanf("%d%d",&b,&p);
    if(p>=0)
    {
      for(int i=1;i<=p;i++)
      {
        x=x*b;
      }
      printf("%d",x);
    }
      else
      {
        printf("Wrong input");
      }
    return 0;
}