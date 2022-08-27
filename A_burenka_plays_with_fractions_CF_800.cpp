#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		long long int a,b,c,d,n,m;
		cin>>a>>b>>c>>d;
		n=a*d;
		m=b*c;
		if(n==m){
			cout<<0<<endl;
		}else if(n==0 || m==0){
			cout<<1<<endl;
		}else if(n%m==0 || m%n==0){
			cout<<1<<endl;
		}else{
			cout<<2<<endl;
		}
	}
}