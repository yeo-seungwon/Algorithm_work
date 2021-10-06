#include <stdio.h>
#include <string.h>

int main(void) {
  int n;
  char *plan;
  int x = 1, y = 1;

  // L, R, U, D에 따른 이동 방향
  int dx[4] = {0, 0, -1, 1};
  int dy[4] = {-1, 1, 0, 0};
  char moveTypes[4] = {'L', 'R', 'U', 'D'};

	printf("이동 공간의 크기 : ");
	scanf("%d", &n);
  getchar(); // scanf의 마지막에 \n가 남아있음, gets를 위해 입력 버퍼 제거
  printf("이동 계획 : ");
  gets(plan);

  int nx = 0;
  int ny = 0;
  for(int i = 0; i < strlen(plan); i++){
    for(int j = 0; j < strlen(moveTypes); j++){
      if(plan[i] == moveTypes[j]){
        nx = x + dx[j];
        ny = y + dy[j];
      }
    }

    if(nx < 1 || ny < 1 || nx > n || ny > n){
      continue;
    }
    x = nx;
    y = ny;
  }

  printf("%d %d", x, y);
  return 0;
}
