package com.ms.email.Services;

import com.ms.email.DTO.EmailDTO;
import com.ms.email.Entitys.Email;
import com.ms.email.Repositorys.EmailRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class EmailService {

    private final EmailRepository emailRepository;
    private static final String mail = "pedrosolucas1745@gmail.com";
    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public Email create(EmailDTO dto){
        LocalDateTime now = LocalDateTime.now();
        Email email = new Email(
                dto.userId(),
                dto.subject(),
                dto.text(),
                dto.mailTo(),
                mail,
                now
        );
        return emailRepository.save(email);
    }
}
