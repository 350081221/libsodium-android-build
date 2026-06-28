.class public Lorg/osmdroid/tileprovider/modules/TileDownloader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;
    }
.end annotation


# instance fields
.field private compatibilitySocketFactorySet:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public computeExpirationTime(Ljava/lang/String;Ljava/lang/String;J)J
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lorg/osmdroid/config/c;->i0()Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    add-long/2addr p3, p1

    .line 16
    return-wide p3

    .line 17
    :cond_0
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lorg/osmdroid/config/c;->g0()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-virtual {p0, p2}, Lorg/osmdroid/tileprovider/modules/TileDownloader;->getHttpCacheControlDuration(Ljava/lang/String;)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/16 v2, 0x3e8

    .line 36
    .line 37
    mul-long/2addr p1, v2

    .line 38
    add-long/2addr p3, p1

    .line 39
    add-long/2addr p3, v0

    .line 40
    return-wide p3

    .line 41
    :cond_1
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader;->getHttpExpiresTime(Ljava/lang/String;)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    add-long/2addr p1, v0

    .line 52
    return-wide p1

    .line 53
    :cond_2
    const-wide/32 p1, 0x240c8400

    .line 54
    .line 55
    .line 56
    add-long/2addr p3, p1

    .line 57
    add-long/2addr p3, v0

    .line 58
    return-wide p3
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
    .line 107
    .line 108
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
.end method

