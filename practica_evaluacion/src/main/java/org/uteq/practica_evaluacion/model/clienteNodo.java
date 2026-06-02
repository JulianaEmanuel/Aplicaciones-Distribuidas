package org.uteq.practica_evaluacion.model;

import org.uteq.practica_evaluacion.NodeConfig;

public class clienteNodo {
    private final NodeConfig config;

    public clienteNodo(NodeConfig config) {
        this.config = config;
    }

    public void message(message.tipo tipo) {
        System.out.println("Mensaje recibido: " + tipo);
    }
}