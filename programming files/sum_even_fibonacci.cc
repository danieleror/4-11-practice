#include <stdio.h>

int main(void) {
    int prev, n, temp, sum_even;

	n = 1;
	prev = 0;
	sum_even = 0;
	// sum even fibonacci numbers up to 4000000
    while (n < 4000000) {
        // if b is even, add it to the sum
		if (n % 2 == 0) {
            sum_even += n;
        }
		// next fibonacci number is the sum of the current and previous
        temp = n;
        n += prev;
        prev = temp;
    }
	// print the sum
    printf("%d\n", sum_even);

    return 0;
}

// answer should be 4613732
