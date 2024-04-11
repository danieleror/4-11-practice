#base cases
a, b = 1, 0
sum_even = 0
#loop through first 4000000 terms of fibonacci sequence
while b < 4000000:
    #if even add to sum
    if b % 2 == 0:
        sum_even += b
    a, b = b, a+b

print(sum_even)

# answer should be 4613732
