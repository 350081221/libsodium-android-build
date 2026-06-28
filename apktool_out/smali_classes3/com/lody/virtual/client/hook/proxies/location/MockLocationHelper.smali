.class public Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checksum(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "$"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, p0

    .line 16
    :goto_0
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    move v4, v3

    .line 19
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-ge v3, v5, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    int-to-byte v5, v5

    .line 30
    xor-int/2addr v4, v5

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, "*"

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    new-array p0, v1, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    aput-object v1, p0, v2

    .line 54
    .line 55
    const-string v1, "%02X"

    .line 56
    .line 57
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
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

.method public static fakeGpsStatus(Landroid/location/LocationManager;)V
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->fakeGpsStatusN(Landroid/location/LocationManager;)V

    return-void
.end method

.method public static fakeGpsStatusN(Landroid/location/LocationManager;)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/location/LocationManager;->mGpsStatusListeners:Lmirror/RefObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->invokeSvStatusChanged(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method public static getGPSLat(D)Ljava/lang/String;
    .locals 3

    double-to-int v0, p0

    int-to-double v1, v0

    sub-double/2addr p0, v1

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    mul-double/2addr p0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    double-to-int v0, p0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->leftZeroPad(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getNorthWest(Lcom/lody/virtual/remote/vloc/VLocation;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    const-string p0, "N"

    return-object p0

    :cond_0
    const-string p0, "S"

    return-object p0
.end method

.method private static getSouthEast(Lcom/lody/virtual/remote/vloc/VLocation;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    const-string p0, "E"

    return-object p0

    :cond_0
    const-string p0, "W"

    return-object p0
.end method

.method public static invokeNmeaReceived(Ljava/lang/Object;)V
    .locals 14

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->get()Lcom/lody/virtual/client/env/VirtualGPSSatalines;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/VLocationManager;->get()Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lcom/lody/virtual/client/ipc/VLocationManager;->getCurAppLocation()Lcom/lody/virtual/remote/vloc/VLocation;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 18
    .line 19
    const-string v3, "HHmmss:SS"

    .line 20
    .line 21
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ljava/util/Date;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v3, v4}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->getGPSLat(D)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    invoke-static {v4, v5}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->getGPSLat(D)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->getNorthWest(Lcom/lody/virtual/remote/vloc/VLocation;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->getSouthEast(Lcom/lody/virtual/remote/vloc/VLocation;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v6, "$GPGGA,%s,%s,%s,%s,%s,1,%s,692,.00,M,.00,M,,,"

    .line 60
    .line 61
    const/4 v7, 0x6

    .line 62
    new-array v7, v7, [Ljava/lang/Object;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    aput-object v2, v7, v8

    .line 66
    .line 67
    const/4 v9, 0x1

    .line 68
    aput-object v3, v7, v9

    .line 69
    .line 70
    const/4 v10, 0x2

    .line 71
    aput-object v5, v7, v10

    .line 72
    .line 73
    const/4 v11, 0x3

    .line 74
    aput-object v4, v7, v11

    .line 75
    .line 76
    const/4 v12, 0x4

    .line 77
    aput-object v1, v7, v12

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getSvCount()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v13, 0x5

    .line 88
    aput-object v0, v7, v13

    .line 89
    .line 90
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->checksum(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v6, "$GPRMC,%s,A,%s,%s,%s,%s,0,0,260717,,,A,"

    .line 99
    .line 100
    new-array v7, v13, [Ljava/lang/Object;

    .line 101
    .line 102
    aput-object v2, v7, v8

    .line 103
    .line 104
    aput-object v3, v7, v9

    .line 105
    .line 106
    aput-object v5, v7, v10

    .line 107
    .line 108
    aput-object v4, v7, v11

    .line 109
    .line 110
    aput-object v1, v7, v12

    .line 111
    .line 112
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->checksum(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    sget-object v2, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    const-string v3, "$GPGSA,A,2,12,15,19,31,,,,,,,,,604,712,986,*27"

    .line 123
    .line 124
    const-string v4, "$GPVTG,0,T,0,M,0,N,0,K,A,*25"

    .line 125
    .line 126
    const-string v5, "$GPGSV,1,1,04,12,05,159,36,15,41,087,15,19,38,262,30,31,56,146,19,*73"

    .line 127
    .line 128
    if-eqz v2, :cond_0

    .line 129
    .line 130
    :try_start_1
    new-array v6, v10, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v11

    .line 136
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    aput-object v7, v6, v8

    .line 141
    .line 142
    aput-object v5, v6, v9

    .line 143
    .line 144
    invoke-virtual {v2, p0, v6}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    sget-object v2, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 148
    .line 149
    new-array v5, v10, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    aput-object v6, v5, v8

    .line 160
    .line 161
    aput-object v0, v5, v9

    .line 162
    .line 163
    invoke-virtual {v2, p0, v5}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    sget-object v0, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 167
    .line 168
    new-array v2, v10, [Ljava/lang/Object;

    .line 169
    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 171
    .line 172
    .line 173
    move-result-wide v5

    .line 174
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    aput-object v5, v2, v8

    .line 179
    .line 180
    aput-object v4, v2, v9

    .line 181
    .line 182
    invoke-virtual {v0, p0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    sget-object v0, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 186
    .line 187
    new-array v2, v10, [Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 190
    .line 191
    .line 192
    move-result-wide v4

    .line 193
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    aput-object v4, v2, v8

    .line 198
    .line 199
    aput-object v1, v2, v9

    .line 200
    .line 201
    invoke-virtual {v0, p0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    sget-object v0, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 205
    .line 206
    new-array v1, v10, [Ljava/lang/Object;

    .line 207
    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v4

    .line 212
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    aput-object v2, v1, v8

    .line 217
    .line 218
    aput-object v3, v1, v9

    .line 219
    .line 220
    invoke-virtual {v0, p0, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_0
    sget-object v2, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 225
    .line 226
    if-eqz v2, :cond_1

    .line 227
    .line 228
    new-array v6, v10, [Ljava/lang/Object;

    .line 229
    .line 230
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 231
    .line 232
    .line 233
    move-result-wide v11

    .line 234
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    aput-object v7, v6, v8

    .line 239
    .line 240
    aput-object v5, v6, v9

    .line 241
    .line 242
    invoke-virtual {v2, p0, v6}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    sget-object v2, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 246
    .line 247
    new-array v5, v10, [Ljava/lang/Object;

    .line 248
    .line 249
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    aput-object v6, v5, v8

    .line 258
    .line 259
    aput-object v0, v5, v9

    .line 260
    .line 261
    invoke-virtual {v2, p0, v5}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    sget-object v0, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 265
    .line 266
    new-array v2, v10, [Ljava/lang/Object;

    .line 267
    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 269
    .line 270
    .line 271
    move-result-wide v5

    .line 272
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    aput-object v5, v2, v8

    .line 277
    .line 278
    aput-object v4, v2, v9

    .line 279
    .line 280
    invoke-virtual {v0, p0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    sget-object v0, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 284
    .line 285
    new-array v2, v10, [Ljava/lang/Object;

    .line 286
    .line 287
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 288
    .line 289
    .line 290
    move-result-wide v4

    .line 291
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    aput-object v4, v2, v8

    .line 296
    .line 297
    aput-object v1, v2, v9

    .line 298
    .line 299
    invoke-virtual {v0, p0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    sget-object v0, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->onNmeaReceived:Lmirror/RefMethod;

    .line 303
    .line 304
    new-array v1, v10, [Ljava/lang/Object;

    .line 305
    .line 306
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 307
    .line 308
    .line 309
    move-result-wide v4

    .line 310
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    aput-object v2, v1, v8

    .line 315
    .line 316
    aput-object v3, v1, v9

    .line 317
    .line 318
    invoke-virtual {v0, p0, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 319
    .line 320
    .line 321
    goto :goto_0

    .line 322
    :catchall_0
    move-exception p0

    .line 323
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 324
    .line 325
    .line 326
    :cond_1
    :goto_0
    return-void
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

.method public static invokeSvStatusChanged(Ljava/lang/Object;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->get()Lcom/lody/virtual/client/env/VirtualGPSSatalines;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const/4 v4, 0x6

    .line 16
    const/4 v5, 0x4

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, 0x5

    .line 20
    const/4 v9, 0x1

    .line 21
    const/4 v10, 0x0

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getSvCount()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getPrnWithFlags()[I

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getSnrs()[F

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getElevations()[F

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getAzimuths()[F

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    if-eqz v14, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getCarrierFreqs()[F

    .line 51
    .line 52
    .line 53
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :try_start_1
    sget-object v14, Lmirror/android/location/LocationManager$GnssStatusListenerTransportO;->onSvStatusChanged:Lmirror/RefMethod;

    .line 55
    .line 56
    new-array v4, v4, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    aput-object v2, v4, v10

    .line 63
    .line 64
    aput-object v3, v4, v9

    .line 65
    .line 66
    aput-object v11, v4, v7

    .line 67
    .line 68
    aput-object v12, v4, v6

    .line 69
    .line 70
    aput-object v13, v4, v5

    .line 71
    .line 72
    aput-object v1, v4, v8

    .line 73
    .line 74
    invoke-virtual {v14, v0, v4}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_0
    :try_start_2
    sget-object v1, Lmirror/android/location/LocationManager$GnssStatusListenerTransport;->onSvStatusChanged:Lmirror/RefMethod;

    .line 80
    .line 81
    new-array v4, v8, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    aput-object v2, v4, v10

    .line 88
    .line 89
    aput-object v3, v4, v9

    .line 90
    .line 91
    aput-object v11, v4, v7

    .line 92
    .line 93
    aput-object v12, v4, v6

    .line 94
    .line 95
    aput-object v13, v4, v5

    .line 96
    .line 97
    invoke-virtual {v1, v0, v4}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_1
    sget-object v3, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    if-ne v2, v3, :cond_8

    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getSvCount()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getPrns()[I

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getSnrs()[F

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getElevations()[F

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getAzimuths()[F

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getEphemerisMask()I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getAlmanacMask()I

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getUsedInFixMask()I

    .line 135
    .line 136
    .line 137
    move-result v16

    .line 138
    sget-object v4, Lmirror/android/location/LocationManager$GpsStatusListenerTransport;->onSvStatusChanged:Lmirror/RefMethod;

    .line 139
    .line 140
    const/16 v17, 0x7

    .line 141
    .line 142
    const/16 v8, 0x8

    .line 143
    .line 144
    if-eqz v4, :cond_2

    .line 145
    .line 146
    new-array v1, v8, [Ljava/lang/Object;

    .line 147
    .line 148
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    aput-object v2, v1, v10

    .line 153
    .line 154
    aput-object v3, v1, v9

    .line 155
    .line 156
    aput-object v11, v1, v7

    .line 157
    .line 158
    aput-object v12, v1, v6

    .line 159
    .line 160
    aput-object v13, v1, v5

    .line 161
    .line 162
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    const/4 v3, 0x5

    .line 167
    aput-object v2, v1, v3

    .line 168
    .line 169
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/4 v3, 0x6

    .line 174
    aput-object v2, v1, v3

    .line 175
    .line 176
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    aput-object v2, v1, v17

    .line 181
    .line 182
    invoke-virtual {v4, v0, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto/16 :goto_3

    .line 186
    .line 187
    :cond_2
    sget-object v4, Lmirror/android/location/LocationManager$GpsStatusListenerTransportVIVO;->onSvStatusChanged:Lmirror/RefMethod;

    .line 188
    .line 189
    const/16 v8, 0x9

    .line 190
    .line 191
    if-eqz v4, :cond_3

    .line 192
    .line 193
    new-array v1, v8, [Ljava/lang/Object;

    .line 194
    .line 195
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    aput-object v8, v1, v10

    .line 200
    .line 201
    aput-object v3, v1, v9

    .line 202
    .line 203
    aput-object v11, v1, v7

    .line 204
    .line 205
    aput-object v12, v1, v6

    .line 206
    .line 207
    aput-object v13, v1, v5

    .line 208
    .line 209
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    const/4 v5, 0x5

    .line 214
    aput-object v3, v1, v5

    .line 215
    .line 216
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    const/4 v5, 0x6

    .line 221
    aput-object v3, v1, v5

    .line 222
    .line 223
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    aput-object v3, v1, v17

    .line 228
    .line 229
    new-array v2, v2, [J

    .line 230
    .line 231
    const/16 v3, 0x8

    .line 232
    .line 233
    aput-object v2, v1, v3

    .line 234
    .line 235
    invoke-virtual {v4, v0, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    goto/16 :goto_3

    .line 239
    .line 240
    :cond_3
    sget-object v4, Lmirror/android/location/LocationManager$GpsStatusListenerTransportSumsungS5;->onSvStatusChanged:Lmirror/RefMethod;

    .line 241
    .line 242
    if-eqz v4, :cond_4

    .line 243
    .line 244
    new-array v1, v8, [Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    aput-object v8, v1, v10

    .line 251
    .line 252
    aput-object v3, v1, v9

    .line 253
    .line 254
    aput-object v11, v1, v7

    .line 255
    .line 256
    aput-object v12, v1, v6

    .line 257
    .line 258
    aput-object v13, v1, v5

    .line 259
    .line 260
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    const/4 v5, 0x5

    .line 265
    aput-object v3, v1, v5

    .line 266
    .line 267
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    const/4 v5, 0x6

    .line 272
    aput-object v3, v1, v5

    .line 273
    .line 274
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    aput-object v3, v1, v17

    .line 279
    .line 280
    new-array v2, v2, [I

    .line 281
    .line 282
    const/16 v3, 0x8

    .line 283
    .line 284
    aput-object v2, v1, v3

    .line 285
    .line 286
    invoke-virtual {v4, v0, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_4
    sget-object v4, Lmirror/android/location/LocationManager$GpsStatusListenerTransportOPPO_R815T;->onSvStatusChanged:Lmirror/RefMethod;

    .line 291
    .line 292
    if-eqz v4, :cond_8

    .line 293
    .line 294
    array-length v4, v3

    .line 295
    new-array v14, v4, [I

    .line 296
    .line 297
    move v15, v10

    .line 298
    :goto_0
    if-ge v15, v4, :cond_5

    .line 299
    .line 300
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getEphemerisMask()I

    .line 301
    .line 302
    .line 303
    move-result v16

    .line 304
    aput v16, v14, v15

    .line 305
    .line 306
    add-int/lit8 v15, v15, 0x1

    .line 307
    .line 308
    goto :goto_0

    .line 309
    :cond_5
    new-array v15, v4, [I

    .line 310
    .line 311
    move v5, v10

    .line 312
    :goto_1
    if-ge v5, v4, :cond_6

    .line 313
    .line 314
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getAlmanacMask()I

    .line 315
    .line 316
    .line 317
    move-result v18

    .line 318
    aput v18, v15, v5

    .line 319
    .line 320
    add-int/lit8 v5, v5, 0x1

    .line 321
    .line 322
    goto :goto_1

    .line 323
    :cond_6
    new-array v5, v4, [I

    .line 324
    .line 325
    move v6, v10

    .line 326
    :goto_2
    if-ge v6, v4, :cond_7

    .line 327
    .line 328
    invoke-virtual {v1}, Lcom/lody/virtual/client/env/VirtualGPSSatalines;->getUsedInFixMask()I

    .line 329
    .line 330
    .line 331
    move-result v19

    .line 332
    aput v19, v5, v6

    .line 333
    .line 334
    add-int/lit8 v6, v6, 0x1

    .line 335
    .line 336
    goto :goto_2

    .line 337
    :cond_7
    sget-object v1, Lmirror/android/location/LocationManager$GpsStatusListenerTransportOPPO_R815T;->onSvStatusChanged:Lmirror/RefMethod;

    .line 338
    .line 339
    new-array v4, v8, [Ljava/lang/Object;

    .line 340
    .line 341
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    aput-object v6, v4, v10

    .line 346
    .line 347
    aput-object v3, v4, v9

    .line 348
    .line 349
    aput-object v11, v4, v7

    .line 350
    .line 351
    const/4 v3, 0x3

    .line 352
    aput-object v12, v4, v3

    .line 353
    .line 354
    const/4 v3, 0x4

    .line 355
    aput-object v13, v4, v3

    .line 356
    .line 357
    const/4 v3, 0x5

    .line 358
    aput-object v14, v4, v3

    .line 359
    .line 360
    const/4 v3, 0x6

    .line 361
    aput-object v15, v4, v3

    .line 362
    .line 363
    aput-object v5, v4, v17

    .line 364
    .line 365
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/16 v3, 0x8

    .line 370
    .line 371
    aput-object v2, v4, v3

    .line 372
    .line 373
    invoke-virtual {v1, v0, v4}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 374
    .line 375
    .line 376
    goto :goto_3

    .line 377
    :catchall_0
    move-exception v0

    .line 378
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 379
    .line 380
    .line 381
    :catch_0
    :cond_8
    :goto_3
    return-void
.end method

.method private static leftZeroPad(II)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->leftZeroPad(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static leftZeroPad(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x30

    const/4 v2, 0x0

    if-nez p0, :cond_0

    :goto_0
    if-ge v2, p1, :cond_2

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int v3, p1, v3

    if-ge v2, v3, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
