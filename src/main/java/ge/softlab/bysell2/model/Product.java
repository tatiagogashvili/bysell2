package ge.softlab.bysell2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table (name = "products")
public class Product {
    @Id
    String ean_code;
    String product_name;
    String description;
    Integer maker_id;
    Integer category_id;
    Double sell_price;
    Integer remaining;
}
