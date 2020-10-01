[code]Features:
+ Config
+ Welcome Message
+ ChatClear
+ SetSpawn/Spawn/Respawn
+ DoubleJump
+ ChatFormat
+ TeamChat
+ Plugin reload command
+ Command Protection
+ No Damage (Water or Fall)
+ No drop Item and No pickup Item

Permissions:
LobbySystem.Spawn
LobbySystem.SetSpawn
LobbySystem.ChatClear
LobbySystem.DoubleJump
LobbySystem.TeamChat
LobbySystem.Help
LobbySystem.Reload
LobbySystem.NoDamage
LobbySystem.dropItem
LobbySystem.pickupItem
LobbySystem.CommandProtection

[/code]

[code=YAML]
# Config by IzanamiNeko (Markus5K)
Config:
  Custom-Message:
    Join: '&8[&3System&8] &c%player% &7has joined the Server!'
    Quit: '&8[&3System&8] &c%player% &7has left the Server!'
    ShowMsg: 'true'
  Spawnpoint:
    Spawn: '&8[&3System&8] &7You have been teleported to the Spawn!'
    SetSpawn: '&8[&3System&8] &7You have set the Spawnpoint!'
    Respawn: '&8[&3System&8] &7After you died you will spawn at the Mainpoint or your
      own Spawnpoint!'
    NoPerm: '&8[&3System&8] &7You dont have Permissions to set the main Spawnpoint!'
    NoSpawnPerm: '&8[&3System&8] &7You dont have Permissions to teleport to the Spawn!'
    ShowMsg: 'true'
  ChatClear:
    NoPerm: '&8[&3System&8] &7You dont have Permissions to clear the Chat!'
    ChatClear: '&8[&3System&8] &7The Chat has been cleared by &c%player%!'
    ShowMsg: 'true'
  TeamChat:
    Enabled: 'true'
    Prefix: '&8[&2Team&8] &7'
  DoubleJump:
    Enabled: 'true'
  ChatFormat:
    Enabled: 'true'
    Format: '%pex% %player% &4>>&r'
  AntiPlugin:
    Enabled: 'true'
    Message: '&8[&3System&8] &7You dont have permissions... &4[ &c%player% &4]'
  Reload:
    Success: '&8[&3System&8] &aLobbySystem has been reloaded!'
    Fail: '&8[&3System&8] &cLobbySystem failed to reload the Config!'
  GeneralEvents:
    DropItem: 'false'
    pickupItem: 'false'

[/code]

[code]License:
Don't distribute the plugin.
Don't edit the code.
Don't leave bad reviews without sending me a PM about the problem!
Don't decompile the plugin.[/code]
