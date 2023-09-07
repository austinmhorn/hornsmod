# Horn's Mod 

Austin Horn's Minecraft 1.19.2 Forge Mod

## What is Horn's Mod?

Horn's Mod is a mod written for the hit game [Minecraft](https://minecraft.net/). It is built on top of the [Minecraft Forge](https://github.com/MinecraftForge) API.

It greatly expands and improves the Minecraft experience, adding many new blocks, entities, and features. Development started in August 2023, and is currently still an unreleased alpha with the first release estimated to be in late September.

The mod was created and is still currently maintained by the user going by the name **austinmhorn**.

- 3 New Ores
- 20+ New Blocks
- 50+ New Items
- New Armor Sets
- New Tools
- New Benches & Tables
- Travel To New Dimensions & Planets
- Custom Machinery & Technology 

## Installing

This project uses the build automation tool [Gradle](https://gradle.org/install/), which requires a Java JDK or JRE to be installed, version 6 or higher (to check, use java -version).

#### MacOS, Linux

Use The Missing Package Manager for macOS (or Linux), [Homebrew](https://brew.sh)

    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
    brew install gradle@7.6.2

#### Windows

Use the Windows command line installer [Scoop](https://scoop.sh)
    
    iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
    scoop install gradle

Note: if you get an error you might need to change the execution policy (i.e. enable Powershell) with the following command

    Set-ExecutionPolicy RemoteSigned -scope CurrentUser

#### Most Unix-based systems

    sdk install gradle 7.6.2

## Building

    git clone --branch main --single-branch https://github.com/austinmhorn/hornsmod
    (cd hornsmod; ./gradlew wrapper --gradle-version 7.6.2)

- **You can find the .jar file(s) located in the *libs* directory**

    *hornsmod/build/libs/*

## How To Use

For sample testing, just run this command in the project root directory:

    ./gradlew runClient

### Use in Solo Worlds

#### Add mods to client side

- [Download] Minecraft Forge 1.19.2(https://files.minecraftforge.net/net/minecraftforge/forge/index_1.19.2.html)
- Open the .jar file that was downloaded
  - Keep “Install client” selected and click install
- For MacOS, open Finder and go to */Users/replace_with_your_username/Library/Application Support/minecraft*
- On Windows, search %appdata% in File Explorer and select .minecraft folder
- If there isn’t a folder named “mods”, create one
- Copy all mod .jar file(s) into mods folder

### Use in Multiplayer Worlds

- First, follow the "Add mods to client side" instructions above.

#### Add mods to server side

- Open server FTP File Access
- If there isn’t a folder named “mods”, create one
- Copy all mod .jar file(s) into mods folder
- Safely restart server

## Troubleshooting

- Minecraft isn't loading any mods?
  - Make sure you have the forge installation selected in the Minecraft Launcher when you boot the game.
- brew install gradle@7.6.2 failed?
  - This happens on ARM arch for some reason. If you follow the manual Gradle installation instructions on their website that resolves the issue.
- permission denied: ./gradlew?
  - Give the gradlew exectuable permissions by running:
    - *chmod +x ./gradlew*

## Issues

Post only confirmed bugs [here](https://github.com/austinmhorn/hornsmod/issues). Do not post crash logs, you can post pastebin links to FML logs, but no crash logs.
