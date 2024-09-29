n = int(input('Enter the number : '))

##for i in range(1,101):
##    print(n, '*', i, '=', i*n)

##for i in range(n,(n*10)*1,n):
##    print(i)

##nested
##for i in range(1,7):
##    for j in range(1,7):
##        for k in range(1,7):
##            print(i,j,k)
##    print('-')
##print('*******')

##number = 0
##for i in range(1,7):
##    for j in range(1,7):
##        if (i + j == 8):
##            number = number + 1
##            print(i,j)
##        print(number)
##    print((number/36)*100)


for n in range(1,13):
    number = 0
    for i in range(1,7):
        for j in range(1,7):
            if (i + j == n):
                number = number + 1
                
        print(n, '=', round((number/36)*100,2))
