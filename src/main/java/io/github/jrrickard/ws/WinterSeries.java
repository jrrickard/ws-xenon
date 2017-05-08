package io.github.jrrickard.ws;

import com.vmware.xenon.common.ServiceHost;
import com.vmware.xenon.services.common.RootNamespaceService;
import io.github.jrrickard.ws.service.ParticipantService;

public class WinterSeries extends ServiceHost {

    @Override
    public ServiceHost start() throws Throwable {
        super.start();
        startDefaultCoreServicesSynchronously();
        super.startService(new RootNamespaceService());
        super.startFactory(new ParticipantService());
        return this;
    }

    public static void main(final String[] args) throws Throwable {
        final WinterSeries ws = new WinterSeries();
        ws.initialize(args);
        ws.start();
    }
}
