#include <iostream>
using namespace std;
int main()
{
    int num;
    float score=0.0;
    for(int i=0; i<3;){
        cin>>num;
        if(num<0){
            score-=1;
            break;
        }
        else if(num%2==1){
            score+=1;
            i++;
        }
        else
            score-=0.5;
    }
    cout<<score;
}