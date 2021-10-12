# 입력 예시 4 5
# 00110 00011 11111 00000

# dfs 함수
def dfs(x, y) :
    # 얼음판의 범위를 벋어난 경우
    if x <= -1 or x >= n or y <= -1 or y >= m : 
        return False

    # 현재 노드를 방문하지 않았다면
    if graph[x][y] == 0 :
        graph[x][y] = 1 # 해당 노드 방문 처리
        # 상, 하, 좌, 우의 요소들도 모두 재귀적으로 호출
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    
    return False

# n 세로, m 가로
n, m = map(int, input().split())

# 얼음판의 정보
graph = []
for i in range(n) :
    graph.append(list(map(int, input())))

result = 0
for i in range(n) :
    for j in range(m) :
        # 깊이우선탐색
        if dfs(i, j) == True :
            result += 1

print(result)