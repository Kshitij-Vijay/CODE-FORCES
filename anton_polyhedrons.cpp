/*

<QUESTION> 785A - 19 :				ANTON POLYHEDRONS

Anton's favourite geometric figures are regular polyhedrons. Note that there are five kinds of regular polyhedrons:

Tetrahedron. Tetrahedron has 4 triangular faces.
Cube. Cube has 6 square faces.
Octahedron. Octahedron has 8 triangular faces.
Dodecahedron. Dodecahedron has 12 pentagonal faces.
Icosahedron. Icosahedron has 20 triangular faces.

Anton has a collection of n polyhedrons. One day he decided to know, how many faces his polyhedrons have in total. Help Anton and find this number!

Input
The first line of the input contains a single integer n (1 ≤ n ≤ 200 000) — the number of polyhedrons in Anton's collection.

Each of the following n lines of the input contains a string si — the name of the i-th polyhedron in Anton's collection. The string can look like this:

"Tetrahedron" (without quotes), if the i-th polyhedron in Anton's collection is a tetrahedron.
"Cube" (without quotes), if the i-th polyhedron in Anton's collection is a cube.
"Octahedron" (without quotes), if the i-th polyhedron in Anton's collection is an octahedron.
"Dodecahedron" (without quotes), if the i-th polyhedron in Anton's collection is a dodecahedron.
"Icosahedron" (without quotes), if the i-th polyhedron in Anton's collection is an icosahedron.
Output
Output one number — the total number of faces in all the polyhedrons in Anton's collection.

*/


#include <bits/stdc++.h>
using namespace std;

int poly(char c){
	if(c=='T'){
		return 4;
	}else if(c=='C'){
		return 6;
	}else if(c=='O'){
		return 8;
	}else if(c=='D'){
		return 12;
	}else {
		return 20;
	}
}

int main(){
	int t;
	cin>>t;
	int sum=0;
	while(t--){
		string s;
		cin>>s;
		sum=sum+poly(s[0]);
	}
	cout<<sum;
}
