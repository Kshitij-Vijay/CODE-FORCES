#include <bits/stdc++.h>
using namespace std;
const int N = 1e7;
long long int arr[N]={0};
int main(){
	int s,q;
	cin>>s>>q;
	while(q--){
		int a,b,n;
		cin>>a>>b>>n;
		arr[a]+=n;
		arr[b+1]-=n;
	}
	for(int i=0;i<=s;i++){
		arr[i]+=arr[i-1];
	}
	long long int max = -1;
	for(int i =1;i<=s;i++){
		if(max<arr[i]){
			max=arr[i];
		}
	}
	cout<<max;
}