// it is important to use long long

#include <bits/stdc++.h>
using namespace std;
int ret(int y){
	long long p=1;
	while(y--){
		long long w;
		cin>>w;
		p=p*w;
	}
	return p%10;
}
void check(int b){
	if(b==3 || b==5 || b==2){
		cout<<"YES"<<endl;
	}else{
		cout<<"NO"<<endl;
	}
}
 int main(){
 	int t;
 	cin>>t;
 	while(t--){
 		int n;
 		cin>>n;
 		check(ret(n));
 	}
 }