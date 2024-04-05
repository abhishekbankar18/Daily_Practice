#include<iostream>
#include<stdlib.h>
using namespace std;

class Base
{
    public:
        int A;
        int B;

        Base()
        {
            cout<<"Inside Base Constructor\n";
        }
        ~Base()
        {
            cout<<"Inside Base Destructor\n";
        }
        void fun()
        {
            cout<<"Inside Fun\n";
        }
};

class Derived : public Base
{
    public:
        int X,Y;

    Derived()
    {
        cout<<"Inside derived constructor"<<"\n";
    }
    ~Derived()
    {
        cout<<"Inside derived Destructor"<<"\n";
    }
    void gun()
    {
        cout<<"Inside gun Derived"<<"\n";
    }
};

int main()
{
    Derived * ptr = NULL;

    ptr = new Derived;

    ptr->fun();
    ptr->gun();

    delete ptr;

    return 0;
}