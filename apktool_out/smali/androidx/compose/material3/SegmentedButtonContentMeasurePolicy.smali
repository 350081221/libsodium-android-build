.class public final Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MultiContentMeasurePolicy;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ2\u0010\u000b\u001a\u00020\u0008*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;",
        "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "measurables",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
        "measure",
        "Lkotlinx/coroutines/s0;",
        "scope",
        "Lkotlinx/coroutines/s0;",
        "getScope",
        "()Lkotlinx/coroutines/s0;",
        "Landroidx/compose/animation/core/Animatable;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "animatable",
        "Landroidx/compose/animation/core/Animatable;",
        "getAnimatable",
        "()Landroidx/compose/animation/core/Animatable;",
        "setAnimatable",
        "(Landroidx/compose/animation/core/Animatable;)V",
        "initialOffset",
        "Ljava/lang/Integer;",
        "<init>",
        "(Lkotlinx/coroutines/s0;)V",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,786:1\n151#2,3:787\n33#2,4:790\n154#2,2:794\n38#2:796\n156#2:797\n171#2,13:798\n151#2,3:811\n33#2,4:814\n154#2,2:818\n38#2:820\n156#2:821\n171#2,13:822\n171#2,13:835\n1#3:848\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:787,3\n354#1:790,4\n354#1:794,2\n354#1:796\n354#1:797\n355#1:798,13\n356#1:811,3\n356#1:814,4\n356#1:818,2\n356#1:820\n356#1:821\n357#1:822,13\n358#1:835,13\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private animatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private initialOffset:Ljava/lang/Integer;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final scope:Lkotlinx/coroutines/s0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/s0;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->scope:Lkotlinx/coroutines/s0;

    .line 5
    .line 6
    return-void
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
.end method


# virtual methods
.method public final getAnimatable()Landroidx/compose/animation/core/Animatable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->animatable:Landroidx/compose/animation/core/Animatable;

    return-object v0
.end method

