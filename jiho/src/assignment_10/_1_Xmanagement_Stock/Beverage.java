package assignment_10._1_Xmanagement_Stock;

import java.util.Scanner;

public class Beverage extends Stock{
	
	// Beverage ������ - �Ű�����: StockKind Ŭ���� Ÿ���� kind ���� 
	public Beverage(StockKind kind) {
		super(kind);						// kind�� ��� ����
	}

	public void getUserInput(Scanner input){
		
		setStockId(input);
		
		setStockName(input);
		
		setStockDate(input);
		
		setStockSaleYN(input);
		
	}
	
	
	public void PrintInfo() {
		
		String stockKind = getStockKind();
		System.out.println("kind: " + kind + " name: " + name + " id: " + id + " date: " + date + " sale: " + sale + " order: "+ order);
	}

	public int getId() {
		return id;
	}


}