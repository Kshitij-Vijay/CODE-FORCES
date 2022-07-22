#include <bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int a,b,sum=0;
	cin>>a>>b;
	while(n--){
		if(a%10>=b%10)
            sum+=min(a%10-b%10,b%10+10-a%10);
        else{
            sum+=min(b%10-a%10,a%10+10-b%10);
        }
	    }
	    a/=10;
	    b/=10;
	
	cout<<sum<<endl;
}