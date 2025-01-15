package com.ms.email.Entitys;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID userId;
    private String subject;
    private String text;
    private String mailTo;
    private String mailFrom;
    private LocalDateTime send;

    public UUID getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Email(UUID userId, String subject, String text, String mailTo, String mailFrom, LocalDateTime send) {
        this.userId = userId;
        this.subject = subject;
        this.text = text;
        this.mailTo = mailTo;
        this.mailFrom = mailFrom;
        this.send = send;
    }
}
