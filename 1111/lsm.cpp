#include<iostream>
#include<string.h>
#include <algorithm>
using namespace std;
char c[16];
char k[16];
void change(int n)
{
	char temp[16];
	int size = strlen(c)-n;
	int x=0;
	for(int i=0;i<size;i++)
	{
		temp[i]=c[n];
		n++;
	}
	for(int j=size;j<strlen(c);j++)
	{
		temp[j]=c[x];
		x++;
	}
	for(int l=0;l<strlen(c);l++)
		c[l]=temp[l];

}
int main()
{
	int button=0; 
	int round=0;
	cout<<"입력 : "; 
	cin >> c;
	cin >> k;
	
	int size = strlen(c);
	
	for(int i=0;i<strlen(k);i++)
	{
		for(int j=0;j<strlen(c);j++)
		{
			if(k[i]==c[j])
			{
				button++;
				change(j);
				round+=min(j,size-j);
			}		
		}
	} 
	cout<<"출력 : "<<button+round<<endl;
}
