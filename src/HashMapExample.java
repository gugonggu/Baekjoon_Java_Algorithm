import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

    // 1620 나는야 포켓몬 마스터 이다솜 문제 풀기
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // 값 추가. 키를 통해 값에 접근하므로 값은 중복 가능, 그러나 키는 불가능
        students.put(20240801, "이철수");
        students.put(20240802, "김민재");
        students.put(20240803, "정홍찬");
        students.put(20240804, "이재향");
        students.put(20240805, "이철수");

        // 키에 해당하는 값 얻기
        System.out.println(students.get(20240802));
        System.out.println(students.get(20240810)); // null 값이 없다.

        // 키가 있는지 확인
        if (students.containsKey(20240810)) {
            System.out.println(students.get(20240810));
        } else {
            System.out.println("키가 존재하지 않습니다.");
        }

        Set<Integer> keySet = students.keySet();

        // 값이 있는지 확인 (keySet을 통해 순회)
        if (students.containsValue("정홍찬")) {
            for (Integer key : keySet) {
                if (students.get(key).equals("정홍찬")) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println("값이 존재하지 않습니다.");
        }

        // 값 삭제
        students.remove(20240804);

        // values() 모든 값 확인
        for (String value : students.values()) {
            System.out.println(value);
        }

        // keySet() 모든 키 확인
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }
    }
}