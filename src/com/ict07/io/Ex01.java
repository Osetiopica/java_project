package com.ict07.io;

public class Ex01 {

	public static void main(String[] args) {
//		File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리를 처리하는 클래스
//		File(File parent, String child), File(String pathname), 
//		File(String parent, String child), File(URI uri)
//		parent : 상위 경로, child : 하위 경로
//		parent + child = 전체 경로
//		pathname : 전체 경로
//		uri : 나중에 네트워크에서 필요
		
//		주요 메소드
//		createNewFile() : boolean -> 파일을 생성되면 true, 동일한 이름의 파일은 생성 못 함 false
//		mkdir(), mkdirs() : boolean -> 디렉토리 생성되면 true, 동일한 이름의 디렉토리는 생성 못 함 false
//		mkdir(), mkdirs() 차이 : 만들고자 하는 디렉토리의 상위 디렉토리가 없으면 생성 불가 -> mkdir()
//		c:\aaa\bbb -> bbb 디렉토리를 만드려는데 aaa 디렉토리가 없으면 생성 실패
//		상위 디렉도리인 aaa까지 만들어 주는 -> mkdirs()
		
//		delete() : 파일, 디렉토리 삭제
//		isDirectory() : 디렉토리면 true
//		isFile() : 파일이면 true
//		컴퓨터에 저장 측면에서 파일와 디렉토리만 존재한다. 파일이 아니면 디렉토리, 디렉토리가 아니면 파일
//		list() : 지정 위치의 파일 및 디렉토리를 String[]에 넣음
//		lenght() : 배열이나 String에서는 길이를 뜻하지만 File 클래스에서는 파일의 크기를 byte로 표현
		
//		getAbsolutePath() : 절대 경로 표시
//		getPath() : 상대 경로 표시
//		getCanonicalPath() : 정규화 경로
		
//		lastModified() : 마지막 수정 날짜
		
				
		
	}

}