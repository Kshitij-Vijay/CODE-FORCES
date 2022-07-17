#include <bits/stdc++.h>
using namespace std;

int poly(char c){
	if(c=='T'){
		return 4;
	}else if(c=='C'){
		return 6;
	}else if(c=='O'){
		return 8;
	}else if(c=='D'){
		return 12;
	}else {
		return 20;
	}
}

int main(){
	int t;
	cin>>t;
	int sum=0;
	while(t--){
		string s;
		cin>>s;
		sum=sum+poly(s[0]);
	}
	cout<<sum;
}