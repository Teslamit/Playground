#include <iostream>
using namespace std;
int main() 
{
  int x;
  cin>>x;
  int reverse = 0;
  int remainder;
  while(x!=0)
  {
    remainder = x%10;
    reverse = reverse*10+remainder;
    x = x/10;
  }
  cout<<reverse;
}