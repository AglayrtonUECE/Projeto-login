package enumeracao;

import entities.Pedido;
import entities.StatusDoPedido;
import java.util.Date;

public class Enumeracao {

   
    public static void main(String[] args) {
       Pedido pedido = new Pedido(108, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);
        
        StatusDoPedido st1 = StatusDoPedido.ENTREGUE;
        
        //CONVERTE STRIN PARA TIPO ENUM
        StatusDoPedido st2 = StatusDoPedido.valueOf("ENTREGUE");
    }
    
}
