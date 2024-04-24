package com.cotterrell.quickfixiris;

import quickfix.*;
import java.io.FileInputStream;

public class AcceptorApp {
    
    public static void main(String[] args) {
        SocketAcceptor socketAcceptor = null;
        try {
            SessionSettings executorSettings = new SessionSettings(args[0]);
            Application application = new Acceptor();
            FileStoreFactory fileStoreFactory = new FileStoreFactory(executorSettings);
            MessageFactory messageFactory = new DefaultMessageFactory();
            FileLogFactory fileLogFactory = new FileLogFactory(executorSettings);
            socketAcceptor = new SocketAcceptor(application, fileStoreFactory, executorSettings, fileLogFactory, messageFactory);
            socketAcceptor.start();
        } catch (ConfigError e) {
            e.printStackTrace();
        }
    }

}
