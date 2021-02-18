import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {

		// 학생이름(key) - 점수(value)
		
		// key - value : Map
		// value값은 보통 object로 선언하고 있다.
		// 생성 = class, type = Interface로 하고 있다. - 모든 작업은 method를 이용해야 한다.
		Map<String, Integer> map = new HashMap<>();
		
		// Date 저장하기 (동명이인이 있는 경우 = 값이 덮어쓰기가 된다)
		// key는 중복을 허용하지 않는다.(DB에 있는 고유값을 사용한다.)
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		// data의 갯수 확인 : .size();
		System.out.println("map 데이터의 개수 : " + map.size());

		// map은 순차적인 처리를 제공하지 않는다.
		// key를 순차적인 처리가 가능한 set으로 전달할 수 있다. : 모든 data를 출력할 수 있다.
		Set<String> keySet = map.keySet();
		
		System.out.println(keySet);
		
		// 모든 data를 처리할 수 있도록 가져온 keySet -> Iterator(반복처리를 위해 만들어 놓은 것) 객체로 만든다.
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {	// for-each문
			
			String key = keyIterator.next();
			
			Integer value = map.get(key);
			
			System.out.println("key = " + key + ", value = " + value);
			
		}
		
		for (String k : keySet) {	// while(keyIterator.hasNext())와 동일한 결과 값
			
			System.out.println(k + " = " + map.get(k));
			
		}
		
		// map에서 하나의 data 삭제하기 : key가 필요
		map.remove("홍길동");
		
		for (String k : map.keySet()) {
			
			System.out.println(k + " = " + map.get(k));
			
		}
		
		// map의 모든 data 삭제하기 : clear
		map.clear();
		
		System.out.println(map.size());
		
		for (String k : map.keySet()) {
			
			System.out.println(k + " = " + map.get(k));
			
		}
		
		
		
	}

}
