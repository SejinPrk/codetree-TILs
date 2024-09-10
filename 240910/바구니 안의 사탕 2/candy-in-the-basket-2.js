const readline = require('readline');

// 입력을 받기 위한 readline 인터페이스 설정
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let inputLines = [];
let currentLine = 0;

// 한 줄씩 입력을 받음
rl.on('line', (input) => {
    inputLines.push(input);
});

// 입력을 다 받았을 때 실행
rl.on('close', () => {
    const [N, K] = inputLines[0].split(' ').map(Number);  // 첫 번째 줄에서 N과 K를 가져옵니다.
    const baskets = [];

    // 두 번째 줄부터 바구니 정보를 가져옴
    for (let i = 1; i <= N; i++) {
        const [candyCount, position] = inputLines[i].split(' ').map(Number);
        baskets.push([candyCount, position]);
    }

    // 최대 사탕 수 계산
    console.log(maximizeCandies(N, K, baskets));
});

// 사탕을 최대화하는 함수
function maximizeCandies(N, K, baskets) {
    let maxCandies = 0;

    // 중심점 c를 0부터 100까지 이동하면서 최적의 구간을 찾기
    for (let c = 0; c <= 100; c++) {
        let currentCandies = 0;

        // 각 바구니에 대해 해당 바구니가 구간 [c-K, c+K] 안에 있는지 확인
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