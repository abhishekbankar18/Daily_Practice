#include<iostream>
using namespace std;

class Base
{
    public:
        int X, Y;

    Base()
    {
        cout<<"Inside BAse constructor "<<"\n";
    }
    ~Base()
    {
        cout<<"Inside base destructor "<<"\n";
    }
    void fun()
    {
        cout<<"Inside fun"<<"\n";
    }
};

class Derived : public Base
{
    public:
        int A, B;

    Derived()
    {
        cout<<"Inside derived constructor "<<"\n";
    }
    ~Derived()
    {
        cout<<"Inside derived destructor "<<"\n";
    }
    void gun()
    {
        cout<<"Inside gun"<<"\n";
    }
};

class Derivedx : public Derived
{
    public:
        int I, J;

    Derivedx()
    {
        cout<<"Inside derivedx constructor "<<"\n";
    }
    ~Derivedx()
    {
        cout<<"Inside derivedx destructor "<<"\n";
    }
    void sun()
    {
        cout<<"Inside sun"<<"\n";
    }
};

int main()
{
    Derivedx dobj;

    cout<<"Size of Base is "<<sizeof(Base)<<"\n";
    cout<<"Size of Derived is "<<sizeof(Derived)<<"\n";
    cout<<"Size of Derivedx is "<<sizeof(Derivedx)<<"\n";

    dobj.fun();
    dobj.gun();
    dobj.sun();

    return 0;
}