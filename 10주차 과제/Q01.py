# 비트 연산을 통해 짝수, 홀수 판별하기

def isEven(N) :
    return(N & 1)

N = int(input())

if isEven(N) == 1 :
    print("Odd")
else :
    print("Even")