def dfs(x, y) :
    print("dfs 함수 시작")
    Stack stack

class Stack: # 선입후출
    #리스트를 이용한 스택 구현
    def __init__(self):
        self.top = []
    #스택 크기 반환
    def __len__(self) -> bool :
        return len(self.top)
    
    #구현함수
    #스택에 원소 삽입
    def push(self, item):
        self.top.append(item)
    #스택 가장 위에 있는 원소를 삭제하고 반환   
    def pop(self):
        if not self.isEmpty():
            return self.top.pop(-1)
        else:
            print("Stack underflow")
            exit()
    #스택 가장 위에 있는 원소를 반환
    def peek(self):
        if not self.isEmpty():
            return self.top[-1]
        else:
            print("underflow")
            exit()
    #스택이 비어있는 지를 bool값으로 반환
    def isEmpty(self) -> bool :
        return len(self.top)==0

# 메인 ----------------------------------
n, m = map(int, input().split())
graph = []
for i in range(n) :
    graph.append(list(map(int, input())))

dx = [-1, 1, 0 , 0]
dy = [0, 0, -1, 1]

print(dfs(0, 0))