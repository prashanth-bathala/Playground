#include<stdio.h>
#include<math.h>
int main()
{
 float a, b, c, root1, root2, d, imaginary, real;
 scanf("%f%f%f",&a,&b,&c);
 d=(b*b)-(4*a*c);
 if(d>0)
 {
   root1=(-b+sqrt(d))/(2*a);
   root2=(-b-sqrt(d))/(2*a);
   printf("root1 = %.2f  root2 = %.2f",root1,root2);
 }
  else if(d==0)
  {
    root1=root2=(-b)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
  else
  {
    real=(-b)/(2*a);
    imaginary=(sqrt(-d))/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,imaginary,real,imaginary);
   }
  return 0;
 }