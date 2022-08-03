#include <bits/stdc++.h>
using namespace std;
int main(){
	int m;
	cin>>m;
	unordered_set<int> a;
	int q=2;
	while(q--){
		int u;
	cin>>u;
	while(u--){
		int y;
		cin>>y;
		a.insert(y);
		if(a.size()==m){
			cout<<"I become the guy."<<endl;
			return 0;
		}
	}
}

	cout<<"Oh, my keyboard!"<<endl;
}