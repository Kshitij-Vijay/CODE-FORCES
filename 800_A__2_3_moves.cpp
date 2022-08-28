#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,a,b;
		cin>>n;
		a=n/3;
		b=n%3;
		if(n==1){
			a++;
		}
		if(b==0){
			cout<<a<<endl;
		}else{
			cout<<a+1<<endl;
		}
	}
}