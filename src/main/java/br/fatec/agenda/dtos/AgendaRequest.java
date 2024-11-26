package br.fatec.agenda.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AgendaRequest(

    @NotBlank(message = "A descrição não pode ser vazia ou apenas espaços em branco.")
    @Size(min = 5, max = 255, message = "A descrição deve ter entre 5 e 255 caracteres.")
    String description,

    @NotBlank(message = "A descrição não pode ser vazia ou apenas espaços em branco.")
    String duration,

    @NotBlank(message = "O local não pode ser vazio ou apenas espaços em branco.")
    @Size(min = 3, max = 100, message = "O local deve ter entre 3 e 100 caracteres.")
    String local

) {
    
}
