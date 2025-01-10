package scannner;

public class Board {
	 private long no;
	 private String title;
	 private String content;
	 
	 void setNo(long no) {
		 this.no = no;
	 }
	 void setTitle(String title) {
		 this.title = title;
	 }
	 void setContent(String content) {
		 this.content = content;
	 }
	 String getTitle() {
		 return title;
	 }
	 String getContent() {
		 return content;
	 }
	 long getNo() {
		 return no;
	 }
}
