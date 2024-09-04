def count_lee(grid):
    n, m = len(grid), len(grid[0])
    count = 0
    
    # 8방향: 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1), (-1, -1), (-1, 1), (1, -1), (1, 1)]
    
    def is_valid(x, y):
        return 0 <= x < n and 0 <= y < m
    
    for i in range(n):
        for j in range(m):
            if grid[i][j] == 'L':
                for dx, dy in directions:
                    x, y = i + dx, j + dy
                    if is_valid(x, y) and grid[x][y] == 'E':
                        x, y = x + dx, y + dy
                        if is_valid(x, y) and grid[x][y] == 'E':
                            count += 1
    
    return count

# 입력 받기
n, m = map(int, input().split())
grid = [input().strip() for _ in range(n)]

# 결과 출력
result = count_lee(grid)
print(result)