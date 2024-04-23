package com.cotterrell;

import quickfix.*;

public class FixApp extends quickfix.MessageCracker implements quickfix.Application {
    
    public void fromApp(Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        crack(message, sessionID);
    }
}
