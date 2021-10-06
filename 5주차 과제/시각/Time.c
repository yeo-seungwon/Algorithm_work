#include <stdio.h>

int check(int i, int j, int k);

int main(void){
  int n;
  printf("입력할 정수 N : ");
  scanf("%d", &n);
  int count = 0;

  for (int i = 0; i <= n; i++){
    for (int j = 0; j < 60; j++) {
      for (int k = 0; k < 60; k++) {
        if (check(i, j, k)) count++;
      }
    }
  }

  printf("%d", count);
  return 0;
}

int check(int i, int j, int k){
  if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) return 1;
  return 0; // False
}