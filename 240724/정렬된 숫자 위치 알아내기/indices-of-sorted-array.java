import java.util.*;

class SequenceSorter { // 수열을 처리하는 로직
    private int[] sequence;  // 원본 수열을 저장하는 배열
    private Integer[] indices; // Arrays.sort() 메소드에 커스텀 비교자(Comparator)를 사용할 때 Integer 객체 필요

    public SequenceSorter(int[] sequence) { 
        this.sequence = sequence;
        this.indices = new Integer[sequence.length];
        // 인덱스 배열 초기화: 0부터 sequence.length-1까지
        for (int i = 0; i < sequence.length; i++) {
            indices[i] = i;
        }
    }

    public int[] getSortedPositions() { // 실제 정렬 및 위치 계산을 수행
        // 인덱스 배열을 정렬. 이때 sequence 값을 기준으로 정렬하되,
        // 값이 같은 경우 원래 인덱스 순서를 유지
        Arrays.sort(indices, (a, b) -> {
            if (sequence[a] == sequence[b]) {
                return Integer.compare(a, b); // 값이 같으면 인덱스로 비교
            }
            return Integer.compare(sequence[a], sequence[b]);  // 값으로 비교
        });

        int[] result = new int[sequence.length];
        // 정렬된 인덱스 배열을 이용해 각 원소의 새 위치 계산
        for (int i = 0; i < sequence.length; i++) {
            result[indices[i]] = i + 1; // 새 위치는 1부터 시작
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 수열의 길이
        int n = sc.nextInt();

        int[] sequence = new int[n];
        
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        // SequenceSorter 객체 생성 및 결과 계산
        SequenceSorter sorter = new SequenceSorter(sequence);
        int[] result = sorter.getSortedPositions();

        // 결과 출력
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        } 

        sc.close();
    }
}