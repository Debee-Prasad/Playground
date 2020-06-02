#include<iostream>
using namespace std;
int main()
{
int a;
float b;
float x=10.15;
cin>>a>>b;
if(a>13)
{
if(b != x){cout<<"$5.00";
}
else{
cout<<"$8.00";
}
}
 if(a<13)
{
if(b != x)
{
cout<<"$2.00";
}
else{cout<<"$4.00";
}
 }return 0;
}