#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,x;
		cin>>n>>x;
		int arr[2*n]={0};
		cin>>arr[0];
		for(int i=1;i<2*n;i++){
			int key;
			cin>>key;
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}

		// insertion sort correct 

		int a=n-1,b=(2*n)-1;
		bool k=true;
		while(n--){
			if(arr[b]-arr[a]>=x){
				a--;
				b--;
			}else{
				k=false;
				break;
			}
		}

		if(k==false){
			cout<<"NO"<<endl;
		}else{
			cout<<"YES"<<endl;
		}
	}
}