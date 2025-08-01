# Analysis of N-grams (simple text analysis) - vzporedna (paralelna) izvedba 

## <ins>Kaj dela</ins>:
### Več o tem;
### - Kaj program dela,
### - Uporaba in
### - Primer uporabe
### si lahko prebereš na naslednji povezavi:
### https://github.com/Zankooo/N-Grams-Sequential

## <ins> Testiranje </ins>
### Za testiranje (in tudi za implementacijo) sem uporabil svoj lasten laptop: <ins>Apple MacBook Pro, M1 Max, 64GB/2TB</ins>.
#### (Komp sem kupil za 1600eur in še 16 inch je :) )
### Javi virtual machine sem dal na voljo cca 16GB max heap size (rama) za izvajanje programa. Na trajanje programa je zelo pomembno koliko ga imamo na voljo, saj uporabljamo v programu podatkovno strukturo HashMap in kot input dajemo podatke ki so precej veliki. (HashMap in veliki podatki --> hitrost izvajanja programa odvisna od velikosti rama)</ins>
### Testiranje je bilo opravljenju na petih različno velikih .txt datotekah. Dolžina n-gramov pa je od 2 do 5. Opravljeno je bilo brez printanja n-gramov z pojavitvami in relativnimi frekvencami. Če bi jih printali bi program trajal občutno dlje. Če želimo printati n-grame samo odkomentiramo vrstico v funkciji 'narediVseTxt'
### Tabela rezultatov testiranja:

| Tabela    | n = 2     | n = 3     | n = 4     | n = 5     |
|-----------|-----------|-----------|-----------|-----------|
| **123MB** | 6,17 sec  | 7,33 sec  | 9,44 sec  | 10,72 sec |
| **234MB** | 13,53 sec | 22,77 sec | 27,81 sec | 32,63 sec |
| **350MB** | 19,54 sec | 32,42 sec | 40,58 sec | 41,63 sec |
| **490MB** | 14,80 sec | 20,83 sec | 28,63 sec | 36,85 sec |
| **613MB** | 16,71 sec | 24,69 sec | 35,71 sec | 42,68 sec |

#### Opomba: številke so zapisane v evropskem formatu, kjer vejica pomeni decimalko

<hr>

## <ins>Pomembna navodila za uspešen zagon programa (step by step)</ins>
### 1. Če programa še nimaš lokalno, ga pridobiš z komando v terminal:
#### ` git clone https://github.com/Zankooo/N-Grams-Paralell.git`
### 2. V root direktoriju ustvariš direktorij 'resources' in vanj daš datoteke iz tega linka:
### https://drive.google.com/drive/folders/1GnL52MgBBja04Hhqun_TRghp_sVrtZ2F?usp=share_link
### 3. Program nato lahko poženeš preko po želji izbranega IDE (Visual Studio, Intellij) in mora delovati!
### 4. Če pa poganjaš program preko Terminala iz src direktorija z komandama:
#### ` javac Main.java && java Main `
### pa zelo verjetno nastane težava zaradi 'Working direktorija'. To rešiš tako da v kodi manualno spremeniš path v funkciji 'izbiraTeksta'. Pred resources moraš dodati dve piki in slash. Dejansko:
#### to vrstico ` return "resources/" + datoteke[izbira-1]; ` zamenjaš z:
#### `  return "../resources/" + datoteke[izbira-1]; `

## <ins>Dodatne informacije o delovanju programa </ins>
### Program te na začetku vpraša; ali želiš vpisati besedilo kot input ali pa boš bral besede iz external file-a (kot input sem dal možnost samo za to, da sem lahko testiral na zelo kratkem besedilu.). Za delovanje po programa po navodilih pa izbereš drugo možnost s pritiskom na '2'.

<hr>

## <ins>Viri in literatura</ins>
### Primarno sem si pri izdelovanju projekta pomagal z znanjem pridobljenim na predavanjih in vajah:
### https://e.famnit.upr.si/course/view.php?id=6182 - letošnja eučilnica
### https://e.famnit.upr.si/course/view.php?id=4943 - eučilnica preteklih let
### Pomagal sem si tudi z video posnetki iz youtube:
### - https://www.youtube.com/watch?v=gvQGKRlgop4&t=12692s
### - https://www.youtube.com/watch?v=WldMTtUWqTg

### Pomagala pa mi je tudi umetna inteligenca; ChatGPT-4o. 

