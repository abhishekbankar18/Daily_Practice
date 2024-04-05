#include<iostream>
using namespace std;

class Base1
{
    public:
        int X,Y;

    Base1()
    {
        cout<<"Inside Base1 constructor"<<"\n";
    }
    ~Base1()
    {
        cout<<"Inside Base1 destructor"<<"\n";
    }
    void fun()
    {
        cout<<"Inside fun"<<"\n";
    }

};

class Base2
{
    public:
        int A,B;

    Base2()
    {
        cout<<"Inside Base2 constructor"<<"\n";
    }
    ~Base2()
    {
        cout<<"Inside Base2 destructor"<<"\n";
    }
    void gun()
    {
        cout<<"Inside gun"<<"\n";
    }
};

class Derived : public Base2, public Base1
{
    public:
        int I,J;

    Derived()
    {
        cout<<"Inside Derived constructor"<<"\n";
    }
    ~Derived()
    {
        cout<<"Inside Derived destructor"<<"\n";
    }
    void sun()
    {
        cout<<"Inside sun"<<"\n";
    }
};

int main()
{
    
    cout<<"Size of Base is "<<sizeof(Base1)<<"\n";
    cout<<"Size of Base2 is "<<sizeof(Base2)<<"\n";
    cout<<"Size of Derived is "<<sizeof(Derived)<<"\n";

    Derived dobj;

    dobj.fun();
    dobj.gun();
    dobj.sun();

    return 0;
}