#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x,y,z,m,n,o;
  cin>>a>>x>>m>>b>>y>>n>>c>>z>>o;
  int d1=(a*x)/100;
  int d2=(b*y)/100;
  int d3=(c*z)/100;
  int p1=a-d1+m;
  int p2=b-d2+n;
  int p3=c-d3+o;
  cout<<"In Flipkart Rs."<<p1<<endl;
  cout<<"In Snapdeal Rs."<<p2<<endl;
  cout<<"In Amazon Rs."<<p3<<endl;
  if((p1<=p2) && (p1<=p3))
    cout<<"He will prefer Flipkart";
  else if(p2<p3)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  return 0;
}