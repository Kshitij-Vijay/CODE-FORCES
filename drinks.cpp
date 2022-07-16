#include<bits/stdc++.h>
using namespace std;
 int main(){
 	int l;
 	cin>>l;
 	double sum=0;
 	for(int i=0;i<l;i++){
 		double y;
 		cin>>y;
 		sum=sum+y;
 	}
 	double ans=sum/(l);
 	cout<<ans;
 }