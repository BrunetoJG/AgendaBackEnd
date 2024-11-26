package br.fatec.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.agenda.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda,Long>{
    
}
