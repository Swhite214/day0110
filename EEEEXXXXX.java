package scannner;

import java.util.Scanner;

public class EEEEXXXXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Board board = new Board();
		Board boards [] = new Board [5];
		//boards[0] = null;
		//boards[1] = null;
		//boards[2] = null; .....
		Scanner in = new Scanner(System.in);
		String strs [] = new String [3];
		
		
		for(int i=0; i<=4; i++) {
			boards[i] = new Board();
			boards[i].setNo(i);
		}
		
			
			
		for(Board b: boards) {
			System.out.println("번호: " +b.getNo()); //실행하면 nullpointerexception에러가뜹니다
			System.out.println("제목: " +b.getTitle());
			System.out.println("내용: " +b.getContent());
			
		}
		
		/*for(int i=0; i<=strs.length-1; i++) {
			strs[i] = in.nextLine();
		}//1부터시작하면 AraayIndexOutOfBoundsException 예외발생(인덱스 범위탈출)
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.print(strs[2]);
	*/
	}
		
}
