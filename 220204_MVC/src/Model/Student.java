package Model;

public class Student {

	// Model : �����͸� �����ϴ� ��
	// view�� controller�� ���� ��� ������ �� �� ����.
	// ������ �Ͼ�� ó�� ����� �����ؾ� �Ѵ�.

	private String name;
	private int age; //
	private String className; // �� �̸�

	// ������ ������ �� �ִ� ������ �޼ҵ�
	public Student(String name, int age, String className) {
		this.name = name;
		this.age = age; //
		this.className = className;
	}

	// ���� ���� �޼ҵ� ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
