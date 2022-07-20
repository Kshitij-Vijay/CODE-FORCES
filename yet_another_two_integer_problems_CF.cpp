#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		long long a,b;
		cin>>a>>b;
		long long d=a-b,sum;
		if(d<0){
			d*=-1;
		}
		d=d/10;
		if(a<b){
			a=a+(d*10);
			if(a-b<0){
				d++;
			}
		}
		else if(a>b){
			a=a-(d*10);
			if(a-b>0){
				d++;
			}
		}
		cout<<d<<endl;
	}
}