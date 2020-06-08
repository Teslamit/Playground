#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x,y,z;
  cin>>a>>b>>c;
  x = b*75;
  y = c*30;
  z = x + y;
  if(z<=a)
    cout<<"Boat is stable";
 else
   cout<<"Boat will drow";
}