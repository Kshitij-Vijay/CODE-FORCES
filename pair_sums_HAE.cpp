#include <bits/stdc++.h>
using namespace std;
int main(){
	int l,n;
	cin>>l>>n;
	const int e = 2*(1e+6);
	bool arr[e]={false};
	while(l--){
		int y;
		cin>>y;
		if(arr[n-y]==true){
			cout<<"YES"<<endl;
			return 0;
		}else{
			arr[y]=true;
		}
	}
	cout<<"NO"<<endl;
}