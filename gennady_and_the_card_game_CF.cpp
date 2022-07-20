#include <bits/stdc++.h>
using namespace std;
int main(){
	string c;
	cin>>c;
	bool b=false;
	for(int i=0;i<5;i++){
		string a;
		cin>>a;
		if(a[0]==c[0] || a[1]==c[1]){
			b=true;
		}
	}
	if(b==true){
		cout<<"YES"<<endl;
	}else{
		cout<<"NO"<<endl;
	}
}