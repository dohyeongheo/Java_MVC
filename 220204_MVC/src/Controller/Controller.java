package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Student;

public class Controller {

	// Controller : ��� ���� �������ִ� ����

	// �л� ������ �Ѱܹ޴� �޼ҵ�

	// ���� �л��� �����͸� ���� �� �� �ִ� ArrayList ����
	Scanner sc = new Scanner(System.in);

	ArrayList<Student> list = new ArrayList<>();

	public int addInfo(String name, int age, String className) {
		list.add(new Student(name, age, className));
		
		return 1;
	}

	// �л� ��ü���� ��ȸ�ϱ� �޼ҵ�
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
				System.out.println("�ش��ϴ� �л��� �����ϴ�.");
			}
		}
	}

	public void update(String name, String className) {

		boolean ischeck = true;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				list.get(i).setClassName(className);
				ischeck = false;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			} else if (ischeck = true) {
				System.out.println("�ش��ϴ� �л��� �����ϴ�.");
			}
		}
	}

	public void remove(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).getName() + " �л��� ������ �Ϸ�Ǿ����ϴ�.");
				list.remove(i);
			}
		}
	}

}
