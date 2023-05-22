package assignment_7._1_Xmanagement_Manager;

import java.util.ArrayList;

import java.util.Scanner;

import assignment_7._1_Xmanagement_Stock.Alcohol;
import assignment_7._1_Xmanagement_Stock.Beverage;
import assignment_7._1_Xmanagement_Stock.Cigarette;
import assignment_7._1_Xmanagement_Stock.FrozenFood;
import assignment_7._1_Xmanagement_Stock.RefrigerationFood;
import assignment_7._1_Xmanagement_Stock.RoomTemperatureFood;
import assignment_7._1_Xmanagement_Stock.StockInput;
import assignment_7._1_Xmanagement_Stock.StockKind;
import assignment_7._1_Xmanagement_Stock.Sundries;

public class StockManager {
	
	ArrayList<StockInput> stocks = new ArrayList<StockInput>();
	Scanner input;
	
	// Manager(Scanner input) - Scanner ��ü�� �޾� �Է� ������ �ʱ�ȭ�ϴ� ������
	StockManager(Scanner input){
		this.input = input;
	}
		
	// addStock() - Stock ��ü�� �����Ͽ� stocks ArrayList�� �߰��ϴ� �޼ҵ�
	public void addStock() {
		
		int kind = 0;			// ��� ���� ����
		StockInput stockInput;			
		while (kind != 8) {		// ����� 1~7���� ������ 8�̸� �ݺ��� ���� 
			
			System.out.println("1. Frozen Food");							// 1. �õ� ��ǰ
			System.out.println("2. Refrigeration Food");					// 2. ���� ��ǰ
			System.out.println("3. RoomTemperature Food");					// 3. ��� ��ǰ
			System.out.println("4. Alcohol");								// 4. �ַ�
			System.out.println("5. Beverage");								// 5. ����
			System.out.println("6. Cigarette");								// 6. ���
			System.out.println("7. Sundries");								// 7. ��ȭ
			System.out.print("Select num for Stock Kind from 1 to 7: ");
			
			kind = input.nextInt();						// ���� ���� �Է¹ޱ�	
					
			if (kind == 1) {							// 1: �õ� ��ǰ�� ���
				
				// Stockind�� �ʱⰪ�� FrozenFood�̹Ƿ� Stock(StockKind kind) ������ ȣ��
				stockInput = new FrozenFood(StockKind.FrozenFood);
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;									// break - �ݺ��� ����
			}
			
			else if (kind == 2) {						// 2: ���� ��ǰ�� ���
				
				// Stock Ŭ������ stock ���� = new RefrigerationFood(StockKind kind) ������ ȣ��
				stockInput = new RefrigerationFood(StockKind.RefrigerationFood);	
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;									// break - �ݺ��� ����
			}
			
			else if (kind == 3) {						// 3: ��� ��ǰ�� ���
				
				// Stock Ŭ������ stock ���� = new RoomTemperatureFood(StockKind kind) ������ ȣ��
				stockInput = new RoomTemperatureFood(StockKind.RoomTemperatureFood);	
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;									// break - �ݺ��� ����
			}
				
			else if (kind == 4) {						// 4: �ַ��� ���
				
				// Stock Ŭ������ stock ���� = new Alcohol(StockKind kind) ������ ȣ��
				stockInput = new Alcohol(StockKind.Alcohol);			
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;									// break - �ݺ��� ����
			}
			
			else if (kind == 5) {					// 5: ������ ���
				
				// Stock Ŭ������ stock ���� = new Beverage(StockKind kind) ������ ȣ�� 
				stockInput = new Beverage(StockKind.Beverage);		
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 6) {					// 6: ����� ���
				
				// Stock Ŭ������ stock ���� = new Cigarette(StockKind kind) ������ ȣ��
				stockInput = new Cigarette(StockKind.Cigarette);		
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 7) {					// 7: ��ȭ�� ���
				
				// Stock Ŭ������ stock ���� = new Sundries(StockKind kind) ������ ȣ��
				stockInput = new Sundries(StockKind.Sundries);				
				
				stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else {									// 1~7�� �ƴ� ��� �ٽ� ����
				System.out.println("Select num for Stock Kind from 1 to 7");
			}
				
		}
			
	}
	
	// deleteStock() - ����ڿ��� Stock ID�� �Է¹޾� 
	//                 ArrayList���� ��ġ�ϴ� Stock ID�� �߰� �� �����ϴ� �޼���
	public void deleteStock() {
		
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId�� �Է� ����
		int index = -1;									// index ������ -1�� �ʱ�ȭ
		
		for(int i = 0; i<stocks.size(); i++)			// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ�  
		{
			if(stocks.get(i).getId() == stockId) {		// �Է¹��� stockId�� stocks �迭�� i��° �ε����� Id�� ���� ���
														// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
				index = i;								// index = i
				break;									// break - �ݺ��� ����
			}
		}
		if(index >=0){									// index�� 0���� Ŭ ���
			stocks.remove(index);						// stocks �迭�� index ���� ����
														// ��> ArrayList.get(int index)
														//    : ���ڷ� ���޵� �ε��� ��ġ�� �������� ����Ʈ���� ����, ��ü�� ����
			System.out.println("the stock " + stockId + "is deleted");
		}

		else{											// ���� ������ �������� ���� ��� -> return
			System.out.println("the stock has been resistered");
			return;
		}
	}
	
	// editStock() - Stock ID �Է��ϰ� ��ġ�ϴ� Stock ID�� ���� stocks ArrayList �˻�
	//               -> ������ �ʵ�(ID, �̸�, �Ǹ� �Ǵ� �ֽ� �Է�)�� ����ڿ��� ���� �޼����Դϴ�.
	public void editStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId �Է� ����
		
		for(int i = 0; i<stocks.size(); i++)			// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ� 
		{
			
			StockInput stockInput = stocks.get(i);				// Stock Ŭ������ stock ���� = stocks �迭�� i��° �ε����� �ִ� ��ü 
														// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
			
			if(stockInput.getId() == stockId) 				// getId �޼��� ȣ�� -> stock ������ ���� stockId�� ���� ���� ���
			{				
				int num = -1;							// num�� -1�� �ʱ�ȭ
				
				while (num != 6) {							// num�� 6�� �ƴ� ������ �ݺ�
					System.out.println("1. Edit Id");		// 1. ��� ���� ��ȣ ����
					System.out.println("2. Edit Name");		// 2. ��� �̸� ����
					System.out.println("3. Edit Date");		// 3. ��� ������� ����
					System.out.println("4. Edit Sale");		// 4. ��� �Ǹ� ���� ����
					System.out.println("5. Edit Order");	// 5. ��� �ֹ�(����) ���� ����
					System.out.println("6. Exit");			// 6. ����
					System.out.println("Select one number between 1-5");
					
					num = input.nextInt();					// num �� �Է�
					
					if (num==1) {							// num�� 1�� ���
						System.out.println("Stock Id");		
						int id = input.nextInt();			// ��� ���� ��ȣ �Է�
						stockInput.setId(id);					// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==2) {
						System.out.println("Stock Name");
						String name = input.nextLine();		// ��� �̸� �Է�
						stockInput.setName(name);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==3) {
						System.out.println("Expiration Date");
						int date = input.nextInt();			// ��� ������� �Է�
						stockInput.setDate(date);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==4) {
						System.out.println("Today Sale");
						int sale = input.nextInt();			// ��� ���� ���� �Է�
						stockInput.setSale(sale);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==5) {
						System.out.println("Today Order");
						int order = input.nextInt();		// ��� �ֹ�(����) ���� �Է�
						stockInput.setOrder(order);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else {									// ���� ������ �� ���� ���� ���
						continue;							// ���
					}
					
				}		
				
			}
			
			
	
		}

		
	}
	
	// viewStocks() - stocks ArrayList�� �ִ� ��� �ֽ��� ������ ����ϴ� �޼ҵ�
	public void viewStocks() {
	//  System.out.print("Stock ID: ");
	//  int stockId = input.nextInt();	
		
		for(int i = 0; i<stocks.size(); i++)		// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ� 
		{
			stocks.get(i).PrintInfo();				// PrintInfo �޼��� ȣ�� -> stocks �迭�� i��° �ε���
													// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
	
		}

	}
}