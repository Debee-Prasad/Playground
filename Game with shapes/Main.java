#include<iostream>
using namespace std;
int main()
{
  int r,x;
  cin>>r>>x;
  if(x>=(r*2))
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;
}