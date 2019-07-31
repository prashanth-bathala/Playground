#include <stdio.h>
int main()
{
  int n, num=0;
  scanf("%d",&n);
  while(n!=0)
     {
        num = (num * 10) + (n % 10);
        n /= 10;
    }
  while(num != 0)
    {
        switch(num % 10)
        {
    case 1 : 
      printf("One");
      break;
    case 2 :
      printf("Two");
      break;
    case 3 :
      printf("Three");
      break;
    case 4 :
      printf("Four");
      break;
    case 5 :
      printf("Five");
      break;
      default :
      printf("Invalid");
      break;
        }
    num = num / 10;
  }
  
  return 0;
}