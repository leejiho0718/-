package assignment_2;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ���: ");
		
		int sec = input.nextInt();  // 100000�� 
        int min = sec / 60;		    // �� 		 =  ��	 X 	60	->	��	= 	��	/  60
        int hour = min / 60;	    // ��		 =  �ð� 	 X 	60	->	�ð� 	= 	��	/  60 
        int day = hour / 24;	    // �ð�		 =  ��	 X  24	->	��	=	�ð�	/  24	
        int year = day / 365;	    // ��		 =  ��	 X  365	->  ��	=	��	/  365
        int reSec = sec % 60;		// ���� �� 	 =  ��	 / 	60��  ������
        int reMin = min % 60;		// ���� �� 	 =  �� 	 / 	60��  ������
        int reHour = hour % 24;		// ���� �ð�	 =  �ð� 	 / 	24��  ������
        
        System.out.printf("%d�ʴ� %d�� %d�ð� %d�� %d���Դϴ�.\n", sec, day, reHour, reMin, reSec);
        // %d - ���������ڸ� �̿��ϸ� ��¹� printf ���
        // ���������ڸ� ����� ���� ��, �ð�, ��, �ʸ� ���ʴ�� ����Ѵ�.
        
        if (year > 1) 											// ���� year�� 1�� ������ ��, 1���� ������ 
        {
            System.out.printf("%d�ʴ� 1���� �Ѿ����ϴ�.\n", sec);		// 100000�ʴ� 1���� �Ѿ����ϴ�. ���
        } 
        
        else if(year == 1)										// ���� year�� 1�̸� �� 1,���̸�
        {
        	System.out.printf("%d�ʴ� ��Ȯ�� 1���Դϴ�.\n", sec);		// 100000�ʴ� ��ȭ�� 1���Դϴ�. ���
        }
        else 													// ���� �Ѵ� �ƴϸ� -> year�� 1�� ������ ��, 1�� �̸��̸�
        {
            System.out.printf("%d�ʴ� 1�� �̸��Դϴ�.\n", sec);		// 100000�ʴ� 1�� �̸��Դϴ�. ���
        }
        
        input.close();

	}

}