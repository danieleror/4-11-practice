#include <stdint.h>
#include <stdlib.h>
#include <stdio.h>

// instead of clamping values, use inherent type restrictions
// ownership of str transfers to caller
char * rgb_to_hex(uint8_t r, uint8_t g, uint8_t b)
{
    char *str = (char *) malloc(sizeof(char) * 7);
	sprintf(str, "%2X%2X%2X", r, g, b);
	str[6] = '\0';

    return str;
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
