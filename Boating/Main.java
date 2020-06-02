#include<iostream>
using namespace std;
int main()
{
  int x,y,z,a,b;
  cin>>x>>y>>z;
  a=75*y;
  b=30*z;
  switch(x>a+b){
    case 0:cout<<"Boat will drow";
    break;
    case 1:cout<<"Boat is stable";
  }
  return 0;
}