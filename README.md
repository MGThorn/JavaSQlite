# JavaSQlite
implement of SQlite in java

TODO general
  - Fehlende TextFelder für jeweilige fremdschlüssel in der GUI (siehe Tier, button_tiere_aendern, temp6 und temp 7)
  - komplette tabllen für pflegt und wird_gefüttert_mit ( siehe SQL.java createDAtabases)
  - implementierung von TabellenVerbindungen
  - //optionale Veränderung von select Ausgaben

TODO GUI.java
  - ALle text Felder textField_???_listenausgabe in textPanes ändern siehe beispiel Tier
  - actionPerformed methoden in alle Buttens hinzufügen siehe Tier
    -  actionPerformed button auslesen kopieren aus Tierr
        -  s.insertTier zu s.insert??? ändern  
        -  variblen ggf hinzufügen
        -  variblen der MEthode s.insert??? übergeben
        -  textFelder anpasen 
    -  actionPerformed button löschen kopieren aus Tier
        - textFelder anpasen
        - in if anweisung s.deletTier zu s.delet??? ändern
    -  actionPerformed button clear kopieren aus Tier
        - textFelder anpasen  
    -  actionPerformed button listenausgabe kopieren aus Tier
        - textFeld anpasen 

TODO SQL.java
  - die einzigen vollständigen implimentierungen von insert() und select() liegen bei Tier vor
      - die anderen insert???() sowie select???() müssen jweiliger in variblenZahl angepasst werden und der sql befhel abgeändert
  - delet???() und change???() sind noch mit jeweils correcten sql befehlen zu füllen und die variblen müssen angepasst werden

