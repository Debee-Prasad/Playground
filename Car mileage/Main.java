#include<iostream>
using namespace std;
int main()
{
  float mile;
  int pa,dt;
  cin>>mile>>pa>>dt;
  if(dt<=mile*pa)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}