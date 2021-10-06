# 24 * 60 * 60 = 86,400
# 단순히 시각을 1씩 증가시키며 3이 포함되었는지 확인
# 완전탐색 문제

n = int(input())
count = 0

for i in range(n + 1): # 시
    for j in range(60): # 분
        for k in range(60): # 초
            if '3' in str(i) + str(j) + str(k):
                count += 1

print(count)