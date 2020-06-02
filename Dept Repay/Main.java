#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
double inter,amount,disc,settlement;
cin>>p>>t>>r;
inter=(p*t*r)/100;
amount=p+inter;
disc=inter*2/100;
settlement=amount-disc;
cout<<inter<<endl;
cout<<amount<<endl;
cout<<disc<<endl;
cout<<settlement;
return 0;
}