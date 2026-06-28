.class public Lorg/osmdroid/views/overlay/Polyline;
.super Lorg/osmdroid/views/overlay/PolyOverlayWithIW;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/Polyline$OnClickListener;
    }
.end annotation


# instance fields
.field protected mOnClickListener:Lorg/osmdroid/views/overlay/Polyline$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lorg/osmdroid/views/overlay/Polyline;-><init>(Lorg/osmdroid/views/MapView;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lorg/osmdroid/views/overlay/Polyline;-><init>(Lorg/osmdroid/views/MapView;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/views/overlay/Polyline;-><init>(Lorg/osmdroid/views/MapView;ZZ)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;ZZ)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;-><init>(Lorg/osmdroid/views/MapView;ZZ)V

    .line 4
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    const/high16 p2, 0x41200000    # 10.0f

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iget-object p1, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method protected click(Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/Polyline;->mOnClickListener:Lorg/osmdroid/views/overlay/Polyline$OnClickListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p0, p1, p2}, Lorg/osmdroid/views/overlay/Polyline;->onClickDefault(Lorg/osmdroid/views/overlay/Polyline;Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-interface {v0, p0, p1, p2}, Lorg/osmdroid/views/overlay/Polyline$OnClickListener;->onClick(Lorg/osmdroid/views/overlay/Polyline;Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z

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

.method public getColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getDistance()D
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutline:Lorg/osmdroid/views/overlay/LinearRing;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/LinearRing;->getDistance()D

    move-result-wide v0

    return-wide v0
.end method

.method public getPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getOutlinePaint()Landroid/graphics/Paint;

    move-result-object v0

    return-object v0
.end method

.method public getPoints()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->getActualPoints()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getWidth()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    return v0
.end method

.method public onClickDefault(Lorg/osmdroid/views/overlay/Polyline;Lorg/osmdroid/views/MapView;Lorg/osmdroid/util/GeoPoint;)Z
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
    iput-object p1, p0, Lorg/osmdroid/views/overlay/Polyline;->mOnClickListener:Lorg/osmdroid/views/overlay/Polyline$OnClickListener;

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

.method public setColor(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setOnClickListener(Lorg/osmdroid/views/overlay/Polyline$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/Polyline;->mOnClickListener:Lorg/osmdroid/views/overlay/Polyline$OnClickListener;

    return-void
.end method

.method public setWidth(F)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/PolyOverlayWithIW;->mOutlinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method
