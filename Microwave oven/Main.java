#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  float sih;
  cin>>n>>sih;
  if(n==2)
  {
    float a = sih +sih*0.5;
    cout<<fixed<<setprecision(2)<<a;
  } else if(n==3){
    float b= sih*2;
    cout<<fixed<<setprecision(2)<<b;
  }
  else{
    cout<<"Number of items is more";
  }
  return 0;
}