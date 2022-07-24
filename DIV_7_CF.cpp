#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int w;
		cin>>w;
		int r=w/7;
		int a=7*r;
		int b=7*(r+1);
		if(a/10==w/10){
			cout<<a<<endl;
		}else{
			cout<<b<<endl;
		}
	}
}