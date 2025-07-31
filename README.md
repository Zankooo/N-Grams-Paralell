# Analysis of N-grams (simple text analysis) - vzporedna (paralelna) izvedba 

## <ins>Kaj dela</ins>:
### Kaj program dela si lahko prebereš na naslednji povezavi:
### https://github.com/Zankooo/N-Grams-Sequential

## <ins> Testiranje </ins>
### Za testiranje sem uporabil svoj lasten laptop: <ins>Apple MacBook Pro, M1 Max, 64GB/2TB</ins>. 
#### (Komp sem kupil za 1600eur in še 16 inch je :) )
### Javi virtual machine sem dal na voljo cca 16GB max heap size (rama) za izvajanje programa. Na trajanje programa je zelo pomembno koliko ga imamo na voljo, saj uporabljamo v programu podatkovno strukturo HashMap in kot input dajemo podatke ki so precej veliki. (HashMap in veliki podatki --> hitrost izvajanja programa odvisna od velikosti rama)</ins>
### Testiranje je bilo opravljenju na petih različno velikih .txt file-ih. Dolzina n-gramov pa je od 2 do 5. Tesitranje je bilo opravljeno brez printanja n-gramov z pojavitvami in relativnimi frekvencami. Če bi jih printali bi program trajal občutno dlje.  


| Tabela    | n = 2     | n = 3     | n = 4     | n = 5     |
|-----------|-----------|-----------|-----------|-----------|
| **123MB** | 6,17 sec  | 7,33 sec  | 9,44 sec  | 10,72 sec |
| **234MB** | 13,53 sec | 22,77 sec | 27,81 sec | 32,63 sec |
| **350MB** | 19,54 sec | 32,42 sec | 40,58 sec | 41,63 sec |
| **490MB** | 14,80 sec | 20,83 sec | 28,63 sec | 36,85 sec |
| **613MB** | 16,71 sec | 24,69 sec | 35,71 sec | 42,68 sec |

#### Opomba: številke so zapisane v evropskem formatu, kjer vejica pomeni decimalko

<hr>

## <ins>Pomembne opombe za uspešno delovanje programa</ins>
### Program te na začetku vpraša; ali želiš vpisati besedilo kot input ali pa boš bral besede iz external file-a (kot input sem dal možnost samo za to, da sem lahko testiral na zelo kratkem besedilu.)
### Ko pa izbereš "naravno pot" oziroma daš 2 (da boš bral iz external file-a), pa je pomembno, da pred tem ustvariš direktorij z imenom *resources* (ustvari ga v mapi projekta, ne v src) in v njega daš datoteke z besedili. Datoteke z besedili so na voljo na tej povezavi:
### https://drive.google.com/drive/folders/1GnL52MgBBja04Hhqun_TRghp_sVrtZ2F?usp=share_link

<hr>


## <ins>Druge informacije</ins>
### - uporabljal sem trenutno najnovejšo verzijo Jave; JDK 24
### - pri izdelovanju programa sem si pomagal z umetno inteligenco - ChatGPT-4o in pa tudi Gemini 2.5 pro in DeepSeek

