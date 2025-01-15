package com.ms.email.Services;

import com.ms.email.DTO.EmailDTO;
import com.ms.email.Entitys.Email;
import com.ms.email.Repositorys.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public Email create(EmailDTO dto){
        Email email = new Email(
                dto.userId(),
                dto.subject(),
                dto.text(),
                dto.mailTo()
        );
        return emailRepository.save(email);
    }
}
