#include<stdio.h>
int main()
{
  char c;
  scanf("%c",&c);
  if('A'<=c && c<='Z')
  {
    printf("%c",c+32);
  }
  if('a'<=c&& c<='z')
  {
    printf("%c",c-32);
  }
  return 0;
}