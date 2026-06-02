package org.uteq.practica_evaluacion.model;

public class message {
    public enum tipo {
        OPERATION,
        REPLICATE,
        HEARTBEAT,
        HEARTBEAT_ACK,
        ELECTION,
        OK,
        COORDINATOR,
        REJECT
    }


}
