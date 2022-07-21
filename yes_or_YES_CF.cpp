#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		string s;
		cin>>s;
		int i=2;
		// to convert all upper case to lower 
		while(i>=0){
			if((int)s[i]>=65 && (int)s[i]<=90){
				s[i]=(char)((int)s[i]+32);
			}
			i--;
		}
		if(s=="yes"){
			cout<<"YES"<<endl;
		}else{
			cout<<"NO"<<endl;
		}
	}
}