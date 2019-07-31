#include <stdio.h>
int getdigit(int num, int n)
{
    int r, t1, t2;
 
    t1 = pow(10, n+1);
    r = num % t1;
 
    if (n > 0)
    {
        t2 = pow(10, n);
        r = r / t2;
    }
  
 
    return r;
}
int main()
{
    int n, reversedNumber = 0, remainder;

   
    scanf("%d", &n);

    while(n != 0)
    {
        remainder = n%10;
        reversedNumber = reversedNumber*10 + remainder;
        n /= 10;
    }

   
    int num = reversedNumber, pos=1;
 
 
  
 
    printf("%d", getdigit(num, pos));

    return 0;
}