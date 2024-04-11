#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    std::string date_str = "2022-03-17 10:45:30";
    //added ; in next line
    std::tm date_obj = {};
    std::istringstream ss(date_str);
    //added > to >> in next line
    ss >> std::get_time(&date_obj, "%Y-%m-%d %H:%M:%S");
    std::stringstream formatted_date_ss;
    formatted_date_ss << std::put_time(&date_obj, "%m/%d/%Y %H:%M:%S");
    string formatted_date = formatted_date_ss.string();

    //added std:: to cout and endl
    std::cout << formatted_date << std::endl;

    return 0;
}
