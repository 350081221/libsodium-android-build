.class public Lorg/osmdroid/views/overlay/ScaleBarOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/util/constants/GeoConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;
    }
.end annotation


# static fields
.field private static final sTextBoundsRect:Landroid/graphics/Rect;


# instance fields
.field private adjustLength:Z

.field protected alignBottom:Z

.field protected alignRight:Z

.field private barPaint:Landroid/graphics/Paint;

.field protected final barPath:Landroid/graphics/Path;

.field private bgPaint:Landroid/graphics/Paint;

.field private centred:Z

.field private context:Landroid/content/Context;

.field private lastLatitude:D

.field private lastZoomLevel:D

.field latitudeBar:Z

.field protected final latitudeBarRect:Landroid/graphics/Rect;

.field longitudeBar:Z

.field protected final longitudeBarRect:Landroid/graphics/Rect;

.field private mMapHeight:I

.field private mMapView:Lorg/osmdroid/views/MapView;

.field private mMapWidth:I

.field private maxLength:F

.field minZoom:D

.field public screenHeight:I

.field public screenWidth:I

.field private textPaint:Landroid/graphics/Paint;

.field unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

.field xOffset:I

.field public xdpi:F

.field yOffset:I

.field public ydpi:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->sTextBoundsRect:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2, p3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;-><init>(Lorg/osmdroid/views/MapView;Landroid/content/Context;II)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, v1}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;-><init>(Lorg/osmdroid/views/MapView;Landroid/content/Context;II)V

    return-void
.end method

.method private constructor <init>(Lorg/osmdroid/views/MapView;Landroid/content/Context;II)V
    .locals 6

    .line 3
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xOffset:I

    .line 5
    iput v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    const-wide/16 v0, 0x0

    .line 6
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->minZoom:D

    .line 7
    sget-object v2, Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;->metric:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    iput-object v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    const/4 v2, 0x1

    .line 8
    iput-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    const/4 v3, 0x0

    .line 9
    iput-boolean v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 10
    iput-boolean v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 11
    iput-boolean v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 12
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    iput-object v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 13
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBarRect:Landroid/graphics/Rect;

    .line 14
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBarRect:Landroid/graphics/Rect;

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 15
    iput-wide v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 16
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastLatitude:D

    .line 17
    iput-boolean v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->centred:Z

    .line 18
    iput-boolean v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustLength:Z

    .line 19
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 20
    iput-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->context:Landroid/content/Context;

    .line 21
    iput p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapWidth:I

    .line 22
    iput p4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapHeight:I

    .line 23
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 24
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    const/high16 p3, -0x1000000

    .line 25
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    sget-object p4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    const/16 p4, 0xff

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 29
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    iget v0, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 p2, 0x0

    .line 30
    iput-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->bgPaint:Landroid/graphics/Paint;

    .line 31
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 32
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-object p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 34
    iget-object p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    iget-object p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 36
    iget-object p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    const/high16 p4, 0x41200000    # 10.0f

    iget v0, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p4

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 37
    iget p3, p1, Landroid/util/DisplayMetrics;->xdpi:F

    iput p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xdpi:F

    .line 38
    iget p3, p1, Landroid/util/DisplayMetrics;->ydpi:F

    iput p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->ydpi:F

    .line 39
    iget p3, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 40
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 41
    :try_start_0
    const-class p1, Landroid/os/Build;

    const-string p3, "MANUFACTURER"

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    .line 42
    invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p2, p1

    :catch_0
    const-string p1, "motorola"

    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "DROIDX"

    sget-object p4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 44
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->context:Landroid/content/Context;

    const-string p2, "window"

    .line 45
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    const-wide/high16 p2, 0x400e000000000000L    # 3.75

    const-wide v0, 0x4000cccccccccccdL    # 2.1

    if-eqz p1, :cond_0

    .line 46
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getOrientation()I

    move-result p1

    if-lez p1, :cond_0

    .line 47
    iget p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    int-to-double v2, p1

    div-double/2addr v2, p2

    double-to-float p1, v2

    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xdpi:F

    .line 48
    iget p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    int-to-double p1, p1

    div-double/2addr p1, v0

    double-to-float p1, p1

    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->ydpi:F

    goto :goto_0

    .line 49
    :cond_0
    iget p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    int-to-double v2, p1

    div-double/2addr v2, v0

    double-to-float p1, v2

    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xdpi:F

    .line 50
    iget p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    int-to-double v0, p1

    div-double/2addr v0, p2

    double-to-float p1, v0

    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->ydpi:F

    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Droid"

    sget-object p2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/high16 p1, 0x43840000    # 264.0f

    .line 52
    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xdpi:F

    .line 53
    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->ydpi:F

    :cond_2
    :goto_0
    const p1, 0x40228f5c    # 2.54f

    .line 54
    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->maxLength:F

    return-void
