#include <bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int sum=0;
	string a,b;
	cin>>a>>b;
	for(int i=0;i<n;i++){
		int x=a[i],y=b[i];
		if(x>y){
			sum+=min(x-y,y-x+10);
		}else{
			sum+=min(y-x,x-y+10);
		}
	}	
	cout<<sum<<endl;
}