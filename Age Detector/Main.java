#include<iostream>
using namespace std;
int main()
{
  int by,cy;
  cin>>by>>cy;
  if(cy != 0){
   if(cy > by)
    cout<<cy-by;
  else 
    cout<<100-by+cy;}
  else{
    cout<<100-by;
  }
  return 0;
}