.end method

.method private adjustScaleBarLength(D)D
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 4
    .line 5
    sget-object v2, Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;->imperial:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 6
    .line 7
    const-wide v3, 0x409cf00000000000L    # 1852.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v5, 0x409925604189374cL    # 1609.344

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    const-wide v8, 0x400a3f28fd4f4b98L    # 3.2808399

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const-wide/16 v10, 0x0

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    const-wide v1, 0x40741de69ad42c3dL    # 321.8688

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmpl-double v1, p1, v1

    .line 34
    .line 35
    if-ltz v1, :cond_0

    .line 36
    .line 37
    div-double v1, p1, v5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    mul-double v1, p1, v8

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    sget-object v2, Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;->nautical:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 44
    .line 45
    if-ne v1, v2, :cond_2

    .line 46
    .line 47
    const-wide v1, 0x4077266666666666L    # 370.4

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmpl-double v1, p1, v1

    .line 53
    .line 54
    if-ltz v1, :cond_0

    .line 55
    .line 56
    div-double v1, p1, v3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-wide/from16 v1, p1

    .line 60
    .line 61
    :goto_0
    move v7, v12

    .line 62
    :goto_1
    const-wide/high16 v12, 0x4024000000000000L    # 10.0

    .line 63
    .line 64
    cmpl-double v14, v1, v12

    .line 65
    .line 66
    const-wide/16 v15, 0x1

    .line 67
    .line 68
    if-ltz v14, :cond_3

    .line 69
    .line 70
    add-long/2addr v10, v15

    .line 71
    div-double/2addr v1, v12

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_2
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 74
    .line 75
    cmpg-double v14, v1, v17

    .line 76
    .line 77
    if-gez v14, :cond_4

    .line 78
    .line 79
    const-wide/16 v19, 0x0

    .line 80
    .line 81
    cmpl-double v14, v1, v19

    .line 82
    .line 83
    if-lez v14, :cond_4

    .line 84
    .line 85
    sub-long/2addr v10, v15

    .line 86
    mul-double/2addr v1, v12

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 89
    .line 90
    cmpg-double v16, v1, v14

    .line 91
    .line 92
    if-gez v16, :cond_5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    const-wide/high16 v17, 0x4014000000000000L    # 5.0

    .line 96
    .line 97
    cmpg-double v1, v1, v17

    .line 98
    .line 99
    if-gez v1, :cond_6

    .line 100
    .line 101
    move-wide/from16 v17, v14

    .line 102
    .line 103
    :cond_6
    :goto_3
    if-eqz v7, :cond_7

    .line 104
    .line 105
    div-double v17, v17, v8

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_7
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 109
    .line 110
    sget-object v2, Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;->imperial:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 111
    .line 112
    if-ne v1, v2, :cond_8

    .line 113
    .line 114
    mul-double v17, v17, v5

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    sget-object v2, Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;->nautical:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 118
    .line 119
    if-ne v1, v2, :cond_9

    .line 120
    .line 121
    mul-double v17, v17, v3

    .line 122
    .line 123
    :cond_9
    :goto_4
    long-to-double v1, v10

    .line 124
    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->pow(DD)D

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    mul-double v17, v17, v1

    .line 129
    .line 130
    return-wide v17
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

