package Model;

public class Student {

	// Model : 데이터를 관리하는 곳
	// view나 controller에 대한 어떠한 정보도 알 수 없다.
	// 변경이 일어나면 처리 방법을 구현해야 한다.

	private String name;
	private int age; //
	private String className; // 반 이름

	// 정보를 저장할 수 있는 생성자 메소드
	public Student(String name, int age, String className) {
		this.name = name;
		this.age = age; //
		this.className = className;
	}

	// 게터 세터 메소드 생성
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
