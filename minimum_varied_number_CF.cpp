#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		// n is the main number 

		// these lines of code is to get to know the number fo digits our ans must have.

		int i=9,sum=0,power =1;
		long long ans =0;
		for(;i>0;i--){
			sum+=i;
			if(sum>=n){
				break;
			}else{
				ans +=(power * i);
				power *=10;			}
		}
		int d = n-sum + i;
		ans+=(power * d);
		cout<< ans << endl;
	}
}