#include<iostream>
using namespace std;

int main()
{
    int *p = NULL;

    p = new int;
    cout<<"Memory gets allocated for p\n";

    int *q = NULL;

    q = new int(5);

    cout<<"Memory gets allocated for q\n";


    int *X = NULL;
    X = new int[5];

    cout<<"Memory gets allocated fro X\n";

    delete p;
    cout<<"Memory gets deallocated for p\n";

    delete q;
    cout<<"Memory gets deallocated for q\n";

    delete []X;
    cout<<"Memory gets deallocated for X\n";

    return 0;
}