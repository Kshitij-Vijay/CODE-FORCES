#include <bits/stdc++.h>
using namespace std;
int main(){
	int t,i=0,sum=0;
	cin>>t;
	string s;
	cin>>s;
	for(;i<t-2;i++){
		if(s[i]=='x'&&s[i+1]=='x'&&s[i+2]=='x'){
			sum++;
		}
	}
	cout<<sum<<endl;
}