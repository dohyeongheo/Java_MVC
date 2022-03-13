package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Student;

public class Controller {

	// Controller : 뷰와 모델을 연결해주는 역할

	// 학생 정보를 넘겨받는 메소드

	// 여러 학생의 데이터를 관리 할 수 있는 ArrayList 생성
	Scanner sc = new Scanner(System.in);

	ArrayList<Student> list = new ArrayList<>();

	public int addInfo(String name, int age, String className) {
		list.add(new Student(name, age, className));
		
		return 1;
	}

	// 학생 전체정보 조회하기 메소드
	public void allList() {
		for (int i = 0; i < list.size(); i++) {
			System.out
					.println(list.get(i).getName() + " / " + list.get(i).getAge() + " / " + list.get(i).getClassName());

		}

	}

	public void searchInfo(String name) {
		boolean ischeck = true;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.println(
						list.get(i).getName() + " / " + list.get(i).getAge() + " / " + list.get(i).getClassName());
				ischeck = false;
			} else if (ischeck = true) {
				System.out.println("해당하는 학생이 없습니다.");
			}
		}
	}

	public void update(String name, String className) {

		boolean ischeck = true;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				list.get(i).setClassName(className);
				ischeck = false;
				System.out.println("수정이 완료되었습니다.");
			} else if (ischeck = true) {
				System.out.println("해당하는 학생이 없습니다.");
			}
		}
	}

	public void remove(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).getName() + " 학생의 삭제가 완료되었습니다.");
				list.remove(i);
			}
		}
	}

}
