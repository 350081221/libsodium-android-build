.class public final Landroidx/compose/ui/layout/LayoutCoordinatesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u00a2\u0006\u0002\u0010\u0008\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002\u00a2\u0006\u0002\u0010\u0008\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "boundsInParent",
        "Landroidx/compose/ui/geometry/Rect;",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "boundsInRoot",
        "boundsInWindow",
        "findRootCoordinates",
        "positionInParent",
        "Landroidx/compose/ui/geometry/Offset;",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;)J",
        "positionInRoot",
        "positionInWindow",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final boundsInParent(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;
    .locals 4
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getParentLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v0, p0, v3, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localBoundingBoxOf$default(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;ZILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    :cond_0
    new-instance v0, Landroidx/compose/ui/geometry/Rect;

    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    int-to-float p0, p0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, v2, v2, v1, p0}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object v0
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
.end method

.method public static final boundsInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;
    .locals 4
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localBoundingBoxOf$default(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;ZILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static final boundsInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;
    .locals 17
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    int-to-float v2, v2

    .line 18
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    int-to-float v3, v3

    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v4, v5, v2}, Lkotlin/ranges/s;->H(FFF)F

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-static {v6, v5, v3}, Lkotlin/ranges/s;->H(FFF)F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-static {v7, v5, v2}, Lkotlin/ranges/s;->H(FFF)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1, v5, v3}, Lkotlin/ranges/s;->H(FFF)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    cmpg-float v3, v4, v2

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    const/4 v7, 0x0

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    move v3, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v3, v7

    .line 69
    :goto_0
    if-nez v3, :cond_3

    .line 70
    .line 71
    cmpg-float v3, v6, v1

    .line 72
    .line 73
    if-nez v3, :cond_1

    .line 74
    .line 75
    move v3, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move v3, v7

    .line 78
    :goto_1
    if-eqz v3, :cond_2

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_2
    invoke-static {v4, v6}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    invoke-interface {v0, v8, v9}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    invoke-static {v2, v6}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 91
    .line 92
    .line 93
    move-result-wide v10

    .line 94
    invoke-interface {v0, v10, v11}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v10

    .line 98
    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    invoke-interface {v0, v2, v3}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    invoke-static {v4, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 107
    .line 108
    .line 109
    move-result-wide v12

    .line 110
    invoke-interface {v0, v12, v13}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    const/4 v6, 0x3

    .line 119
    new-array v12, v6, [F

    .line 120
    .line 121
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    aput v13, v12, v7

    .line 126
    .line 127
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    aput v13, v12, v5

    .line 132
    .line 133
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    const/4 v14, 0x2

    .line 138
    aput v13, v12, v14

    .line 139
    .line 140
    invoke-static {v4, v12}, Lkotlin/comparisons/a;->l0(F[F)F

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    new-array v13, v6, [F

    .line 149
    .line 150
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    aput v15, v13, v7

    .line 155
    .line 156
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    aput v15, v13, v5

    .line 161
    .line 162
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    aput v15, v13, v14

    .line 167
    .line 168
    invoke-static {v12, v13}, Lkotlin/comparisons/a;->l0(F[F)F

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    new-array v15, v6, [F

    .line 177
    .line 178
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    aput v16, v15, v7

    .line 183
    .line 184
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 185
    .line 186
    .line 187
    move-result v16

    .line 188
    aput v16, v15, v5

    .line 189
    .line 190
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    aput v16, v15, v14

    .line 195
    .line 196
    invoke-static {v13, v15}, Lkotlin/comparisons/a;->Q(F[F)F

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    new-array v6, v6, [F

    .line 205
    .line 206
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    aput v9, v6, v7

    .line 211
    .line 212
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    aput v0, v6, v5

    .line 217
    .line 218
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    aput v0, v6, v14

    .line 223
    .line 224
    invoke-static {v8, v6}, Lkotlin/comparisons/a;->Q(F[F)F

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    new-instance v1, Landroidx/compose/ui/geometry/Rect;

    .line 229
    .line 230
    invoke-direct {v1, v4, v12, v13, v0}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 231
    .line 232
    .line 233
    return-object v1

    .line 234
    :cond_3
    :goto_2
    sget-object v0, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect$Companion;->getZero()Landroidx/compose/ui/geometry/Rect;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0
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
.end method

.method public static final findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 2
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getParentLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    move-object v1, v0

    .line 6
    move-object v0, p0

    .line 7
    move-object p0, v1

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getParentLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p0, v0, Landroidx/compose/ui/node/NodeCoordinator;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    move-object p0, v0

    .line 20
    check-cast p0, Landroidx/compose/ui/node/NodeCoordinator;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    :goto_1
    if-nez p0, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_2
    move-object v1, v0

    .line 32
    move-object v0, p0

    .line 33
    move-object p0, v1

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    return-object v0
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
.end method

.method public static final positionInParent(Landroidx/compose/ui/layout/LayoutCoordinates;)J
    .locals 3
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getParentLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v1

    invoke-interface {v0, p0, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static final positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J
    .locals 2
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final positionInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)J
    .locals 2
    .param p0    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    move-result-wide v0

    return-wide v0
.end method
