.class public abstract Lorg/osmdroid/views/overlay/PolyOverlayWithIW;
.super Lorg/osmdroid/views/overlay/OverlayWithIW;
.source "SourceFile"


# instance fields
.field private final mClosePath:Z

.field protected mDensity:F

.field private mDensityMultiplier:F

.field private final mDowngradeBottomRight:Landroid/graphics/Point;

.field private final mDowngradeCenter:Lorg/osmdroid/util/PointL;

.field private mDowngradeDisplay:Z

.field private mDowngradeMaximumPixelSize:I

.field private mDowngradeMaximumRectanglePixelSize:I

.field private final mDowngradeOffset:Lorg/osmdroid/util/PointL;

.field private mDowngradeSegments:[F

.field private final mDowngradeTopLeft:Landroid/graphics/Point;

.field protected mFillPaint:Landroid/graphics/Paint;

.field protected mHoles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/LinearRing;",
            ">;"
        }
    .end annotation
.end field

.field private mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

.field private mIsPaintOrPaintList:Z

.field private mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

.field private mMilestoneManagers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/milestones/e;",
            ">;"
        }
    .end annotation
.end field

.field protected mOutline:Lorg/osmdroid/views/overlay/LinearRing;

.field protected mOutlinePaint:Landroid/graphics/Paint;

.field private final mOutlinePaintLists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/PaintList;",
            ">;"
        }
    .end annotation
.end field

.field protected mPath:Landroid/graphics/Path;

.field private final mVisibilityProjectedCenter:Lorg/osmdroid/util/PointL;

.field private final mVisibilityProjectedCorner:Lorg/osmdroid/util/PointL;

.field private final mVisibilityRectangleCenter:Lorg/osmdroid/util/PointL;

.field private final mVisibilityRectangleCorner:Lorg/osmdroid/util/PointL;


