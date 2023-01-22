---
title: Dezentrale Kotlin Course
separator: <!--s-->
verticalSeparator: <!--v-->
theme: night
revealOptions:
transition: 'fade'
---

# Kotlinkurs

<!--s-->

## Kotlin die Multiplattform-Sprache

- JVM: Java-Code kann in Kotlin eingebunden werden und umgekehrt
- Android: Ausführung auf verschiedenen Geräten
- JS: Client-Anwendungen lauffähig im Browser
- Native: Kompilieren für jedes Betriebssystem (bspw. Windows, Linux, iOS und macOS)

<!--v-->

## Mehrere Programmierparadigmen möglich

- _imperative_ Programmierung,
- _objektorientierte_ Programmierung, 
- _generische_ Programmierung, 
- _funktionale_ Programmierung und mehr.

<!--v-->

## Etwas Geschichte

- Kotlin wurde **2011** erstmals vorgestellt und 
- seit **2010** entwickelt
- **2016** wurde Version 1.0 veröffentlicht
- **2017** auf Google I/O erstklassiger Support angekündigt

<!--s-->

## Ein Beispielprogramm

Hello-World, wie üblich (siehe [Main.kt](../src/nativeMain/kotlin/Main.kt)):

```kotlin
fun main() {
    println("Hello, Kotlin/Native!")
}
```

<!--v-->

## Grundlegende Begriffe (1/2)

- Ein **Programm** ist eine Folge von Anweisungen, die nacheinander ausgeführt werden.
- Eine **Anweisung** ist ein einzelner auszuführender Befehl (drucke den Text),
- Ein **Ausdruck** ist ein Codestück, das einen einzigen Wert ergibt (z. B. ist 2*2 ein Ausdruck)

<!--v-->

## Grundlegende Begriffe (2/2)

- Ein **Block** ist eine Gruppe von Anweisungen, in einem Paar geschweifter Klammern `{...}`
- Des Weiteren gibt es noch:
  - **Schlüsselwörter** - Wort mit besonderer Bedeutung in der Programmiersprache
  - **Bezeichner** - Wort um etwas zu identifizieren
  - **Kommentare** - Text der beim Ausführen des Programms identifiziert wird

## Analyse Hello-World-Programm
