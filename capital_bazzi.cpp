#include<bits/stdc++.h>
using namespace std;

char up(char c){
	if((int)c>=97 && (int)c<=122){
		c=(char)((int)c-32);
	}
	return c;
}
int main(){
	while(true){
		string s;
		cin>>s;
		if(s.size()==0){
			break;
		}else{
			int l=s.size();
			for(int i=0;i<l;i++){
				s[i]=up(s[i]);
			}
			cout<<s<<endl;
		}
	}
}