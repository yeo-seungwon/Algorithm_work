N = int(input())
time = list(map(int,input().split()))
time.sort()

result = 0
for i in range(N) :
    for j in range(0, i+1):
            result += time[j]

print(result)