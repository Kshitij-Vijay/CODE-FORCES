#include <bits/stdc++.h>
using namespace std;
int check(string s, char c){
	int l=s.size();
	int i=0;
	for(;i<l;i++){
		if(s[i]==c){
			int a=i+1;
			if((l-a)%2==0 && (a-1)%2==0){
				cout<<"YES"<<endl;
				return 0;
			}
		}
	}
	cout<<"NO"<<endl;
	return 0;
}
int main(){
	int t;
	cin>>t;
	while(t--){
		string s;
		char c;
		cin>>s>>c;
		check(s,c);
	}
}