.method public final getScope()Lkotlinx/coroutines/s0;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->scope:Lkotlinx/coroutines/s0;

    return-object v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 20
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;>;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-wide/from16 v1, p3

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Ljava/util/List;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    new-instance v6, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    move v10, v3

    .line 37
    :goto_0
    if-ge v10, v9, :cond_0

    .line 38
    .line 39
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .line 44
    .line 45
    invoke-interface {v11, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v10, v10, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v9, 0x0

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    move-object v4, v9

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    move-object v10, v4

    .line 69
    check-cast v10, Landroidx/compose/ui/layout/Placeable;

    .line 70
    .line 71
    invoke-virtual {v10}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    invoke-static {v6}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-gt v5, v11, :cond_3

    .line 80
    .line 81
    move v12, v5

    .line 82
    :goto_1
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    move-object v14, v13

    .line 87
    check-cast v14, Landroidx/compose/ui/layout/Placeable;

    .line 88
    .line 89
    invoke-virtual {v14}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    if-ge v10, v14, :cond_2

    .line 94
    .line 95
    move-object v4, v13

    .line 96
    move v10, v14

    .line 97
    :cond_2
    if-eq v12, v11, :cond_3

    .line 98
    .line 99
    add-int/lit8 v12, v12, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    :goto_2
    check-cast v4, Landroidx/compose/ui/layout/Placeable;

    .line 103
    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    move v4, v3

    .line 112
    :goto_3
    new-instance v10, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    move v12, v3

    .line 126
    :goto_4
    if-ge v12, v11, :cond_5

    .line 127
    .line 128
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .line 133
    .line 134
    invoke-interface {v13, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-interface {v10, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    add-int/lit8 v12, v12, 0x1

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    move-object v0, v9

    .line 151
    goto :goto_6

    .line 152
    :cond_6
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object v1, v0

    .line 157
    check-cast v1, Landroidx/compose/ui/layout/Placeable;

    .line 158
    .line 159
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-static {v10}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-gt v5, v2, :cond_8

    .line 168
    .line 169
    move v11, v5

    .line 170
    :goto_5
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    move-object v13, v12

    .line 175
    check-cast v13, Landroidx/compose/ui/layout/Placeable;

    .line 176
    .line 177
    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    if-ge v1, v13, :cond_7

    .line 182
    .line 183
    move-object v0, v12

    .line 184
    move v1, v13

    .line 185
    :cond_7
    if-eq v11, v2, :cond_8

    .line 186
    .line 187
    add-int/lit8 v11, v11, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_8
    :goto_6
    check-cast v0, Landroidx/compose/ui/layout/Placeable;

    .line 191
    .line 192
    if-eqz v0, :cond_9

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    goto :goto_7

    .line 203
    :cond_9
    move-object v0, v9

    .line 204
    :goto_7
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_a

    .line 209
    .line 210
    move-object v1, v9

    .line 211
    goto :goto_9

    .line 212
    :cond_a
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    move-object v2, v1

    .line 217
    check-cast v2, Landroidx/compose/ui/layout/Placeable;

    .line 218
    .line 219
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-static {v10}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-gt v5, v11, :cond_c

    .line 228
    .line 229
    :goto_8
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    move-object v13, v12

    .line 234
    check-cast v13, Landroidx/compose/ui/layout/Placeable;

    .line 235
    .line 236
    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    if-ge v2, v13, :cond_b

    .line 241
    .line 242
    move-object v1, v12

    .line 243
    move v2, v13

    .line 244
    :cond_b
    if-eq v5, v11, :cond_c

    .line 245
    .line 246
    add-int/lit8 v5, v5, 0x1

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_c
    :goto_9
    check-cast v1, Landroidx/compose/ui/layout/Placeable;

    .line 250
    .line 251
    if-eqz v1, :cond_d

    .line 252
    .line 253
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    move v11, v1

    .line 258
    goto :goto_a

    .line 259
    :cond_d
    move v11, v3

    .line 260
    :goto_a
    sget-object v1, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    .line 261
    .line 262
    invoke-virtual {v1}, Landroidx/compose/material3/SegmentedButtonDefaults;->getIconSize-D9Ej5fM()F

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-interface {v8, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-static {}, Landroidx/compose/material3/SegmentedButtonKt;->access$getIconSpacing$p()F

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-interface {v8, v5}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    add-int/2addr v2, v5

    .line 283
    if-eqz v0, :cond_e

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    goto :goto_b

    .line 290
    :cond_e
    move v0, v3

    .line 291
    :goto_b
    add-int v12, v2, v0

    .line 292
    .line 293
    if-nez v4, :cond_f

    .line 294
    .line 295
    invoke-virtual {v1}, Landroidx/compose/material3/SegmentedButtonDefaults;->getIconSize-D9Ej5fM()F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-interface {v8, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    invoke-static {}, Landroidx/compose/material3/SegmentedButtonKt;->access$getIconSpacing$p()F

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-interface {v8, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    add-int/2addr v0, v1

    .line 312
    neg-int v0, v0

    .line 313
    div-int/lit8 v0, v0, 0x2

    .line 314
    .line 315
    move v4, v0

    .line 316
    goto :goto_c

    .line 317
    :cond_f
    move v4, v3

    .line 318
    :goto_c
    iget-object v0, v7, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->initialOffset:Ljava/lang/Integer;

    .line 319
    .line 320
    if-nez v0, :cond_10

    .line 321
    .line 322
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iput-object v0, v7, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->initialOffset:Ljava/lang/Integer;

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_10
    iget-object v0, v7, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->animatable:Landroidx/compose/animation/core/Animatable;

    .line 330
    .line 331
    if-nez v0, :cond_11

    .line 332
    .line 333
    new-instance v0, Landroidx/compose/animation/core/Animatable;

    .line 334
    .line 335
    iget-object v14, v7, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->initialOffset:Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-static {v14}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    sget-object v1, Lkotlin/jvm/internal/j0;->a:Lkotlin/jvm/internal/j0;

    .line 341
    .line 342
    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/j0;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/16 v18, 0xc

    .line 351
    .line 352
    const/16 v19, 0x0

    .line 353
    .line 354
    move-object v13, v0

    .line 355
    invoke-direct/range {v13 .. v19}, Landroidx/compose/animation/core/Animatable;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/w;)V

    .line 356
    .line 357
    .line 358
    iput-object v0, v7, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->animatable:Landroidx/compose/animation/core/Animatable;

    .line 359
    .line 360
    :cond_11
    invoke-virtual {v0}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Ljava/lang/Number;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eq v1, v4, :cond_12

    .line 371
    .line 372
    iget-object v13, v7, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->scope:Lkotlinx/coroutines/s0;

    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    const/4 v15, 0x0

    .line 376
    new-instance v1, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$1;

    .line 377
    .line 378
    invoke-direct {v1, v0, v4, v9}, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$1;-><init>(Landroidx/compose/animation/core/Animatable;ILkotlin/coroutines/d;)V

    .line 379
    .line 380
    .line 381
    const/16 v17, 0x3

    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    move-object/from16 v16, v1

    .line 386
    .line 387
    invoke-static/range {v13 .. v18}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 388
    .line 389
    .line 390
    :cond_12
    :goto_d
    const/4 v9, 0x0

    .line 391
    new-instance v13, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$2;

    .line 392
    .line 393
    move-object v0, v13

    .line 394
    move-object v1, v6

    .line 395
    move-object/from16 v2, p1

    .line 396
    .line 397
    move-object/from16 v3, p0

    .line 398
    .line 399
    move-object v5, v10

    .line 400
    move v6, v11

    .line 401
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$2;-><init>(Ljava/util/List;Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;ILjava/util/List;I)V

    .line 402
    .line 403
    .line 404
    const/4 v5, 0x4

    .line 405
    const/4 v6, 0x0

    .line 406
    move-object/from16 v0, p1

    .line 407
    .line 408
    move v1, v12

    .line 409
    move v2, v11

    .line 410
    move-object v3, v9

    .line 411
    move-object v4, v13

    .line 412
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    return-object v0
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
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
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
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method public final setAnimatable(Landroidx/compose/animation/core/Animatable;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/Animatable;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;->animatable:Landroidx/compose/animation/core/Animatable;

    return-void
.end method
