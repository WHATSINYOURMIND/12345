#include<iostream>
using namespace std;
class person
{
	public:
		string name;
	public:
		void accept()
		{
			cout<<"\nEnter name=";
			cin>>name;
		}
		void display()
		{
			cout<<"\nName="<<name;
		}
};

class account:public person
{
	public:
		int accno;
	public:
		void accept()
		{
			person::accept();
			cout<<"\nEnter account number=";
			cin>>accno;
		}
		void display()
		{
			person::display();
			cout<<"\nAccount Number="<<accno;
		}
};

class customer:public account
{
	public:
		float balance;
	public:
		void accept()
		{
			account::accept();
			cout<<"\nEnter balance=";
			cin>>balance;
		}
		void display()
		{
			account::display();
			cout<<"\nAccount Balance="<<balance;
		}
};

int main()
{
	customer c;
	c.accept();
	c.display();
	return 0;
}












