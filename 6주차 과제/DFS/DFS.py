def dfs(graph, v, visited) :
    # 현재 방문한 노드 방문 처리
    visited[v] = True
    print(v, end=' ')

    # 현재 노드와 연결된 다른 노드 방문 (재귀함수)
    for i in graph[v] :
        if not visited[i] : # 방문 기록이 없는 노드인 경우 방문 표시위해 재귀 함수 실행
            dfs(graph, i, visited)

graph = [
    [],
    [2, 3, 8], # 1번 노드와 인접한 노드
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

# 각 노드가 방문된 정보 1 ~ 8번 노드
visited = [False] * 9 

# 정의된 DFS 함수 호출, 1 위치에서 시작
dfs(graph, 1, visited)