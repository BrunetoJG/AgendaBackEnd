package br.fatec.agenda.mappers;

import br.fatec.agenda.dtos.AgendaRequest;
import br.fatec.agenda.dtos.AgendaResponse;
import br.fatec.agenda.entities.Agenda;

public class AgendaMapper {

    public static Agenda toEntity(AgendaRequest agendaRequest){
        Agenda agenda = new Agenda();
        agenda.setDescription(agendaRequest.description());
        agenda.setDuration(agendaRequest.duration());
        agenda.setLocal(agendaRequest.local());

        return agenda;
    }

    public static AgendaResponse toDTO(Agenda agenda){
        return new AgendaResponse(agenda.getId(),
                                    agenda.getDescription(),
                                    agenda.getDuration(),
                                    agenda.getLocal() );
    }
}
