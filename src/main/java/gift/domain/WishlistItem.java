package gift.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "wishlist")
public class WishlistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "product_id", nullable = false)
    private Long productId;


    public WishlistItem(Long memberId, Long productId) {
        this.memberId = memberId;
        this.productId = productId;
    }

    public WishlistItem() {

    }

    public Long getProductId() {
        return productId;
    }


}
