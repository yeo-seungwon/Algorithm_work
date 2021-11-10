// 비트 연산을 통해 문자의 대소문자 바꾸기

#include <stdio.h>
#define MAX_LENGTH 100

int main(void) {
    char s[MAX_LENGTH];
    int i=0;
    printf("문자열 입력: ");
    gets(s);
    while(s[i]!='\0') {
        printf("%c",s[i]^32);
        i++;
    }
    
    printf("\n");
    return 0;
}