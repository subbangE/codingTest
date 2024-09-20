package explanation;
import java.util.*;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int max = 0;
        int index = 0;

        List<Integer> arr = new ArrayList<>();

        Arrays.sort(people);

        for(int i=0; i<people.length; i++) {
            arr.add(people[i]);
        }

        while (index < arr.size()) {
            max += arr.get(arr.size()-1);
            arr.remove(arr.size()-1);

            for (int i=index; i<arr.size(); i++) {
                if (max + arr.get(i) <= limit) {
                    max += limit;
                    index++;
                } else {
                    answer++;
                    max = 0;
                    break;
                }
            }
        }

        return answer + 1;
    }
}
