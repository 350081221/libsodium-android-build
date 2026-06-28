.class public Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/media/IAudioService$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "audio"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 5
    .line 6
    const-string v1, "adjustVolume"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 15
    .line 16
    const-string v1, "adjustStreamVolume"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 25
    .line 26
    const-string v1, "adjustStreamVolumeWithAttributio"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 35
    .line 36
    const-string v1, "setStreamVolume"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 45
    .line 46
    const-string v1, "setStreamVolumeWithAttribution"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 55
    .line 56
    const-string v1, "setDeviceVolume"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 65
    .line 66
    const-string v1, "getDeviceVolume"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 75
    .line 76
    const-string v1, "handleVolumeKey"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 85
    .line 86
    const-string v1, "setMasterMute"

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 95
    .line 96
    const-string v1, "setVolumeGroupVolumeIndex"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 102
    .line 103
    .line 104
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 105
    .line 106
    const-string v1, "adjustVolumeGroupVolume"

    .line 107
    .line 108
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 112
    .line 113
    .line 114
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 115
    .line 116
    const-string v1, "setMicrophoneMute"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 122
    .line 123
    .line 124
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 125
    .line 126
    const-string v1, "setRingerModeExternal"

    .line 127
    .line 128
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 132
    .line 133
    .line 134
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 135
    .line 136
    const-string v1, "setRingerModeInternal"

    .line 137
    .line 138
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 142
    .line 143
    .line 144
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 145
    .line 146
    const-string v1, "setMode"

    .line 147
    .line 148
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 152
    .line 153
    .line 154
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 155
    .line 156
    const-string v1, "playSoundEffect"

    .line 157
    .line 158
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 162
    .line 163
    .line 164
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSequencePkgMethodProxy;

    .line 165
    .line 166
    const-string v1, "requestAudioFocus"

    .line 167
    .line 168
    const/4 v2, 0x2

    .line 169
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSequencePkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 173
    .line 174
    .line 175
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 176
    .line 177
    const-string v1, "abandonAudioFocus"

    .line 178
    .line 179
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 183
    .line 184
    .line 185
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 186
    .line 187
    const-string v1, "setWiredDeviceConnectionState"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 193
    .line 194
    .line 195
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 196
    .line 197
    const-string v1, "disableSafeMediaVolume"

    .line 198
    .line 199
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 203
    .line 204
    .line 205
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 206
    .line 207
    const-string v1, "lowerVolumeToRs1"

    .line 208
    .line 209
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 213
    .line 214
    .line 215
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 216
    .line 217
    const-string v1, "setUidDeviceAffinity"

    .line 218
    .line 219
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 223
    .line 224
    .line 225
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 226
    .line 227
    const-string v1, "removeUidDeviceAffinity"

    .line 228
    .line 229
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 233
    .line 234
    .line 235
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 236
    .line 237
    const-string v1, "setUserIdDeviceAffinity"

    .line 238
    .line 239
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 243
    .line 244
    .line 245
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 246
    .line 247
    const-string v1, "removeUserIdDeviceAffinity"

    .line 248
    .line 249
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 253
    .line 254
    .line 255
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 256
    .line 257
    const-string v1, "setDeviceVolumeBehavior"

    .line 258
    .line 259
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 263
    .line 264
    .line 265
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;

    .line 266
    .line 267
    const-string v1, "adjustStreamVolumeForUid"

    .line 268
    .line 269
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 273
    .line 274
    .line 275
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;

    .line 276
    .line 277
    const-string v1, "adjustSuggestedStreamVolumeForUid"

    .line 278
    .line 279
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 283
    .line 284
    .line 285
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;

    .line 286
    .line 287
    const-string v1, "setStreamVolumeForUid"

    .line 288
    .line 289
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/audio/AudioManagerStub$ReplacePkgAndUid;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 293
    .line 294
    .line 295
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 296
    .line 297
    const-string v1, "registerDeviceVolumeDispatcherForAbsoluteVolume"

    .line 298
    .line 299
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 303
    .line 304
    .line 305
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 306
    .line 307
    const-string v1, "adjustLocalOrRemoteStreamVolume"

    .line 308
    .line 309
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 313
    .line 314
    .line 315
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 316
    .line 317
    const-string v1, "adjustSuggestedStreamVolume"

    .line 318
    .line 319
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 323
    .line 324
    .line 325
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 326
    .line 327
    const-string v1, "adjustMasterVolume"

    .line 328
    .line 329
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 333
    .line 334
    .line 335
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 336
    .line 337
    const-string v1, "setMasterVolume"

    .line 338
    .line 339
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 343
    .line 344
    .line 345
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 346
    .line 347
    const-string v1, "avrcpSupportsAbsoluteVolume"

    .line 348
    .line 349
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 353
    .line 354
    .line 355
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 356
    .line 357
    const-string v1, "setSpeakerphoneOn"

    .line 358
    .line 359
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 363
    .line 364
    .line 365
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 366
    .line 367
    const-string v1, "setBluetoothScoOn"

    .line 368
    .line 369
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 373
    .line 374
    .line 375
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 376
    .line 377
    const-string v1, "stopBluetoothSco"

    .line 378
    .line 379
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 383
    .line 384
    .line 385
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 386
    .line 387
    const-string v1, "startBluetoothSco"

    .line 388
    .line 389
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 393
    .line 394
    .line 395
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 396
    .line 397
    const-string v1, "registerRemoteControlClient"

    .line 398
    .line 399
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 403
    .line 404
    .line 405
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 406
    .line 407
    const-string v1, "unregisterAudioFocusClient"

    .line 408
    .line 409
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 413
    .line 414
    .line 415
    return-void
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
