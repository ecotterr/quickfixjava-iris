# QuickFix/J with InterSystems IRIS

1. Compile the quickfixiris Java project to QuickFIX.jar.

2. Start the acceptor:
```
java -cp .\QuickFIXJ.jar com.cotterrell.quickfixiris.AcceptorApp ".\quickfixiris\src\main\resources\acceptorSettings.cfg"
```

3. Start the initiator:
```
java -cp .\QuickFIXJ.jar com.cotterrell.quickfixiris.InitiatorApp ".\quickfixiris\src\main\resources\initiatorSettings.cfg"
```