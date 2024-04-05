#include<iostream>
#include<stdlib.h>
using namespace std;

class Demo
{
    public :
        int x;
        int y;
    
    Demo()
    {
        cout<<"Inside constructor"<<"\n";
    }
    ~Demo()
    {
        cout<<"Inside destructor"<<"\n";
    }
    void fun()
    {
        cout<<"Inside fun"<<"\n";
    }

};

int main()
{
    Demo *ptr = NULL;

    ptr = (Demo *)malloc(sizeof(Demo));

    ptr->fun();

    free(ptr);
    
    return 0;
}