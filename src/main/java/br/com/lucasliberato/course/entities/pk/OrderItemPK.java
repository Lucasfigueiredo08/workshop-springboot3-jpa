package br.com.lucasliberato.course.entities.pk;

import br.com.lucasliberato.course.entities.Order;
import br.com.lucasliberato.course.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product procuct;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProcuct() {
        return procuct;
    }

    public void setProcuct(Product procuct) {
        this.procuct = procuct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(procuct, that.procuct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, procuct);
    }
}
