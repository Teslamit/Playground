#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  cin>>a;
  b = 0.5*a;
  c = (0.65*a)+100;
  d = (0.80*a)+200;
  e = (1.25*a)+425;
  if(a<=200)
  {
    if(a==65)
      cout<<"Rs.32";
    else
      cout<<"Rs."<<b;
  }
  else if(a<=400)
    cout<<"Rs."<<c;
  else if(a<=600)
    cout<<"Rs."<<d;
  else
    cout<<"Rs."<<e;
}
