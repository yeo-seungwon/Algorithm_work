# 나이트가 갈 수 있는 모든 경로를 확인하며 각 위치로 이동

position = input() # 나이트의 현 위치 ex) a1
column = int(ord(position[0])) - int(ord('a')) + 1 # 문자 부 / ord : 유니코드 값 반환
row = int(position[1]) # 숫자 부

# 나이트가 이동할 수 있는 8가지 방향 정의
steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
result = 0 # 움직임이 가능한 위치의 개수
for step in steps:
    # 이동하고자 하는 위치 확인
    next_row = row + step[0]
    next_column = column + step[1]
    # 해당 위치로 이동이 가능하다면 카운트 증가
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
        result += 1

print(result)