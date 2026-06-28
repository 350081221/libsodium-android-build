.class public final Landroidx/compose/material3/DrawerState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/DrawerState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0014\u0008\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+07\u00a2\u0006\u0004\u00089\u0010:J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0087@\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00178\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR&\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u0012\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001f\u0010 R/\u0010*\u001a\u0004\u0018\u00010\u00022\u0008\u0010#\u001a\u0004\u0018\u00010\u00028@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u0011\u0010,\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0011\u0010.\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010-R\u0011\u00101\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100R\u0011\u00102\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\u00082\u0010-R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00083\u00100R\u0011\u00105\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u00084\u0010\u0015\u00a8\u0006<"
    }
    d2 = {
        "Landroidx/compose/material3/DrawerState;",
        "",
        "Landroidx/compose/ui/unit/Density;",
        "requireDensity",
        "Landroidx/compose/material3/DrawerValue;",
        "targetValue",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "",
        "animationSpec",
        "velocity",
        "Lkotlin/r2;",
        "animateTo",
        "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;)Ljava/lang/Object;",
        "open",
        "(Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "close",
        "anim",
        "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "snapTo",
        "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "requireOffset$material3_release",
        "()F",
        "requireOffset",
        "Landroidx/compose/material3/AnchoredDraggableState;",
        "anchoredDraggableState",
        "Landroidx/compose/material3/AnchoredDraggableState;",
        "getAnchoredDraggableState$material3_release",
        "()Landroidx/compose/material3/AnchoredDraggableState;",
        "Landroidx/compose/runtime/State;",
        "offset",
        "Landroidx/compose/runtime/State;",
        "getOffset",
        "()Landroidx/compose/runtime/State;",
        "getOffset$annotations",
        "()V",
        "<set-?>",
        "density$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getDensity$material3_release",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity$material3_release",
        "(Landroidx/compose/ui/unit/Density;)V",
        "density",
        "",
        "isOpen",
        "()Z",
        "isClosed",
        "getCurrentValue",
        "()Landroidx/compose/material3/DrawerValue;",
        "currentValue",
        "isAnimationRunning",
        "getTargetValue",
        "getCurrentOffset",
        "currentOffset",
        "initialValue",
        "Lkotlin/Function1;",
        "confirmStateChange",
        "<init>",
        "(Landroidx/compose/material3/DrawerValue;Lv3/l;)V",
        "Companion",
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
        "SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,948:1\n81#2:949\n107#2,2:950\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n228#1:949\n228#1:950,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/material3/DrawerState$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/material3/AnchoredDraggableState<",
            "Landroidx/compose/material3/DrawerValue;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final density$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final offset:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/material3/DrawerState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/material3/DrawerState$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/material3/DrawerState;->Companion:Landroidx/compose/material3/DrawerState$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material3/DrawerValue;Lv3/l;)V
    .locals 7
    .param p1    # Landroidx/compose/material3/DrawerValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DrawerValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/DrawerValue;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Landroidx/compose/material3/NavigationDrawerKt;->access$getAnimationSpec$p()Landroidx/compose/animation/core/TweenSpec;

    move-result-object v4

    .line 3
    new-instance v6, Landroidx/compose/material3/AnchoredDraggableState;

    .line 4
    sget-object v2, Landroidx/compose/material3/DrawerState$anchoredDraggableState$1;->INSTANCE:Landroidx/compose/material3/DrawerState$anchoredDraggableState$1;

    .line 5
    new-instance v3, Landroidx/compose/material3/DrawerState$anchoredDraggableState$2;

    invoke-direct {v3, p0}, Landroidx/compose/material3/DrawerState$anchoredDraggableState$2;-><init>(Landroidx/compose/material3/DrawerState;)V

    move-object v0, v6

    move-object v1, p1

    move-object v5, p2

    .line 6
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/AnchoredDraggableState;-><init>(Ljava/lang/Object;Lv3/l;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V

    iput-object v6, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    .line 7
    new-instance p1, Landroidx/compose/material3/DrawerState$offset$1;

    invoke-direct {p1, p0}, Landroidx/compose/material3/DrawerState$offset$1;-><init>(Landroidx/compose/material3/DrawerState;)V

    iput-object p1, p0, Landroidx/compose/material3/DrawerState;->offset:Landroidx/compose/runtime/State;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 8
    invoke-static {p1, p1, p2, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/material3/DrawerState;->density$delegate:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/material3/DrawerValue;Lv3/l;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 9
    sget-object p2, Landroidx/compose/material3/DrawerState$1;->INSTANCE:Landroidx/compose/material3/DrawerState$1;

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/material3/DrawerState;-><init>(Landroidx/compose/material3/DrawerValue;Lv3/l;)V

    return-void
.end method

.method public static final synthetic access$animateTo(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/material3/DrawerState;->animateTo(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$requireDensity(Landroidx/compose/material3/DrawerState;)Landroidx/compose/ui/unit/Density;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material3/DrawerState;->requireDensity()Landroidx/compose/ui/unit/Density;

    move-result-object p0

    return-object p0
.end method

.method private final animateTo(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DrawerValue;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;F",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/material3/DrawerState$animateTo$3;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p3, p2, v1}, Landroidx/compose/material3/DrawerState$animateTo$3;-><init>(Landroidx/compose/material3/DrawerState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p1

    move-object v4, p4

    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/AnchoredDraggableState;->anchoredDrag$default(Landroidx/compose/material3/AnchoredDraggableState;Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lv3/r;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method static synthetic animateTo$default(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/material3/NavigationDrawerKt;->access$getAnimationSpec$p()Landroidx/compose/animation/core/TweenSpec;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    iget-object p3, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    .line 14
    .line 15
    invoke-virtual {p3}, Landroidx/compose/material3/AnchoredDraggableState;->getLastVelocity()F

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/material3/DrawerState;->animateTo(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method

.method public static synthetic getOffset$annotations()V
    .locals 0
    .annotation runtime Lkotlin/k;
        message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "currentOffset"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method private final requireDensity()Landroidx/compose/ui/unit/Density;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/DrawerState;->getDensity$material3_release()Landroidx/compose/ui/unit/Density;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "The density on BottomDrawerState ("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ") was not set. Did you use BottomDrawer with the BottomDrawer composable?"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1
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
.end method


# virtual methods
.method public final animateTo(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Landroidx/compose/material3/DrawerValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DrawerValue;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer."
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    const/4 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    .line 1
    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/DrawerState;->animateTo$default(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final close(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    sget-object v1, Landroidx/compose/material3/DrawerValue;->Closed:Landroidx/compose/material3/DrawerValue;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, p0

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/DrawerState;->animateTo$default(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final getAnchoredDraggableState$material3_release()Landroidx/compose/material3/AnchoredDraggableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/material3/AnchoredDraggableState<",
            "Landroidx/compose/material3/DrawerValue;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    return-object v0
.end method

.method public final getCurrentOffset()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getOffset()F

    move-result v0

    return v0
.end method

.method public final getCurrentValue()Landroidx/compose/material3/DrawerValue;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getCurrentValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material3/DrawerValue;

    return-object v0
.end method

.method public final getDensity$material3_release()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->density$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 8
    .line 9
    return-object v0
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
.end method

.method public final getOffset()Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->offset:Landroidx/compose/runtime/State;

    return-object v0
.end method

.method public final getTargetValue()Landroidx/compose/material3/DrawerValue;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getTargetValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material3/DrawerValue;

    return-object v0
.end method

.method public final isAnimationRunning()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->isAnimationRunning()Z

    move-result v0

    return v0
.end method

.method public final isClosed()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/material3/DrawerState;->getCurrentValue()Landroidx/compose/material3/DrawerValue;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/DrawerValue;->Closed:Landroidx/compose/material3/DrawerValue;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isOpen()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/material3/DrawerState;->getCurrentValue()Landroidx/compose/material3/DrawerValue;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/DrawerValue;->Open:Landroidx/compose/material3/DrawerValue;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final open(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    sget-object v1, Landroidx/compose/material3/DrawerValue;->Open:Landroidx/compose/material3/DrawerValue;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, p0

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/DrawerState;->animateTo$default(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final requireOffset$material3_release()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->requireOffset()F

    move-result v0

    return v0
.end method

.method public final setDensity$material3_release(Landroidx/compose/ui/unit/Density;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->density$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
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

.method public final snapTo(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroidx/compose/material3/DrawerValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DrawerValue;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DrawerState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-static {v0, p1, p2}, Landroidx/compose/material3/AnchoredDraggableKt;->snapTo(Landroidx/compose/material3/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method
