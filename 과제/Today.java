package test;

import java.util.*;

public class Today {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int year=0;
		int month=0;
		int days=0;
		int total_days=0;
		String week[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.print("연도를 입력하시오 :");
		year=input.nextInt();
		System.out.print("월을 입력하시오 :");
		month=input.nextInt();
		System.out.print("일을 입력하시오 :");
		days=input.nextInt();
		
		
		total_days+=(year-1)*365;
		total_days+=(year-1)/4;
		total_days-=(year-1)/100;
		total_days+=(year-1)/400;
		
		for(int i=1 ; i<month ; i++)
		{
			switch(i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				total_days+=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				total_days+=30;
				break;
			case 2:
				if(((year%4==0)&&(year%100!=0)) || (year%400==0))
				{
					total_days+=29;
				}
				else
				{
					total_days+=28;
				}
				break;
			}
		}
		total_days+=days;
		total_days%=7;
		
		System.out.println(year+"년 "+month+"월 "+days+"일은 "+week[total_days]+"입니다.");

		input.close();
	}
}


