#include <iostream>
using namespace std;
int main()
{
    int r, c, grid, count=0;
    cin>>r>>c;
    grid=r*c;
    while(grid>=1)
    {
        r-=1;
        c-=1;
        grid=r*c;
        count++;
    }
    if(count%2==0)
        cout<<"Mani Iyer";
    else
        cout<<"Arun Gupta";
}