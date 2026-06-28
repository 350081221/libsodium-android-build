.class Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;
.super Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/tileprovider/MapTileProviderBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ZoomOutTileLooper"
.end annotation


# static fields
.field private static final MAX_ZOOM_OUT_DIFF:I = 0x4


# instance fields
.field final synthetic this$0:Lorg/osmdroid/tileprovider/MapTileProviderBase;


# direct methods
.method private constructor <init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;->this$0:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Lorg/osmdroid/tileprovider/MapTileProviderBase$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Lorg/osmdroid/tileprovider/MapTileProviderBase$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;)V

    return-void
.end method


# virtual methods
.method protected computeTile(JII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mDiff:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    if-lt v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->getX(J)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mDiff:I

    .line 14
    .line 15
    shl-int/2addr v1, v2

    .line 16
    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->getY(J)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget v3, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mDiff:I

    .line 21
    .line 22
    shl-int/2addr v2, v3

    .line 23
    const/4 v4, 0x1

    .line 24
    shl-int v3, v4, v3

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    move v6, v4

    .line 29
    move-object v7, v5

    .line 30
    move-object v8, v7

    .line 31
    :goto_0
    if-ge v6, v3, :cond_4

    .line 32
    .line 33
    move v9, v4

    .line 34
    :goto_1
    if-ge v9, v3, :cond_3

    .line 35
    .line 36
    iget v10, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mOldTileZoomLevel:I

    .line 37
    .line 38
    add-int v11, v1, v6

    .line 39
    .line 40
    add-int v12, v2, v9

    .line 41
    .line 42
    invoke-static {v10, v11, v12}, Lorg/osmdroid/util/MapTileIndex;->getTileIndex(III)J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    iget-object v12, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;->this$0:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 47
    .line 48
    iget-object v12, v12, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    .line 49
    .line 50
    invoke-virtual {v12, v10, v11}, Lorg/osmdroid/tileprovider/MapTileCache;->getMapTile(J)Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    instance-of v11, v10, Landroid/graphics/drawable/BitmapDrawable;

    .line 55
    .line 56
    if-eqz v11, :cond_2

    .line 57
    .line 58
    check-cast v10, Landroid/graphics/drawable/BitmapDrawable;

    .line 59
    .line 60
    invoke-virtual {v10}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    if-eqz v10, :cond_2

    .line 65
    .line 66
    if-nez v7, :cond_1

    .line 67
    .line 68
    iget v7, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mTileSize:I

    .line 69
    .line 70
    invoke-static {v7}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->getTileBitmap(I)Landroid/graphics/Bitmap;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    new-instance v8, Landroid/graphics/Canvas;

    .line 75
    .line 76
    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->access$300()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-virtual {v8, v11}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-object v11, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mDestRect:Landroid/graphics/Rect;

    .line 87
    .line 88
    iget v12, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mTileSize_2:I

    .line 89
    .line 90
    mul-int v13, v6, v12

    .line 91
    .line 92
    mul-int v14, v9, v12

    .line 93
    .line 94
    add-int/lit8 v15, v6, 0x1

    .line 95
    .line 96
    mul-int/2addr v15, v12

    .line 97
    add-int/lit8 v16, v9, 0x1

    .line 98
    .line 99
    mul-int v12, v12, v16

    .line 100
    .line 101
    invoke-virtual {v11, v13, v14, v15, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 102
    .line 103
    .line 104
    iget-object v11, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mDestRect:Landroid/graphics/Rect;

    .line 105
    .line 106
    invoke-virtual {v8, v10, v5, v11, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    if-eqz v7, :cond_5

    .line 116
    .line 117
    iget-object v1, v0, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->mNewTiles:Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_5
    return-void
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
