package baekjun;

import java.util.*;

//2초, 실버2
public class P1260_DFSBFS {
    // DFS = 깊이우선 탐색 (스택, 재귀함수)
    // BFS = 너비우선 탐색 (큐)

    static boolean visited[];
    static ArrayList<Integer>[] A;


    public static void main(String[] args) {

        // 1<= N <= 1,000 노드개수
        // 1 <= M <= 10,000 엣지갯수
        // V 시작번호

        /* q1.
            4 5 1
            1 2
            1 3
            1 4
            2 4
            3 4
            ->
            1 2 4 3  dfs
            1 2 3 4  bfs
        */

        // 1. 인접 리스트에 그래프 저장 (노드를 기준으로)  <-> 엣지리스트는 엣지를 기준으로 (MTS, 벨만포드)
        // 2. dfs 실행하면서 작은 번호 노드부터 탐색, 인접노드 오름차순 정렬 -> 재귀함수 호출
        // 3. bfs 노드 오름차순 정렬 -> 큐 삽입
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        A = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            // A 인접 리스트의 각 ArrayList초기화하기
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            // A 인접 리스트에 그래프 데이터 저장하기
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i <= N ; i++) {
            // 각 노드와 관련된 에지를 정렬하기
            Collections.sort(A[i]);
        }
        visited = new boolean[N+1];
        DFS(V);
        System.out.println();
        visited = new boolean[N +1];
        BFS(V);
        System.out.println();

        sc.close();
    }
    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);    // 큐 자료구조에 시작 노드 삽입하기
        visited[node] = true;   // visited 배열에 현재 노드 방문 기록하기

        // 큐가 비어있을 때 까지
        while(!queue.isEmpty()){
            int now_Node = queue.poll();    // 큐에서 노드 데이터를 가져오기
            System.out.print(now_Node + " ");  // 가져온 노드 출력하기
            // 현재 노드의 연결노드 중 미바운 노드를 큐에 삽입하고 방문 배열에 기록하기
            for(int i : A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void DFS(int node) {
        System.out.print(node + " "); // 현재 노드 출력
        visited[node] = true;  // visited 배열에 현재 노드 방문 기록
        // 현재 노드의 연결노드 중 방문하지 않은 노드로 dfs 실행하기
        for(int i : A[node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
