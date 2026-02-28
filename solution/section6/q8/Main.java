package section6.q8;

import java.io.*;
import java.util.*;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    // 5 2
    // 60 50 70 80 90
    public int solution(int person, int target, String danger) {
        int answer = 0;

        StringTokenizer st = new StringTokenizer(danger);

        Queue<Person> q = new ArrayDeque<>();

        for (int i=0; i<person; i++) {
            q.offer(new Person(i, Integer.parseInt(st.nextToken())));
        }

        Person tmp;

        boolean bool = true;

        while (bool) {
            tmp = q.poll();
            for (Person x : q) {
                if (tmp.priority < x.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                } else {
                    continue;
                }
            }

            if (tmp != null) {
                answer++;

                if (tmp.id == target) {
                    bool = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int person = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        String danger = br.readLine();

        System.out.println(m.solution(person, target, danger));
    }
}