.method public downloadTile(JILjava/lang/String;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;)Landroid/graphics/drawable/Drawable;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/modules/CantContinueException;
        }
    .end annotation

    move/from16 v1, p3

    move-object/from16 v2, p4

    const-string v3, "https://"

    const-string v4, " : "

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-le v1, v5, :cond_0

    return-object v6

    .line 2
    :cond_0
    invoke-virtual/range {p6 .. p6}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->getTileSourcePolicy()Lorg/osmdroid/tileprovider/tilesource/j;

    move-result-object v5

    invoke-virtual {v5}, Lorg/osmdroid/tileprovider/tilesource/j;->j()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 3
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v5

    invoke-interface {v5}, Lorg/osmdroid/config/c;->s()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v6

    :goto_0
    if-nez v5, :cond_2

    .line 4
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v5

    invoke-interface {v5}, Lorg/osmdroid/config/c;->w()Ljava/lang/String;

    move-result-object v5

    .line 5
    :cond_2
    invoke-virtual/range {p6 .. p6}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->getTileSourcePolicy()Lorg/osmdroid/tileprovider/tilesource/j;

    move-result-object v7

    invoke-virtual {v7, v5}, Lorg/osmdroid/tileprovider/tilesource/j;->d(Ljava/lang/String;)Z

    move-result v7

    const-string v8, "OsmDroid"

    if-nez v7, :cond_3

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Please configure a relevant user agent; current value is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v6

    :cond_3
    const/4 v7, 0x1

    .line 7
    :try_start_0
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v9

    invoke-interface {v9}, Lorg/osmdroid/config/c;->M()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 8
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Downloading Maptile from url: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    :cond_4
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_12

    .line 10
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v9

    invoke-interface {v9}, Lorg/osmdroid/config/c;->E()Ljava/net/Proxy;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 11
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v10

    invoke-interface {v10}, Lorg/osmdroid/config/c;->E()Ljava/net/Proxy;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v9

    check-cast v9, Ljava/net/HttpURLConnection;

    goto :goto_1

    .line 12
    :cond_5
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v9

    check-cast v9, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1f
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_0 .. :try_end_0} :catch_1e
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1d
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1c
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 13
    :goto_1
    :try_start_1
    invoke-virtual {v9, v7}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 14
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v10

    invoke-interface {v10}, Lorg/osmdroid/config/c;->r()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v5

    invoke-interface {v5}, Lorg/osmdroid/config/c;->n()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 16
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v9, v11, v10}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 17
    :cond_6
    invoke-virtual {v9}, Ljava/net/URLConnection;->connect()V

    .line 18
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    const/16 v10, 0xc8

    if-eq v5, v10, :cond_e

    .line 19
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1a
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_1 .. :try_end_1} :catch_19
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_18
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_17
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    const/16 v10, 0x12d

    const-string v11, " HTTP response: "

    if-eq v5, v10, :cond_7

    const/16 v10, 0x12e

    if-eq v5, v10, :cond_7

    const/16 v10, 0x133

    if-eq v5, v10, :cond_7

    const/16 v10, 0x134

    if-eq v5, v10, :cond_7

    goto/16 :goto_5

    .line 20
    :cond_7
    :try_start_2
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v5

    invoke-interface {v5}, Lorg/osmdroid/config/c;->T()Z

    move-result v5

    if-eqz v5, :cond_c

    const-string v5, "Location"

    .line 21
    invoke-virtual {v9, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_e

    const-string v10, "/"

    .line 22
    invoke-virtual {v5, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 23
    new-instance v10, Ljava/net/URL;

    invoke-direct {v10, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v10}, Ljava/net/URL;->getPort()I

    move-result v12

    .line 25
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    const/4 v14, -0x1

    if-ne v12, v14, :cond_9

    .line 26
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v12, "http://"

    invoke-virtual {v2, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v12, 0x50

    goto :goto_3

    :cond_8
    const/16 v12, 0x1bb

    .line 27
    :cond_9
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v13, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "http"

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 28
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Http redirect for MapTile: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to url "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v15, v1, 0x1

    move-object/from16 v12, p0

    move-wide/from16 v13, p1

    move-object/from16 v16, v5

    move-object/from16 v17, p5

    move-object/from16 v18, p6

    .line 29
    invoke-virtual/range {v12 .. v18}, Lorg/osmdroid/tileprovider/modules/TileDownloader;->downloadTile(JILjava/lang/String;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;)Landroid/graphics/drawable/Drawable;

    move-result-object v1
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_1a
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_2 .. :try_end_2} :catch_19
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_18
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_17
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 30
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 31
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 32
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 33
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 34
    :try_start_3
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    return-object v1

    .line 35
    :cond_c
    :goto_5
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Problem downloading MapTile: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v1

    invoke-interface {v1}, Lorg/osmdroid/config/c;->m0()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 37
    invoke-static {v8, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    :cond_d
    sget v1, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    add-int/2addr v1, v7

    sput v1, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    .line 39
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_4
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_1a
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_4 .. :try_end_4} :catch_19
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_18
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_17
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 40
    invoke-static {v1}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 41
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 42
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 43
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 44
    :try_start_5
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    return-object v6

    :cond_e
    :try_start_6
    const-string v1, "Content-Type"

    .line 45
    invoke-virtual {v9, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v3

    invoke-interface {v3}, Lorg/osmdroid/config/c;->m0()Z

    move-result v3

    if-eqz v3, :cond_f

    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " success, mime is "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v8, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    if-eqz v1, :cond_10

    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v5, "image"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " success, however the mime type does not appear to be an image "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    :cond_10
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_6
    .catch Ljava/net/UnknownHostException; {:try_start_6 .. :try_end_6} :catch_1a
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_6 .. :try_end_6} :catch_19
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_18
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_17
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 51
    :try_start_7
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_7
    .catch Ljava/net/UnknownHostException; {:try_start_7 .. :try_end_7} :catch_16
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_7 .. :try_end_7} :catch_15
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_14
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_13
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 52
    :try_start_8
    new-instance v3, Ljava/io/BufferedOutputStream;

    const/16 v5, 0x2000

    invoke-direct {v3, v2, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_8
    .catch Ljava/net/UnknownHostException; {:try_start_8 .. :try_end_8} :catch_12
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_8 .. :try_end_8} :catch_11
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_10
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_f
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 53
    :try_start_9
    invoke-virtual/range {p6 .. p6}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->getTileSourcePolicy()Lorg/osmdroid/tileprovider/tilesource/j;

    move-result-object v5

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 55
    invoke-virtual {v5, v9, v10, v11}, Lorg/osmdroid/tileprovider/tilesource/j;->f(Ljava/net/HttpURLConnection;J)J

    move-result-wide v10

    .line 56
    invoke-static {v1, v3}, Lorg/osmdroid/tileprovider/util/StreamUtils;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 57
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 58
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    .line 59
    new-instance v14, Ljava/io/ByteArrayInputStream;

    invoke-direct {v14, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_9
    .catch Ljava/net/UnknownHostException; {:try_start_9 .. :try_end_9} :catch_e
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_9 .. :try_end_9} :catch_d
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_c
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_b
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-eqz p5, :cond_11

    .line 60
    :try_start_a
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17
    :try_end_a
    .catch Ljava/net/UnknownHostException; {:try_start_a .. :try_end_a} :catch_5
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    move-object v5, v14

    move-wide/from16 v14, p1

    move-object/from16 v16, v5

    :try_start_b
    invoke-interface/range {v12 .. v17}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->saveFile(Lorg/osmdroid/tileprovider/tilesource/e;JLjava/io/InputStream;Ljava/lang/Long;)Z

    .line 61
    invoke-virtual {v5}, Ljava/io/ByteArrayInputStream;->reset()V

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v5, v14

    move-object v4, v0

    goto/16 :goto_14

    :catch_2
    move-exception v0

    move-object v5, v14

    goto :goto_7

    :catch_3
    move-exception v0

    move-object v5, v14

    goto :goto_8

    :catch_4
    move-exception v0

    move-object v5, v14

    goto/16 :goto_b

    :catch_5
    move-exception v0

    move-object v5, v14

    goto :goto_9

    :cond_11
    move-object v5, v14

    :goto_6
    move-object/from16 v10, p6

    .line 62
    invoke-virtual {v10, v5}, Lorg/osmdroid/tileprovider/tilesource/a;->getDrawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object v4
    :try_end_b
    .catch Ljava/net/UnknownHostException; {:try_start_b .. :try_end_b} :catch_a
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_b .. :try_end_b} :catch_9
    .catch Ljava/io/FileNotFoundException; {:try_start_b .. :try_end_b} :catch_8
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 63
    invoke-static {v1}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 64
    invoke-static {v3}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 65
    invoke-static {v5}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 66
    invoke-static {v2}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 67
    :try_start_c
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    :catch_6
    return-object v4

    :catchall_1
    move-exception v0

    move-object v4, v0

    move-object v14, v5

    goto/16 :goto_14

    :catch_7
    move-exception v0

    move-object v14, v5

    :goto_7
    move-object v5, v0

    goto/16 :goto_16

    :catch_8
    move-exception v0

    move-object v14, v5

    :goto_8
    move-object v5, v0

    goto/16 :goto_17

    :catch_9
    move-exception v0

    goto/16 :goto_b

    :catch_a
    move-exception v0

    move-object v14, v5

    :goto_9
    move-object v5, v0

    goto/16 :goto_19

    :catchall_2
    move-exception v0

    move-object v4, v0

    move-object v14, v6

    goto/16 :goto_14

    :catch_b
    move-exception v0

    move-object v5, v0

    move-object v14, v6

    goto/16 :goto_16

    :catch_c
    move-exception v0

    move-object v5, v0

    move-object v14, v6

    goto/16 :goto_17

    :catch_d
    move-exception v0

    move-object v5, v6

    goto :goto_b

    :catch_e
    move-exception v0

    move-object v5, v0

    move-object v14, v6

    goto/16 :goto_19

    :catchall_3
    move-exception v0

    move-object v4, v0

    move-object v3, v6

    goto :goto_d

    :catch_f
    move-exception v0

    move-object v5, v0

    move-object v3, v6

    goto :goto_f

    :catch_10
    move-exception v0

    move-object v5, v0

    move-object v3, v6

    goto/16 :goto_11

    :catch_11
    move-exception v0

    move-object v3, v6

    goto :goto_a

    :catch_12
    move-exception v0

    move-object v5, v0

    move-object v3, v6

    goto/16 :goto_13

    :catchall_4
    move-exception v0

    move-object v4, v0

    move-object v2, v6

    goto :goto_c

    :catch_13
    move-exception v0

    move-object v5, v0

    move-object v2, v6

    goto :goto_e

    :catch_14
    move-exception v0

    move-object v5, v0

    move-object v2, v6

    goto :goto_10

    :catch_15
    move-exception v0

    move-object v2, v6

    move-object v3, v2

    :goto_a
    move-object v5, v3

    :goto_b
    move-object v6, v1

    move-object v1, v0

    goto/16 :goto_18

    :catch_16
    move-exception v0

    move-object v5, v0

    move-object v2, v6

    goto :goto_12

    :catchall_5
    move-exception v0

    move-object v4, v0

    move-object v1, v6

    move-object v2, v1

    :goto_c
    move-object v3, v2

    :goto_d
    move-object v14, v3

    goto :goto_14

    :catch_17
    move-exception v0

    move-object v5, v0

    move-object v1, v6

    move-object v2, v1

    :goto_e
    move-object v3, v2

    :goto_f
    move-object v14, v3

    goto/16 :goto_16

    :catch_18
    move-exception v0

    move-object v5, v0

    move-object v1, v6

    move-object v2, v1

    :goto_10
    move-object v3, v2

    :goto_11
    move-object v14, v3

    goto/16 :goto_17

    :catch_19
    move-exception v0

    move-object v1, v0

    move-object v2, v6

    move-object v3, v2

    move-object v5, v3

    goto/16 :goto_18

    :catch_1a
    move-exception v0

    move-object v5, v0

    move-object v1, v6

    move-object v2, v1

    :goto_12
    move-object v3, v2

    :goto_13
    move-object v14, v3

    goto/16 :goto_19

    .line 68
    :cond_12
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 69
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 70
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 71
    invoke-static {v6}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 72
    :try_start_d
    throw v6
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1b

    :catch_1b
    return-object v6

    :catchall_6
    move-exception v0

    move-object v4, v0

    move-object v1, v6

    move-object v2, v1

    move-object v3, v2

    move-object v9, v3

    move-object v14, v9

    .line 73
    :goto_14
    :try_start_e
    sget v5, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    add-int/2addr v5, v7

    sput v5, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    .line 74
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error downloading MapTile: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 75
    :goto_15
    invoke-static {v1}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 76
    invoke-static {v3}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 77
    invoke-static {v14}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 78
    invoke-static {v2}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 79
    :try_start_f
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_20

    goto/16 :goto_1a

    :catch_1c
    move-exception v0

    move-object v5, v0

    move-object v1, v6

    move-object v2, v1

    move-object v3, v2

    move-object v9, v3

    move-object v14, v9

    .line 80
    :goto_16
    :try_start_10
    sget v10, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    add-int/2addr v10, v7

    sput v10, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    .line 81
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "IOException downloading MapTile: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_15

    :catch_1d
    move-exception v0

    move-object v5, v0

    move-object v1, v6

    move-object v2, v1

    move-object v3, v2

    move-object v9, v3

    move-object v14, v9

    .line 82
    :goto_17
    sget v10, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    add-int/2addr v10, v7

    sput v10, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    .line 83
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Tile not found: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_15

    :catchall_7
    move-exception v0

    move-object v4, v0

    goto/16 :goto_1b

    :catch_1e
    move-exception v0

    move-object v1, v0

    move-object v2, v6

    move-object v3, v2

    move-object v5, v3

    move-object v9, v5

    .line 84
    :goto_18
    :try_start_11
    sget v10, Lorg/osmdroid/tileprovider/util/Counters;->countOOM:I

    add-int/2addr v10, v7

    sput v10, Lorg/osmdroid/tileprovider/util/Counters;->countOOM:I

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "LowMemoryException downloading MapTile: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    new-instance v4, Lorg/osmdroid/tileprovider/modules/CantContinueException;

    invoke-direct {v4, v1}, Lorg/osmdroid/tileprovider/modules/CantContinueException;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    move-object v4, v0

    move-object v14, v5

    move-object v1, v6

    goto :goto_1b

    :catch_1f
    move-exception v0

    move-object v5, v0

    move-object v1, v6

    move-object v2, v1

    move-object v3, v2

    move-object v9, v3

    move-object v14, v9

    .line 87
    :goto_19
    :try_start_12
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "UnknownHostException downloading MapTile: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    sget v4, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    add-int/2addr v4, v7

    sput v4, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    goto/16 :goto_15

    :catch_20
    :goto_1a
    return-object v6

    .line 89
    :goto_1b
    invoke-static {v1}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 90
    invoke-static {v3}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 91
    invoke-static {v14}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 92
    invoke-static {v2}, Lorg/osmdroid/tileprovider/util/StreamUtils;->closeStream(Ljava/io/Closeable;)V

    .line 93
    :try_start_13
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_21

    .line 94
    :catch_21
    throw v4
