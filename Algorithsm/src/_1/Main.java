package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Student st1 = new Student("홍종화", "961015");
		Student st2 = new Student("홍재화", "020406");
		Student st3 = new Student("유병욱", "000000");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
				
		Scanner scan = new Scanner(System.in);
						
		while (true) {
			System.out.println("검색을 원하시면 y, 종료하고 싶으면 n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("학생의 이름을 입력해 주세요.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (stu.getName().equals(name)){
						System.out.println("학생의 학번은 : " + stu.getNo());
						flag = true;
					}
				}					
					if (!flag) {
						System.out.println("없는 학생 이름");
					}
			} else if (input.equals("n")) {
				break;
			}
		}
		
		System.out.println("종료.");
	}
}
