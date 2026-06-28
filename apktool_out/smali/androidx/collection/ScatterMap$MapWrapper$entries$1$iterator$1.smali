.class final Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/ScatterMap$MapWrapper$entries$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lv3/p<",
        "Lkotlin/sequences/o<",
        "-",
        "Ljava/util/Map$Entry<",
        "+TK;+TV;>;>;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1"
    f = "ScatterMap.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x2bd
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "m$iv",
        "lastIndex$iv",
        "i$iv",
        "slot$iv",
        "bitCount$iv",
        "j$iv"
    }
    s = {
        "L$0",
        "L$2",
        "I$0",
        "I$1",
        "J$0",
        "I$2",
        "I$3"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@"
    }
    d2 = {
        "K",
        "V",
        "Lkotlin/sequences/o;",
        "",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n699#1:1835,6\n699#1:1842,3\n699#1:1846,9\n699#1:1841\n699#1:1845\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/collection/ScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/ScatterMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/collection/ScatterMap;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterMap<",
            "TK;TV;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->this$0:Landroidx/collection/ScatterMap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;

    iget-object v1, p0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->this$0:Landroidx/collection/ScatterMap;

    invoke-direct {v0, v1, p2}, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;-><init>(Landroidx/collection/ScatterMap;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/sequences/o;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->invoke(Lkotlin/sequences/o;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/sequences/o;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlin/sequences/o;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/o<",
            "-",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->label:I

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v5, :cond_0

    .line 15
    .line 16
    iget v2, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$3:I

    .line 17
    .line 18
    iget v6, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$2:I

    .line 19
    .line 20
    iget-wide v7, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->J$0:J

    .line 21
    .line 22
    iget v9, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$1:I

    .line 23
    .line 24
    iget v10, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$0:I

    .line 25
    .line 26
    iget-object v11, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$2:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v11, [J

    .line 29
    .line 30
    iget-object v12, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$1:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v12, Landroidx/collection/ScatterMap;

    .line 33
    .line 34
    iget-object v13, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v13, Lkotlin/sequences/o;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v4, v0

    .line 42
    move v3, v5

    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v2, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lkotlin/sequences/o;

    .line 59
    .line 60
    iget-object v6, v0, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->this$0:Landroidx/collection/ScatterMap;

    .line 61
    .line 62
    iget-object v7, v6, Landroidx/collection/ScatterMap;->metadata:[J

    .line 63
    .line 64
    array-length v8, v7

    .line 65
    add-int/lit8 v8, v8, -0x2

    .line 66
    .line 67
    if-ltz v8, :cond_7

    .line 68
    .line 69
    move-object v10, v0

    .line 70
    const/4 v9, 0x0

    .line 71
    :goto_0
    aget-wide v11, v7, v9

    .line 72
    .line 73
    not-long v13, v11

    .line 74
    const/4 v15, 0x7

    .line 75
    shl-long/2addr v13, v15

    .line 76
    and-long/2addr v13, v11

    .line 77
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    and-long/2addr v13, v15

    .line 83
    cmp-long v13, v13, v15

    .line 84
    .line 85
    if-eqz v13, :cond_6

    .line 86
    .line 87
    sub-int v13, v9, v8

    .line 88
    .line 89
    not-int v13, v13

    .line 90
    ushr-int/lit8 v13, v13, 0x1f

    .line 91
    .line 92
    rsub-int/lit8 v13, v13, 0x8

    .line 93
    .line 94
    move-object v14, v2

    .line 95
    const/4 v2, 0x0

    .line 96
    move/from16 v19, v13

    .line 97
    .line 98
    move-object v13, v6

    .line 99
    move/from16 v6, v19

    .line 100
    .line 101
    move-wide/from16 v20, v11

    .line 102
    .line 103
    move-object v12, v7

    .line 104
    move-object v11, v10

    .line 105
    move v10, v8

    .line 106
    move-wide/from16 v7, v20

    .line 107
    .line 108
    :goto_1
    if-ge v2, v6, :cond_5

    .line 109
    .line 110
    const-wide/16 v15, 0xff

    .line 111
    .line 112
    and-long/2addr v15, v7

    .line 113
    const-wide/16 v17, 0x80

    .line 114
    .line 115
    cmp-long v15, v15, v17

    .line 116
    .line 117
    if-gez v15, :cond_2

    .line 118
    .line 119
    move v15, v5

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    const/4 v15, 0x0

    .line 122
    :goto_2
    if-eqz v15, :cond_4

    .line 123
    .line 124
    shl-int/lit8 v15, v9, 0x3

    .line 125
    .line 126
    add-int/2addr v15, v2

    .line 127
    new-instance v4, Landroidx/collection/MapEntry;

    .line 128
    .line 129
    iget-object v3, v13, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 130
    .line 131
    aget-object v3, v3, v15

    .line 132
    .line 133
    iget-object v5, v13, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 134
    .line 135
    aget-object v5, v5, v15

    .line 136
    .line 137
    invoke-direct {v4, v3, v5}, Landroidx/collection/MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-object v14, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v13, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$1:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v12, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->L$2:Ljava/lang/Object;

    .line 145
    .line 146
    iput v10, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$0:I

    .line 147
    .line 148
    iput v9, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$1:I

    .line 149
    .line 150
    iput-wide v7, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->J$0:J

    .line 151
    .line 152
    iput v6, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$2:I

    .line 153
    .line 154
    iput v2, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->I$3:I

    .line 155
    .line 156
    const/4 v3, 0x1

    .line 157
    iput v3, v11, Landroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1;->label:I

    .line 158
    .line 159
    invoke-virtual {v14, v4, v11}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-ne v4, v1, :cond_3

    .line 164
    .line 165
    return-object v1

    .line 166
    :cond_3
    move-object v4, v11

    .line 167
    move-object v11, v12

    .line 168
    move-object v12, v13

    .line 169
    move-object v13, v14

    .line 170
    :goto_3
    move-object v14, v13

    .line 171
    move-object v13, v12

    .line 172
    move-object v12, v11

    .line 173
    move-object v11, v4

    .line 174
    :goto_4
    const/16 v4, 0x8

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_4
    move v3, v5

    .line 178
    goto :goto_4

    .line 179
    :goto_5
    shr-long/2addr v7, v4

    .line 180
    add-int/2addr v2, v3

    .line 181
    move v5, v3

    .line 182
    move v3, v4

    .line 183
    goto :goto_1

    .line 184
    :cond_5
    move v4, v3

    .line 185
    move v3, v5

    .line 186
    if-ne v6, v4, :cond_7

    .line 187
    .line 188
    move v8, v10

    .line 189
    move-object v10, v11

    .line 190
    move-object v7, v12

    .line 191
    move-object v6, v13

    .line 192
    move-object v2, v14

    .line 193
    goto :goto_6

    .line 194
    :cond_6
    move v4, v3

    .line 195
    move v3, v5

    .line 196
    :goto_6
    if-eq v9, v8, :cond_7

    .line 197
    .line 198
    add-int/lit8 v9, v9, 0x1

    .line 199
    .line 200
    move v5, v3

    .line 201
    move v3, v4

    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_7
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 205
    .line 206
    return-object v1
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
.end method
