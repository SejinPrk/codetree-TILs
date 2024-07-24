import java.util.*;

class SequenceSorter { // 수열을 처리하는 로직
    private int[] sequence;  // 원본 수열을 저장하는 배열
    private Element[] elements;

    // Comparable 인터페이스를 구현하는 내부 클래스
    private static class Element implements Comparable<Element> {
        int value;
        int index;

        Element(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Element other) {
            if (this.value == other.value) {
                return Integer.compare(this.index, other.index); // 값이 같으면 인덱스로 비교
            }
            return Integer.compare(this.value, other.value); // 값으로 비교
        }
    }

    public SequenceSorter(int[] sequence) { 
        this.sequence = sequence;
        this.elements = new Element[sequence.length];
        // 인덱스 배열 초기화: 0부터 sequence.length-1까지
        for (int i = 0; i < sequence.length; i++) {
            elements[i] = new Element(sequence[i], i);
        }
    }

    public int[] getSortedPositions() { // 실제 정렬 및 위치 계산을 수행
        Arrays.sort(elements);

        int[] result = new int[sequence.length];
        // 정렬된 인덱스 배열을 이용해 각 원소의 새 위치 계산
        for (int i = 0; i < sequence.length; i++) {
            result[elements[i].index] = i + 1; // 새 위치는 1부터 시작
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