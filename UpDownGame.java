package donghyeon.midterm.exam;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UpDownGame
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int low, high; // ������ �� ����
			int card; // ������ �� ��
			Random r = new Random(); // ������ �� �߻�;
			Scanner scanner = new Scanner(System.in); // Ű���� �Է� ����
			
		System.out.println("�й� : 21530011 �̸� : �ŵ���");
			
		while(true)
		{
			int i = 0; // ����Ƚ��
			low = 0; //�ּ� ����
			high = 99; // �ִ����
			card = r.nextInt(100); // �����ǰ� ����
			System.out.println("������ �� ����! ���ڸ� ���纸����.");
			
			while(true)
			{
				System.out.println(low + " - " + high); // ������ �� ���� �����
				System.out.print(i + 1 + " >> "); // ����Ƚ�� ���
				int n = 0;
				
				try
				{
					n = scanner.nextInt();
				}
				
				catch(InputMismatchException e)
				{
					System.out.println("������ �Է����ּ���.");
					scanner.nextLine(); //������ �Է� �б�
					continue; //�ٽýõ�
				}
				if(n > high || n < low) // �ִ� �ּ��� ���ڸ� ��� ��� 
					System.out.println("������ ������ϴ�.");
			
				else // ���� ������ ���� �Էµ� ����
				{
					if(n == card) // �Է¹��� ���� ������ ���
					{
						System.out.println("�¾ҽ��ϴ�.");
						break; // �ݺ��� ����
					}
				
					else if(n > card) // �Է¹��� ���� ���亸�� ���� ���
					{
						System.out.println("�� ����");
						high = n;
					}
				
					else // �Է¹��� ���� ���亸�� ���� ���
					{
						System.out.println("�� ����");
						low = n;
					}
				}
				i++; // ���� Ƚ�� ����
			}
			
			System.out.print("�ٽ��Ͻðڽ��ϱ�? (Y/N) >>");
			if(scanner.next().equals("n"))
				break;
		}
	}

}