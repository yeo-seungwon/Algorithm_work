#include <stdio.h>
#include <stdlib.h>

int main(void){
  //현재 나이트의 위치
  printf("현재 나이트의 위치 : ");
  char *inputData;
  scanf("%s", inputData);
  int column = inputData[0] - 'a' + 1; // 문자부
  int row = inputData[1] - '0'; // 숫자부

  // 나이트가 이동할 수 있는 8가지 방향 정의
  int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
  int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

  // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
  int result = 0;
  for (int i = 0; i < 8; i++) {
    // 이동하고자 하는 위치 확인
    int nextRow = row + dx[i];
    int nextColumn = column + dy[i];
    // 해당 위치로 이동이 가능하다면 카운트 증가
    if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
      result += 1;
      }
  }

  printf("%d", result);
  return 0;
}