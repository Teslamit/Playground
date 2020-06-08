#include <iostream>
using namespace std;
int main()
{
    int num, sq, digits=0, n, left, right, div=10;
    cin>>num;
    sq=num*num;
    n=num;
    while(n>0)
    {
        digits+=1;
        n=n/10;
    }
    for(int i=1;i<digits;i++){
        div=div*10;
    }
    right=sq%div;
    left=sq/div;
    if((left+right)==num)
        cout<<"Kaprekar Number";
    else
        cout<<"Not a Kaprekar Number";
}