# direct methods
.method protected constructor <init>(Lorg/osmdroid/views/MapView;ZZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/OverlayWithIW;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaintLists:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 31
    .line 32
    const/high16 v0, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDensity:F

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mIsPaintOrPaintList:Z

    .line 38
    .line 39
    new-instance v1, Lorg/osmdroid/util/PointL;

    .line 40
    .line 41
    invoke-direct {v1}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 45
    .line 46
    new-instance v1, Lorg/osmdroid/util/PointL;

    .line 47
    .line 48
    invoke-direct {v1}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityProjectedCorner:Lorg/osmdroid/util/PointL;

    .line 52
    .line 53
    new-instance v1, Lorg/osmdroid/util/PointL;

    .line 54
    .line 55
    invoke-direct {v1}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCenter:Lorg/osmdroid/util/PointL;

    .line 59
    .line 60
    new-instance v1, Lorg/osmdroid/util/PointL;

    .line 61
    .line 62
    invoke-direct {v1}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCorner:Lorg/osmdroid/util/PointL;

    .line 66
    .line 67
    new-instance v1, Landroid/graphics/Point;

    .line 68
    .line 69
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 73
    .line 74
    new-instance v1, Landroid/graphics/Point;

    .line 75
    .line 76
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 80
    .line 81
    new-instance v1, Lorg/osmdroid/util/PointL;

    .line 82
    .line 83
    invoke-direct {v1}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeCenter:Lorg/osmdroid/util/PointL;

    .line 87
    .line 88
    new-instance v1, Lorg/osmdroid/util/PointL;

    .line 89
    .line 90
    invoke-direct {v1}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeOffset:Lorg/osmdroid/util/PointL;

    .line 94
    .line 95
    iput v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDensityMultiplier:F

    .line 96
    .line 97
    iput-boolean p3, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mClosePath:Z

    .line 98
    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getRepository()Lorg/osmdroid/views/MapViewRepository;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    invoke-virtual {p3}, Lorg/osmdroid/views/MapViewRepository;->getDefaultPolylineInfoWindow()Lorg/osmdroid/views/overlay/infowindow/a;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-virtual {p0, p3}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setInfoWindow(Lorg/osmdroid/views/overlay/infowindow/b;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 125
    .line 126
    iput p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDensity:F

    .line 127
    .line 128
    :cond_0
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->usePath(Z)V

    .line 129
    .line 130
    .line 131
    return-void
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

.method private displayDowngrade(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 6
    .line 7
    invoke-virtual {v2}, Lorg/osmdroid/views/overlay/LinearRing;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Lorg/osmdroid/util/GeoPoint;

    .line 12
    .line 13
    invoke-virtual {v2}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    invoke-virtual {v2}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 18
    .line 19
    .line 20
    move-result-wide v6

    .line 21
    invoke-direct {v3, v4, v5, v6, v7}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 25
    .line 26
    invoke-virtual {v1, v3, v4}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 27
    .line 28
    .line 29
    new-instance v3, Lorg/osmdroid/util/GeoPoint;

    .line 30
    .line 31
    invoke-virtual {v2}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    invoke-virtual {v2}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    invoke-direct {v3, v4, v5, v6, v7}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 43
    .line 44
    invoke-virtual {v1, v3, v2}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getWorldMapSize()D

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    iget-object v4, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 52
    .line 53
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 54
    .line 55
    int-to-long v10, v5

    .line 56
    iget v4, v4, Landroid/graphics/Point;->y:I

    .line 57
    .line 58
    int-to-long v12, v4

    .line 59
    long-to-double v4, v10

    .line 60
    iget-object v6, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 61
    .line 62
    iget v6, v6, Landroid/graphics/Point;->x:I

    .line 63
    .line 64
    int-to-double v6, v6

    .line 65
    move-wide v8, v2

    .line 66
    invoke-static/range {v4 .. v9}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 71
    .line 72
    .line 73
    move-result-wide v14

    .line 74
    long-to-double v4, v12

    .line 75
    iget-object v6, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 76
    .line 77
    iget v6, v6, Landroid/graphics/Point;->y:I

    .line 78
    .line 79
    int-to-double v6, v6

    .line 80
    invoke-static/range {v4 .. v9}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    cmp-long v4, v10, v14

    .line 89
    .line 90
    const-wide/16 v5, 0x1

    .line 91
    .line 92
    if-nez v4, :cond_0

    .line 93
    .line 94
    move-wide v7, v5

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    if-lez v4, :cond_1

    .line 97
    .line 98
    sub-long/2addr v10, v14

    .line 99
    move-wide v7, v10

    .line 100
    move-wide v10, v14

    .line 101
    goto :goto_0

    .line 102
    :cond_1
    sub-long v7, v14, v10

    .line 103
    .line 104
    :goto_0
    cmp-long v4, v12, v2

    .line 105
    .line 106
    if-nez v4, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    if-lez v4, :cond_3

    .line 110
    .line 111
    sub-long v5, v12, v2

    .line 112
    .line 113
    move-wide v12, v2

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    sub-long v5, v2, v12

    .line 116
    .line 117
    :goto_1
    iget-object v2, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeCenter:Lorg/osmdroid/util/PointL;

    .line 118
    .line 119
    const-wide/16 v3, 0x2

    .line 120
    .line 121
    div-long v14, v7, v3

    .line 122
    .line 123
    add-long/2addr v14, v10

    .line 124
    div-long v3, v5, v3

    .line 125
    .line 126
    add-long/2addr v3, v12

    .line 127
    invoke-virtual {v2, v14, v15, v3, v4}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 128
    .line 129
    .line 130
    iget-object v2, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 131
    .line 132
    iget-object v3, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeOffset:Lorg/osmdroid/util/PointL;

    .line 133
    .line 134
    iget-object v4, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeCenter:Lorg/osmdroid/util/PointL;

    .line 135
    .line 136
    invoke-virtual {v2, v1, v3, v4}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;Lorg/osmdroid/util/PointL;)V

    .line 137
    .line 138
    .line 139
    iget-object v1, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeOffset:Lorg/osmdroid/util/PointL;

    .line 140
    .line 141
    iget-wide v2, v1, Lorg/osmdroid/util/PointL;->x:J

    .line 142
    .line 143
    add-long/2addr v10, v2

    .line 144
    iget-wide v1, v1, Lorg/osmdroid/util/PointL;->y:J

    .line 145
    .line 146
    add-long/2addr v12, v1

    .line 147
    iget-boolean v1, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mIsPaintOrPaintList:Z

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    if-eqz v1, :cond_5

    .line 151
    .line 152
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    :cond_4
    move-wide/from16 v20, v10

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaintLists()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-lez v1, :cond_6

    .line 168
    .line 169
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaintLists()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    move-object v14, v1

    .line 178
    check-cast v14, Lorg/osmdroid/views/overlay/PaintList;

    .line 179
    .line 180
    invoke-interface {v14}, Lorg/osmdroid/views/overlay/PaintList;->getPaint()Landroid/graphics/Paint;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-nez v1, :cond_4

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    long-to-float v1, v10

    .line 188
    long-to-float v3, v12

    .line 189
    move v4, v3

    .line 190
    add-long v2, v10, v7

    .line 191
    .line 192
    long-to-float v2, v2

    .line 193
    move-wide/from16 v20, v10

    .line 194
    .line 195
    add-long v9, v12, v5

    .line 196
    .line 197
    long-to-float v3, v9

    .line 198
    move/from16 v16, v1

    .line 199
    .line 200
    move/from16 v17, v4

    .line 201
    .line 202
    move/from16 v18, v2

    .line 203
    .line 204
    move/from16 v19, v3

    .line 205
    .line 206
    invoke-interface/range {v14 .. v19}, Lorg/osmdroid/views/overlay/PaintList;->getPaint(IFFFF)Landroid/graphics/Paint;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    goto :goto_2

    .line 211
    :cond_6
    move-wide/from16 v20, v10

    .line 212
    .line 213
    const/4 v1, 0x0

    .line 214
    :goto_2
    invoke-direct {v0, v1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->isVisible(Landroid/graphics/Paint;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-nez v2, :cond_7

    .line 219
    .line 220
    return-void

    .line 221
    :cond_7
    cmp-long v2, v7, v5

    .line 222
    .line 223
    if-lez v2, :cond_8

    .line 224
    .line 225
    move-wide v2, v7

    .line 226
    goto :goto_3

    .line 227
    :cond_8
    move-wide v2, v5

    .line 228
    :goto_3
    iget v4, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumRectanglePixelSize:I

    .line 229
    .line 230
    int-to-long v9, v4

    .line 231
    cmp-long v4, v2, v9

    .line 232
    .line 233
    if-gtz v4, :cond_9

    .line 234
    .line 235
    move-wide/from16 v10, v20

    .line 236
    .line 237
    long-to-float v15, v10

    .line 238
    long-to-float v2, v12

    .line 239
    add-long/2addr v10, v7

    .line 240
    long-to-float v3, v10

    .line 241
    add-long/2addr v12, v5

    .line 242
    long-to-float v4, v12

    .line 243
    move-object/from16 v14, p1

    .line 244
    .line 245
    move/from16 v16, v2

    .line 246
    .line 247
    move/from16 v17, v3

    .line 248
    .line 249
    move/from16 v18, v4

    .line 250
    .line 251
    move-object/from16 v19, v1

    .line 252
    .line 253
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_9
    iget-object v4, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 258
    .line 259
    iget v5, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 260
    .line 261
    invoke-virtual {v4, v5}, Lorg/osmdroid/views/overlay/LinearRing;->computeDowngradePointList(I)[F

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    if-eqz v4, :cond_10

    .line 266
    .line 267
    array-length v5, v4

    .line 268
    if-nez v5, :cond_a

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_a
    array-length v5, v4

    .line 272
    mul-int/lit8 v5, v5, 0x2

    .line 273
    .line 274
    iget-object v6, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeSegments:[F

    .line 275
    .line 276
    if-eqz v6, :cond_b

    .line 277
    .line 278
    array-length v6, v6

    .line 279
    if-ge v6, v5, :cond_c

    .line 280
    .line 281
    :cond_b
    new-array v5, v5, [F

    .line 282
    .line 283
    iput-object v5, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeSegments:[F

    .line 284
    .line 285
    :cond_c
    long-to-float v2, v2

    .line 286
    const/high16 v3, 0x3f800000    # 1.0f

    .line 287
    .line 288
    mul-float/2addr v2, v3

    .line 289
    iget v3, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 290
    .line 291
    int-to-float v3, v3

    .line 292
    div-float/2addr v2, v3

    .line 293
    const/4 v3, 0x0

    .line 294
    move v5, v3

    .line 295
    const/4 v6, 0x0

    .line 296
    const/4 v7, 0x0

    .line 297
    :goto_4
    array-length v8, v4

    .line 298
    if-ge v6, v8, :cond_e

    .line 299
    .line 300
    iget-object v8, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeCenter:Lorg/osmdroid/util/PointL;

    .line 301
    .line 302
    iget-wide v9, v8, Lorg/osmdroid/util/PointL;->x:J

    .line 303
    .line 304
    long-to-float v9, v9

    .line 305
    add-int/lit8 v10, v6, 0x1

    .line 306
    .line 307
    aget v6, v4, v6

    .line 308
    .line 309
    mul-float/2addr v6, v2

    .line 310
    add-float/2addr v9, v6

    .line 311
    iget-wide v11, v8, Lorg/osmdroid/util/PointL;->y:J

    .line 312
    .line 313
    long-to-float v6, v11

    .line 314
    add-int/lit8 v8, v10, 0x1

    .line 315
    .line 316
    aget v10, v4, v10

    .line 317
    .line 318
    mul-float/2addr v10, v2

    .line 319
    add-float/2addr v6, v10

    .line 320
    if-nez v7, :cond_d

    .line 321
    .line 322
    move v5, v6

    .line 323
    move v3, v9

    .line 324
    goto :goto_5

    .line 325
    :cond_d
    iget-object v10, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeSegments:[F

    .line 326
    .line 327
    add-int/lit8 v11, v7, 0x1

    .line 328
    .line 329
    aput v9, v10, v7

    .line 330
    .line 331
    add-int/lit8 v7, v11, 0x1

    .line 332
    .line 333
    aput v6, v10, v11

    .line 334
    .line 335
    :goto_5
    iget-object v10, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeSegments:[F

    .line 336
    .line 337
    add-int/lit8 v11, v7, 0x1

    .line 338
    .line 339
    aput v9, v10, v7

    .line 340
    .line 341
    add-int/lit8 v7, v11, 0x1

    .line 342
    .line 343
    aput v6, v10, v11

    .line 344
    .line 345
    move v6, v8

    .line 346
    goto :goto_4

    .line 347
    :cond_e
    iget-object v2, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeSegments:[F

    .line 348
    .line 349
    add-int/lit8 v4, v7, 0x1

    .line 350
    .line 351
    aput v3, v2, v7

    .line 352
    .line 353
    add-int/lit8 v3, v4, 0x1

    .line 354
    .line 355
    aput v5, v2, v4

    .line 356
    .line 357
    const/4 v4, 0x4

    .line 358
    if-gt v3, v4, :cond_f

    .line 359
    .line 360
    return-void

    .line 361
    :cond_f
    move-object/from16 v4, p1

    .line 362
    .line 363
    const/4 v5, 0x0

    .line 364
    invoke-virtual {v4, v2, v5, v3, v1}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 365
    .line 366
    .line 367
    :cond_10
    :goto_6
    return-void
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

.method private drawWithLines(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/LineDrawer;->setCanvas(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lorg/osmdroid/views/overlay/LinearRing;->setClipArea(Lorg/osmdroid/views/Projection;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mIsPaintOrPaintList:Z

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lorg/osmdroid/views/overlay/LineDrawer;->setPaint(Landroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 37
    .line 38
    invoke-virtual {v1, p2, v0}, Lorg/osmdroid/views/overlay/LinearRing;->buildLinePortion(Lorg/osmdroid/views/Projection;Z)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaintLists()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lorg/osmdroid/views/overlay/PaintList;

    .line 61
    .line 62
    iget-object v4, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 63
    .line 64
    invoke-virtual {v4, v3}, Lorg/osmdroid/views/overlay/LineDrawer;->setPaint(Lorg/osmdroid/views/overlay/PaintList;)V

    .line 65
    .line 66
    .line 67
    iget-object v3, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 68
    .line 69
    invoke-virtual {v3, p2, v0}, Lorg/osmdroid/views/overlay/LinearRing;->buildLinePortion(Lorg/osmdroid/views/Projection;Z)V

    .line 70
    .line 71
    .line 72
    move v0, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    :goto_2
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lorg/osmdroid/views/overlay/milestones/e;

    .line 91
    .line 92
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/milestones/e;->init()V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 96
    .line 97
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/LinearRing;->getDistances()[D

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/milestones/e;->b([D)V

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 105
    .line 106
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/LinearRing;->getPointsForMilestones()Lorg/osmdroid/util/ListPointL;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Lorg/osmdroid/util/ListPointL;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Lorg/osmdroid/util/PointL;

    .line 125
    .line 126
    iget-wide v3, v2, Lorg/osmdroid/util/PointL;->x:J

    .line 127
    .line 128
    iget-wide v5, v2, Lorg/osmdroid/util/PointL;->y:J

    .line 129
    .line 130
    invoke-virtual {v0, v3, v4, v5, v6}, Lorg/osmdroid/views/overlay/milestones/e;->add(JJ)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_3
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/milestones/e;->end()V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lorg/osmdroid/views/overlay/milestones/e;

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/milestones/e;->a(Landroid/graphics/Canvas;)V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_5
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/OverlayWithIW;->isInfoWindowOpen()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_6

    .line 165
    .line 166
    iget-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 167
    .line 168
    if-eqz p1, :cond_6

    .line 169
    .line 170
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/infowindow/b;->f()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, p0, :cond_6

    .line 175
    .line 176
    iget-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 177
    .line 178
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/infowindow/b;->c()V

    .line 179
    .line 180
    .line 181
    :cond_6
    return-void
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

.method private drawWithPath(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lorg/osmdroid/views/overlay/LinearRing;->setClipArea(Lorg/osmdroid/views/Projection;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 12
    .line 13
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    move v1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v3

    .line 26
    :goto_0
    const/4 v4, 0x0

    .line 27
    invoke-virtual {v0, p2, v4, v1}, Lorg/osmdroid/views/overlay/LinearRing;->buildPathPortion(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lorg/osmdroid/views/overlay/milestones/e;

    .line 48
    .line 49
    invoke-virtual {v4}, Lorg/osmdroid/views/overlay/milestones/e;->init()V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 53
    .line 54
    invoke-virtual {v5}, Lorg/osmdroid/views/overlay/LinearRing;->getDistances()[D

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v4, v5}, Lorg/osmdroid/views/overlay/milestones/e;->b([D)V

    .line 59
    .line 60
    .line 61
    iget-object v5, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 62
    .line 63
    invoke-virtual {v5}, Lorg/osmdroid/views/overlay/LinearRing;->getPointsForMilestones()Lorg/osmdroid/util/ListPointL;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Lorg/osmdroid/util/ListPointL;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Lorg/osmdroid/util/PointL;

    .line 82
    .line 83
    iget-wide v7, v6, Lorg/osmdroid/util/PointL;->x:J

    .line 84
    .line 85
    iget-wide v9, v6, Lorg/osmdroid/util/PointL;->y:J

    .line 86
    .line 87
    invoke-virtual {v4, v7, v8, v9, v10}, Lorg/osmdroid/views/overlay/milestones/e;->add(JJ)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    invoke-virtual {v4}, Lorg/osmdroid/views/overlay/milestones/e;->end()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 96
    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lorg/osmdroid/views/overlay/LinearRing;

    .line 114
    .line 115
    invoke-virtual {v4, p2}, Lorg/osmdroid/views/overlay/LinearRing;->setClipArea(Lorg/osmdroid/views/Projection;)V

    .line 116
    .line 117
    .line 118
    iget-object v5, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-lez v5, :cond_3

    .line 125
    .line 126
    move v5, v2

    .line 127
    goto :goto_4

    .line 128
    :cond_3
    move v5, v3

    .line 129
    :goto_4
    invoke-virtual {v4, p2, v0, v5}, Lorg/osmdroid/views/overlay/LinearRing;->buildPathPortion(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 134
    .line 135
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 136
    .line 137
    invoke-virtual {p2, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    .line 141
    .line 142
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->isVisible(Landroid/graphics/Paint;)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_6

    .line 147
    .line 148
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 149
    .line 150
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    .line 151
    .line 152
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    .line 156
    .line 157
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->isVisible(Landroid/graphics/Paint;)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_7

    .line 162
    .line 163
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 164
    .line 165
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    .line 166
    .line 167
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    iget-object p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_8

    .line 181
    .line 182
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lorg/osmdroid/views/overlay/milestones/e;

    .line 187
    .line 188
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/milestones/e;->a(Landroid/graphics/Canvas;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/OverlayWithIW;->isInfoWindowOpen()Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-eqz p1, :cond_9

    .line 197
    .line 198
    iget-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 199
    .line 200
    if-eqz p1, :cond_9

    .line 201
    .line 202
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/infowindow/b;->f()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-ne p1, p0, :cond_9

    .line 207
    .line 208
    iget-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 209
    .line 210
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/infowindow/b;->c()V

    .line 211
    .line 212
    .line 213
    :cond_9
    return-void
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

.method private isVisible(Landroid/graphics/Paint;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isVisible(Lorg/osmdroid/views/Projection;)Z
    .locals 20

    move-object/from16 v0, p0

    .line 2
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getBounds()Lorg/osmdroid/util/BoundingBox;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getCenterLatitude()D

    move-result-wide v3

    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getCenterLongitude()D

    move-result-wide v5

    iget-object v7, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityProjectedCenter:Lorg/osmdroid/util/PointL;

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Lorg/osmdroid/views/Projection;->toProjectedPixels(DDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 4
    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    move-result-wide v9

    invoke-virtual {v1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v11

    iget-object v13, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityProjectedCorner:Lorg/osmdroid/util/PointL;

    move-object/from16 v8, p1

    invoke-virtual/range {v8 .. v13}, Lorg/osmdroid/views/Projection;->toProjectedPixels(DDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 5
    iget-object v2, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 6
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getProjectedPowerDifference()D

    move-result-wide v3

    const/4 v5, 0x1

    iget-object v6, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCenter:Lorg/osmdroid/util/PointL;

    move-object/from16 v1, p1

    .line 7
    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/Projection;->getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 8
    iget-object v8, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityProjectedCorner:Lorg/osmdroid/util/PointL;

    .line 9
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getProjectedPowerDifference()D

    move-result-wide v9

    const/4 v11, 0x1

    iget-object v12, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCorner:Lorg/osmdroid/util/PointL;

    move-object/from16 v7, p1

    .line 10
    invoke-virtual/range {v7 .. v12}, Lorg/osmdroid/views/Projection;->getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 11
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 12
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    .line 13
    iget-object v3, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCenter:Lorg/osmdroid/util/PointL;

    iget-wide v4, v3, Lorg/osmdroid/util/PointL;->x:J

    long-to-double v6, v4

    iget-wide v3, v3, Lorg/osmdroid/util/PointL;->y:J

    long-to-double v8, v3

    iget-object v3, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCorner:Lorg/osmdroid/util/PointL;

    iget-wide v4, v3, Lorg/osmdroid/util/PointL;->x:J

    long-to-double v10, v4

    iget-wide v3, v3, Lorg/osmdroid/util/PointL;->y:J

    long-to-double v12, v3

    invoke-static/range {v6 .. v13}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToPoint(DDDD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    .line 14
    iget-object v5, v0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mVisibilityRectangleCenter:Lorg/osmdroid/util/PointL;

    iget-wide v6, v5, Lorg/osmdroid/util/PointL;->x:J

    long-to-double v8, v6

    iget-wide v5, v5, Lorg/osmdroid/util/PointL;->y:J

    long-to-double v10, v5

    int-to-double v5, v1

    int-to-double v1, v2

    move-wide v12, v5

    move-wide v14, v1

    invoke-static/range {v8 .. v15}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToPoint(DDDD)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    move-wide/from16 v16, v5

    move-wide/from16 v18, v1

    .line 15
    invoke-static/range {v12 .. v19}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToPoint(DDDD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    add-double/2addr v3, v1

    cmpg-double v1, v7, v3

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private isWorthDisplaying(Lorg/osmdroid/views/Projection;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getBounds()Lorg/osmdroid/util/BoundingBox;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 19
    .line 20
    invoke-virtual {p1, v1, v2}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 21
    .line 22
    .line 23
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 37
    .line 38
    invoke-virtual {p1, v1, v0}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getWorldMapSize()D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 48
    .line 49
    int-to-double v2, p1

    .line 50
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 51
    .line 52
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 53
    .line 54
    int-to-double v4, p1

    .line 55
    move-wide v6, v0

    .line 56
    invoke-static/range {v2 .. v7}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 65
    .line 66
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 67
    .line 68
    int-to-double v2, p1

    .line 69
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 70
    .line 71
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 72
    .line 73
    int-to-double v4, p1

    .line 74
    invoke-static/range {v2 .. v7}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 83
    .line 84
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 85
    .line 86
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 87
    .line 88
    iget v2, v2, Landroid/graphics/Point;->x:I

    .line 89
    .line 90
    sub-int/2addr p1, v2

    .line 91
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    if-ge p1, v2, :cond_0

    .line 99
    .line 100
    return v3

    .line 101
    :cond_0
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 102
    .line 103
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 104
    .line 105
    int-to-long v4, p1

    .line 106
    sub-long/2addr v4, v8

    .line 107
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    iget p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 112
    .line 113
    int-to-long v6, p1

    .line 114
    cmp-long p1, v4, v6

    .line 115
    .line 116
    if-gez p1, :cond_1

    .line 117
    .line 118
    return v3

    .line 119
    :cond_1
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 120
    .line 121
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 122
    .line 123
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeBottomRight:Landroid/graphics/Point;

    .line 124
    .line 125
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 126
    .line 127
    sub-int/2addr p1, v2

    .line 128
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iget v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 133
    .line 134
    if-ge p1, v2, :cond_2

    .line 135
    .line 136
    return v3

    .line 137
    :cond_2
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeTopLeft:Landroid/graphics/Point;

    .line 138
    .line 139
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 140
    .line 141
    int-to-long v4, p1

    .line 142
    sub-long/2addr v4, v0

    .line 143
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    iget p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 148
    .line 149
    int-to-long v4, p1

    .line 150
    cmp-long p1, v0, v4

    .line 151
    .line 152
    if-gez p1, :cond_3

    .line 153
    .line 154
    return v3

    .line 155
    :cond_3
    const/4 p1, 0x1

    .line 156
    return p1
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
.method public addPoint(Lorg/osmdroid/util/GeoPoint;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/LinearRing;->addPoint(Lorg/osmdroid/util/GeoPoint;)V

    return-void
.end method

.method protected abstract click(Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z
.end method

.method public contains(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Landroid/graphics/Region;

    .line 23
    .line 24
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 28
    .line 29
    new-instance v3, Landroid/graphics/Region;

    .line 30
    .line 31
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 32
    .line 33
    float-to-int v4, v4

    .line 34
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    float-to-int v5, v5

    .line 37
    iget v6, v0, Landroid/graphics/RectF;->right:F

    .line 38
    .line 39
    float-to-int v6, v6

    .line 40
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 41
    .line 42
    float-to-int v0, v0

    .line 43
    invoke-direct {v3, v4, v5, v6, v0}, Landroid/graphics/Region;-><init>(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    float-to-int v0, v0

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    float-to-int p1, p1

    .line 59
    invoke-virtual {v1, v0, p1}, Landroid/graphics/Region;->contains(II)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1
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
.end method

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->isVisible(Lorg/osmdroid/views/Projection;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 9
    .line 10
    if-lez v0, :cond_2

    .line 11
    .line 12
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->isWorthDisplaying(Lorg/osmdroid/views/Projection;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeDisplay:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->displayDowngrade(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void

    .line 26
    :cond_2
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->drawWithPath(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->drawWithLines(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
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

.method public getActualPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->getPoints()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getBounds()Lorg/osmdroid/util/BoundingBox;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    return-object v0
.end method

.method public getCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/MapView;)Lorg/osmdroid/util/GeoPoint;
    .locals 6

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {p4}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v4

    iget-boolean v5, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mClosePath:Z

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/overlay/LinearRing;->getCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/Projection;Z)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public getDistance()D
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->getDistance()D

    move-result-wide v0

    return-wide v0
.end method

.method protected getFillPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mFillPaint:Landroid/graphics/Paint;

    return-object v0
.end method

.method public getInfoWindowLocation()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getOutlinePaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mIsPaintOrPaintList:Z

    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public getOutlinePaintLists()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/PaintList;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mIsPaintOrPaintList:Z

    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaintLists:Ljava/util/List;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public isCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/MapView;)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/MapView;)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isGeodesic()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->isGeodesic()Z

    move-result v0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/Overlay;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/LinearRing;->clear()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mHoles:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/OverlayWithIW;->onDestroy()V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    float-to-int v1, v1

    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    float-to-int v2, v2

    .line 15
    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/views/Projection;->fromPixels(II)Lorg/osmdroid/api/IGeoPoint;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lorg/osmdroid/util/GeoPoint;

    .line 20
    .line 21
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->contains(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDensity:F

    .line 41
    .line 42
    mul-float/2addr p1, v1

    .line 43
    iget v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDensityMultiplier:F

    .line 44
    .line 45
    mul-float/2addr p1, v1

    .line 46
    float-to-double v1, p1

    .line 47
    invoke-virtual {p0, v0, v1, v2, p2}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/MapView;)Lorg/osmdroid/util/GeoPoint;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, p2, v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->click(Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    return p1
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

.method protected setDefaultInfoWindowLocation()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->getPoints()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v1, v2}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    .line 28
    .line 29
    invoke-direct {v0, v1, v2, v1, v2}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 35
    .line 36
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/LinearRing;->getCenter(Lorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public setDensityMultiplier(F)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDensityMultiplier:F

    return-void
.end method

.method public setDowngradeDisplay(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeDisplay:Z

    return-void
.end method

.method public setDowngradePixelSizes(II)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumRectanglePixelSize:I

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mDowngradeMaximumPixelSize:I

    .line 8
    .line 9
    return-void
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

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/LinearRing;->setGeodesic(Z)V

    return-void
.end method

.method public setInfoWindow(Lorg/osmdroid/views/overlay/infowindow/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/infowindow/b;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/infowindow/b;->m(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 18
    .line 19
    return-void
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

.method public setInfoWindowLocation(Lorg/osmdroid/util/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    return-void
.end method

.method public setMilestoneManagers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/milestones/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-lez p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mMilestoneManagers:Ljava/util/List;

    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
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

.method public setPoints(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/LinearRing;->setPoints(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setDefaultInfoWindowLocation()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setVisible(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/Overlay;->setEnabled(Z)V

    return-void
.end method

.method public showInfoWindow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mInfoWindowLocation:Lorg/osmdroid/util/GeoPoint;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p0, v1, v2, v2}, Lorg/osmdroid/views/overlay/infowindow/b;->l(Ljava/lang/Object;Lorg/osmdroid/util/GeoPoint;II)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
.end method

.method public usePath(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->getPoints()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 20
    .line 21
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 22
    .line 23
    new-instance v1, Lorg/osmdroid/views/overlay/LinearRing;

    .line 24
    .line 25
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mClosePath:Z

    .line 26
    .line 27
    invoke-direct {v1, p1, v2}, Lorg/osmdroid/views/overlay/LinearRing;-><init>(Landroid/graphics/Path;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mPath:Landroid/graphics/Path;

    .line 34
    .line 35
    new-instance p1, Lorg/osmdroid/views/overlay/LineDrawer;

    .line 36
    .line 37
    const/16 v1, 0x100

    .line 38
    .line 39
    invoke-direct {p1, v1}, Lorg/osmdroid/views/overlay/LineDrawer;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 43
    .line 44
    new-instance v1, Lorg/osmdroid/views/overlay/LinearRing;

    .line 45
    .line 46
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mClosePath:Z

    .line 47
    .line 48
    invoke-direct {v1, p1, v2}, Lorg/osmdroid/views/overlay/LinearRing;-><init>(Lorg/osmdroid/util/LineBuilder;Z)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    .line 52
    .line 53
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mLineDrawer:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 54
    .line 55
    iget-object v1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lorg/osmdroid/views/overlay/LineDrawer;->setPaint(Landroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->setPoints(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
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
