#include<iostream>
using namespace std;
class XYZ;
class ABC
{
	private:
		int a;
	public:
		void accept()
		{
			cout<<"\nEnter a=";
			cin>>a;
		}
		friend void add(ABC ob1,XYZ ob2);
};
class XYZ
{
	private:
		int x;
	public:
		void accept()
		{
			cout<<"\nEnter x=";
			cin>>x;
		}
		friend void add(ABC ob1,XYZ ob2);
};

void add(ABC ob1,XYZ ob2)
{
	int z;
	z=ob1.a+ob2.x;
	cout<<"\nAddition="<<z;
}

int main()
{
	ABC p;
	XYZ q;
	p.accept();
	q.accept();
	add(p,q);
	return 0;
}
