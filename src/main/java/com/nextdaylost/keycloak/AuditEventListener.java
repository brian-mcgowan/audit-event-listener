package com.nextdaylost.keycloak;

import org.jboss.logging.Logger;
import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;
import org.keycloak.models.KeycloakSession;

public class AuditEventListener implements EventListenerProvider {

    private static final Logger log = Logger.getLogger(AuditEventListener.class);

    private final KeycloakSession session;

    public AuditEventListener(KeycloakSession session) {
        this.session = session;
    }
    @Override
    public void onEvent(Event event) {
        log.debugf("New %s Event", event.getType());
        log.debugf("onEvent -> %s", event.toString());
    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean b) {
        log.debugf("New %s Event", adminEvent.getOperationType());
        log.debugf("AdminEvent -> %s", adminEvent.toString());
    }

    @Override
    public void close() {

    }
}
