### 2.0.3, Minecraft 1.17.1, 21w37a+

1) Fix problem with registration ([#14](https://github.com/NikitaCartes/EasyAuth/issues/14))
    - argon2 library split to two libs, and I didn't include one of it
    - Update libraries
2) Improve hiding in TabList
    - Now premium players shown in it
    - as well as carpet's fake-player

### 2.0.2, Minecraft 1.17.1

1) Add setting which hide unauthenticated players from tab list
    - `hideUnauthenticatedPLayersFromPlayerList` in `config.json`
    - `True` by default

### 2.0.1, Minecraft 1.17.1

1) Fix problem with MongoDB ([#15](https://github.com/NikitaCartes/EasyAuth/issues/15))
2) Change `config.json`:
    - Delete `mongoDBCredentials` section
    - Add `MongoDBConnectionString` and `MongoDBDatabase` in main section

### 1.9.7, Minecraft 1.17.1, 1.17.0

1) Fix crash on account unregistering
2) Add alias `\l` for `\login` and setting for disabling it
3) Allow special characters like `@,#!` in password (you will need to enclose password in quotes if you use them)

### 1.9.6, Minecraft 1.17.1, 1.17.0

1) Fix [#11](https://github.com/NikitaCartes/EasyAuth/issues/11)
    - Fix `account unregister <password>` not unregistering account
    - Fix `auth remove <uuid>` crashing server on it's stopping

### 1.9.5, Minecraft 1.17.1

1) Fix [#8](https://github.com/NikitaCartes/EasyAuth/issues/8)
    - Add [`teleportationTimeoutInMs`](https://github.com/NikitaCartes/EasyAuth/wiki/Config#experimental-part) setting
    - Limit number of packets server will send to unauthorized players
    - Note: this setting is server-wide so maximum rate would be `(1000/teleportationTimeoutInMs)` per seconds for all
      unauthorised players
    - Value 0 would effectively disable this setting so players will be teleported after each packet, but you can expect
      a lot of incoming and outgoing packets (up to 3000 and more).

### 1.9.3, Minecraft 1.17.1, 1.17.0

1) Server-side translation
2) Changed implementation of supporting SimpleAuth database
    - Now there is a [`useSimpleAuthDatabase`](https://github.com/NikitaCartes/EasyAuth/wiki/Config#experimental-part)
      setting in config

### 1.9.1, Minecraft 1.17.1

1) Rename mod to EasyAuth
2) Add support fot SimpleAuth database

### 1.9.0, Minecraft 1.17.1

1) Update to Minecraft 1.17.1
2) Migrate from Architectury
3) Fix GitHub actions

### 1.8.2, Minecraft 1.17.0

Fix forceOfflineUuid

### 1.8.1, Minecraft 1.17.0

Fix some bugs

### 1.8.0, Minecraft 1.17.0

First 1.17.0 update