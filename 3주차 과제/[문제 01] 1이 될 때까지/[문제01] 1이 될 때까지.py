N, K = map(int,input().split())

result = 0

while True :
   target = (N // K) * K # K로 N을 나눌 때, 나누어 떨어지는 가장 큰 수
   result += (N-target) # K를 N으로 나눌 때 나머지 값
   N = target 

   # N이 K보다 작으면 더 이상 나눌 수 없음, 반복문 탈출 
   if N < K :
       break

   N //= K
   result += 1

result += (N - 1)
print(result)
