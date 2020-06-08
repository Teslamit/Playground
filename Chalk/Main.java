#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  float n,root,count=0;
  int val=1,days,ans;
  cin>>n;
  root=(1/sqrt(n));
  ans=root*n;
  cout<<ans+1+n;
}

