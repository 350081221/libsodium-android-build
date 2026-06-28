.class public final Landroidx/compose/foundation/gestures/TransformableKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u001a<\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u0007\u001a>\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/foundation/gestures/TransformableState;",
        "state",
        "",
        "lockRotationOnZoomPan",
        "enabled",
        "transformable",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/geometry/Offset;",
        "canPan",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "panZoomLock",
        "Lkotlinx/coroutines/channels/l;",
        "Landroidx/compose/foundation/gestures/TransformEvent;",
        "channel",
        "Lkotlin/r2;",
        "detectZoom",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/l;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,277:1\n101#2,2:278\n33#2,6:280\n103#2:286\n33#2,6:287\n101#2,2:293\n33#2,6:295\n103#2:301\n101#2,2:302\n33#2,6:304\n103#2:310\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n219#1:278,2\n219#1:280,6\n219#1:286\n253#1:287,6\n264#1:293,2\n264#1:295,6\n264#1:301\n265#1:302,2\n265#1:304,6\n265#1:310\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$detectZoom(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/l;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/TransformableKt;->detectZoom(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/l;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final detectZoom(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/l;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Z",
            "Lkotlinx/coroutines/channels/l<",
            "Landroidx/compose/foundation/gestures/TransformEvent;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;-><init>(Lkotlin/coroutines/d;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 34
    .line 35
    const/4 v10, 0x3

    .line 36
    const/4 v11, 0x2

    .line 37
    const/4 v14, 0x1

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v14, :cond_3

    .line 41
    .line 42
    if-eq v2, v11, :cond_2

    .line 43
    .line 44
    if-ne v2, v10, :cond_1

    .line 45
    .line 46
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$2:I

    .line 47
    .line 48
    iget v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 49
    .line 50
    iget v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 51
    .line 52
    iget v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 53
    .line 54
    iget-wide v6, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 55
    .line 56
    iget v15, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 57
    .line 58
    iget v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 59
    .line 60
    iget-boolean v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 61
    .line 62
    iget-object v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$3:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 65
    .line 66
    iget-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v13, Lv3/l;

    .line 69
    .line 70
    iget-object v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v9, Lkotlinx/coroutines/channels/l;

    .line 73
    .line 74
    iget-object v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v12, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move/from16 v19, v11

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/high16 v18, 0x3f800000    # 1.0f

    .line 86
    .line 87
    move v11, v10

    .line 88
    move-object v10, v9

    .line 89
    move-object v9, v8

    .line 90
    move v8, v15

    .line 91
    move v15, v2

    .line 92
    move-object v2, v0

    .line 93
    const/4 v0, 0x3

    .line 94
    goto/16 :goto_e

    .line 95
    .line 96
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_2
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 105
    .line 106
    iget v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 107
    .line 108
    iget v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 109
    .line 110
    iget-wide v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 111
    .line 112
    iget v7, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 113
    .line 114
    iget v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 115
    .line 116
    iget-boolean v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 117
    .line 118
    iget-object v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v11, Lv3/l;

    .line 121
    .line 122
    iget-object v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v12, Lkotlinx/coroutines/channels/l;

    .line 125
    .line 126
    iget-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v13, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 129
    .line 130
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move v14, v10

    .line 134
    const/4 v10, 0x2

    .line 135
    move-object/from16 v28, v11

    .line 136
    .line 137
    move v11, v9

    .line 138
    move-object v9, v12

    .line 139
    move-object v12, v13

    .line 140
    move-object/from16 v13, v28

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :cond_3
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 145
    .line 146
    iget v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 147
    .line 148
    iget v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 149
    .line 150
    iget-wide v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 151
    .line 152
    iget v7, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 153
    .line 154
    iget v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 155
    .line 156
    iget-boolean v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 157
    .line 158
    iget-object v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v11, Lv3/l;

    .line 161
    .line 162
    iget-object v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v12, Lkotlinx/coroutines/channels/l;

    .line 165
    .line 166
    iget-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v13, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 169
    .line 170
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move v14, v10

    .line 174
    move-object/from16 v28, v13

    .line 175
    .line 176
    move-object v13, v11

    .line 177
    move-object/from16 v11, v28

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_4
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    const/4 v3, 0x0

    .line 198
    const/4 v4, 0x0

    .line 199
    const/4 v6, 0x2

    .line 200
    const/4 v7, 0x0

    .line 201
    move-object/from16 v11, p0

    .line 202
    .line 203
    iput-object v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 204
    .line 205
    move-object/from16 v12, p2

    .line 206
    .line 207
    iput-object v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    move-object/from16 v13, p3

    .line 210
    .line 211
    iput-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 212
    .line 213
    move/from16 v14, p1

    .line 214
    .line 215
    iput-boolean v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 216
    .line 217
    const/4 v2, 0x0

    .line 218
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 219
    .line 220
    const/high16 v2, 0x3f800000    # 1.0f

    .line 221
    .line 222
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 223
    .line 224
    iput-wide v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 225
    .line 226
    const/4 v2, 0x0

    .line 227
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 228
    .line 229
    iput v0, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 230
    .line 231
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 232
    .line 233
    const/4 v2, 0x1

    .line 234
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 235
    .line 236
    move-object/from16 v2, p0

    .line 237
    .line 238
    move-object v5, v1

    .line 239
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-ne v2, v8, :cond_5

    .line 244
    .line 245
    return-object v8

    .line 246
    :cond_5
    move v3, v0

    .line 247
    move-wide v5, v9

    .line 248
    const/4 v2, 0x0

    .line 249
    const/4 v4, 0x0

    .line 250
    const/high16 v7, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/4 v9, 0x0

    .line 253
    :goto_1
    iput-object v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 258
    .line 259
    const/4 v0, 0x0

    .line 260
    iput-object v0, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$3:Ljava/lang/Object;

    .line 261
    .line 262
    iput-boolean v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 263
    .line 264
    iput v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 265
    .line 266
    iput v7, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 267
    .line 268
    iput-wide v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 269
    .line 270
    iput v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 271
    .line 272
    iput v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 273
    .line 274
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 275
    .line 276
    const/4 v10, 0x2

    .line 277
    iput v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 278
    .line 279
    const/4 v15, 0x1

    .line 280
    invoke-static {v11, v0, v1, v15, v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-ne v0, v8, :cond_6

    .line 285
    .line 286
    return-object v8

    .line 287
    :cond_6
    move-object/from16 v28, v11

    .line 288
    .line 289
    move v11, v9

    .line 290
    move-object v9, v12

    .line 291
    move-object/from16 v12, v28

    .line 292
    .line 293
    :goto_2
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v15

    .line 299
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    move/from16 p0, v2

    .line 304
    .line 305
    const/4 v2, 0x0

    .line 306
    :goto_3
    if-ge v2, v10, :cond_8

    .line 307
    .line 308
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v20

    .line 312
    check-cast v20, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 313
    .line 314
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 315
    .line 316
    .line 317
    move-result v20

    .line 318
    if-eqz v20, :cond_7

    .line 319
    .line 320
    const/4 v2, 0x1

    .line 321
    goto :goto_4

    .line 322
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_8
    const/4 v2, 0x0

    .line 326
    :goto_4
    if-nez v2, :cond_16

    .line 327
    .line 328
    invoke-static {v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateZoom(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 329
    .line 330
    .line 331
    move-result v21

    .line 332
    invoke-static {v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateRotation(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 333
    .line 334
    .line 335
    move-result v10

    .line 336
    move-object v15, v1

    .line 337
    move/from16 p1, v2

    .line 338
    .line 339
    invoke-static {v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculatePan(Landroidx/compose/ui/input/pointer/PointerEvent;)J

    .line 340
    .line 341
    .line 342
    move-result-wide v1

    .line 343
    if-nez v4, :cond_c

    .line 344
    .line 345
    mul-float v7, v7, v21

    .line 346
    .line 347
    add-float/2addr v11, v10

    .line 348
    invoke-static {v5, v6, v1, v2}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 349
    .line 350
    .line 351
    move-result-wide v5

    .line 352
    move/from16 p2, v4

    .line 353
    .line 354
    const/4 v4, 0x0

    .line 355
    invoke-static {v0, v4}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateCentroidSize(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F

    .line 356
    .line 357
    .line 358
    move-result v17

    .line 359
    move/from16 v16, v10

    .line 360
    .line 361
    const/4 v4, 0x1

    .line 362
    int-to-float v10, v4

    .line 363
    sub-float/2addr v10, v7

    .line 364
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    mul-float v10, v10, v17

    .line 369
    .line 370
    const v20, 0x40490fdb    # (float)Math.PI

    .line 371
    .line 372
    .line 373
    mul-float v20, v20, v11

    .line 374
    .line 375
    mul-float v20, v20, v17

    .line 376
    .line 377
    const/high16 v17, 0x43340000    # 180.0f

    .line 378
    .line 379
    div-float v20, v20, v17

    .line 380
    .line 381
    invoke-static/range {v20 .. v20}, Ljava/lang/Math;->abs(F)F

    .line 382
    .line 383
    .line 384
    move-result v17

    .line 385
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 386
    .line 387
    .line 388
    move-result v20

    .line 389
    cmpl-float v10, v10, v3

    .line 390
    .line 391
    if-gtz v10, :cond_a

    .line 392
    .line 393
    cmpl-float v10, v17, v3

    .line 394
    .line 395
    if-gtz v10, :cond_a

    .line 396
    .line 397
    cmpl-float v10, v20, v3

    .line 398
    .line 399
    if-lez v10, :cond_9

    .line 400
    .line 401
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    invoke-interface {v13, v10}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    check-cast v10, Ljava/lang/Boolean;

    .line 410
    .line 411
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    if-eqz v10, :cond_9

    .line 416
    .line 417
    goto :goto_5

    .line 418
    :cond_9
    move/from16 v10, p0

    .line 419
    .line 420
    move/from16 v4, p2

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_a
    :goto_5
    if-eqz v14, :cond_b

    .line 424
    .line 425
    cmpg-float v10, v17, v3

    .line 426
    .line 427
    if-gez v10, :cond_b

    .line 428
    .line 429
    move v10, v4

    .line 430
    goto :goto_6

    .line 431
    :cond_b
    const/4 v10, 0x0

    .line 432
    :goto_6
    sget-object v4, Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;

    .line 433
    .line 434
    invoke-interface {v9, v4}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    const/4 v4, 0x1

    .line 438
    goto :goto_7

    .line 439
    :cond_c
    move/from16 p2, v4

    .line 440
    .line 441
    move/from16 v16, v10

    .line 442
    .line 443
    move/from16 v10, p0

    .line 444
    .line 445
    :goto_7
    if-eqz v4, :cond_14

    .line 446
    .line 447
    if-eqz v10, :cond_d

    .line 448
    .line 449
    const/16 v16, 0x0

    .line 450
    .line 451
    const/16 v24, 0x0

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_d
    move/from16 v24, v16

    .line 455
    .line 456
    const/16 v16, 0x0

    .line 457
    .line 458
    :goto_8
    cmpg-float v19, v24, v16

    .line 459
    .line 460
    if-nez v19, :cond_e

    .line 461
    .line 462
    const/16 v19, 0x1

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_e
    const/16 v19, 0x0

    .line 466
    .line 467
    :goto_9
    if-eqz v19, :cond_11

    .line 468
    .line 469
    const/high16 v18, 0x3f800000    # 1.0f

    .line 470
    .line 471
    cmpg-float v19, v21, v18

    .line 472
    .line 473
    if-nez v19, :cond_f

    .line 474
    .line 475
    const/16 v19, 0x1

    .line 476
    .line 477
    goto :goto_a

    .line 478
    :cond_f
    const/16 v19, 0x0

    .line 479
    .line 480
    :goto_a
    if-eqz v19, :cond_10

    .line 481
    .line 482
    sget-object v19, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 483
    .line 484
    move/from16 p0, v4

    .line 485
    .line 486
    move-wide/from16 v26, v5

    .line 487
    .line 488
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 489
    .line 490
    .line 491
    move-result-wide v4

    .line 492
    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    if-nez v4, :cond_12

    .line 497
    .line 498
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    invoke-interface {v13, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    check-cast v4, Ljava/lang/Boolean;

    .line 507
    .line 508
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    if-eqz v4, :cond_12

    .line 513
    .line 514
    goto :goto_b

    .line 515
    :cond_10
    move/from16 p0, v4

    .line 516
    .line 517
    move-wide/from16 v26, v5

    .line 518
    .line 519
    goto :goto_b

    .line 520
    :cond_11
    move/from16 p0, v4

    .line 521
    .line 522
    move-wide/from16 v26, v5

    .line 523
    .line 524
    const/high16 v18, 0x3f800000    # 1.0f

    .line 525
    .line 526
    :goto_b
    new-instance v4, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;

    .line 527
    .line 528
    const/16 v25, 0x0

    .line 529
    .line 530
    move-object/from16 v20, v4

    .line 531
    .line 532
    move-wide/from16 v22, v1

    .line 533
    .line 534
    invoke-direct/range {v20 .. v25}, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;-><init>(FJFLkotlin/jvm/internal/w;)V

    .line 535
    .line 536
    .line 537
    invoke-interface {v9, v4}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    :cond_12
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    const/4 v4, 0x0

    .line 549
    :goto_c
    if-ge v4, v2, :cond_15

    .line 550
    .line 551
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 556
    .line 557
    invoke-static {v5}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChanged(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-eqz v6, :cond_13

    .line 562
    .line 563
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 564
    .line 565
    .line 566
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 567
    .line 568
    goto :goto_c

    .line 569
    :cond_14
    move/from16 p0, v4

    .line 570
    .line 571
    move-wide/from16 v26, v5

    .line 572
    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    const/high16 v18, 0x3f800000    # 1.0f

    .line 576
    .line 577
    :cond_15
    move/from16 v5, p0

    .line 578
    .line 579
    move v1, v7

    .line 580
    move-wide/from16 v6, v26

    .line 581
    .line 582
    goto :goto_d

    .line 583
    :cond_16
    move-object v15, v1

    .line 584
    move/from16 p1, v2

    .line 585
    .line 586
    move/from16 p2, v4

    .line 587
    .line 588
    const/16 v16, 0x0

    .line 589
    .line 590
    const/high16 v18, 0x3f800000    # 1.0f

    .line 591
    .line 592
    sget-object v1, Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;

    .line 593
    .line 594
    invoke-interface {v9, v1}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move/from16 v10, p0

    .line 598
    .line 599
    move v1, v7

    .line 600
    move-wide v6, v5

    .line 601
    move/from16 v5, p2

    .line 602
    .line 603
    :goto_d
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 604
    .line 605
    move-object v4, v15

    .line 606
    iput-object v12, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 607
    .line 608
    iput-object v9, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 609
    .line 610
    iput-object v13, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 611
    .line 612
    iput-object v0, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$3:Ljava/lang/Object;

    .line 613
    .line 614
    iput-boolean v14, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 615
    .line 616
    iput v11, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 617
    .line 618
    iput v1, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 619
    .line 620
    iput-wide v6, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 621
    .line 622
    iput v5, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 623
    .line 624
    iput v3, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 625
    .line 626
    iput v10, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 627
    .line 628
    move/from16 v15, p1

    .line 629
    .line 630
    iput v15, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$2:I

    .line 631
    .line 632
    move-object/from16 p0, v0

    .line 633
    .line 634
    const/4 v0, 0x3

    .line 635
    iput v0, v4, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 636
    .line 637
    invoke-interface {v12, v2, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    if-ne v2, v8, :cond_17

    .line 642
    .line 643
    return-object v8

    .line 644
    :cond_17
    move/from16 v19, v14

    .line 645
    .line 646
    move-object/from16 v14, p0

    .line 647
    .line 648
    move-object/from16 v28, v8

    .line 649
    .line 650
    move v8, v1

    .line 651
    move-object v1, v4

    .line 652
    move v4, v3

    .line 653
    move v3, v10

    .line 654
    move-object v10, v9

    .line 655
    move-object/from16 v9, v28

    .line 656
    .line 657
    :goto_e
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 658
    .line 659
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    move-object/from16 p0, v1

    .line 668
    .line 669
    const/4 v1, 0x0

    .line 670
    :goto_f
    if-ge v1, v0, :cond_19

    .line 671
    .line 672
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v20

    .line 676
    check-cast v20, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 677
    .line 678
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 679
    .line 680
    .line 681
    move-result v20

    .line 682
    if-eqz v20, :cond_18

    .line 683
    .line 684
    const/4 v2, 0x1

    .line 685
    goto :goto_10

    .line 686
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 687
    .line 688
    goto :goto_f

    .line 689
    :cond_19
    const/4 v2, 0x0

    .line 690
    :goto_10
    if-eqz v2, :cond_1a

    .line 691
    .line 692
    if-nez v5, :cond_1a

    .line 693
    .line 694
    const/4 v2, 0x1

    .line 695
    goto :goto_11

    .line 696
    :cond_1a
    const/4 v2, 0x0

    .line 697
    :goto_11
    if-nez v15, :cond_1e

    .line 698
    .line 699
    if-nez v2, :cond_1e

    .line 700
    .line 701
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    const/4 v2, 0x0

    .line 710
    :goto_12
    if-ge v2, v1, :cond_1c

    .line 711
    .line 712
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v14

    .line 716
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 717
    .line 718
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 719
    .line 720
    .line 721
    move-result v14

    .line 722
    if-eqz v14, :cond_1b

    .line 723
    .line 724
    const/4 v2, 0x1

    .line 725
    goto :goto_13

    .line 726
    :cond_1b
    add-int/lit8 v2, v2, 0x1

    .line 727
    .line 728
    goto :goto_12

    .line 729
    :cond_1c
    const/4 v2, 0x0

    .line 730
    :goto_13
    if-nez v2, :cond_1d

    .line 731
    .line 732
    goto :goto_14

    .line 733
    :cond_1d
    move-object/from16 v1, p0

    .line 734
    .line 735
    move v2, v3

    .line 736
    move v3, v4

    .line 737
    move v4, v5

    .line 738
    move-wide v5, v6

    .line 739
    move v7, v8

    .line 740
    move-object v8, v9

    .line 741
    move v9, v11

    .line 742
    move-object v11, v12

    .line 743
    move/from16 v14, v19

    .line 744
    .line 745
    move-object v12, v10

    .line 746
    goto/16 :goto_1

    .line 747
    .line 748
    :cond_1e
    :goto_14
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 749
    .line 750
    return-object v0
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
.end method

.method public static final transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lv3/l;ZZ)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/TransformableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/gestures/TransformableState;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Ljava/lang/Boolean;",
            ">;ZZ)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableElement;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/TransformableElement;-><init>(Landroidx/compose/foundation/gestures/TransformableState;Lv3/l;ZZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/TransformableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/TransformableKt$transformable$1;->INSTANCE:Landroidx/compose/foundation/gestures/TransformableKt$transformable$1;

    invoke-static {p0, p1, v0, p2, p3}, Landroidx/compose/foundation/gestures/TransformableKt;->transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lv3/l;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic transformable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lv3/l;ZZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x1

    .line 2
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/TransformableKt;->transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lv3/l;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic transformable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x1

    .line 1
    :cond_1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/TransformableKt;->transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
