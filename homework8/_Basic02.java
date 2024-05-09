package homework8;

import java.util.Calendar;

public class _Basic02 {

	public static void main(String[] args) {
		// 2. Calendar 객체를 오늘날짜로 생성하세요.
		//    오늘날짜를 2023-03-24 형식으로 출력하세요.
		//    오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		
		// 오늘 날짜로 생성
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("오늘 날짜는 " + calendar.get(Calendar.YEAR) + "-" + 
				((calendar.get(Calendar.MONTH) + 1) < 10 ? 
						"0" + (calendar.get(Calendar.MONTH)+1)
						:
						(calendar.get(Calendar.MONTH) + 1)) + "-" +
				(calendar.get(Calendar.DATE) < 10 ? 
						"0" + calendar.get(Calendar.DATE)
						:
						calendar.get(Calendar.DATE))
		);
		
		System.out.println("오늘 날짜는 " + calendar.get(Calendar.YEAR) + "년 " +
				(calendar.get(Calendar.MONTH)+1) + "월 " + 
				calendar.get(Calendar.DATE) + "일 " + 
				calendar.get(Calendar.HOUR_OF_DAY) + "시 " +
				calendar.get(Calendar.MINUTE) + "분 " + 
				calendar.get(Calendar.SECOND) + "초"
		);
		
		
	}

}
