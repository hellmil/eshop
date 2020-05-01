package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EshopItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(name="unit_cost")
    private Float unitCost;

    @Column(name ="number_of_pages")
    private Integer nbOfItems;

    @Column(name="image_url")
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public Integer getNbOfItems() {
        return nbOfItems;
    }

    public void setNbOfItems(Integer nbOfItems) {
        this.nbOfItems = nbOfItems;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "model.EshopItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", unitCost=" + unitCost +
                ", nbOfItems=" + nbOfItems +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
