#include <iostream>
using namespace std;

bool LeapYear(int year){
    if(year % 400 == 0){
        return true;
    }
    else if ((year % 100 ) != 0 && (year%4)==0){
        return true;
    }
    else {
        return false;
    }
}

int main() {
    cout << "Input a number as a year. ";

    int yearInput;
    cin >> yearInput;


    if(LeapYear(yearInput)){
        cout << "true" << endl;
    }
    else {
        cout << "false" << endl;
    }
    return 0;
}