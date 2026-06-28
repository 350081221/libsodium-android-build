.class public Lcom/lody/virtual/client/hook/proxies/user/UserManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/os/IUserManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "user"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 11

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 5
    .line 6
    const-string v1, "setApplicationRestrictions"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 15
    .line 16
    const-string v1, "getApplicationRestrictions"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 25
    .line 26
    const-string v1, "getApplicationRestrictionsForUser"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 35
    .line 36
    const-string v1, "isUserUnlocked"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 45
    .line 46
    const-string v1, "isUserUnlockingOrUnlocked"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 55
    .line 56
    const-string v1, "isProfile"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 65
    .line 66
    const-string v1, "isManagedProfile"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 75
    .line 76
    const-string v1, "getProfileParent"

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 86
    .line 87
    const-string v1, "getUserIcon"

    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 93
    .line 94
    .line 95
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 96
    .line 97
    sget-object v1, Lmirror/android/content/pm/UserInfo;->ctor:Lmirror/RefConstructor;

    .line 98
    .line 99
    const/4 v3, 0x3

    .line 100
    new-array v4, v3, [Ljava/lang/Object;

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    aput-object v6, v4, v5

    .line 108
    .line 109
    const/4 v7, 0x1

    .line 110
    const-string v8, "Admin"

    .line 111
    .line 112
    aput-object v8, v4, v7

    .line 113
    .line 114
    sget-object v9, Lmirror/android/content/pm/UserInfo;->FLAG_PRIMARY:Lmirror/RefStaticInt;

    .line 115
    .line 116
    invoke-virtual {v9}, Lmirror/RefStaticInt;->get()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    const/4 v10, 0x2

    .line 125
    aput-object v9, v4, v10

    .line 126
    .line 127
    invoke-virtual {v1, v4}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const-string v4, "getUserInfo"

    .line 132
    .line 133
    invoke-direct {v0, v4, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 137
    .line 138
    .line 139
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 140
    .line 141
    const-string v1, "getDefaultGuestRestrictions"

    .line 142
    .line 143
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 147
    .line 148
    .line 149
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 150
    .line 151
    const-string v1, "setDefaultGuestRestrictions"

    .line 152
    .line 153
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 157
    .line 158
    .line 159
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 160
    .line 161
    const-string v1, "removeRestrictions"

    .line 162
    .line 163
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 167
    .line 168
    .line 169
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 170
    .line 171
    sget-object v1, Lmirror/android/content/pm/UserInfo;->ctor:Lmirror/RefConstructor;

    .line 172
    .line 173
    new-array v3, v3, [Ljava/lang/Object;

    .line 174
    .line 175
    aput-object v6, v3, v5

    .line 176
    .line 177
    aput-object v8, v3, v7

    .line 178
    .line 179
    sget-object v4, Lmirror/android/content/pm/UserInfo;->FLAG_PRIMARY:Lmirror/RefStaticInt;

    .line 180
    .line 181
    invoke-virtual {v4}, Lmirror/RefStaticInt;->get()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    aput-object v4, v3, v10

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-string v3, "getUsers"

    .line 200
    .line 201
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 205
    .line 206
    .line 207
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 208
    .line 209
    const-string v1, "createUser"

    .line 210
    .line 211
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 215
    .line 216
    .line 217
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 218
    .line 219
    const-string v1, "createProfileForUser"

    .line 220
    .line 221
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 225
    .line 226
    .line 227
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 228
    .line 229
    const-string v1, "getProfiles"

    .line 230
    .line 231
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 232
    .line 233
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 237
    .line 238
    .line 239
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 240
    .line 241
    const-string v1, "setUserEnabled"

    .line 242
    .line 243
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 247
    .line 248
    .line 249
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 250
    .line 251
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 252
    .line 253
    const-string v3, "removeUser"

    .line 254
    .line 255
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 259
    .line 260
    .line 261
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 262
    .line 263
    const-string v3, "setUserName"

    .line 264
    .line 265
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 269
    .line 270
    .line 271
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 272
    .line 273
    const-string v3, "setUserIcon"

    .line 274
    .line 275
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 279
    .line 280
    .line 281
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 282
    .line 283
    const-string v3, "canAddMoreManagedProfiles"

    .line 284
    .line 285
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 289
    .line 290
    .line 291
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 292
    .line 293
    const-string v3, "setUserRestrictions"

    .line 294
    .line 295
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 299
    .line 300
    .line 301
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 302
    .line 303
    const-string v3, "setUserRestriction"

    .line 304
    .line 305
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 309
    .line 310
    .line 311
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 312
    .line 313
    const-string v3, "markGuestForDeletion"

    .line 314
    .line 315
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-direct {v0, v3, v4}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 321
    .line 322
    .line 323
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 324
    .line 325
    const-string v3, "createRestrictedProfile"

    .line 326
    .line 327
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 331
    .line 332
    .line 333
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 334
    .line 335
    const-string v3, "getPrimaryUser"

    .line 336
    .line 337
    invoke-direct {v0, v3, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 341
    .line 342
    .line 343
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 344
    .line 345
    const-string v3, "hasBaseUserRestriction"

    .line 346
    .line 347
    invoke-direct {v0, v3, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 351
    .line 352
    .line 353
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 354
    .line 355
    const-string v1, "getUserName"

    .line 356
    .line 357
    const-string v3, ""

    .line 358
    .line 359
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 363
    .line 364
    .line 365
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 366
    .line 367
    const-string v1, "getSeedAccountOptions"

    .line 368
    .line 369
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 373
    .line 374
    .line 375
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 376
    .line 377
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    const-string v2, "getMainUserId"

    .line 390
    .line 391
    invoke-direct {v0, v2, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 395
    .line 396
    .line 397
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/user/UserManagerStub$1;

    .line 398
    .line 399
    const-string v1, "isUserOfType"

    .line 400
    .line 401
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/user/UserManagerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/user/UserManagerStub;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 405
    .line 406
    .line 407
    return-void
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
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
