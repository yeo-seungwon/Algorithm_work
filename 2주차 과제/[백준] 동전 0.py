# 가지고 있는 동전의 종류 N / 동전 금액의 합 K
N, K = map(int,input().split())
coin = []
# 가지고 있는 동전의 종류 coin 리스트에 삽입
for i in range(N):
    coin.append(int(input()))
coin.sort(reverse=True) # 내림차순 정렬

count_c = 0
# 사용되는 동전의 수 만큼 count
for j in coin:
    if K == 0:
        break
    count_c += K // j
    K = K % j

print(count_c)
