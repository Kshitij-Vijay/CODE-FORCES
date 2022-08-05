#include <bits/stdc++.h>
using namespace std;
int main(){
	// must have the exactly upto the constraints
	const int N = (2*(1e+5))+1;
	int t;
	cin>>t;
	while(t--){
		bool arr[N]={false};
		int n;
		cin>>n;
		int brr[n];
		for(int i=0;i<n;i++){
			cin>>brr[i];
		}
		n--;
		for(;n>=0;n--){
			if(arr[brr[n]]==false){
				arr[brr[n]]=true;
			}else{
				break;
			}
		}
		cout<<n+1<<endl;
	}
}
