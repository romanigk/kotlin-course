---
title: Dezentrale Kotlin Course
separator: <!--next_chapter-->
verticalSeparator: <!--next_slide-->
theme: night
revealOptions:
transition: 'fade'
---

# Kotlinkurs

<!--next_chapter-->

## Kotlin die Multiplattform-Sprache

- **JVM**: Java-Code kann in Kotlin eingebunden werden und umgekehrt
- **Android**: Ausführung auf verschiedenen Geräten
- **JS**: Client-Anwendungen lauffähig im Browser
- **Native**: Kompilieren für jedes Betriebssystem (bspw. Windows, Linux, iOS und macOS)

<!--next_slide-->

## Mehrere Programmierparadigmen möglich

- _imperative_ Programmierung,
- _objektorientierte_ Programmierung, 
- _generische_ Programmierung, 
- _funktionale_ Programmierung und mehr.

<!--next_slide-->

## Etwas Geschichte

- Kotlin wurde **2011** erstmals vorgestellt und 
- seit **2010** entwickelt
- **2016** wurde Version 1.0 veröffentlicht
- **2017** auf Google I/O erstklassiger Support angekündigt

<!--next_chapter-->

## Ein Beispielprogramm

Hello-World, wie üblich (siehe [Main.kt](../src/nativeMain/kotlin/Main.kt)):

```kotlin
fun main() {
    println("Hello, Kotlin/Native!")
}
```

<!--next_slide-->

## Grundlegende Begriffe (1/2)

- Ein **Programm** ist eine Folge von Anweisungen, die nacheinander ausgeführt werden.
- Eine **Anweisung** ist ein einzelner auszuführender Befehl (drucke den Text),
- Ein **Ausdruck** ist ein Codestück, das einen einzigen Wert ergibt (z. B. ist 2*2 ein Ausdruck)

<!--next_slide-->

## Grundlegende Begriffe (2/2)

- Ein **Block** ist eine Gruppe von Anweisungen, in einem Paar geschweifter Klammern `{...}`
- Des Weiteren gibt es noch:
  - **Schlüsselwörter** - Wort mit besonderer Bedeutung in der Programmiersprache
  - **Bezeichner** - Wort um etwas zu identifizieren
  - **Kommentare** - Text der beim Ausführen des Programms identifiziert wird

<!--next_slide-->

## Variablen deklarieren

- **val** (für value) deklariert unveränderliche Variable
- **var** (für Variable) deklariert eine veränderbare Variable

Der anschließende, zwingend erforderliche Name darf nicht mit einer Zahl beginnen!

<!--next_slide-->

### Beispiel unveränderliche Variable:

```kotlin
val language = "Kotlin"
```

<div style="background-color: dimgray; border-radius: 18px; margin: 50px; padding: 5px;">
&#9888; Achtung: Variablennamen sind case-sensitiv: 

language != Language
</div>
<!--next_slide-->

### Beispiel veränderliche Variable:

```kotlin
var dayOfWeek = "Monday"
println(dayOfWeek) // prints Monday

dayOfWeek = "Tuesday"
println(dayOfWeek) // prints Tuesday
```

<!--next_slide-->

### Variablen und Datentypen (1/2)

Variablen in Kotlin wird durch Wertzuweisung ein Typ (Zahl oder Zeichenkette) zugewiesen.

D. h. folgender Code ist nicht möglich:

```kotlin
var aString = "lorem ipsum"
aString = 0.815
```
<!--next_slide-->

### Variablen und Datentypen (2/2)

Variablen kann ein Typ zugewiesen werden:

```kotlin
val aString : String
print(aString) // Fehler, Variable nicht initialisiert!
```

<!--next_slide-->

### Unveränderbarkeit von **`val`**

Unveränderbare Werte, innerer Status:

```kotlin
val anagram = "Anagram".toCharArray()
println(anagram.joinToString()) // -> "A, n, a, g, r, a, m"
anagram.sort()
println(anagram.joinToString()) // -> "A, a, a, g, m, n, r"
```

<!--next_chapter-->

## Ein neues Projekt beginnen

Installieren von [SdkMan](https://sdkman.io/install "Link zur Installationsseite von SdkMan")

Kontrollieren, ob SdkMan installiert ist:

```shell
sdk version
```