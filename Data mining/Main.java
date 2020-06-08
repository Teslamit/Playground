#include <iostream>
using namespace std;
int main()
{
    int num, n, odd=0, even=0;
    cin>>num;
    while(num>0)
    {
        n=num%10;
        if(n%2==0)
            even+=n;
        else
            odd+=n;
        num=num/10;
    }
    if(odd==even)
        cout<<"Yes";
    else
        cout<<"No";
}