.method private drawLatitudeText(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 7

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xdpi:F

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    const-wide v2, 0x400451eb851eb852L    # 2.54

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    div-double/2addr v0, v2

    .line 10
    double-to-int v0, v0

    .line 11
    iget v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->maxLength:F

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    mul-float/2addr v1, v0

    .line 15
    float-to-int v0, v1

    .line 16
    iget v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 17
    .line 18
    div-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    div-int/lit8 v2, v0, 0x2

    .line 21
    .line 22
    sub-int/2addr v1, v2

    .line 23
    iget v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-virtual {p2, v1, v3, v4}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 31
    .line 32
    div-int/lit8 v3, v3, 0x2

    .line 33
    .line 34
    add-int/2addr v3, v2

    .line 35
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    .line 36
    .line 37
    invoke-virtual {p2, v3, v2, v4}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast v1, Lorg/osmdroid/util/GeoPoint;

    .line 42
    .line 43
    invoke-virtual {v1, p2}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    iget-boolean p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustLength:Z

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    invoke-direct {p0, v1, v2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustScaleBarLength(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-wide v3, v1

    .line 57
    :goto_0
    int-to-double v5, v0

    .line 58
    mul-double/2addr v5, v3

    .line 59
    div-double/2addr v5, v1

    .line 60
    double-to-int p2, v5

    .line 61
    invoke-virtual {p0, v3, v4}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->scaleBarLengthText(D)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    sget-object v3, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->sTextBoundsRect:Landroid/graphics/Rect;

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    int-to-double v1, v1

    .line 82
    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    .line 83
    .line 84
    div-double/2addr v1, v4

    .line 85
    double-to-int v1, v1

    .line 86
    div-int/lit8 v2, p2, 0x2

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    div-int/lit8 v4, v4, 0x2

    .line 93
    .line 94
    sub-int/2addr v2, v4

    .line 95
    int-to-float v2, v2

    .line 96
    iget-boolean v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 97
    .line 98
    if-eqz v4, :cond_1

    .line 99
    .line 100
    iget v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 101
    .line 102
    sub-int/2addr v4, p2

    .line 103
    int-to-float p2, v4

    .line 104
    add-float/2addr v2, p2

    .line 105
    :cond_1
    iget-boolean p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 106
    .line 107
    if-eqz p2, :cond_2

    .line 108
    .line 109
    iget p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 110
    .line 111
    mul-int/lit8 v1, v1, 0x2

    .line 112
    .line 113
    sub-int/2addr p2, v1

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    add-int/2addr p2, v1

    .line 120
    :goto_1
    int-to-float p2, p2

    .line 121
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 122
    .line 123
    invoke-virtual {p1, v0, v2, p2, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 124
    .line 125
    .line 126
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

.method private drawLongitudeText(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 7

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->ydpi:F

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    const-wide v2, 0x400451eb851eb852L    # 2.54

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    div-double/2addr v0, v2

    .line 10
    double-to-int v0, v0

    .line 11
    iget v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->maxLength:F

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    mul-float/2addr v1, v0

    .line 15
    float-to-int v0, v1

    .line 16
    iget v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 17
    .line 18
    div-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 21
    .line 22
    div-int/lit8 v2, v2, 0x2

    .line 23
    .line 24
    div-int/lit8 v3, v0, 0x2

    .line 25
    .line 26
    sub-int/2addr v2, v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {p2, v1, v2, v4}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 33
    .line 34
    div-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    iget v5, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 37
    .line 38
    div-int/lit8 v5, v5, 0x2

    .line 39
    .line 40
    add-int/2addr v5, v3

    .line 41
    invoke-virtual {p2, v2, v5, v4}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast v1, Lorg/osmdroid/util/GeoPoint;

    .line 46
    .line 47
    invoke-virtual {v1, p2}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    iget-boolean p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustLength:Z

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    invoke-direct {p0, v1, v2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustScaleBarLength(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-wide v3, v1

    .line 61
    :goto_0
    int-to-double v5, v0

    .line 62
    mul-double/2addr v5, v3

    .line 63
    div-double/2addr v5, v1

    .line 64
    double-to-int p2, v5

    .line 65
    invoke-virtual {p0, v3, v4}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->scaleBarLengthText(D)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    sget-object v3, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->sTextBoundsRect:Landroid/graphics/Rect;

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    int-to-double v1, v1

    .line 86
    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    .line 87
    .line 88
    div-double/2addr v1, v4

    .line 89
    double-to-int v1, v1

    .line 90
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 95
    .line 96
    mul-int/lit8 v1, v1, 0x2

    .line 97
    .line 98
    sub-int/2addr v2, v1

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    add-int/2addr v2, v1

    .line 105
    :goto_1
    int-to-float v1, v2

    .line 106
    div-int/lit8 v2, p2, 0x2

    .line 107
    .line 108
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    div-int/lit8 v3, v3, 0x2

    .line 113
    .line 114
    add-int/2addr v2, v3

    .line 115
    int-to-float v2, v2

    .line 116
    iget-boolean v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 117
    .line 118
    if-eqz v3, :cond_2

    .line 119
    .line 120
    iget v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 121
    .line 122
    sub-int/2addr v3, p2

    .line 123
    int-to-float p2, v3

    .line 124
    add-float/2addr v2, p2

    .line 125
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 126
    .line 127
    .line 128
    const/high16 p2, -0x3d4c0000    # -90.0f

    .line 129
    .line 130
    invoke-virtual {p1, p2, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 131
    .line 132
    .line 133
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 134
    .line 135
    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 139
    .line 140
    .line 141
    return-void
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

.method private getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->context:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p3}, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->getConversionFactorToMeters()D

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    div-double/2addr p1, v3

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x0

    .line 20
    aput-object p1, v2, p2

    .line 21
    .line 22
    invoke-static {v1, p4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1, p3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getScaleString(Landroid/content/Context;Ljava/lang/String;Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
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

.method private getMapHeight()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapHeight:I

    :goto_0
    return v0
.end method

.method private getMapWidth()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapWidth:I

    :goto_0
    return v0
.end method

.method public static getScaleString(Landroid/content/Context;Ljava/lang/String;Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, Lorg/osmdroid/library/R$string;->D:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p1, v1, v2

    .line 8
    .line 9
    invoke-virtual {p2}, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->getStringResId()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p2, 0x1

    .line 18
    aput-object p1, v1, p2

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
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
.method public disableScaleBar()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/Overlay;->setEnabled(Z)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->minZoom:D

    .line 6
    .line 7
    cmpg-double v2, v0, v2

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->getIntrinsicScreenRect()Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x1

    .line 28
    if-ne v2, v4, :cond_2

    .line 29
    .line 30
    iget v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 31
    .line 32
    if-eq v3, v4, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    move v4, v6

    .line 38
    :goto_1
    iput v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 39
    .line 40
    iput v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 41
    .line 42
    div-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    div-int/lit8 v2, v2, 0x2

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-virtual {p2, v3, v2, v7}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-wide v7, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 52
    .line 53
    cmpl-double v3, v0, v7

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    iget-wide v9, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastLatitude:D

    .line 62
    .line 63
    cmpl-double v3, v7, v9

    .line 64
    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    :cond_3
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 70
    .line 71
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastLatitude:D

    .line 76
    .line 77
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->rebuildBarPath(Lorg/osmdroid/views/Projection;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xOffset:I

    .line 81
    .line 82
    iget v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    .line 83
    .line 84
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 85
    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    mul-int/lit8 v1, v1, -0x1

    .line 89
    .line 90
    :cond_5
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    mul-int/lit8 v0, v0, -0x1

    .line 95
    .line 96
    :cond_6
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->centred:Z

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 101
    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBarRect:Landroid/graphics/Rect;

    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    neg-int v2, v2

    .line 111
    div-int/lit8 v2, v2, 0x2

    .line 112
    .line 113
    add-int/2addr v0, v2

    .line 114
    :cond_7
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->centred:Z

    .line 115
    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 119
    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBarRect:Landroid/graphics/Rect;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    neg-int v2, v2

    .line 129
    div-int/lit8 v2, v2, 0x2

    .line 130
    .line 131
    add-int/2addr v1, v2

    .line 132
    :cond_8
    invoke-virtual {p2, p1, v5, v6}, Lorg/osmdroid/views/Projection;->save(Landroid/graphics/Canvas;ZZ)V

    .line 133
    .line 134
    .line 135
    int-to-float v0, v0

    .line 136
    int-to-float v1, v1

    .line 137
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 138
    .line 139
    .line 140
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 141
    .line 142
    if-eqz v0, :cond_9

    .line 143
    .line 144
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->bgPaint:Landroid/graphics/Paint;

    .line 145
    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBarRect:Landroid/graphics/Rect;

    .line 149
    .line 150
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 151
    .line 152
    .line 153
    :cond_9
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 154
    .line 155
    if-eqz v0, :cond_b

    .line 156
    .line 157
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->bgPaint:Landroid/graphics/Paint;

    .line 158
    .line 159
    if-eqz v0, :cond_b

    .line 160
    .line 161
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 162
    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBarRect:Landroid/graphics/Rect;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    :cond_a
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBarRect:Landroid/graphics/Rect;

    .line 172
    .line 173
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 174
    .line 175
    int-to-float v8, v1

    .line 176
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 177
    .line 178
    add-int/2addr v1, v5

    .line 179
    int-to-float v9, v1

    .line 180
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 181
    .line 182
    int-to-float v10, v1

    .line 183
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 184
    .line 185
    int-to-float v11, v0

    .line 186
    iget-object v12, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->bgPaint:Landroid/graphics/Paint;

    .line 187
    .line 188
    move-object v7, p1

    .line 189
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 190
    .line 191
    .line 192
    :cond_b
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 193
    .line 194
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    .line 195
    .line 196
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 197
    .line 198
    .line 199
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 200
    .line 201
    if-eqz v0, :cond_c

    .line 202
    .line 203
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->drawLatitudeText(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 204
    .line 205
    .line 206
    :cond_c
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 207
    .line 208
    if-eqz v0, :cond_d

    .line 209
    .line 210
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->drawLongitudeText(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 211
    .line 212
    .line 213
    :cond_d
    invoke-virtual {p2, p1, v6}, Lorg/osmdroid/views/Projection;->restore(Landroid/graphics/Canvas;Z)V

    .line 214
    .line 215
    .line 216
    return-void
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

.method public drawLatitudeScale(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method public drawLongitudeScale(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method public enableScaleBar()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/Overlay;->setEnabled(Z)V

    return-void
.end method

.method public getBarPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    return-object v0
.end method

.method public getTextPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    return-object v0
.end method

.method public getUnitsOfMeasure()Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    return-object v0
.end method

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->context:Landroid/content/Context;

    .line 3
    .line 4
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 5
    .line 6
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    .line 7
    .line 8
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->bgPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 11
    .line 12
    return-void
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

.method protected rebuildBarPath(Lorg/osmdroid/views/Projection;)V
    .locals 12

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xdpi:F

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    const-wide v2, 0x400451eb851eb852L    # 2.54

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    div-double/2addr v0, v2

    .line 10
    double-to-int v0, v0

    .line 11
    iget v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->ydpi:F

    .line 12
    .line 13
    float-to-double v4, v1

    .line 14
    div-double/2addr v4, v2

    .line 15
    double-to-int v1, v4

    .line 16
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->maxLength:F

    .line 17
    .line 18
    int-to-float v0, v0

    .line 19
    mul-float/2addr v0, v2

    .line 20
    float-to-int v0, v0

    .line 21
    int-to-float v1, v1

    .line 22
    mul-float/2addr v2, v1

    .line 23
    float-to-int v1, v2

    .line 24
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 25
    .line 26
    div-int/lit8 v2, v2, 0x2

    .line 27
    .line 28
    div-int/lit8 v3, v0, 0x2

    .line 29
    .line 30
    sub-int/2addr v2, v3

    .line 31
    iget v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-virtual {p1, v2, v4, v5}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 39
    .line 40
    div-int/lit8 v4, v4, 0x2

    .line 41
    .line 42
    add-int/2addr v4, v3

    .line 43
    iget v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    .line 44
    .line 45
    invoke-virtual {p1, v4, v3, v5}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v2, Lorg/osmdroid/util/GeoPoint;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    iget-boolean v4, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustLength:Z

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    invoke-direct {p0, v2, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustScaleBarLength(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-wide v6, v2

    .line 65
    :goto_0
    int-to-double v8, v0

    .line 66
    mul-double/2addr v8, v6

    .line 67
    div-double/2addr v8, v2

    .line 68
    double-to-int v0, v8

    .line 69
    iget v2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 70
    .line 71
    div-int/lit8 v2, v2, 0x2

    .line 72
    .line 73
    iget v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 74
    .line 75
    div-int/lit8 v3, v3, 0x2

    .line 76
    .line 77
    div-int/lit8 v4, v1, 0x2

    .line 78
    .line 79
    sub-int/2addr v3, v4

    .line 80
    invoke-virtual {p1, v2, v3, v5}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenWidth:I

    .line 85
    .line 86
    div-int/lit8 v3, v3, 0x2

    .line 87
    .line 88
    iget v8, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->screenHeight:I

    .line 89
    .line 90
    div-int/lit8 v8, v8, 0x2

    .line 91
    .line 92
    add-int/2addr v8, v4

    .line 93
    invoke-virtual {p1, v3, v8, v5}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast v2, Lorg/osmdroid/util/GeoPoint;

    .line 98
    .line 99
    invoke-virtual {v2, p1}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    iget-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustLength:Z

    .line 104
    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    invoke-direct {p0, v2, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustScaleBarLength(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    move-wide v4, v2

    .line 113
    :goto_1
    int-to-double v8, v1

    .line 114
    mul-double/2addr v8, v4

    .line 115
    div-double/2addr v8, v2

    .line 116
    double-to-int p1, v8

    .line 117
    invoke-virtual {p0, v6, v7}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->scaleBarLengthText(D)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v2, Landroid/graphics/Rect;

    .line 122
    .line 123
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-object v3, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    const/4 v7, 0x0

    .line 133
    invoke-virtual {v3, v1, v7, v6, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    int-to-double v8, v1

    .line 141
    const-wide/high16 v10, 0x4014000000000000L    # 5.0

    .line 142
    .line 143
    div-double/2addr v8, v10

    .line 144
    double-to-int v1, v8

    .line 145
    invoke-virtual {p0, v4, v5}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->scaleBarLengthText(D)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    new-instance v4, Landroid/graphics/Rect;

    .line 150
    .line 151
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 152
    .line 153
    .line 154
    iget-object v5, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    invoke-virtual {v5, v3, v7, v6, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    int-to-double v5, v3

    .line 168
    div-double/2addr v5, v10

    .line 169
    double-to-int v3, v5

    .line 170
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    iget-object v5, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 179
    .line 180
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 181
    .line 182
    .line 183
    iget-boolean v5, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 184
    .line 185
    if-eqz v5, :cond_2

    .line 186
    .line 187
    mul-int/lit8 v1, v1, -0x1

    .line 188
    .line 189
    mul-int/lit8 v2, v2, -0x1

    .line 190
    .line 191
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getMapHeight()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    sub-int p1, v5, p1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_2
    move v5, v7

    .line 199
    :goto_2
    iget-boolean v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 200
    .line 201
    if-eqz v6, :cond_3

    .line 202
    .line 203
    mul-int/lit8 v3, v3, -0x1

    .line 204
    .line 205
    mul-int/lit8 v4, v4, -0x1

    .line 206
    .line 207
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getMapWidth()I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    sub-int v0, v7, v0

    .line 212
    .line 213
    :cond_3
    iget-boolean v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 214
    .line 215
    if-eqz v6, :cond_5

    .line 216
    .line 217
    iget-object v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 218
    .line 219
    int-to-float v8, v0

    .line 220
    add-int/2addr v2, v5

    .line 221
    mul-int/lit8 v1, v1, 0x2

    .line 222
    .line 223
    add-int/2addr v2, v1

    .line 224
    int-to-float v1, v2

    .line 225
    invoke-virtual {v6, v8, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 226
    .line 227
    .line 228
    iget-object v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 229
    .line 230
    int-to-float v9, v5

    .line 231
    invoke-virtual {v6, v8, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 232
    .line 233
    .line 234
    iget-object v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 235
    .line 236
    int-to-float v8, v7

    .line 237
    invoke-virtual {v6, v8, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 238
    .line 239
    .line 240
    iget-boolean v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 241
    .line 242
    if-nez v6, :cond_4

    .line 243
    .line 244
    iget-object v6, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 245
    .line 246
    invoke-virtual {v6, v8, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 247
    .line 248
    .line 249
    :cond_4
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBarRect:Landroid/graphics/Rect;

    .line 250
    .line 251
    invoke-virtual {v1, v7, v5, v0, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 252
    .line 253
    .line 254
    :cond_5
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBar:Z

    .line 255
    .line 256
    if-eqz v0, :cond_7

    .line 257
    .line 258
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->latitudeBar:Z

    .line 259
    .line 260
    if-nez v0, :cond_6

    .line 261
    .line 262
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 263
    .line 264
    add-int v1, v7, v4

    .line 265
    .line 266
    mul-int/lit8 v2, v3, 0x2

    .line 267
    .line 268
    add-int/2addr v1, v2

    .line 269
    int-to-float v1, v1

    .line 270
    int-to-float v2, v5

    .line 271
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 275
    .line 276
    int-to-float v1, v7

    .line 277
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 278
    .line 279
    .line 280
    :cond_6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 281
    .line 282
    int-to-float v1, v7

    .line 283
    int-to-float v2, p1

    .line 284
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 285
    .line 286
    .line 287
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPath:Landroid/graphics/Path;

    .line 288
    .line 289
    add-int/2addr v4, v7

    .line 290
    mul-int/lit8 v3, v3, 0x2

    .line 291
    .line 292
    add-int/2addr v4, v3

    .line 293
    int-to-float v1, v4

    .line 294
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 295
    .line 296
    .line 297
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->longitudeBarRect:Landroid/graphics/Rect;

    .line 298
    .line 299
    invoke-virtual {v0, v7, v5, v4, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 300
    .line 301
    .line 302
    :cond_7
    return-void
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

.method protected scaleBarLengthText(D)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lorg/osmdroid/views/overlay/ScaleBarOverlay$1;->$SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure:[I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const-string v2, "%.1f"

    .line 13
    .line 14
    const-string v3, "%.0f"

    .line 15
    .line 16
    if-eq v0, v1, :cond_6

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const-wide v0, 0x40b3880000000000L    # 5000.0

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmpl-double v0, p1, v0

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->kilometer:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 31
    .line 32
    invoke-direct {p0, p1, p2, v0, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    .line 38
    .line 39
    cmpl-double v0, p1, v0

    .line 40
    .line 41
    if-ltz v0, :cond_1

    .line 42
    .line 43
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->kilometer:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 44
    .line 45
    invoke-direct {p0, p1, p2, v0, v2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_1
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 51
    .line 52
    cmpl-double v0, p1, v0

    .line 53
    .line 54
    if-ltz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->meter:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 57
    .line 58
    invoke-direct {p0, p1, p2, v0, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->meter:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 64
    .line 65
    const-string v1, "%.2f"

    .line 66
    .line 67
    invoke-direct {p0, p1, p2, v0, v1}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :cond_3
    const-wide v0, 0x40c2160000000000L    # 9260.0

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    cmpl-double v0, p1, v0

    .line 78
    .line 79
    if-ltz v0, :cond_4

    .line 80
    .line 81
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->nauticalMile:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 82
    .line 83
    invoke-direct {p0, p1, p2, v0, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_4
    const-wide v0, 0x4077266666666666L    # 370.4

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    cmpl-double v0, p1, v0

    .line 94
    .line 95
    if-ltz v0, :cond_5

    .line 96
    .line 97
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->nauticalMile:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 98
    .line 99
    invoke-direct {p0, p1, p2, v0, v2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :cond_5
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->foot:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 105
    .line 106
    invoke-direct {p0, p1, p2, v0, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_6
    const-wide v0, 0x40bf6eb851eb851fL    # 8046.72

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    cmpl-double v0, p1, v0

    .line 117
    .line 118
    if-ltz v0, :cond_7

    .line 119
    .line 120
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->statuteMile:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 121
    .line 122
    invoke-direct {p0, p1, p2, v0, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :cond_7
    const-wide v0, 0x40741de69ad42c3dL    # 321.8688

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    cmpl-double v0, p1, v0

    .line 133
    .line 134
    if-ltz v0, :cond_8

    .line 135
    .line 136
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->statuteMile:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 137
    .line 138
    invoke-direct {p0, p1, p2, v0, v2}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_8
    sget-object v0, Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;->foot:Lorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;

    .line 144
    .line 145
    invoke-direct {p0, p1, p2, v0, v3}, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->getConvertedScaleString(DLorg/osmdroid/util/constants/GeoConstants$UnitOfMeasure;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1
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

.method public setAlignBottom(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->centred:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 5
    .line 6
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 7
    .line 8
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 9
    .line 10
    return-void
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
.end method

.method public setAlignRight(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->centred:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 5
    .line 6
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 7
    .line 8
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 9
    .line 10
    return-void
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
.end method

.method public setBackgroundPaint(Landroid/graphics/Paint;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->bgPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method public setBarPaint(Landroid/graphics/Paint;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    .line 4
    .line 5
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 6
    .line 7
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "pBarPaint argument cannot be null"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
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

.method public setCentred(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->centred:Z

    .line 2
    .line 3
    xor-int/lit8 v0, p1, 0x1

    .line 4
    .line 5
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignBottom:Z

    .line 6
    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->alignRight:Z

    .line 10
    .line 11
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 12
    .line 13
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 14
    .line 15
    return-void
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

.method public setEnableAdjustLength(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->adjustLength:Z

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method public setLineWidth(F)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->barPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setMaxLength(F)V
    .locals 2

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->maxLength:F

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method public setMinZoom(D)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->minZoom:D

    return-void
.end method

.method public setScaleBarOffset(II)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->xOffset:I

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->yOffset:I

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
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
.end method

.method public setTextPaint(Landroid/graphics/Paint;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    .line 4
    .line 5
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 6
    .line 7
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "pTextPaint argument cannot be null"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
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

.method public setTextSize(F)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public setUnitsOfMeasure(Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->unitsOfMeasure:Lorg/osmdroid/views/overlay/ScaleBarOverlay$UnitsOfMeasure;

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/ScaleBarOverlay;->lastZoomLevel:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method
