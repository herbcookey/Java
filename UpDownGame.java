package donghyeon.midterm.exam;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UpDownGame
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int low, high; // 임의의 수 범위
			int card; // 임의의 수 값
			Random r = new Random(); // 임의의 수 발생;
			Scanner scanner = new Scanner(System.in); // 키보드 입력 생성
			
		System.out.println("학번 : 21530011 이름 : 신동현");
			
		while(true)
		{
			int i = 0; // 시행횟수
			low = 0; //최소 범위
			high = 99; // 최대범위
			card = r.nextInt(100); // 임의의값 생성
			System.out.println("임의의 수 생성! 숫자를 맞춰보세요.");
			
			while(true)
			{
				System.out.println(low + " - " + high); // 임의의 수 범우 ㅣ출력
				System.out.print(i + 1 + " >> "); // 시행횟수 출력
				int n = 0;
				
				try
				{
					n = scanner.nextInt();
				}
				
				catch(InputMismatchException e)
				{
					System.out.println("정수만 입력해주세요.");
					scanner.nextLine(); //나머지 입력 읽기
					continue; //다시시도
				}
				if(n > high || n < low) // 최대 최소의 숫자를 벗어난 경우 
					System.out.println("범위를 벗어났습니다.");
			
				else // 정상 범위의 수가 입력된 경유
				{
					if(n == card) // 입력받은 수가 정답인 경우
					{
						System.out.println("맞았습니다.");
						break; // 반복문 종료
					}
				
					else if(n > card) // 입력받은 수가 정답보다 높은 경우
					{
						System.out.println("더 낮게");
						high = n;
					}
				
					else // 입력받은 수가 정답보다 낮은 경우
					{
						System.out.println("더 높게");
						low = n;
					}
				}
				i++; // 시행 횟수 증가
			}
			
			System.out.print("다시하시겠습니까? (Y/N) >>");
			if(scanner.next().equals("n"))
				break;
		}
	}

}