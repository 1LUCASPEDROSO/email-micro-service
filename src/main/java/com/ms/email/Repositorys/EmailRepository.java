package com.ms.email.Repositorys;

import com.ms.email.Entitys.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}
