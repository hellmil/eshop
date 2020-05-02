package du1_eshop.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue
    @Column(name="id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Product item;

    @Min(1)
    private Integer quantity;

    @Column
    private Date orderDate;

    @Column(length = 50)
    @Size(min = 1, max = 50)
    private String uoid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
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

    public String getUoid() {
        return uoid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", item=" + item +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                ", uoid='" + uoid + '\'' +
                '}';
    }

    public void setUoid(String uoid) {
        this.uoid = uoid;
    }

}
