package com.example.apisecurity.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refreshToken;
    private LocalDateTime issuedAt;
    private LocalDateTime expiredAt;
    @ManyToOne
    private User user;

    public Token(String refreshToken, LocalDateTime issuedAt, LocalDateTime expiredAt) {
        this.refreshToken = refreshToken;
        this.issuedAt = issuedAt;
        this.expiredAt = expiredAt;
    }

    public Token() {

    }
}
