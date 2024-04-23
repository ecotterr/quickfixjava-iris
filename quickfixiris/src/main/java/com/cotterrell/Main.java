package com.cotterrell;

import quickfix.*;
import java.io.FileInputStream;

public class Main {
    
    public static void main(String[] args) throws Exception {
        if (args.length != 1) return;
        
        String configFileName = args[0];

        Application application = new FixApp();

        SessionSettings settings = new SessionSettings(new FileInputStream(configFileName));

        MessageStoreFactory storeFactory = new FileStoreFactory(settings);

        LogFactory logFactory = new FileLogFactory(settings);

        MessageFactory messageFactory = new DefaultMessageFactory();

        Acceptor acceptor = new SocketAcceptor(application, storeFactory, settings, logFactory, messageFactory);

        acceptor.start();
        acceptor.stop();
      
    }

}
