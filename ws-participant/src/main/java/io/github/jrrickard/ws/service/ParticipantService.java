package io.github.jrrickard.ws.service;

import com.vmware.xenon.common.StatefulService;
import io.github.jrrickard.ws.state.Participant;

public class ParticipantService extends StatefulService {

    public static final String FACTORY_LINK = "/ws/participants";

    public ParticipantService() {
        super(Participant.class);
        super.toggleOption(ServiceOption.PERSISTENCE, true);
        super.toggleOption(ServiceOption.REPLICATION, true);
        super.toggleOption(ServiceOption.OWNER_SELECTION, true);
    }
   
}
