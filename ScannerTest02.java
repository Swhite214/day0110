package scannner;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputStream inputStream = System.in; 이렇게 선언해도 되고 여기서 inputstream은 키보드
		System.out.println("숫자만 입력해주세요");
		Scanner scanner = new Scanner(System.in); //가장 기본적인 input stream (입력)장치는? 키보드
		int c =0; //실행중 입력하는 사람의 실수로 문제가 발생 => 문자열을 넣는다든지 등 이러면 예외가 발생합니다
		try {//예외처리 오류가나면 어떻게 처리하십쇼 하고 알려주는 문법
			//사용법 트라이 블록에 문제가 발생할수있는 구간을 넣어주세요
			c = scanner.nextInt();
			System.out.println(c+"가능해?");//이러면 문자열임
		} catch (Exception e) { //그다음 catch()이 괄호안에 예외가 넣으면 catch의 블록대로 실행하세요
			
			System.out.println("숫자만 입력하라고");
		}
		
		scanner.close();
		/*
		 * 숫자만 입력해주세요실행후
		 * 스캐너 스캐너를 통해 스캐너를 사용할 변수선언
		 * 트라이 안에있는 c를 통해 스캐너의 인트값받기 실행후
		 * 가능해출력
		 * 만약 아니라면 숫자만 입력실행 후 클로즈로 탈출
		 * 
		 */
	}

}