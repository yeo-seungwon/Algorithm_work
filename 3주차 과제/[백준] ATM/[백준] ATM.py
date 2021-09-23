N = int(input()) # ATM 기기를 사용하기 위해 기다리는 사람 수
time = list(map(int,input().split())) # 각각이 ATM을 사용하는데 소모되는 시간
time.sort() # 작은 수 부터 정렬

result = 0 
for i in range(N) :
    for j in range(0, i+1):
            result += time[j]

print(result)