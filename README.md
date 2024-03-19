# Svátky

Implementujte kód, který načte seznam svátků z JSON souboru a následně vyhledá seznam svátků pro daný den.

1. Třída `HlavniProgram` už je implementovaná. Po správné implementaci ostatních tříd program po spuštění vypíše, kdo má dnes svátek.
1. V souboru `svatky.json` už jsou připravená data ve vhodném formátu.
1. Upravovat budete třídu `SvatkySluzba`. Třídy `Svatek` a `SeznamSvatku` už jsou implementované.
1. Ve třídě `SvatkySluzba` už je připravený `ObjectMapper` a cesta k JSON souboru s daty ve fieldu `cestaKDatum`.
1. V konstruktoru `SvatkySluzba` implementujte načtení pomocí `objectMapper`u do fieldu `seznamSvatku`.
1. V metodě `vyhledatSvatkyKeDni()` implementujte vyhledání svátků k zadanému dni a vrácení seznamu jmen.
1. V testu `SvatkySluzbaTest` implementujte vhodné testy metody `vyhledatSvatkyKeDni()`. Nezapomeňte na různé případy – dny, kdy má svátek jedno jména, více jmen nebo nikdo. Pokud vám to bude lépe vyhovovat, rozdělte testy do více samostatných metod. 
