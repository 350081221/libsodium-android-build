.class public Lorg/osmdroid/tileprovider/cachemanager/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/cachemanager/a$h;,
        Lorg/osmdroid/tileprovider/cachemanager/a$e;,
        Lorg/osmdroid/tileprovider/cachemanager/a$g;,
        Lorg/osmdroid/tileprovider/cachemanager/a$f;,
        Lorg/osmdroid/tileprovider/cachemanager/a$i;
    }
.end annotation


# instance fields
.field private a:Lorg/osmdroid/tileprovider/modules/TileDownloader;

.field protected final b:Lorg/osmdroid/tileprovider/tilesource/e;

.field protected final c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

.field protected final d:I

.field protected final e:I

.field protected f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;",
            ">;"
        }
    .end annotation
.end field

.field protected g:Z


# direct methods
.method public constructor <init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/tilesource/k;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/osmdroid/tileprovider/cachemanager/a;-><init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;II)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/tilesource/k;
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lorg/osmdroid/tileprovider/modules/TileDownloader;

    invoke-direct {v0}, Lorg/osmdroid/tileprovider/modules/TileDownloader;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->a:Lorg/osmdroid/tileprovider/modules/TileDownloader;

    .line 6
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->f:Ljava/util/Set;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->g:Z

    .line 8
    iput-object p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->b:Lorg/osmdroid/tileprovider/tilesource/e;

    .line 9
    iput-object p2, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    .line 10
    iput p3, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->d:I

    .line 11
    iput p4, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->e:I

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/tilesource/k;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileWriter()Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/osmdroid/tileprovider/cachemanager/a;-><init>(Lorg/osmdroid/views/MapView;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/tilesource/k;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    move-result-object v0

    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMinZoomLevel()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    move-result-wide v2

    double-to-int p1, v2

    invoke-direct {p0, v0, p2, v1, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;II)V

    return-void
.end method

.method public static A(Lorg/osmdroid/tileprovider/tilesource/e;J)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lorg/osmdroid/config/c;->f()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, p1, p2}, Lorg/osmdroid/tileprovider/tilesource/e;->getTileRelativeFilenameString(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ".tile"

    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0
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
    .line 86
    .line 87
    .line 88
.end method

.method public static B(DDI)Landroid/graphics/Point;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1, p4}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p2, p3, p4}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-instance p2, Landroid/graphics/Point;

    .line 18
    .line 19
    invoke-direct {p2, p1, p0}, Landroid/graphics/Point;-><init>(II)V

    .line 20
    .line 21
    .line 22
    return-object p2
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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

