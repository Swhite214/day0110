package scannner;

import java.util.Scanner;

class Person{
	String name;
	String phone;
	
	
}

public class ScannerTest03 {

	public static void main(String[] args) {
		Person whoAreYou = new Person(); //초기값을 외부에서 입력해서 받기때문에 생성자로 초기값을 지정해줄 필요가없어요
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int age = scanner.nextInt();
		scanner.nextLine();//편법쓰기 엔터만 처리하고 출력은안함
		System.out.println("이름을 입력해주세요"); //입력은 next는 띄어쓰기로 구별합니다 박찬우 = 단어1개 박 찬우 = 단어 2개
		whoAreYou.name = scanner.nextLine();
		System.out.println("전화번호를 알려주세요");
		whoAreYou.phone = scanner.nextLine();//지금은 오히려 엔터가 나올때까지 인식하는 nextLine이 더 나을수도있겠네요
		scanner.close();//넥스트 라인의 문제는 앞에잇는 메서드가 엔터를 처리안해버리면 그뒤 넥스트라인 하나가 무효처리됩니다. 버퍼안에 엔터가 남아있기때문이죠
		System.out.print("당신은 " + whoAreYou.name + "이고 전화번호는 " + whoAreYou.phone + "입니다." );

	}//즉 Next와 NextLine 둘다 가능하지만 전자는 띄어쓰기 처리가 안되고 후자는 엔터처리안하면 생략되기에 상황에따라적절히 사용하셔야합니다
	//다른 메서드가 있을까요? -주말에 찾아보세요

}
