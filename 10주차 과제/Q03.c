// 가장 오른쪽 0값의 비트를 1로 바꾼 값 찾기

#include <stdio.h>
#include <math.h>

int getPosOfRightmostSetBit(int n) { 
  return log2(~n&(n+1)) + 1; 
} 

int setRightmostUnsetBit(int n) { 
  if (n == 0) return 1; 
  if ((n & (n + 1)) == 0) return n; 
  int pos = getPosOfRightmostSetBit(n); 
  return ((1 << (pos - 1)) | n); 
} 

int main() { 
  int n;
  printf("숫자 입력 : ");
  scanf("%d", &n); 
  printf("%d", setRightmostUnsetBit(n)); 
  return 0; 
} 