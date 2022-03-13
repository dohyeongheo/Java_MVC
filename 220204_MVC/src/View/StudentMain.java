package View;

import java.util.Scanner;

import Controller.Controller;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Controller controller = new Controller();

		// view : ����ڰ� ����ϸ�, �ð����� Ȯ���� �� �� �ִ� ��
		// Model�� ������ �ִ� �����͸� ���� �� �� ����

		System.out.println("=======�л� �������� �ý���=======");

		while (true) {
			System.out.print("[1]�����߰� [2]��ü��ȸ [3]�˻� [4]���� [5]���� [6]���� >> ");
			int choice = sc.nextInt(); // ������� �Ѱ����Բ� �ϴ� ������ view�� ���� �����ϴ�

			if (choice == 1) {
				System.out.println("===�����߰�===");

				System.out.print("�̸� : ");
				String name = sc.next();

				System.out.print("���� : ");
				int age = sc.nextInt();

				System.out.print("������ : ");
				String className = sc.next();

				// �л� ������ Controller�� ���ؼ� Model�� ����
				int cnt = controller.addInfo(name, age, className);
				
				// ���� �����Ͱ� �Է� ������ �޽����� ��µǵ��� ����
				if(cnt > 0) {
					System.out.println("���� �߰� ����!");
				} else {
				System.out.println("���� �߰� ����");	
				}

			} else if (choice == 2) {
				System.out.println("===��ü��ȸ===");
				controller.allList();

			} else if (choice == 3) {
				System.out.println("===�˻�===");
				System.out.print("�˻��� �̸� : ");
				String name = sc.next();
				controller.searchInfo(name);

			} else if (choice == 4) {
				System.out.println("===����===");
				System.out.print("�̸� : ");
				String name = sc.next();

				// �����Ǿ�� �� �� �̸� �Է¹ޱ�
				System.out.print("������ �� �̸� : ");
				String className = sc.next();
				controller.update(name, className);
				// 1. �����ϰ� ���� �л� �̸� �Է¹ޱ�
				// 2. �����Ǿ�� �� �� �̸� �Է¹ޱ�
				// 3. ���� �����ϱ� -> controller Ȱ��

			} else if (choice == 5) {
				System.out.println("===����===");

				// 1. �����ϰ� ���� �л� �̸� �Է� �ޱ�
				System.out.print("�̸� : ");
				String name = sc.next();
				// 2. ���� �����ϱ�
				controller.remove(name);

			} else if (choice == 6) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;

			}
		}

	}
}
