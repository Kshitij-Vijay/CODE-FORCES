#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int a,b,s;
		cin>>a>>b;
		if(a%2==0 || b%2==0){
			s=a*b/2;
		}else{
			s=(((a-1)/2)*b)+((b+1)/2);
		}
		cout<<s<<endl;
	}
}