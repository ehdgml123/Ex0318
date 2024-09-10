package ex07;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam01 {

	public static void main(String[] args) {
		
		//1 - 10000 총합 소요시간 구하기 
		long sum =0;
		
         // 출력 소요시간		
		Instant start = Instant.now();

		for(long i=1; i<=100000L; i++)
			sum += i;
		
		Instant end = Instant.now();
		
		Duration between = Duration.between(start, end);
		
		System.out.println("소요시간 :" + (between.toMillis()/1000.0));
		
		// 오늘 날짜 
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 위치
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("Local Zone ID: "+ zoneId);
		
		// 현재시간
		LocalDateTime current = LocalDateTime.now();   // 현재 시스템 날짜/시간 
		System.out.println("현재 시스템 날짜/시간 : "+current);
		
		// 날짜시간을 내 포맷 맞추기
		DateTimeFormatter forrmatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
		
		// 출력
		System.out.println("현재 날짜와 시간 : "+ forrmatter.format(current));
		
	}

}