.end method

.method public downloadTile(JLorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;)Landroid/graphics/drawable/Drawable;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/modules/CantContinueException;
        }
    .end annotation

    const/4 v3, 0x0

    .line 1
    invoke-virtual {p4, p1, p2}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->getTileURLString(J)Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-wide v1, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lorg/osmdroid/tileprovider/modules/TileDownloader;->downloadTile(JILjava/lang/String;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public getHttpCacheControlDuration(Ljava/lang/String;)Ljava/lang/Long;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    const-string v0, ", "

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    array-length v1, v0

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    aget-object v3, v0, v2

    .line 20
    .line 21
    const-string v4, "max-age="

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    return-object p1

    .line 40
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1}, Lorg/osmdroid/config/c;->m0()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "Unable to parse cache control tag for tile, server returned "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v1, "OsmDroid"

    .line 72
    .line 73
    invoke-static {v1, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    :cond_1
    const/4 p1, 0x0

    .line 77
    return-object p1
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
    .line 107
    .line 108
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
.end method

.method public getHttpExpiresTime(Ljava/lang/String;)Ljava/lang/Long;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lorg/osmdroid/config/c;->p()Ljava/text/SimpleDateFormat;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object p1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Lorg/osmdroid/config/c;->m0()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "Unable to parse expiration tag for tile, server returned "

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v1, "OsmDroid"

    .line 59
    .line 60
    invoke-static {v1, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 61
    .line 62
    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    return-object p1
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
    .line 107
    .line 108
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
.end method
