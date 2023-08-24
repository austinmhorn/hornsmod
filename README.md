# Horn's Mod 

Austin Horn's Minecraft 1.19.2 Forge Mod

## What is Horn's Mod?

Horn's Mod is a mod written for the hit game [Minecraft](https://minecraft.net/). It is built on top of the [Minecraft Forge](https://github.com/MinecraftForge) API.

It greatly expands and improves the Minecraft experience, adding many new blocks, entities, and features. Development started in August 2023, and is currently still an unreleased alpha with the first release estimated to be in late September.

The mod was created and is still currently maintained by the user going by the name **austinmhorn**.

#### New Ores:
- Ruby Ore
- Deepslate Ruby Ore
- Pink Sapphire Ore
- Deepslate Pink Sapphire Ore
- Platinum Ore
- Deepslate Platinum Ore

#### New Blocks:
- Ruby Block
- Pink Sapphire Block
- Platinum Block

#### New Items:
- Ruby
- Pink Sapphire Ingot
- Platinum Ingot
- Ruby Pickaxe
- Ruby Shovel
- Ruby Axe
- Ruby Sword
- Pink Sapphire Pickaxe
- Pink Sapphire Shovel
- Pink Sapphire Axe
- Pink Sapphire Sword
- Platinum Pickaxe
- Platinum Shovel
- Platinum Axe
- Platinum Sword

#### New Armor:
- Ruby Helmet
- Ruby Chestplate
- Ruby Leggings
- Ruby Boots
- Pink Sapphire Helmet
- Pink Sapphire Chestplate
- Pink Sapphire Leggings
- Pink Sapphire Boots
- Platinum Helmet
- Platinum Chestplate
- Platinum Leggings
- Platinum Boots

## Issues

Post only confirmed bugs [here](https://github.com/austinmhorn/hornsmod/issues). Do not post crash logs, you can post pastebin links to FML logs, but no crash logs.

## Installing

The easy way:

[Download](https://legacy.curseforge.com/minecraft/mc-mods/horns-mod) from CurseForge

Or you can manually build the source code:

Install both [Gradle](https://gradle.org/install/) and [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)

    git clone --branch main --single-branch https://github.com/austinmhorn/hornsmod
    (cd hornsmod; gradle build)

## How To Use

For sample testing, you can run the following command in the project root directory:

    gradle runClient

For actual game use:

If you know how to mod minecraft, you can find the .jar file(s) in the folder:

- *hornsmod/build/libs/*

Otherwise, here is how to mod Minecraft:

- [Download] Minecraft Forge 1.19.2(https://files.minecraftforge.net/net/minecraftforge/forge/index_1.19.2.html)
- Open the .jar file that was downloaded
  - Keep “Install client” selected and click install
- For macOS, open Finder and go to */Users/replace_with_your_username/Library/Application Support/minecraft*
- On Windows, search %appdata% in File Explorer and select .minecraft folder
- If there isn’t a folder named “mods”, create one
- Copy all mod .jar file(s) into mods folder

## Debug Commands

Teleport to moon dimension:

    /execute in hornsmod:moon run tp Dev ~ ~ ~
