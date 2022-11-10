#include<iostream>
using namespace std;
class rectangle
{
	public:
		int length,breadth;
	public:
		rectangle()
		{
			cout<<"\nEnter length and breadth=";
			cin>>length>>breadth;
		}
		void area()
		{
			int a;
			a=length*breadth;
			cout<<"\nArea of rectangle="<<a;
		}
};

int main()
{
	rectangle r1,r2;
	r1.area();
	r2.area();
	return 0;
}
