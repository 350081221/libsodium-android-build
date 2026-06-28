.class public abstract Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# instance fields
.field private mBackingBitmap:Landroid/graphics/Bitmap;

.field private mBackingCanvas:Landroid/graphics/Canvas;

.field private final mBackingMatrix:Landroid/graphics/Matrix;

.field private final mCanvasIdentityMatrix:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingMatrix:Landroid/graphics/Matrix;

    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mCanvasIdentityMatrix:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lorg/osmdroid/views/overlay/Overlay;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingMatrix:Landroid/graphics/Matrix;

    .line 3
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mCanvasIdentityMatrix:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->isUsingBackingBitmap()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-ne v0, v2, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eq v0, v2, :cond_3

    .line 55
    .line 56
    :cond_2
    iput-object v1, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    iput-object v1, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingCanvas:Landroid/graphics/Canvas;

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    invoke-static {v0, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    new-instance v0, Landroid/graphics/Canvas;

    .line 77
    .line 78
    iget-object v2, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingCanvas:Landroid/graphics/Canvas;

    .line 84
    .line 85
    :cond_3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingCanvas:Landroid/graphics/Canvas;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingMatrix:Landroid/graphics/Matrix;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingCanvas:Landroid/graphics/Canvas;

    .line 99
    .line 100
    iget-object v2, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingMatrix:Landroid/graphics/Matrix;

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingCanvas:Landroid/graphics/Canvas;

    .line 106
    .line 107
    invoke-virtual {p0, v0, p1, p2, p3}, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->onDraw(Landroid/graphics/Canvas;Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mCanvasIdentityMatrix:Landroid/graphics/Matrix;

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 116
    .line 117
    .line 118
    iget-object p2, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mCanvasIdentityMatrix:Landroid/graphics/Matrix;

    .line 119
    .line 120
    invoke-virtual {p2, p2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mCanvasIdentityMatrix:Landroid/graphics/Matrix;

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 126
    .line 127
    .line 128
    iget-object p2, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;

    .line 129
    .line 130
    const/4 p3, 0x0

    .line 131
    invoke-virtual {p1, p2, p3, p3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :catch_0
    const-string p1, "OsmDroid"

    .line 139
    .line 140
    const-string p2, "OutOfMemoryError creating backing bitmap in NonAcceleratedOverlay."

    .line 141
    .line 142
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 146
    .line 147
    .line 148
    :cond_4
    :goto_0
    return-void

    .line 149
    :cond_5
    invoke-virtual {p0, p1, p1, p2, p3}, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->onDraw(Landroid/graphics/Canvas;Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-void
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

.method public isUsingBackingBitmap()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingBitmap:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    iput-object v0, p0, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->mBackingCanvas:Landroid/graphics/Canvas;

    .line 5
    .line 6
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/Overlay;->onDetach(Lorg/osmdroid/views/MapView;)V

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

.method protected onDraw(Landroid/graphics/Canvas;Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V
    .locals 0

    invoke-virtual {p0, p1, p3, p4}, Lorg/osmdroid/views/overlay/NonAcceleratedOverlay;->onDraw(Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V

    return-void
.end method

.method protected abstract onDraw(Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V
.end method
