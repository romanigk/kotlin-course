# Kotlin Course

This repository contains some examples and slides built
with [reveal-md.js](https://github.com/webpro/reveal-md "link to the git repository of the reveal md project").
To view the slides, the following command must be executed with
the [node package manager (npm)](https://nodejs.org/en/download/package-manager/) [^1]:

```bash
npm install -g reveal-md
```
Um anschlie
execute the following command:

```bash
reveal-md docs/index.md
```

To be able to execute the command afterwards, we have to make the path known. This can be done either once with an 

```bash
export PATH=<path_to_reval_md_bin_path>:$PATH
```

or by adding this path to `~/.profile`

[^1]: A tutorial for the installation can be found at
the [link](https://nodejs.org/en/download/package-manager/) above.