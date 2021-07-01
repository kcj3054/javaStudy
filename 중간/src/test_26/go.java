package test_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class go {

	public static void main(String[] args) {

		 System.out.println("프로그램을 입력해주세요. go를 입력하시면 작동합니다.");
	        while (true) {
	            HashMap<String, Integer> map = new HashMap<>();
	            Scanner scanner = new Scanner(System.in);
	            ArrayList<String> list = new ArrayList<>();

	            while (true) {
	                String str = scanner.nextLine();

	                if (str.equals("go")) {
	                    break;
	                }

	                list.add(str);
	            }

	            for (int i = 0; i < list.size(); i++) {
	                String[] splits = list.get(i).split(" ");
	                String command = splits[0];
	                String var = splits[1];
	                String value = splits[2];

	                switch (command) {
	                    case "mov":
	                        map.put(var, Integer.parseInt(value));
	                        break;
	                    case "add":
	                        try {
	                            map.put(var, map.get(var) + Integer.parseInt(value));
	                        } catch (NumberFormatException e) {
	                            map.put(var, map.get(var) + map.get(value));
	                        }
	                        break;
	                    case "sub":
	                        try {
	                            map.put(var, map.get(var) - Integer.parseInt(value));
	                        } catch (NumberFormatException e) {
	                            map.put(var, map.get(var) - map.get(value));
	                        }
	                        break;
	                    case "jn0":
	                        if (map.get(var) != 0) {
	                            i = Integer.parseInt(value) - 1;
	                            continue;
	                        }
	                        break;
	                    case "prt":
	                        int result = map.get(var);
	                        System.out.println("[" + list.get(i) + "]");
	                        Iterator<String> iter = map.keySet().iterator();
	                        while (iter.hasNext()) {
	                            String s = iter.next();
	                            System.out.print(s.toUpperCase() + ":" + map.get(s) + " ");
	                        }
	                        System.out.println();
	                        System.out.println("출력할 결과는 " + result + ". 프로그램 실행 끝");
	                        break;
	                }
	            }
	        }
	}

}
