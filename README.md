# Analysis of N-grams (simple text analysis) - vzporedna izvedba

## <ins>Kaj dela</ins>:
### Kaj program dela si lahko prebereš na naslednji povezavi:
### https://github.com/Zankooo/N-Grams-Sequential

## <ins> Testiranje </ins>
### Za testiranje sem uporabil svoj lasten laptop: <ins>Apple MacBook Pro, M1 Max, 64GB/2TB</ins>. 
#### (Komp sem kupil za 1600eur :) )
### Javi virtual machine sem dal na voljo cca 16GB max heap size (rama) za izvajanje programa. Na trajanje programa je zelo pomembno koliko ga imamo na voljo, saj uporabljamo v programu podatkovno strukturo HashMap in kot input dajemo podatke ki so precej veliki. (HashMap in veliki podatki --> hitrost izvajanja programa odvisna od velikosti rama)</ins>
### Testiranje je bilo opravljenju na petih različno velikih .txt file-ih. Dolzina n-gramov pa je od 2 do 5. Tesitranje je bilo opravljeno brez printanja n-gramov z pojavitvami in relativnimi frekvencami. Če bi jih printali bi program trajal občutno dlje.  

| Tabela    | n = 2    | n = 3    | n = 4    | n = 5    |
|-----------|----------|----------|----------|----------|
| **123MB** | 6.174ms  | 7.333ms  | 9.442ms  | 10.720ms |
| **234MB** | 13.529ms | 22.771ms | 27.805ms | 32.627ms |
| **350MB** | 19.535ms | 32.419ms | 40.578ms | 41.631ms |
| **490MB** | 14.793ms | 20.828ms | 28.628ms | 36.848ms |
| **613MB** | 16.711ms | 24.694ms | 35.710ms | 42.679ms |

## <ins>Pomembne opombe za uspešno delovanje programa</ins>
### Program te na začetku vpraša; ali želiš vpisati besedilo kot input ali pa boš bral besede iz external file-a (kot input sem dal možnost samo za to, da sem lahko testiral na zelo kratkem besedilu.)
### Ko pa izbereš "naravno pot" oziroma daš 2 (da boš bral iz external file-a), pa je pomembno, da pred tem ustvariš direktorij z imenom *resources* (ustvari ga v mapi projekta, ne v src) in v njega daš datoteke z besedili. Datoteke z besedili so na voljo na tej povezavi:
### https://drive.google.com/drive/folders/1GnL52MgBBja04Hhqun_TRghp_sVrtZ2F?usp=share_link

<hr>


## <ins>Druge informacije</ins>
### - uporabljal sem trenutno najnovejšo verzijo Jave; JDK 24
### - pri izdelovanju programa sem se posluževal umetne inteligence - predvsem ChatGPT-4o, Gemini 2.5 pro in DeepSeek

