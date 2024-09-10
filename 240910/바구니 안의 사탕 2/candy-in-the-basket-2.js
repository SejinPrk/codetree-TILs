function maximizeCandies(N, K, baskets) {
    let maxCandies = 0;

    // 중심점 c를 0부터 100까지 이동하면서 최적의 구간을 찾습니다.
    for (let c = 0; c <= 100; c++) {
        let currentCandies = 0;

        // 각 바구니에 대해 해당 바구니가 구간 [c-K, c+K] 안에 있는지 확인합니다.
        for (let i = 0; i < N; i++) {
            const candyCount = baskets[i][0];
            const position = baskets[i][1];

            // 바구니가 구간 [c-K, c+K]에 있는지 확인
            if (position >= c - K && position <= c + K) {
                currentCandies += candyCount;
            }
        }

        // 최대 사탕 수 갱신
        maxCandies = Math.max(maxCandies, currentCandies);
    }

    return maxCandies;
}

// 입력 예시
const N = 4;
const K = 3;
const baskets = [
    [4, 7],
    [10, 15],
    [2, 2],
    [5, 1]
];

// 최대 사탕 수 출력
console.log(maximizeCandies(N, K, baskets));