#include <iostream>
using namespace std;

/* New comment edit  */

/*** Second comment ***/

int main() {
    static int accn_g = 32;
    double time;
    cout << "Enter the time (seconds): ";
    cin >> time;

    cout << "Enter the time (seconds): " << time << endl;
    cout << "The distance through which it falls is: " << (accn_g * time * time) / 2 << endl;
    return 0;
}
