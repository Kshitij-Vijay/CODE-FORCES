#include <bits/stdc++.h>
using namespace std;
int main(){
	int t,sum=0;
	cin>>t;
	int a[t];
	int h[110]={0};
	for(int i=0;i<t;i++){
		int y;
		cin>>a[i]>>y;
		h[y]++;
	}
	for(int i=0;i<t;i++){
		sum+=h[a[i]];
	}
	cout<<sum<<endl;
}