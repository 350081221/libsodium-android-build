.class public Lorg/osmdroid/views/overlay/Polygon;
.super Lorg/osmdroid/views/overlay/PolyOverlayWithIW;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/Polygon$OnClickListener;
    }
.end annotation


# instance fields
.field protected mOnClickListener:Lorg/osmdroid/views/overlay/Polygon$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lorg/osmdroid/views/overlay/Polygon;-><init>(Lorg/osmdroid/views/MapView;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;-><init>(Lorg/osmdroid/views/MapView;ZZ)V

    .line 3
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 9
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method public static pointsAsCircle(Lorg/osmdroid/util/GeoPoint;D)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/util/GeoPoint;",
            "D)",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0x3c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    const/16 v2, 0x168

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    int-to-double v2, v1

    .line 14
    invoke-virtual {p0, p1, p2, v2, v3}, Lorg/osmdroid/util/GeoPoint;->destinationPoint(DD)Lorg/osmdroid/util/GeoPoint;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x6

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
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

.method public static pointsAsRect(Lorg/osmdroid/util/BoundingBox;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/util/BoundingBox;",
            ")",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/api/IGeoPoint;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v2

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v2

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    move-result-wide v2

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    move-result-wide v2

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static pointsAsRect(Lorg/osmdroid/util/GeoPoint;DD)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/util/GeoPoint;",
            "DD)",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/api/IGeoPoint;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    mul-double/2addr p1, v1

    const-wide v3, 0x4056800000000000L    # 90.0

    .line 7
    invoke-virtual {p0, p1, p2, v3, v4}, Lorg/osmdroid/util/GeoPoint;->destinationPoint(DD)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    mul-double/2addr p3, v1

    const-wide v1, 0x4066800000000000L    # 180.0

    .line 8
    invoke-virtual {p0, p3, p4, v1, v2}, Lorg/osmdroid/util/GeoPoint;->destinationPoint(DD)Lorg/osmdroid/util/GeoPoint;

    move-result-object p2

    .line 9
    invoke-virtual {p0}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide p3

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    mul-double/2addr p3, v1

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v3

    sub-double/2addr p3, v3

    .line 10
    invoke-virtual {p0}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v3

    mul-double/2addr v3, v1

    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v1

    sub-double/2addr v3, v1

    .line 11
    new-instance p0, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v5

    invoke-direct {p0, v1, v2, v5, v6}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    new-instance p0, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-direct {p0, v1, v2, p3, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance p0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {p0, v3, v4, p3, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    new-instance p0, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide p1

    invoke-direct {p0, v3, v4, p1, p2}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method protected click(Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/Polygon;->mOnClickListener:Lorg/osmdroid/views/overlay/Polygon$OnClickListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p0, p1, p2}, Lorg/osmdroid/views/overlay/Polygon;->onClickDefault(Lorg/osmdroid/views/overlay/Polygon;Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-interface {v0, p0, p1, p2}, Lorg/osmdroid/views/overlay/Polygon$OnClickListener;->onClick(Lorg/osmdroid/views/overlay/Polygon;Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public getFillColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getFillPaint()Landroid/graphics/Paint;
    .locals 1

    invoke-super {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getFillPaint()Landroid/graphics/Paint;

    move-result-object v0

    return-object v0
.end method

.method public getHoles()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lorg/osmdroid/views/overlay/LinearRing;

    .line 29
    .line 30
    invoke-virtual {v2}, Lorg/osmdroid/views/overlay/LinearRing;->getPoints()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public getPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getActualPoints()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStrokeColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getStrokeWidth()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    return v0
.end method

.method public onClickDefault(Lorg/osmdroid/views/overlay/Polygon;Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p3}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setInfoWindowLocation(Lorg/osmdroid/util/GeoPoint;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->showInfoWindow()V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1
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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->onDetach(Lorg/osmdroid/views/MapView;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lorg/osmdroid/views/overlay/Polygon;->mOnClickListener:Lorg/osmdroid/views/overlay/Polygon$OnClickListener;

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

.method public setFillColor(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setHoles(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/List;

    .line 27
    .line 28
    new-instance v1, Lorg/osmdroid/views/overlay/LinearRing;

    .line 29
    .line 30
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-direct {v1, v2}, Lorg/osmdroid/views/overlay/LinearRing;-><init>(Landroid/graphics/Path;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 36
    .line 37
    invoke-virtual {v2}, Lorg/osmdroid/views/overlay/LinearRing;->isGeodesic()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v1, v2}, Lorg/osmdroid/views/overlay/LinearRing;->setGeodesic(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lorg/osmdroid/views/overlay/LinearRing;->setPoints(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public setOnClickListener(Lorg/osmdroid/views/overlay/Polygon$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/Polygon;->mOnClickListener:Lorg/osmdroid/views/overlay/Polygon$OnClickListener;

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method
