#include<iostream>
using namespace std;
int main()
{
  int row,col,n;
  cin>>row>>col>>n;
  if(((n>col*1) && (n<=col*2))||((n>col*(col-2)) && (n<=col*(col-1))))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}