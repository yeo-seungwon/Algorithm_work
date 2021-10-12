#include <stdio.h>
#include <string.h>
#include <stdbool.h>

void bfs(int x);

// 큐 기능 구현 ----------------------------------------------------------------------
#define MAX 100
int front = -1;
int rear = -1;
int queue[MAX];

int IsEmpty(void) {
    if (front == rear)//front와 rear가 같으면 큐는 비어있는 상태 
        return true;
    else return false;
}

int IsFull(void) {
    int tmp = (rear + 1) % MAX; //큐에서 rear+1을 MAX로 나눈 나머지값이
    if (tmp == front)//front와 같으면 큐는 가득차 있는 상태 
        return true;
    else
        return false;
}

void addq(int value) {
    if (IsFull())
        printf("Queue is Full.\n");
    else {
        rear = (rear + 1) % MAX;
        queue[rear] = value;
    }

}

int deleteq() {
    return queue[++front];
}

// ----------------------------------------------------------------------------------

bool visited[9];
int graph[9][3] = { {0}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7} };

int main(void) {
    bfs(1);
}

void bfs(int start) {
    addq(start);
    visited[start] = true;
    
    while (!IsEmpty()) { 
        int x = deleteq(0);
        if (x != 0) {
            printf("%d ", x);
        } 

        for (int z = 0; z < sizeof(graph[x]) / sizeof(graph[x][0]); z++) {
            int node = graph[x][z];
            if (!visited[node]) {
                addq(node);
                visited[node] = true;
            }
        }
    }

    return  0;
}