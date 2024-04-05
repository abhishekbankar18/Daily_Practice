#include<iostream>
using namespace std;

class Base
{
    public:
        int X,Y;

    void fun()
    {
        cout<<"Inside Base fun"<<"\n";
    }
    void gun(int i)
    {
        cout<<"Inside Base gun with 1 parameter"<<"\n";
    }
    void gun(int i,int j)
    {
        cout<<"Inside Base gun with 2 parameter"<<"\n";
    }
};

class Derived : public Base
{
    public:
        int A, B;

    void sun()
    {
        cout<<"Inside derived sun"<<"\n";
    }
    void fun()
    {
        cout<<"Derived fun"<<"\n";
    }
};

int main()
{
    Derived dobj;

    dobj.Base ::fun();
    dobj.gun(10);
    dobj.gun(11,21);
    dobj.sun();
    dobj.Derived::fun();
    dobj.fun();

    return 0;
}