.method public static D(Ljava/util/ArrayList;I)Ljava/util/Collection;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;I)",
            "Ljava/util/Collection<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    shl-int v3, v2, v0

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v6, v5

    .line 17
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-eqz v7, :cond_11

    .line 22
    .line 23
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    check-cast v7, Lorg/osmdroid/util/GeoPoint;

    .line 28
    .line 29
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    invoke-static {v8, v9, v0}, Lorg/osmdroid/util/TileSystem;->GroundResolution(DI)D

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_c

    .line 42
    .line 43
    if-eqz v5, :cond_b

    .line 44
    .line 45
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 50
    .line 51
    .line 52
    move-result-wide v14

    .line 53
    sub-double/2addr v12, v14

    .line 54
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 55
    .line 56
    .line 57
    move-result-wide v14

    .line 58
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 59
    .line 60
    .line 61
    move-result-wide v16

    .line 62
    sub-double v14, v14, v16

    .line 63
    .line 64
    div-double/2addr v12, v14

    .line 65
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 70
    .line 71
    .line 72
    move-result-wide v16

    .line 73
    cmpl-double v10, v14, v16

    .line 74
    .line 75
    if-lez v10, :cond_0

    .line 76
    .line 77
    const-wide v14, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v12, v13}, Ljava/lang/Math;->atan(D)D

    .line 83
    .line 84
    .line 85
    move-result-wide v12

    .line 86
    goto :goto_1

    .line 87
    :cond_0
    const-wide v14, 0x4012d97c7f3321d2L    # 4.71238898038469

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {v12, v13}, Ljava/lang/Math;->atan(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide v12

    .line 96
    :goto_1
    sub-double/2addr v14, v12

    .line 97
    new-instance v10, Lorg/osmdroid/util/GeoPoint;

    .line 98
    .line 99
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 100
    .line 101
    .line 102
    move-result-wide v12

    .line 103
    move/from16 v17, v3

    .line 104
    .line 105
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    invoke-direct {v10, v12, v13, v2, v3}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 117
    .line 118
    .line 119
    move-result-wide v12

    .line 120
    cmpl-double v2, v2, v12

    .line 121
    .line 122
    if-lez v2, :cond_1

    .line 123
    .line 124
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 129
    .line 130
    .line 131
    move-result-wide v12

    .line 132
    cmpg-double v2, v2, v12

    .line 133
    .line 134
    if-ltz v2, :cond_2

    .line 135
    .line 136
    :cond_1
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 141
    .line 142
    .line 143
    move-result-wide v12

    .line 144
    cmpg-double v2, v2, v12

    .line 145
    .line 146
    if-gez v2, :cond_a

    .line 147
    .line 148
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 153
    .line 154
    .line 155
    move-result-wide v12

    .line 156
    cmpl-double v2, v2, v12

    .line 157
    .line 158
    if-lez v2, :cond_a

    .line 159
    .line 160
    :cond_2
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 165
    .line 166
    .line 167
    move-result-wide v12

    .line 168
    cmpl-double v2, v2, v12

    .line 169
    .line 170
    if-lez v2, :cond_3

    .line 171
    .line 172
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    cmpg-double v2, v2, v12

    .line 181
    .line 182
    if-ltz v2, :cond_4

    .line 183
    .line 184
    :cond_3
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 185
    .line 186
    .line 187
    move-result-wide v2

    .line 188
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 189
    .line 190
    .line 191
    move-result-wide v12

    .line 192
    cmpg-double v2, v2, v12

    .line 193
    .line 194
    if-gez v2, :cond_a

    .line 195
    .line 196
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 197
    .line 198
    .line 199
    move-result-wide v2

    .line 200
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 201
    .line 202
    .line 203
    move-result-wide v12

    .line 204
    cmpl-double v2, v2, v12

    .line 205
    .line 206
    if-lez v2, :cond_a

    .line 207
    .line 208
    :cond_4
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    const-wide v12, 0x400921fb54442d18L    # Math.PI

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    mul-double/2addr v2, v12

    .line 218
    const-wide v18, 0x4066800000000000L    # 180.0

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    div-double v2, v2, v18

    .line 224
    .line 225
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 226
    .line 227
    .line 228
    move-result-wide v20

    .line 229
    mul-double v20, v20, v12

    .line 230
    .line 231
    div-double v20, v20, v18

    .line 232
    .line 233
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 234
    .line 235
    .line 236
    move-result-wide v22

    .line 237
    const-wide v24, 0x415854a640000000L    # 6378137.0

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    div-double v24, v8, v24

    .line 243
    .line 244
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->cos(D)D

    .line 245
    .line 246
    .line 247
    move-result-wide v26

    .line 248
    mul-double v22, v22, v26

    .line 249
    .line 250
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 251
    .line 252
    .line 253
    move-result-wide v26

    .line 254
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sin(D)D

    .line 255
    .line 256
    .line 257
    move-result-wide v28

    .line 258
    mul-double v26, v26, v28

    .line 259
    .line 260
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    .line 261
    .line 262
    .line 263
    move-result-wide v28

    .line 264
    mul-double v26, v26, v28

    .line 265
    .line 266
    add-double v22, v22, v26

    .line 267
    .line 268
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->asin(D)D

    .line 269
    .line 270
    .line 271
    move-result-wide v22

    .line 272
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 273
    .line 274
    .line 275
    move-result-wide v26

    .line 276
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sin(D)D

    .line 277
    .line 278
    .line 279
    move-result-wide v28

    .line 280
    mul-double v26, v26, v28

    .line 281
    .line 282
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 283
    .line 284
    .line 285
    move-result-wide v28

    .line 286
    mul-double v11, v26, v28

    .line 287
    .line 288
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->cos(D)D

    .line 289
    .line 290
    .line 291
    move-result-wide v24

    .line 292
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sin(D)D

    .line 297
    .line 298
    .line 299
    move-result-wide v26

    .line 300
    mul-double v2, v2, v26

    .line 301
    .line 302
    sub-double v2, v24, v2

    .line 303
    .line 304
    invoke-static {v11, v12, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 305
    .line 306
    .line 307
    move-result-wide v2

    .line 308
    add-double v20, v20, v2

    .line 309
    .line 310
    mul-double v22, v22, v18

    .line 311
    .line 312
    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    div-double v11, v22, v2

    .line 318
    .line 319
    invoke-virtual {v10, v11, v12}, Lorg/osmdroid/util/GeoPoint;->setLatitude(D)V

    .line 320
    .line 321
    .line 322
    mul-double v20, v20, v18

    .line 323
    .line 324
    div-double v2, v20, v2

    .line 325
    .line 326
    invoke-virtual {v10, v2, v3}, Lorg/osmdroid/util/GeoPoint;->setLongitude(D)V

    .line 327
    .line 328
    .line 329
    new-instance v2, Landroid/graphics/Point;

    .line 330
    .line 331
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 336
    .line 337
    .line 338
    move-result-wide v11

    .line 339
    invoke-virtual {v3, v11, v12, v0}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 348
    .line 349
    .line 350
    move-result-wide v12

    .line 351
    invoke-virtual {v11, v12, v13, v0}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    invoke-direct {v2, v3, v11}, Landroid/graphics/Point;-><init>(II)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v6}, Landroid/graphics/Point;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-nez v3, :cond_9

    .line 363
    .line 364
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 365
    .line 366
    if-ltz v3, :cond_5

    .line 367
    .line 368
    const/4 v6, 0x0

    .line 369
    goto :goto_3

    .line 370
    :cond_5
    neg-int v6, v3

    .line 371
    :goto_3
    iget v11, v2, Landroid/graphics/Point;->y:I

    .line 372
    .line 373
    if-ltz v11, :cond_6

    .line 374
    .line 375
    const/4 v11, 0x0

    .line 376
    goto :goto_4

    .line 377
    :cond_6
    neg-int v11, v11

    .line 378
    :goto_4
    add-int/2addr v3, v6

    .line 379
    :goto_5
    iget v12, v2, Landroid/graphics/Point;->x:I

    .line 380
    .line 381
    const/4 v13, 0x1

    .line 382
    add-int/2addr v12, v13

    .line 383
    add-int/2addr v12, v6

    .line 384
    if-gt v3, v12, :cond_8

    .line 385
    .line 386
    iget v12, v2, Landroid/graphics/Point;->y:I

    .line 387
    .line 388
    add-int/2addr v12, v11

    .line 389
    move-object/from16 v18, v4

    .line 390
    .line 391
    :goto_6
    iget v4, v2, Landroid/graphics/Point;->y:I

    .line 392
    .line 393
    add-int/2addr v4, v13

    .line 394
    add-int/2addr v4, v11

    .line 395
    if-gt v12, v4, :cond_7

    .line 396
    .line 397
    move/from16 v4, v17

    .line 398
    .line 399
    invoke-static {v12, v4}, Lorg/osmdroid/util/MyMath;->mod(II)I

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    move-object/from16 v17, v2

    .line 404
    .line 405
    invoke-static {v3, v4}, Lorg/osmdroid/util/MyMath;->mod(II)I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    invoke-static {v0, v2, v13}, Lorg/osmdroid/util/MapTileIndex;->getTileIndex(III)J

    .line 410
    .line 411
    .line 412
    move-result-wide v19

    .line 413
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    add-int/lit8 v12, v12, 0x1

    .line 421
    .line 422
    move-object/from16 v2, v17

    .line 423
    .line 424
    const/4 v13, 0x1

    .line 425
    move/from16 v17, v4

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_7
    move/from16 v4, v17

    .line 429
    .line 430
    move-object/from16 v17, v2

    .line 431
    .line 432
    add-int/lit8 v3, v3, 0x1

    .line 433
    .line 434
    move/from16 v17, v4

    .line 435
    .line 436
    move-object/from16 v4, v18

    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_8
    move-object/from16 v18, v4

    .line 440
    .line 441
    move/from16 v4, v17

    .line 442
    .line 443
    move-object/from16 v17, v2

    .line 444
    .line 445
    move-object/from16 v6, v17

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_9
    move-object/from16 v18, v4

    .line 449
    .line 450
    move/from16 v4, v17

    .line 451
    .line 452
    :goto_7
    move/from16 v17, v4

    .line 453
    .line 454
    move-object/from16 v4, v18

    .line 455
    .line 456
    goto/16 :goto_2

    .line 457
    .line 458
    :cond_a
    move-object/from16 v18, v4

    .line 459
    .line 460
    move/from16 v4, v17

    .line 461
    .line 462
    const/4 v8, 0x1

    .line 463
    goto :goto_c

    .line 464
    :cond_b
    move-object/from16 v18, v4

    .line 465
    .line 466
    move v4, v3

    .line 467
    move v8, v2

    .line 468
    goto :goto_c

    .line 469
    :cond_c
    move-object/from16 v18, v4

    .line 470
    .line 471
    move v4, v3

    .line 472
    new-instance v2, Landroid/graphics/Point;

    .line 473
    .line 474
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 479
    .line 480
    .line 481
    move-result-wide v5

    .line 482
    invoke-virtual {v3, v5, v6, v0}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 491
    .line 492
    .line 493
    move-result-wide v8

    .line 494
    invoke-virtual {v5, v8, v9, v0}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    invoke-direct {v2, v3, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 499
    .line 500
    .line 501
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 502
    .line 503
    if-ltz v3, :cond_d

    .line 504
    .line 505
    const/4 v5, 0x0

    .line 506
    goto :goto_8

    .line 507
    :cond_d
    neg-int v5, v3

    .line 508
    :goto_8
    iget v6, v2, Landroid/graphics/Point;->y:I

    .line 509
    .line 510
    if-ltz v6, :cond_e

    .line 511
    .line 512
    const/4 v11, 0x0

    .line 513
    goto :goto_9

    .line 514
    :cond_e
    neg-int v11, v6

    .line 515
    :goto_9
    add-int/2addr v3, v5

    .line 516
    :goto_a
    iget v6, v2, Landroid/graphics/Point;->x:I

    .line 517
    .line 518
    const/4 v8, 0x1

    .line 519
    add-int/2addr v6, v8

    .line 520
    add-int/2addr v6, v5

    .line 521
    if-gt v3, v6, :cond_10

    .line 522
    .line 523
    iget v6, v2, Landroid/graphics/Point;->y:I

    .line 524
    .line 525
    add-int/2addr v6, v11

    .line 526
    :goto_b
    iget v9, v2, Landroid/graphics/Point;->y:I

    .line 527
    .line 528
    add-int/2addr v9, v8

    .line 529
    add-int/2addr v9, v11

    .line 530
    if-gt v6, v9, :cond_f

    .line 531
    .line 532
    invoke-static {v6, v4}, Lorg/osmdroid/util/MyMath;->mod(II)I

    .line 533
    .line 534
    .line 535
    move-result v9

    .line 536
    invoke-static {v3, v4}, Lorg/osmdroid/util/MyMath;->mod(II)I

    .line 537
    .line 538
    .line 539
    move-result v10

    .line 540
    invoke-static {v0, v10, v9}, Lorg/osmdroid/util/MapTileIndex;->getTileIndex(III)J

    .line 541
    .line 542
    .line 543
    move-result-wide v9

    .line 544
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-interface {v1, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    add-int/lit8 v6, v6, 0x1

    .line 552
    .line 553
    goto :goto_b

    .line 554
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 555
    .line 556
    goto :goto_a

    .line 557
    :cond_10
    move-object v6, v2

    .line 558
    :goto_c
    move v3, v4

    .line 559
    move-object v5, v7

    .line 560
    move v2, v8

    .line 561
    move-object/from16 v4, v18

    .line 562
    .line 563
    goto/16 :goto_0

    .line 564
    .line 565
    :cond_11
    return-object v1
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
.end method

.method public static E(Lorg/osmdroid/util/BoundingBox;I)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/util/BoundingBox;",
            "I)",
            "Ljava/util/Collection<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->H(Lorg/osmdroid/util/BoundingBox;II)Lorg/osmdroid/util/IterableWithSize;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Long;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object v0
    .line 31
    .line 32
    .line 33
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
    .line 86
    .line 87
    .line 88
.end method

.method public static F(Ljava/util/ArrayList;II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;II)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-gt p1, p2, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->D(Ljava/util/ArrayList;I)Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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

.method public static G(Lorg/osmdroid/util/BoundingBox;II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/util/BoundingBox;",
            "II)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-gt p1, p2, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->E(Lorg/osmdroid/util/BoundingBox;I)Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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

.method static H(Lorg/osmdroid/util/BoundingBox;II)Lorg/osmdroid/util/IterableWithSize;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/util/BoundingBox;",
            "II)",
            "Lorg/osmdroid/util/IterableWithSize<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/osmdroid/util/MapTileAreaList;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/osmdroid/util/MapTileAreaList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-gt p1, p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lorg/osmdroid/util/MapTileArea;

    .line 13
    .line 14
    invoke-direct {v2}, Lorg/osmdroid/util/MapTileArea;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->I(Lorg/osmdroid/util/BoundingBox;I)Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v2, p1, v3}, Lorg/osmdroid/util/MapTileArea;->set(ILandroid/graphics/Rect;)Lorg/osmdroid/util/MapTileArea;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
    .line 32
    .line 33
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

.method public static I(Lorg/osmdroid/util/BoundingBox;I)Landroid/graphics/Rect;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    shl-int v1, v0, p1

    .line 3
    .line 4
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    invoke-virtual {v2, v3, v4, p1}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-virtual {v3, v4, v5, p1}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    invoke-virtual {v4, v5, v6, p1}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    invoke-virtual {v5, v6, v7, p1}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    sub-int/2addr v2, v4

    .line 53
    add-int/2addr v2, v0

    .line 54
    if-gtz v2, :cond_0

    .line 55
    .line 56
    add-int/2addr v2, v1

    .line 57
    :cond_0
    sub-int/2addr v3, p0

    .line 58
    add-int/2addr v3, v0

    .line 59
    if-gtz v3, :cond_1

    .line 60
    .line 61
    add-int/2addr v3, v1

    .line 62
    :cond_1
    new-instance p1, Landroid/graphics/Rect;

    .line 63
    .line 64
    add-int/2addr v2, v4

    .line 65
    sub-int/2addr v2, v0

    .line 66
    add-int/2addr v3, p0

    .line 67
    sub-int/2addr v3, v0

    .line 68
    invoke-direct {p1, v4, p0, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 69
    .line 70
    .line 71
    return-object p1
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
.end method

.method static synthetic a(Lorg/osmdroid/tileprovider/cachemanager/a;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/osmdroid/tileprovider/cachemanager/a;->j(J)Z

    move-result p0

    return p0
.end method

.method private j(J)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/tileprovider/cachemanager/a;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    iget-object v1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->b:Lorg/osmdroid/tileprovider/tilesource/e;

    invoke-interface {v0, v1, p1, p2}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->remove(Lorg/osmdroid/tileprovider/tilesource/e;J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static x(III)Lorg/osmdroid/util/GeoPoint;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getLatitudeFromTileY(II)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p0, p2}, Lorg/osmdroid/util/TileSystem;->getLongitudeFromTileX(II)D

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    new-instance p2, Lorg/osmdroid/util/GeoPoint;

    .line 18
    .line 19
    invoke-direct {p2, v0, v1, p0, p1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 20
    .line 21
    .line 22
    return-object p2
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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


# virtual methods
.method public C()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->g:Z

    return v0
.end method

.method public K(Lorg/osmdroid/tileprovider/tilesource/e;J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->getExpirationTimestamp(Lorg/osmdroid/tileprovider/tilesource/e;J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return p2

    .line 11
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-lez p1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p2, 0x0

    .line 25
    :goto_0
    return p2
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
    .line 86
    .line 87
    .line 88
.end method

.method public L(Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;J)Z
    .locals 2

    .line 1
    invoke-static {p1, p2, p3}, Lorg/osmdroid/tileprovider/cachemanager/a;->A(Lorg/osmdroid/tileprovider/tilesource/e;J)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->exists(Lorg/osmdroid/tileprovider/tilesource/e;J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/osmdroid/tileprovider/cachemanager/a;->u(Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;J)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
    .line 86
    .line 87
    .line 88
.end method

.method public M(Ljava/util/ArrayList;II)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;II)I"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lorg/osmdroid/tileprovider/cachemanager/a;->F(Ljava/util/ArrayList;II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public N(Lorg/osmdroid/util/BoundingBox;II)I
    .locals 0

    invoke-static {p1, p2, p3}, Lorg/osmdroid/tileprovider/cachemanager/a;->H(Lorg/osmdroid/util/BoundingBox;II)Lorg/osmdroid/util/IterableWithSize;

    move-result-object p1

    invoke-interface {p1}, Lorg/osmdroid/util/IterableWithSize;->size()I

    move-result p1

    return p1
.end method

.method public O(Lorg/osmdroid/tileprovider/modules/TileDownloader;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->a:Lorg/osmdroid/tileprovider/modules/TileDownloader;

    return-void
.end method

.method public P(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->g:Z

    return-void
.end method

.method public b()J
    .locals 2

    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->f:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->f:Ljava/util/Set;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public d(J)Z
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    iget-object v1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->b:Lorg/osmdroid/tileprovider/tilesource/e;

    invoke-interface {v0, v1, p1, p2}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->exists(Lorg/osmdroid/tileprovider/tilesource/e;J)Z

    move-result p1

    return p1
.end method

.method public e(Landroid/content/Context;Ljava/util/ArrayList;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;II)",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2, p3}, Lorg/osmdroid/tileprovider/cachemanager/a;->t(Ljava/util/ArrayList;I)Lorg/osmdroid/util/BoundingBox;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/osmdroid/tileprovider/cachemanager/a;->g(Landroid/content/Context;Lorg/osmdroid/util/BoundingBox;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public f(Landroid/content/Context;Ljava/util/List;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;II)",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;"
        }
    .end annotation

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/cachemanager/a;->v()Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Ljava/util/List;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->w(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public g(Landroid/content/Context;Lorg/osmdroid/util/BoundingBox;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/cachemanager/a;->v()Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Lorg/osmdroid/util/BoundingBox;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->w(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public h()J
    .locals 2

    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->f()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/osmdroid/tileprovider/cachemanager/a;->k(Ljava/io/File;)J

    move-result-wide v0

    return-wide v0
.end method

.method public i(J)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/tileprovider/cachemanager/a;->d(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    iget-object v1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->b:Lorg/osmdroid/tileprovider/tilesource/e;

    invoke-interface {v0, v1, p1, p2}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->remove(Lorg/osmdroid/tileprovider/tilesource/e;J)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public k(Ljava/io/File;)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    array-length v2, p1

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_2

    .line 12
    .line 13
    aget-object v4, p1, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    :goto_1
    add-long/2addr v0, v4

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Lorg/osmdroid/tileprovider/cachemanager/a;->k(Ljava/io/File;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-wide v0
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
.end method

.method public l(Landroid/content/Context;Ljava/util/ArrayList;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;II)",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;"
        }
    .end annotation

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Ljava/util/ArrayList;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->z(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public m(Landroid/content/Context;Ljava/util/ArrayList;IILorg/osmdroid/tileprovider/cachemanager/a$f;)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;II",
            "Lorg/osmdroid/tileprovider/cachemanager/a$f;",
            ")",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;"
        }
    .end annotation

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Ljava/util/ArrayList;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, p5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->z(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public n(Landroid/content/Context;Ljava/util/List;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;II)",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;"
        }
    .end annotation

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Ljava/util/List;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->z(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public o(Landroid/content/Context;Lorg/osmdroid/util/BoundingBox;II)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Lorg/osmdroid/util/BoundingBox;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->z(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public p(Landroid/content/Context;Lorg/osmdroid/util/BoundingBox;IILorg/osmdroid/tileprovider/cachemanager/a$f;)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Lorg/osmdroid/util/BoundingBox;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, p5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->z(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v6, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public q(Landroid/content/Context;Ljava/util/ArrayList;IILorg/osmdroid/tileprovider/cachemanager/a$f;)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;II",
            "Lorg/osmdroid/tileprovider/cachemanager/a$f;",
            ")",
            "Lorg/osmdroid/tileprovider/cachemanager/a$h;"
        }
    .end annotation

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Ljava/util/ArrayList;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, p5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public r(Landroid/content/Context;Lorg/osmdroid/util/BoundingBox;IILorg/osmdroid/tileprovider/cachemanager/a$f;)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 7

    .line 1
    new-instance v6, Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Lorg/osmdroid/tileprovider/cachemanager/a$e;Lorg/osmdroid/util/BoundingBox;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, p5}, Lorg/osmdroid/tileprovider/cachemanager/a$h;->b(Lorg/osmdroid/tileprovider/cachemanager/a$f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v6}, Lorg/osmdroid/tileprovider/cachemanager/a;->s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    .line 19
    .line 20
    .line 21
    return-object v6
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public s(Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->f:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p1
    .line 13
    .line 14
    .line 15
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public t(Ljava/util/ArrayList;I)Lorg/osmdroid/util/BoundingBox;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;I)",
            "Lorg/osmdroid/util/BoundingBox;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lorg/osmdroid/util/BoundingBox;->fromGeoPoints(Ljava/util/List;)Lorg/osmdroid/util/BoundingBox;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2, p2}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-virtual {v1, v2, v3, p2}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-virtual {v2, v3, v4, p2}, Lorg/osmdroid/util/TileSystem;->getTileXFromLongitude(DI)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    invoke-virtual {v3, v4, v5, p2}, Lorg/osmdroid/util/TileSystem;->getTileYFromLatitude(DI)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    new-instance v12, Lorg/osmdroid/util/BoundingBox;

    .line 54
    .line 55
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    add-int/lit8 p1, p1, -0x1

    .line 60
    .line 61
    invoke-virtual {v3, p1, p2}, Lorg/osmdroid/util/TileSystem;->getLatitudeFromTileY(II)D

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    invoke-virtual {p1, v0, p2}, Lorg/osmdroid/util/TileSystem;->getLongitudeFromTileX(II)D

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    invoke-virtual {p1, v1, p2}, Lorg/osmdroid/util/TileSystem;->getLatitudeFromTileY(II)D

    .line 82
    .line 83
    .line 84
    move-result-wide v8

    .line 85
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    add-int/lit8 v2, v2, -0x1

    .line 90
    .line 91
    invoke-virtual {p1, v2, p2}, Lorg/osmdroid/util/TileSystem;->getLongitudeFromTileX(II)D

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    move-object v3, v12

    .line 96
    invoke-direct/range {v3 .. v11}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 97
    .line 98
    .line 99
    return-object v12
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
.end method

.method public u(Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;J)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->a:Lorg/osmdroid/tileprovider/modules/TileDownloader;

    iget-object v2, p0, Lorg/osmdroid/tileprovider/cachemanager/a;->c:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    invoke-virtual {v1, p2, p3, v2, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader;->downloadTile(JLorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catch Lorg/osmdroid/tileprovider/modules/CantContinueException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method public v()Lorg/osmdroid/tileprovider/cachemanager/a$e;
    .locals 1

    new-instance v0, Lorg/osmdroid/tileprovider/cachemanager/a$d;

    invoke-direct {v0, p0}, Lorg/osmdroid/tileprovider/cachemanager/a$d;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;)V

    return-object v0
.end method

.method public w(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;
    .locals 1

    new-instance v0, Lorg/osmdroid/tileprovider/cachemanager/a$b;

    invoke-direct {v0, p0, p1, p2, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$b;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;Landroid/content/Context;)V

    return-object v0
.end method

.method public y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;
    .locals 1

    new-instance v0, Lorg/osmdroid/tileprovider/cachemanager/a$c;

    invoke-direct {v0, p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$c;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Landroid/content/Context;)V

    return-object v0
.end method

.method public z(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;
    .locals 1

    new-instance v0, Lorg/osmdroid/tileprovider/cachemanager/a$a;

    invoke-direct {v0, p0, p1, p2, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$a;-><init>(Lorg/osmdroid/tileprovider/cachemanager/a;Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;Landroid/content/Context;)V

    return-object v0
.end method
