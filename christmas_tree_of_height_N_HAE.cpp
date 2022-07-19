#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int o;
		cin>>o;
		for(int i=0;i<o;i++){
			for(int j=0;j<=i;j++){
				long long w,a=1,b=1;
			int big,small,n=i,r=j;
			if(n-r>r){
				big=n-r;
				small=r;
			}else{
				big=r;
				small=n-r;
			}
			while(n>=1){
				if(n>big){
						a*=n;
				}
				else if(n<=small){
							b*=n;
				}
					else{
				n=small + 1;
			}
				n--;
			}
				w=a/b;
				cout<<w<<" ";
			}
			cout<<endl;
		}
	}
	return 0;
}