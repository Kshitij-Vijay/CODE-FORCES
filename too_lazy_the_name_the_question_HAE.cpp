#include <bits/stdc++.h>
using namespace std;
int main(){
	int a,b,c;
	cin>>a>>b>>c;
	int i=0,y=1;
	int count=0;
	while(count!=c){
		i++;
		if(i%a==0 || i%b==0){
			count++;
		}
	}
	// finding the last number
	
	int s;
	if(i%a==0 && i%b==0){
		int j=0;
		while(j>=0){
		j++;
		if(j%a==0 && j%b==0){
				s=j;
				break;
		}
	}
	}
	else if(i%a==0){
		s=a;
	}else{
		s=b;
	}
	// this is to find step

	// the both divisible numbers are a or b or some distance away
	// that distance is s
	// so we use that to print
	for(;i>=0;i-=s){
		cout<<i<<" ";
	}
}
