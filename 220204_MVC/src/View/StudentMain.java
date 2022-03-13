package View;

import java.util.Scanner;

import Controller.Controller;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Controller controller = new Controller();

		// view : 사용자가 사용하며, 시각적인 확인을 할 수 있는 곳
		// Model이 가지고 있는 데이터를 저장 할 수 없음

		System.out.println("=======학생 정보관리 시스템=======");

		while (true) {
			System.out.print("[1]정보추가 [2]전체조회 [3]검색 [4]수정 [5]삭제 [6]종료 >> ");
			int choice = sc.nextInt(); // 기능으로 넘겨지게끔 하는 변수는 view에 저장 가능하다

			if (choice == 1) {
				System.out.println("===정보추가===");

				System.out.print("이름 : ");
				String name = sc.next();

				System.out.print("나이 : ");
				int age = sc.nextInt();

				System.out.print("과정명 : ");
				String className = sc.next();

				// 학생 정보를 Controller를 통해서 Model로 전달
				int cnt = controller.addInfo(name, age, className);
				
				// 실제 데이터가 입력 됐을때 메시지가 출력되도록 설정
				if(cnt > 0) {
					System.out.println("정보 추가 성공!");
				} else {
				System.out.println("정보 추가 실패");	
				}

			} else if (choice == 2) {
				System.out.println("===전체조회===");
				controller.allList();

			} else if (choice == 3) {
				System.out.println("===검색===");
				System.out.print("검색할 이름 : ");
				String name = sc.next();
				controller.searchInfo(name);

			} else if (choice == 4) {
				System.out.println("===수정===");
				System.out.print("이름 : ");
				String name = sc.next();

				// 수정되어야 할 반 이름 입력받기
				System.out.print("수정할 반 이름 : ");
				String className = sc.next();
				controller.update(name, className);
				// 1. 수정하고 싶은 학생 이름 입력받기
				// 2. 수정되어야 할 반 이름 입력받기
				// 3. 수정 진행하기 -> controller 활용

			} else if (choice == 5) {
				System.out.println("===삭제===");

				// 1. 삭제하고 싶은 학생 이름 입력 받기
				System.out.print("이름 : ");
				String name = sc.next();
				// 2. 삭제 진행하기
				controller.remove(name);

			} else if (choice == 6) {
				System.out.println("프로그램을 종료되었습니다.");
				break;

			}
		}

	}
}
