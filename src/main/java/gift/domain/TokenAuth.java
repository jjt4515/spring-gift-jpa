package gift.domain;

import jakarta.persistence.*;
@Entity
@Table(name = "token_auth")
public class TokenAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String token;

    @Column(nullable = false)
    private Long memberId;

    public TokenAuth(String token, Long memberId){
        this.token = token;
        this.memberId = memberId;
    }

    public TokenAuth() {

    }

    public String getToken(){
        return token;
    }

    public Long getMemberId(){
        return memberId;
    }

}
