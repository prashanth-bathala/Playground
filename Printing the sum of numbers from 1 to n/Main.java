#include <stdio.h>

int main()
{
    int i, n;
    
    /* Input upper limit from user */
    
    scanf("%d", &n);
  int sum=0;
    for(i=1; i<=n; i++)
    {
       sum=sum+i;

        }
    
            printf("%d\n",sum);

    return 0;
}