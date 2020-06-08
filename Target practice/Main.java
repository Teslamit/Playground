#include<iostream>
using namespace std;
int main()
{
  int n,n1,score,t=1;
  cin>>n>>n1;
  score=n1;
  while(score<n)
  {
    cin>>n1;
    score+=n1;
    t++;
  }
  cout<<"The number of turns is "<<t;
}