#include <bits/stdc++.h>

using namespace std;

int n, cnt;
// 특정한 시각 안에 '3'이 포함되어 있는지의 여부
bool check(int n, int m, int s) {
    if (n % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
        return true;
    return false;
}

int main(void) {
    // H 입력 받기
    cin >> n;
    for (int i = 0; i <= n; i++) { // 시
        for (int j = 0; j < 60; j++) { // 분
            for (int k = 0; k < 60; k++) { // 초
                if (check(i, j, k)) cnt++;
            }
        }
    }
    cout << cnt << '\n';
    return 0;
}