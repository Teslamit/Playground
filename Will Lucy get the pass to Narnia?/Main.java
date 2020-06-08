#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cout<<"Enter first number : ";
  cin>>x;
  cout<<"Enter second number : ";
  cout<<"Menu"<<"\n";
  cin>>y>>z;
  cout<<"1.Addition"<<"\n";
  cout<<"2.Subtraction"<<"\n";
  cout<<"3.Multiplication"<<"\n";
  cout<<"4.Division"<<"\n";
  cout<<"5.Remainder"<<"\n";
  switch(z)
  {
    case 1: cout<<x+y;
    break;
    case 2: cout<<x-y;
    break;
    case 3: cout<<x*y;
    break;
    case 4: cout<<x/y;
    break;
    case 5: cout<<x%y;
    break;
    default: cout<<"Invalid operation";
    break;
  }
}
  
  
  