package scannner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderWriterTest02 {

	public static void main(String[] args) {//트라이캐치는 나중에 만들게요 라고 선언한건임
		// 알고리즘 관련 처리 -성능 고려시
		// Scanner 대신 BufferedReader
		// 문자단위 스트림
		//InputStreamReader isr; buffer가 없기에 성능이 좋지않아요 바이트 단위로 하나씩 읽어오기때문에요
		//리더는 추상클래스입니다.(바디가없기에 생성자가 없어요~)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //괄호안에 버퍼 사이즈도,쓰고 넣을수있어요
		//버퍼가 적용된 성능좋은 리더입니다.
		Member member = new Member();
		System.out.println("제목을 입력해주세요");
		try {
			member.title = br.readLine();;//받는과정 nextInt라 생각하셈
			System.out.println("내용을 입력해주세요");
			member.content = br.readLine();;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("에러");
		} //scanner는 읽어서 쇼츠인지 롱인지 문자열인지 인트인지 분석해줌
		 //물론그냥 데이터를 br.readLine()으로 바로도 가능 메모리낭비가 줄음
		
	 //스캐너에 비해 처리속도는 향상되었습니다.
		
		System.out.println("제목을 입력해주세요: " + member.title);
		System.out.println("내용을 입력해주세요: " + member.content);
		
		
		String str = "문자열";
		Object obj = str; //Object는 String클래스의 부모 클래스이기에 들어갈수있어요
		
	}
}

		
	

		// TODO Auto-generated method stub


