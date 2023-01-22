# Dezentrale Kotlin Course

## Build The Documentation

This repository contains some examples and slides built
with [reveal-md.js](https://github.com/webpro/reveal-md "link to the git repository of the reveal md project").
To view the slides, the following command must be executed with
the [node package manager (npm)](https://nodejs.org/en/download/package-manager/) [^1]:

```shell
npm install -g reveal-md
```

To be able to execute the command afterwards, we have to make the path known. This can be done
either once with an

```shell
export PATH=<path_to_reval_md_bin_path>:$PATH
```

or by adding this path to `~/.profile`. When this is done, you can execute the command:

```shell
reveal-md docs/slides.md -w
```

## Kotlin Native Build

To compile this project natively, you have to go to
the [current Kotlin release page](https://github.com/JetBrains/kotlin/releases) (currently
version 1.8.0) and download the distribution that fits your operating system (you have to scroll
down a bit).

```shell
kotlinc-native src/nativeMain/kotlin/Main.kt -o build/Main
```



[^1]: A tutorial for the installation can be found at
the [link](https://nodejs.org/en/download/package-manager/) above.