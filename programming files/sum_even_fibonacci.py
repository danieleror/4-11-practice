#base cases
a, b = 0, 1
sum_even = 0
#loop through first 4000000 terms of fibonacci sequence
while b < 4000000:
    #if even add to sum
    if b % 2 == 0:
        sum_even += b
    #go to next fibonacci number
    a, b = b, a+b

print(sum_even)

# answer should be 4613732
