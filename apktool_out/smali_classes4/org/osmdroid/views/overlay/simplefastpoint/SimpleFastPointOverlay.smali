.class public Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;,
        Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;,
        Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$b;
    }
.end annotation


# instance fields
.field private final a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

.field private final b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

.field private final c:Lorg/osmdroid/util/BoundingBox;

.field private d:Ljava/lang/Integer;

.field private e:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$b;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;",
            ">;"
        }
    .end annotation
.end field

.field private g:[[Z

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Z

.field private m:I

.field private n:Lorg/osmdroid/util/BoundingBox;

.field private o:Lorg/osmdroid/views/Projection;

.field private p:Lorg/osmdroid/util/BoundingBox;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;)V
    .locals 1

    .line 13
    invoke-static {}, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d()Lorg/osmdroid/views/overlay/simplefastpoint/a;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;-><init>(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;Lorg/osmdroid/views/overlay/simplefastpoint/a;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;Lorg/osmdroid/views/overlay/simplefastpoint/a;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->l:Z

    .line 3
    new-instance v0, Lorg/osmdroid/util/BoundingBox;

    invoke-direct {v0}, Lorg/osmdroid/util/BoundingBox;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->p:Lorg/osmdroid/util/BoundingBox;

    .line 4
    iput-object p2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 5
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move-object v0, p2

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/osmdroid/api/IGeoPoint;

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 7
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-lez v5, :cond_3

    :cond_2
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_3
    if-eqz v3, :cond_4

    .line 8
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpg-double v5, v5, v7

    if-gez v5, :cond_5

    :cond_4
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    :cond_5
    if-eqz v1, :cond_6

    .line 9
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-lez v5, :cond_7

    :cond_6
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :cond_7
    if-eqz v2, :cond_8

    .line 10
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpg-double v5, v5, v7

    if-gez v5, :cond_0

    :cond_8
    invoke-interface {v4}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_0

    :cond_9
    if-eqz v0, :cond_a

    .line 11
    new-instance p1, Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    move-object v4, p1

    invoke-direct/range {v4 .. v12}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->c:Lorg/osmdroid/util/BoundingBox;

    goto :goto_1

    .line 12
    :cond_a
    iput-object p2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->c:Lorg/osmdroid/util/BoundingBox;

    :goto_1
    return-void
.end method

.method private c(Lorg/osmdroid/views/MapView;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->o:Lorg/osmdroid/views/Projection;

    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iget-object v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->p:Lorg/osmdroid/util/BoundingBox;

    .line 18
    .line 19
    invoke-virtual {v3}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    cmpl-double v1, v1, v3

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    iget-object v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->p:Lorg/osmdroid/util/BoundingBox;

    .line 32
    .line 33
    invoke-virtual {v3}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    cmpl-double v1, v1, v3

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->p:Lorg/osmdroid/util/BoundingBox;

    .line 46
    .line 47
    invoke-virtual {v3}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    cmpl-double v1, v1, v3

    .line 52
    .line 53
    if-nez v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    iget-object v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->p:Lorg/osmdroid/util/BoundingBox;

    .line 60
    .line 61
    invoke-virtual {v3}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    cmpl-double v1, v1, v3

    .line 66
    .line 67
    if-eqz v1, :cond_a

    .line 68
    .line 69
    :cond_0
    new-instance v1, Lorg/osmdroid/util/BoundingBox;

    .line 70
    .line 71
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 84
    .line 85
    .line 86
    move-result-wide v9

    .line 87
    move-object v2, v1

    .line 88
    invoke-direct/range {v2 .. v10}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->p:Lorg/osmdroid/util/BoundingBox;

    .line 92
    .line 93
    iget-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    iget v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->k:I

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-ne v1, v3, :cond_2

    .line 105
    .line 106
    iget v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->j:I

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eq v1, v3, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    iget-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    .line 116
    .line 117
    array-length v3, v1

    .line 118
    move v4, v2

    .line 119
    :goto_0
    if-ge v4, v3, :cond_3

    .line 120
    .line 121
    aget-object v5, v1, v4

    .line 122
    .line 123
    invoke-static {v5, v2}, Ljava/util/Arrays;->fill([ZZ)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->j(Lorg/osmdroid/views/MapView;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    new-instance v1, Landroid/graphics/Point;

    .line 133
    .line 134
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v3, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->f:Ljava/util/List;

    .line 147
    .line 148
    iput v2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->m:I

    .line 149
    .line 150
    iget-object v2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_a

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lorg/osmdroid/api/IGeoPoint;

    .line 167
    .line 168
    if-nez v3, :cond_5

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    invoke-interface {v3}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 176
    .line 177
    .line 178
    move-result-wide v6

    .line 179
    cmpl-double v4, v4, v6

    .line 180
    .line 181
    if-lez v4, :cond_4

    .line 182
    .line 183
    invoke-interface {v3}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 184
    .line 185
    .line 186
    move-result-wide v4

    .line 187
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    cmpg-double v4, v4, v6

    .line 192
    .line 193
    if-gez v4, :cond_4

    .line 194
    .line 195
    invoke-interface {v3}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 196
    .line 197
    .line 198
    move-result-wide v4

    .line 199
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    cmpl-double v4, v4, v6

    .line 204
    .line 205
    if-lez v4, :cond_4

    .line 206
    .line 207
    invoke-interface {v3}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 208
    .line 209
    .line 210
    move-result-wide v4

    .line 211
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    cmpg-double v4, v4, v6

    .line 216
    .line 217
    if-gez v4, :cond_4

    .line 218
    .line 219
    invoke-virtual {p1, v3, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 220
    .line 221
    .line 222
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 223
    .line 224
    int-to-float v4, v4

    .line 225
    iget-object v5, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 226
    .line 227
    iget v5, v5, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    .line 228
    .line 229
    int-to-float v5, v5

    .line 230
    div-float/2addr v4, v5

    .line 231
    float-to-double v4, v4

    .line 232
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 233
    .line 234
    .line 235
    move-result-wide v4

    .line 236
    double-to-int v4, v4

    .line 237
    iget v5, v1, Landroid/graphics/Point;->y:I

    .line 238
    .line 239
    int-to-float v5, v5

    .line 240
    iget-object v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 241
    .line 242
    iget v6, v6, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    .line 243
    .line 244
    int-to-float v6, v6

    .line 245
    div-float/2addr v5, v6

    .line 246
    float-to-double v5, v5

    .line 247
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 248
    .line 249
    .line 250
    move-result-wide v5

    .line 251
    double-to-int v5, v5

    .line 252
    iget v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->h:I

    .line 253
    .line 254
    if-ge v4, v6, :cond_4

    .line 255
    .line 256
    iget v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->i:I

    .line 257
    .line 258
    if-ge v5, v6, :cond_4

    .line 259
    .line 260
    if-ltz v4, :cond_4

    .line 261
    .line 262
    if-ltz v5, :cond_4

    .line 263
    .line 264
    iget-object v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    .line 265
    .line 266
    aget-object v4, v6, v4

    .line 267
    .line 268
    aget-boolean v6, v4, v5

    .line 269
    .line 270
    if-eqz v6, :cond_6

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_6
    const/4 v11, 0x1

    .line 274
    aput-boolean v11, v4, v5

    .line 275
    .line 276
    iget-object v4, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->f:Ljava/util/List;

    .line 277
    .line 278
    new-instance v12, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;

    .line 279
    .line 280
    iget-object v5, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 281
    .line 282
    invoke-interface {v5}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->d()Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    const/4 v6, 0x0

    .line 287
    if-eqz v5, :cond_7

    .line 288
    .line 289
    move-object v5, v3

    .line 290
    check-cast v5, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;

    .line 291
    .line 292
    invoke-virtual {v5}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->getLabel()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    move-object v8, v5

    .line 297
    goto :goto_3

    .line 298
    :cond_7
    move-object v8, v6

    .line 299
    :goto_3
    iget-object v5, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 300
    .line 301
    invoke-interface {v5}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-eqz v5, :cond_8

    .line 306
    .line 307
    move-object v5, v3

    .line 308
    check-cast v5, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;

    .line 309
    .line 310
    invoke-virtual {v5}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getPointStyle()Landroid/graphics/Paint;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    move-object v9, v5

    .line 315
    goto :goto_4

    .line 316
    :cond_8
    move-object v9, v6

    .line 317
    :goto_4
    iget-object v5, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 318
    .line 319
    invoke-interface {v5}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-eqz v5, :cond_9

    .line 324
    .line 325
    check-cast v3, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;

    .line 326
    .line 327
    invoke-virtual {v3}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getTextStyle()Landroid/graphics/Paint;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    move-object v10, v3

    .line 332
    goto :goto_5

    .line 333
    :cond_9
    move-object v10, v6

    .line 334
    :goto_5
    move-object v5, v12

    .line 335
    move-object v6, p0

    .line 336
    move-object v7, v1

    .line 337
    invoke-direct/range {v5 .. v10}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;-><init>(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;Landroid/graphics/Point;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Paint;)V

    .line 338
    .line 339
    .line 340
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    iget v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->m:I

    .line 344
    .line 345
    add-int/2addr v3, v11

    .line 346
    iput v3, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->m:I

    .line 347
    .line 348
    goto/16 :goto_2

    .line 349
    .line 350
    :cond_a
    return-void
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

.method private j(Lorg/osmdroid/views/MapView;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->j:I

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->k:I

    .line 12
    .line 13
    iget p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->j:I

    .line 14
    .line 15
    int-to-float p1, p1

    .line 16
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 17
    .line 18
    iget v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    .line 19
    .line 20
    int-to-float v0, v0

    .line 21
    div-float/2addr p1, v0

    .line 22
    float-to-double v0, p1

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    double-to-int p1, v0

    .line 28
    const/4 v0, 0x1

    .line 29
    add-int/2addr p1, v0

    .line 30
    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->h:I

    .line 31
    .line 32
    iget p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->k:I

    .line 33
    .line 34
    int-to-float p1, p1

    .line 35
    iget-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 36
    .line 37
    iget v1, v1, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    .line 38
    .line 39
    int-to-float v1, v1

    .line 40
    div-float/2addr p1, v1

    .line 41
    float-to-double v1, p1

    .line 42
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    double-to-int p1, v1

    .line 47
    add-int/2addr p1, v0

    .line 48
    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->i:I

    .line 49
    .line 50
    iget v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->h:I

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    new-array v2, v2, [I

    .line 54
    .line 55
    aput p1, v2, v0

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    aput v1, v2, p1

    .line 59
    .line 60
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, [[Z

    .line 67
    .line 68
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    .line 69
    .line 70
    return-void
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


# virtual methods
.method protected d(Landroid/graphics/Canvas;FFZLjava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Paint;Lorg/osmdroid/views/MapView;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 5
    .line 6
    .line 7
    move-result p8

    .line 8
    neg-float p8, p8

    .line 9
    invoke-virtual {p1, p8, p2, p3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 10
    .line 11
    .line 12
    iget-object p8, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 13
    .line 14
    iget-object v0, p8, Lorg/osmdroid/views/overlay/simplefastpoint/a;->i:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    .line 15
    .line 16
    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$c;->CIRCLE:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget p8, p8, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d:F

    .line 21
    .line 22
    invoke-virtual {p1, p2, p3, p8, p6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget p8, p8, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d:F

    .line 27
    .line 28
    sub-float v1, p2, p8

    .line 29
    .line 30
    sub-float v2, p3, p8

    .line 31
    .line 32
    add-float v3, p2, p8

    .line 33
    .line 34
    add-float v4, p3, p8

    .line 35
    .line 36
    move-object v0, p1

    .line 37
    move-object v5, p6

    .line 38
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    if-eqz p4, :cond_1

    .line 42
    .line 43
    if-eqz p5, :cond_1

    .line 44
    .line 45
    iget-object p4, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 46
    .line 47
    iget p4, p4, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d:F

    .line 48
    .line 49
    sub-float/2addr p3, p4

    .line 50
    const/high16 p4, 0x40a00000    # 5.0f

    .line 51
    .line 52
    sub-float/2addr p3, p4

    .line 53
    invoke-virtual {p1, p5, p2, p3, p7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 57
    .line 58
    .line 59
    return-void
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
.end method

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V
    .locals 20

    move-object/from16 v9, p0

    move-object/from16 v10, p2

    if-eqz p3, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v11, Landroid/graphics/Point;

    invoke-direct {v11}, Landroid/graphics/Point;-><init>()V

    .line 2
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v12

    .line 3
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    if-nez v0, :cond_1

    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 4
    :cond_1
    sget-object v0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$a;->a:[I

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v1, v1, Lorg/osmdroid/views/overlay/simplefastpoint/a;->h:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v0, v15, :cond_16

    const/4 v1, 0x2

    if-eq v0, v1, :cond_a

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto/16 :goto_13

    .line 5
    :cond_2
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$a;->ZOOM_THRESHOLD:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    if-ne v0, v1, :cond_3

    .line 6
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    iget-object v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget v2, v2, Lorg/osmdroid/views/overlay/simplefastpoint/a;->l:I

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    move/from16 v16, v15

    goto :goto_0

    :cond_3
    move/from16 v16, v14

    .line 7
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v17

    .line 8
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :cond_4
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/osmdroid/api/IGeoPoint;

    if-nez v0, :cond_5

    goto :goto_1

    .line 9
    :cond_5
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    move-result-wide v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_4

    .line 10
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v3

    cmpg-double v1, v1, v3

    if-gez v1, :cond_4

    .line 11
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_4

    .line 12
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v3

    cmpg-double v1, v1, v3

    if-gez v1, :cond_4

    .line 13
    invoke-virtual {v12, v0, v11}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 14
    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v2, v1

    iget v1, v11, Landroid/graphics/Point;->y:I

    int-to-float v3, v1

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v16, :cond_6

    move v4, v15

    goto :goto_2

    :cond_6
    move v4, v14

    .line 15
    :goto_2
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->d()Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;

    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->getLabel()Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_3

    :cond_7
    move-object v5, v13

    .line 16
    :goto_3
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v1

    if-eqz v1, :cond_8

    move-object v1, v0

    check-cast v1, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;

    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getPointStyle()Landroid/graphics/Paint;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 17
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getPointStyle()Landroid/graphics/Paint;

    move-result-object v1

    goto :goto_4

    :cond_8
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v1, v1, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    :goto_4
    move-object v6, v1

    .line 18
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    check-cast v0, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getTextStyle()Landroid/graphics/Paint;

    move-result-object v0

    if-eqz v0, :cond_9

    goto :goto_5

    .line 19
    :cond_9
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    :goto_5
    move-object v7, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    .line 20
    invoke-virtual/range {v0 .. v8}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d(Landroid/graphics/Canvas;FFZLjava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Paint;Lorg/osmdroid/views/MapView;)V

    goto/16 :goto_1

    .line 21
    :cond_a
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    if-eqz v0, :cond_c

    iget v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->k:I

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_c

    iget v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->j:I

    .line 22
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getWidth()I

    move-result v1

    if-eq v0, v1, :cond_b

    goto :goto_7

    .line 23
    :cond_b
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    array-length v1, v0

    move v2, v14

    :goto_6
    if-ge v2, v1, :cond_d

    aget-object v3, v0, v2

    .line 24
    invoke-static {v3, v14}, Ljava/util/Arrays;->fill([ZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 25
    :cond_c
    :goto_7
    invoke-direct {v9, v10}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->j(Lorg/osmdroid/views/MapView;)V

    .line 26
    :cond_d
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$a;->ZOOM_THRESHOLD:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    if-ne v0, v1, :cond_e

    .line 27
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    iget-object v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget v2, v2, Lorg/osmdroid/views/overlay/simplefastpoint/a;->l:I

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_e

    move/from16 v16, v15

    goto :goto_8

    :cond_e
    move/from16 v16, v14

    .line 28
    :goto_8
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v17

    .line 29
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :cond_f
    :goto_9
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/osmdroid/api/IGeoPoint;

    if-nez v0, :cond_10

    goto :goto_9

    .line 30
    :cond_10
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    move-result-wide v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_f

    .line 31
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v3

    cmpg-double v1, v1, v3

    if-gez v1, :cond_f

    .line 32
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_f

    .line 33
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {v17 .. v17}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v3

    cmpg-double v1, v1, v3

    if-gez v1, :cond_f

    .line 34
    invoke-virtual {v12, v0, v11}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 35
    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget v2, v2, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    .line 36
    iget v2, v11, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget v3, v3, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 37
    iget v3, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->h:I

    if-ge v1, v3, :cond_f

    iget v3, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->i:I

    if-ge v2, v3, :cond_f

    if-ltz v1, :cond_f

    if-ltz v2, :cond_f

    iget-object v3, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    aget-object v1, v3, v1

    aget-boolean v3, v1, v2

    if-eqz v3, :cond_11

    goto :goto_9

    .line 38
    :cond_11
    aput-boolean v15, v1, v2

    .line 39
    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v2, v1

    iget v1, v11, Landroid/graphics/Point;->y:I

    int-to-float v3, v1

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->d()Z

    move-result v1

    if-eqz v1, :cond_12

    if-eqz v16, :cond_12

    move v4, v15

    goto :goto_a

    :cond_12
    move v4, v14

    .line 40
    :goto_a
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->d()Z

    move-result v1

    if-eqz v1, :cond_13

    move-object v1, v0

    check-cast v1, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;

    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->getLabel()Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_b

    :cond_13
    move-object v5, v13

    .line 41
    :goto_b
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v1

    if-eqz v1, :cond_14

    move-object v1, v0

    check-cast v1, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;

    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getPointStyle()Landroid/graphics/Paint;

    move-result-object v6

    if-eqz v6, :cond_14

    .line 42
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getPointStyle()Landroid/graphics/Paint;

    move-result-object v1

    goto :goto_c

    :cond_14
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v1, v1, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    :goto_c
    move-object v6, v1

    .line 43
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v1

    if-eqz v1, :cond_15

    check-cast v0, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/StyledLabelledGeoPoint;->getTextStyle()Landroid/graphics/Paint;

    move-result-object v0

    if-eqz v0, :cond_15

    goto :goto_d

    .line 44
    :cond_15
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    :goto_d
    move-object v7, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    .line 45
    invoke-virtual/range {v0 .. v8}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d(Landroid/graphics/Canvas;FFZLjava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Paint;Lorg/osmdroid/views/MapView;)V

    goto/16 :goto_9

    .line 46
    :cond_16
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->g:[[Z

    if-eqz v0, :cond_17

    iget-boolean v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->l:Z

    if-nez v0, :cond_18

    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->isAnimating()Z

    move-result v0

    if-nez v0, :cond_18

    .line 47
    :cond_17
    invoke-direct {v9, v10}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->c(Lorg/osmdroid/views/MapView;)V

    .line 48
    :cond_18
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v1

    iget-object v3, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {v3}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 49
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    iget-object v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {v2}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    move-result-wide v2

    iget-object v4, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {v4}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 50
    invoke-virtual {v12, v0, v13}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v8

    .line 51
    invoke-virtual {v12, v1, v13}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v0

    .line 52
    iget-object v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->o:Lorg/osmdroid/views/Projection;

    invoke-virtual {v2, v1, v13}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v13

    .line 53
    new-instance v1, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget v3, v13, Landroid/graphics/Point;->x:I

    sub-int/2addr v2, v3

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v3, v13, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v3

    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 54
    new-instance v7, Landroid/graphics/Point;

    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v2, v8, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, v8, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v2

    invoke-direct {v7, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 55
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v1, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    sget-object v2, Lorg/osmdroid/views/overlay/simplefastpoint/a$a;->DENSITY_THRESHOLD:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    if-ne v1, v2, :cond_19

    iget v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->m:I

    iget v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->k:I

    if-le v2, v0, :cond_1a

    :cond_19
    sget-object v0, Lorg/osmdroid/views/overlay/simplefastpoint/a$a;->ZOOM_THRESHOLD:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    if-ne v1, v0, :cond_1b

    .line 56
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    iget-object v2, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget v2, v2, Lorg/osmdroid/views/overlay/simplefastpoint/a;->l:I

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1b

    :cond_1a
    move/from16 v16, v15

    goto :goto_e

    :cond_1b
    move/from16 v16, v14

    .line 57
    :goto_e
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_f
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;

    .line 58
    iget v1, v0, Landroid/graphics/Point;->x:I

    iget v2, v7, Landroid/graphics/Point;->x:I

    mul-int/2addr v2, v1

    iget v3, v13, Landroid/graphics/Point;->x:I

    div-int/2addr v2, v3

    int-to-float v2, v2

    .line 59
    iget v3, v0, Landroid/graphics/Point;->y:I

    iget v4, v7, Landroid/graphics/Point;->y:I

    mul-int/2addr v4, v3

    iget v5, v13, Landroid/graphics/Point;->y:I

    div-int/2addr v4, v5

    int-to-float v4, v4

    .line 60
    iget v5, v8, Landroid/graphics/Point;->x:I

    add-int/2addr v1, v5

    int-to-float v1, v1

    add-float/2addr v2, v1

    iget v1, v8, Landroid/graphics/Point;->y:I

    add-int/2addr v3, v1

    int-to-float v1, v3

    add-float v3, v1, v4

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 61
    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->d()Z

    move-result v1

    if-eqz v1, :cond_1c

    if-eqz v16, :cond_1c

    move v4, v15

    goto :goto_10

    :cond_1c
    move v4, v14

    :goto_10
    invoke-static {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;->a(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;)Ljava/lang/String;

    move-result-object v5

    .line 62
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-static {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;->b(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;)Landroid/graphics/Paint;

    move-result-object v1

    if-eqz v1, :cond_1d

    invoke-static {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;->b(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;)Landroid/graphics/Paint;

    move-result-object v1

    goto :goto_11

    :cond_1d
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v1, v1, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    :goto_11
    move-object v6, v1

    .line 63
    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->b()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;->d(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$StyledLabelledPoint;)Landroid/graphics/Paint;

    move-result-object v0

    if-eqz v0, :cond_1e

    goto :goto_12

    .line 64
    :cond_1e
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    :goto_12
    move-object/from16 v18, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v19, v7

    move-object/from16 v7, v18

    move-object/from16 v18, v8

    move-object/from16 v8, p2

    .line 65
    invoke-virtual/range {v0 .. v8}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d(Landroid/graphics/Canvas;FFZLjava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Paint;Lorg/osmdroid/views/MapView;)V

    move-object/from16 v8, v18

    move-object/from16 v7, v19

    goto :goto_f

    .line 66
    :cond_1f
    :goto_13
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->size()I

    move-result v1

    if-ge v0, v1, :cond_21

    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d:Ljava/lang/Integer;

    .line 67
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->get(I)Lorg/osmdroid/api/IGeoPoint;

    move-result-object v0

    if-eqz v0, :cond_21

    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    if-eqz v0, :cond_21

    .line 68
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    iget-object v1, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->get(I)Lorg/osmdroid/api/IGeoPoint;

    move-result-object v0

    invoke-virtual {v12, v0, v11}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 69
    iget-object v0, v9, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    iget-object v1, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->i:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    sget-object v2, Lorg/osmdroid/views/overlay/simplefastpoint/a$c;->CIRCLE:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    if-ne v1, v2, :cond_20

    .line 70
    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v11, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->e:F

    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_14

    :cond_20
    move-object/from16 v4, p1

    .line 71
    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v2, v1

    iget v3, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->e:F

    sub-float/2addr v2, v3

    iget v5, v11, Landroid/graphics/Point;->y:I

    int-to-float v6, v5

    sub-float v12, v6, v3

    int-to-float v1, v1

    add-float v13, v1, v3

    int-to-float v1, v5

    add-float v14, v1, v3

    iget-object v15, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    move-object/from16 v10, p1

    move v11, v2

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_21
    :goto_14
    return-void
.end method

.method public e()Lorg/osmdroid/util/BoundingBox;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->c:Lorg/osmdroid/util/BoundingBox;

    return-object v0
.end method

.method public f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public g()Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    return-object v0
.end method

.method public h(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$b;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->e:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$b;

    return-void
.end method

.method public i(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 14
    .line 15
    invoke-interface {v1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d:Ljava/lang/Integer;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->d:Ljava/lang/Integer;

    .line 27
    .line 28
    :goto_1
    return-void
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

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->f:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, -0x1

    .line 20
    move v5, v1

    .line 21
    :goto_0
    iget-object v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 22
    .line 23
    invoke-interface {v6}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-ge v5, v6, :cond_5

    .line 28
    .line 29
    iget-object v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 30
    .line 31
    invoke-interface {v6, v5}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->get(I)Lorg/osmdroid/api/IGeoPoint;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    if-nez v6, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v6, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 39
    .line 40
    invoke-interface {v6, v5}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;->get(I)Lorg/osmdroid/api/IGeoPoint;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v2, v6, v0}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget v7, v0, Landroid/graphics/Point;->x:I

    .line 52
    .line 53
    int-to-float v7, v7

    .line 54
    sub-float/2addr v6, v7

    .line 55
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/high16 v7, 0x42480000    # 50.0f

    .line 60
    .line 61
    cmpl-float v6, v6, v7

    .line 62
    .line 63
    if-gtz v6, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    iget v8, v0, Landroid/graphics/Point;->y:I

    .line 70
    .line 71
    int-to-float v8, v8

    .line 72
    sub-float/2addr v6, v8

    .line 73
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    cmpl-float v6, v6, v7

    .line 78
    .line 79
    if-lez v6, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    iget v7, v0, Landroid/graphics/Point;->x:I

    .line 87
    .line 88
    int-to-float v7, v7

    .line 89
    sub-float/2addr v6, v7

    .line 90
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    iget v8, v0, Landroid/graphics/Point;->x:I

    .line 95
    .line 96
    int-to-float v8, v8

    .line 97
    sub-float/2addr v7, v8

    .line 98
    mul-float/2addr v6, v7

    .line 99
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    iget v8, v0, Landroid/graphics/Point;->y:I

    .line 104
    .line 105
    int-to-float v8, v8

    .line 106
    sub-float/2addr v7, v8

    .line 107
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    iget v9, v0, Landroid/graphics/Point;->y:I

    .line 112
    .line 113
    int-to-float v9, v9

    .line 114
    sub-float/2addr v8, v9

    .line 115
    mul-float/2addr v7, v8

    .line 116
    add-float/2addr v6, v7

    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    cmpg-float v7, v6, v7

    .line 124
    .line 125
    if-gez v7, :cond_4

    .line 126
    .line 127
    :cond_3
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    move v4, v5

    .line 132
    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    if-nez v3, :cond_6

    .line 136
    .line 137
    return v1

    .line 138
    :cond_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->i(Ljava/lang/Integer;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->e:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$b;

    .line 149
    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    iget-object p2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->b:Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;

    .line 153
    .line 154
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-interface {p1, p2, v0}, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$b;->a(Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay$c;Ljava/lang/Integer;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    const/4 p1, 0x1

    .line 162
    return p1
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

.method public onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->a:Lorg/osmdroid/views/overlay/simplefastpoint/a;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->h:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    .line 4
    .line 5
    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$b;->MAXIMUM_OPTIMIZATION:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_3

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p1, v0, :cond_2

    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    if-eq p1, p2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->l:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iput-boolean v2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->l:Z

    .line 28
    .line 29
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    .line 34
    .line 35
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->o:Lorg/osmdroid/views/Projection;

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->n:Lorg/osmdroid/util/BoundingBox;

    .line 50
    .line 51
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/SimpleFastPointOverlay;->o:Lorg/osmdroid/views/Projection;

    .line 56
    .line 57
    :goto_0
    return v2
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
