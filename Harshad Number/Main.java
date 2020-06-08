#include<iostream>
using namespace std;
int main()
{
  int num, sum=0, n,m;
  cin>>num;
  n=num;
  while(n>0)
  {
    m=n%10;
    sum=sum+m;
    n=n/10;
  }
  if(num % sum == 0)  
    cout<<"Harshad Number";  
  else
    cout<<"Not Harshad Number";
}