#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
 (num>0)?((num%2==0)?cout<<"Possible":cout<<"Not possible"):cout<<"Not possible";
  return 0;
}