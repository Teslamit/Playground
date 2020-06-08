#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tb,tr,cr,cb;
  cin>>tb>>tr>>cr>>cb;
  float t6=tb/6;
  int t=cb/6;
  int p=cb%6;
  double c6= ((float)t+ (float)p/10);
  double crr=cr/c6;
  double trr=tr/t6;
  cout<<t6<<"\n"<<fixed<<setprecision(1)<<c6<<"\n"<<crr<<"\n"<<trr;
  if(crr>trr)
    cout<<"\nEligible to Win";
  else  
    cout<<"\nNot Eligible to Win";
}