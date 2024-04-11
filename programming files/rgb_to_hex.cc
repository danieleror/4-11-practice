#include <iostream>
#include <sstream>
#include <iomanip>
#include <stdint.h>

// instead of clamping values, use inherent type restrictions
std::string rgb_to_hex(uint8_t r, uint8_t g, uint8_t b)
{
    ss << std::uppercase << std::hex << std::setfill('0')
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str();
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
