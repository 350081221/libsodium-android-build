.class public Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;,
        Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetScanResults;,
        Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetConnectionInfo;,
        Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/net/wifi/IWifiManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "wifi"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method

.method private static InetAddress_to_hex(Ljava/net/InetAddress;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/net/InetAddress;->getAddress()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    const/4 v2, 0x4

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    aget-byte v2, p0, v0

    .line 11
    .line 12
    and-int/lit16 v2, v2, 0xff

    .line 13
    .line 14
    mul-int/lit8 v3, v0, 0x8

    .line 15
    .line 16
    shl-int/2addr v2, v3

    .line 17
    or-int/2addr v1, v2

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic access$000()Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->getIPInfo()Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;)Landroid/net/DhcpInfo;
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->createDhcpInfo(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;)Landroid/net/DhcpInfo;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;)Landroid/net/wifi/WifiInfo;
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->createWifiInfo(Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;)Landroid/net/wifi/WifiInfo;

    move-result-object p0

    return-object p0
.end method

.method private static cloneScanResult(Landroid/os/Parcelable;)Landroid/net/wifi/ScanResult;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {p0, v0, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v2, "CREATOR"

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/lody/virtual/helper/utils/Reflect;->field(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x1

    .line 23
    new-array v2, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object v0, v2, v1

    .line 26
    .line 27
    const-string v1, "createFromParcel"

    .line 28
    .line 29
    invoke-virtual {p0, v1, v2}, Lcom/lody/virtual/helper/utils/Reflect;->call(Ljava/lang/String;[Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lcom/lody/virtual/helper/utils/Reflect;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Landroid/net/wifi/ScanResult;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 40
    .line 41
    .line 42
    return-object p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private createDhcpInfo(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;)Landroid/net/DhcpInfo;
    .locals 2

    .line 1
    new-instance v0, Landroid/net/DhcpInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/net/DhcpInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->ip_hex:I

    .line 7
    .line 8
    iput v1, v0, Landroid/net/DhcpInfo;->ipAddress:I

    .line 9
    .line 10
    iget p1, p1, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->netmask_hex:I

    .line 11
    .line 12
    iput p1, v0, Landroid/net/DhcpInfo;->netmask:I

    .line 13
    .line 14
    const p1, 0x4040404

    .line 15
    .line 16
    .line 17
    iput p1, v0, Landroid/net/DhcpInfo;->dns1:I

    .line 18
    .line 19
    const p1, 0x8080808

    .line 20
    .line 21
    .line 22
    iput p1, v0, Landroid/net/DhcpInfo;->dns2:I

    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
.end method

.method private static createWifiInfo(Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;)Landroid/net/wifi/WifiInfo;
    .locals 5

    .line 1
    sget-object v0, Lmirror/android/net/wifi/WifiInfo;->ctor:Lmirror/RefConstructor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmirror/RefConstructor;->newInstance()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/net/wifi/WifiInfo;

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->getIPInfo()Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->addr:Ljava/net/InetAddress;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    sget-object v2, Lmirror/android/net/wifi/WifiInfo;->mNetworkId:Lmirror/RefInt;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v0, v3}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    sget-object v2, Lmirror/android/net/wifi/WifiInfo;->mSupplicantState:Lmirror/RefObject;

    .line 26
    .line 27
    sget-object v4, Landroid/net/wifi/SupplicantState;->COMPLETED:Landroid/net/wifi/SupplicantState;

    .line 28
    .line 29
    invoke-virtual {v2, v0, v4}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    sget-object v2, Lmirror/android/net/wifi/WifiInfo;->mBSSID:Lmirror/RefObject;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->getBSSID()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v0, v4}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    sget-object v2, Lmirror/android/net/wifi/WifiInfo;->mMacAddress:Lmirror/RefObject;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->getMAC()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v2, v0, v4}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    sget-object v2, Lmirror/android/net/wifi/WifiInfo;->mIpAddress:Lmirror/RefObject;

    .line 51
    .line 52
    invoke-virtual {v2, v0, v1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    sget-object v1, Lmirror/android/net/wifi/WifiInfo;->mLinkSpeed:Lmirror/RefInt;

    .line 56
    .line 57
    const/16 v2, 0x41

    .line 58
    .line 59
    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lmirror/android/net/wifi/WifiInfo;->mFrequency:Lmirror/RefInt;

    .line 63
    .line 64
    const/16 v2, 0x1388

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    sget-object v1, Lmirror/android/net/wifi/WifiInfo;->mRssi:Lmirror/RefInt;

    .line 70
    .line 71
    const/16 v2, 0xc8

    .line 72
    .line 73
    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Lmirror/android/net/wifi/WifiInfo;->mWifiSsid:Lmirror/RefObject;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    sget-object v2, Lmirror/android/net/wifi/WifiSsid;->createFromAsciiEncoded:Lmirror/RefStaticMethod;

    .line 81
    .line 82
    new-array v3, v3, [Ljava/lang/Object;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-virtual {p0}, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->getSSID()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    aput-object p0, v3, v4

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v1, v0, p0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sget-object v1, Lmirror/android/net/wifi/WifiInfo;->mSSID:Lmirror/RefObject;

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->getSSID()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {v1, v0, p0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :goto_1
    return-object v0
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private static getIPInfo()Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/net/NetworkInterface;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/net/InetAddress;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->isIPv4Address(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;

    .line 70
    .line 71
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v3, v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->addr:Ljava/net/InetAddress;

    .line 75
    .line 76
    iput-object v1, v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->intf:Ljava/net/NetworkInterface;

    .line 77
    .line 78
    iput-object v4, v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->ip:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v3}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->InetAddress_to_hex(Ljava/net/InetAddress;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    iput v2, v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->ip_hex:I

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInterfaceAddresses()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/net/InterfaceAddress;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/net/InterfaceAddress;->getNetworkPrefixLength()S

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->netmask_to_hex(I)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iput v1, v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$IPInfo;->netmask_hex:I
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    return-object v0

    .line 108
    :catch_0
    move-exception v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    :cond_2
    const/4 v0, 0x0

    .line 113
    return-object v0
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
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

.method private static isIPv4Address(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private static netmask_to_hex(I)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v0

    move v3, v1

    :goto_0
    if-ge v0, p0, :cond_0

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    shl-int/2addr v3, v1

    goto :goto_0

    :cond_0
    return v2
.end method


# virtual methods
.method public inject()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->inject()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "wifi"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 19
    .line 20
    sget-object v1, Lmirror/android/net/wifi/WifiManager;->mService:Lmirror/RefObject;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroid/os/IInterface;

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v0, Lmirror/android/net/wifi/WifiManager;->sService:Lmirror/RefStaticObject;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    :try_start_1
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Landroid/os/IInterface;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lmirror/RefStaticObject;->set(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_1
    move-exception v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$2;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$2;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$3;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$3;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetConnectionInfo;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetConnectionInfo;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetScanResults;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetScanResults;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 46
    .line 47
    const-string v1, "getBatchedScanResults"

    .line 48
    .line 49
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;

    .line 56
    .line 57
    const-string v1, "acquireWifiLock"

    .line 58
    .line 59
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 63
    .line 64
    .line 65
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;

    .line 66
    .line 67
    const-string v1, "updateWifiLockWorkSource"

    .line 68
    .line 69
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 73
    .line 74
    .line 75
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;

    .line 76
    .line 77
    const-string v1, "startLocationRestrictedScan"

    .line 78
    .line 79
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;

    .line 86
    .line 87
    const-string v1, "requestBatchedScan"

    .line 88
    .line 89
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 93
    .line 94
    .line 95
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 96
    .line 97
    const-string v1, "setWifiEnabled"

    .line 98
    .line 99
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 106
    .line 107
    const-string v1, "getConfiguredNetworks"

    .line 108
    .line 109
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 113
    .line 114
    .line 115
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$4;

    .line 116
    .line 117
    const-string v1, "getWifiApConfiguration"

    .line 118
    .line 119
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$4;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 123
    .line 124
    .line 125
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "setWifiApConfiguration"

    .line 133
    .line 134
    invoke-direct {v0, v2, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 138
    .line 139
    .line 140
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 141
    .line 142
    const-string v1, "startLocalOnlyHotspot"

    .line 143
    .line 144
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    const-string v1, "startScan"

    .line 155
    .line 156
    if-eqz v0, :cond_0

    .line 157
    .line 158
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$5;

    .line 159
    .line 160
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$5;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_0
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;

    .line 168
    .line 169
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$RemoveWorkSourceMethodProxy;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 173
    .line 174
    .line 175
    :goto_0
    return-void
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
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
