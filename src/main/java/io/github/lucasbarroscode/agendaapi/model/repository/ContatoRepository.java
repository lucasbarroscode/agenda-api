package io.github.lucasbarroscode.agendaapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.lucasbarroscode.agendaapi.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
