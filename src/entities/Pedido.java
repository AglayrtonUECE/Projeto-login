
package entities;

import java.util.Date;


public class Pedido {
   private Integer id;
   private Date registro;
   private StatusDoPedido status;

    public Pedido() {
    }

    public Pedido(Integer id, Date registro, StatusDoPedido status) {
        this.id = id;
        this.registro = registro;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", registro=" + registro + ", status=" + status + '}';
    }
   
   
}
