#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool dfs(int x, int y);

int n, m;
int graph[1000][1000];

int main(void) {
	printf("세로 : ");
	scanf_s("%d", &n);
	printf("가로 : ");
	scanf_s("%d", &m);

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			scanf_s("%1d", &graph[i][j]);
		}
	}

	// 모든 노드(위치)에 대하여 음료수 채우기
	int result = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			// 현재 위치에서 DFS 수행
			if (dfs(i, j)) {
				result += 1;
			}
		}
	}

	printf("얼릴 수 있는 아이스크림의 갯수 : %d", result);
}

bool dfs(int x, int y) {
	// 주어진 범위를 벗어나는 경우에는 즉시 종료
	if (x <= -1 || x >= n || y <= -1 || y >= m) {
		return false;
	}

	// 현재 노드를 아직 방문하지 않았다면
	if (graph[x][y] == 0) {
		// 해당 노드 방문 처리
		graph[x][y] = 1;
		// 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
		dfs(x - 1, y);
		dfs(x, y - 1);
		dfs(x + 1, y);
		dfs(x, y + 1);
		return true;
	}
	return false;
}

