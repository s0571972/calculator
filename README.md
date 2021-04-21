# Hausaufgabe 1

Deadline für Abgabe per Pull Request: 25.4.2021 23:59 Uhr.

## Aufgabenstellung

- Forken Sie dieses Repository (github.com/ProfWider/prog2-ha1-testing) in Ihren eigenen Github Account.
- Analysieren Sie das Verhalten der Klasse Calculator und finden Sie ein paar Abweichungen im Vergleich zu www.online-calculator.com
- Teilaufgabe 1: Schreiben Sie einen neuen zusätzlichen Test, der eine bisher nicht getestete Funktionalität abdeckt, die bereits funktioniert und der daher direkt grün wird.  
- Teilaufgabe 2: Schreiben Sie zwei weitere zusätzliche Tests, die zwei unterschiedliche Implementierungslücken bzw. Fehler aufdecken (und in jedem Fall zwei unterschiedliche Methoden-Aufruf-Kombinationen testen) und somit fehlschlagen.
- Teilaufgabe 3: Schreiben Sie zwei Bugfixes (also Änderungen der Implementierung), so dass die zwei zuvor hinzugefügten Tests erfolgreich durchlaufen.
- Pushen Sie Ihre Tests & Änderungen auf Ihr eigenes, geforktes Repository, und zwar strukturiert in mindestens drei Commits: z.B. 1. Commit für neuer grüner Test, 2. Commit für neuer roter Test, 3. Commit für den Fix zu diesem Test, 4. Commit für weiteren neuen roter Test, 5. Commit für Fix zu diesem Test. 
- Stellen Sie zum Abschluss einen Pull Request auf das obere Repository, und zwar vor der Deadline am 25.4.2021 um 23:59 Uhr.

## Hinweise

Sie dürfen mit Ihren Bugfixes die bestehende Implementierung deutlich verändern (z.B. die Verwendung der privaten Variablen), solange Sie dabei nicht die Signaturen (Name, Typ, Parameter) der öffentlichen Methoden ändern.
Sie dürfen auch gerne Hilfsmethoden hinzufügen, die intern von den öffentlichen Methoden aufgerufen werden, und diese internen Hilfsmethoden zum Zwecke der besseren Testbarkeit auch öffentlich (public) machen, um entsprechende Unit-Tests für diese Hilfsmethoden hinzufügen zu können.
