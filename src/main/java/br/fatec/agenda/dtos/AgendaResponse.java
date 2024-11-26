package br.fatec.agenda.dtos;

public record AgendaResponse(
    long id,
    String description,
    String duration,
    String local

) {
    
}
