package model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue
    @Column(name="id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private EshopItem item;

    @Min(1)
    private Integer quantity;

    private Date orderDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EshopItem getItem() {
        return item;
    }

    public void setItem(EshopItem item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", item=" + item +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                '}';
    }
}
