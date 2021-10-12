#include <bits/stdc++.h>

using namespace std;

bool visited[9]; // 노드 방문 여부
int graph[9][3] = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

void dfs(int x) {
    visited[x] = true; // 해당 번호의 노드 방문 처리
    if(x != 0) {
        cout << x << ' '; // 해당 번호 출력 후 공백 출력
    }
    for (int node : graph[x]) {
    // 인접한 노드가 방문한 적이 없다면 DFS 수행
        if(!visited[node]) {
            dfs(node);
        }
    }
}

int main(void) {
    dfs(1); 
}