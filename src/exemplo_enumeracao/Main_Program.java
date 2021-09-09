package exemplo_enumeracao;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class Main_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(),OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
