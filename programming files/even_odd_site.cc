#include <iostream>
#include <fstream>
using namespace std;

int main() {
    //creates file to write to
    ofstream file;
    //opens the file
    file.open("numbers.html");
    //adds a title and opens the body
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n";
    //creates a table
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    //loops through values 1-50
    for (int i = 1; i <= 50; i++) {
        if (i % 2 == 0) { //writes number to even column if its even
            file << "<tr><td>" << i << "</td><td></td></tr>\n";
        }
        else { //writes number to odd column if its odd
            file << "<tr><td></td><td>" << i << "</td></tr>\n";
        }
    }
    //ends the table and closes the body
    file << "</table>\n</body>\n</html>";
    //closes the file
    file.close();
    //creates input file
    ifstream input("numbers.html");
    //prints something from the file
    cout << input.rdbuf();
    //closes file
    input.close();
    //end of main, return code 0
    return 0;
}