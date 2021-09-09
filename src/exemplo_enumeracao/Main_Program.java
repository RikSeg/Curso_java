package exemplo_enumeracao;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class Main_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(),OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;// instanciado normalmente
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //instanciado como string convertida para Enum
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
