#include <stdio.h>
#include <stdbool.h>

int dfs(int x);

bool visited[9];
int graph[9][3] = { {0}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7} };

int main(void) {
    dfs(1);
}

int dfs(int x) {
    visited[x] = true;
    if (x != 0) {
        printf("%d ", x);
    }

    for (int i = 0; i < sizeof(graph[x]-1); i++) {
        int node = graph[x][i];
        if (!visited[node]) {
            dfs(node);
        }
    }

    return  0;
}