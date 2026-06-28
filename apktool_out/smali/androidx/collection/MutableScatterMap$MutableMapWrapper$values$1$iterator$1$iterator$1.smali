.class final Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1;-><init>(Landroidx/collection/MutableScatterMap;)V
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
        "Ljava/lang/Integer;",
        ">;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1"
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
        0x5d7
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
        "L$1",
        "I$0",
        "I$1",
        "J$0",
        "I$2",
        "I$3"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"
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
        "SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n*L\n1494#1:1835,6\n1494#1:1842,3\n1494#1:1846,9\n1494#1:1841\n1494#1:1845\n*E\n"
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

.field label:I

.field final synthetic this$0:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/collection/MutableScatterMap;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "TK;TV;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableScatterMap;

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

    new-instance v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;

    iget-object v1, p0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableScatterMap;

    invoke-direct {v0, v1, p2}, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;-><init>(Landroidx/collection/MutableScatterMap;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/sequences/o;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->invoke(Lkotlin/sequences/o;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21
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
    iget v2, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->label:I

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v5, :cond_0

    .line 16
    .line 17
    iget v2, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$3:I

    .line 18
    .line 19
    iget v6, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$2:I

    .line 20
    .line 21
    iget-wide v7, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->J$0:J

    .line 22
    .line 23
    iget v9, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$1:I

    .line 24
    .line 25
    iget v10, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$0:I

    .line 26
    .line 27
    iget-object v11, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->L$1:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v11, [J

    .line 30
    .line 31
    iget-object v12, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v12, Lkotlin/sequences/o;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v13, v12

    .line 39
    move-object v12, v11

    .line 40
    move-object v11, v0

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lkotlin/sequences/o;

    .line 57
    .line 58
    iget-object v6, v0, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableScatterMap;

    .line 59
    .line 60
    iget-object v6, v6, Landroidx/collection/ScatterMap;->metadata:[J

    .line 61
    .line 62
    array-length v7, v6

    .line 63
    add-int/lit8 v7, v7, -0x2

    .line 64
    .line 65
    if-ltz v7, :cond_7

    .line 66
    .line 67
    move-object v9, v0

    .line 68
    move v8, v4

    .line 69
    :goto_0
    aget-wide v10, v6, v8

    .line 70
    .line 71
    not-long v12, v10

    .line 72
    const/4 v14, 0x7

    .line 73
    shl-long/2addr v12, v14

    .line 74
    and-long/2addr v12, v10

    .line 75
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v12, v14

    .line 81
    cmp-long v12, v12, v14

    .line 82
    .line 83
    if-eqz v12, :cond_6

    .line 84
    .line 85
    sub-int v12, v8, v7

    .line 86
    .line 87
    not-int v12, v12

    .line 88
    ushr-int/lit8 v12, v12, 0x1f

    .line 89
    .line 90
    rsub-int/lit8 v12, v12, 0x8

    .line 91
    .line 92
    move-object v13, v2

    .line 93
    move v2, v4

    .line 94
    move/from16 v18, v12

    .line 95
    .line 96
    move-object v12, v6

    .line 97
    move/from16 v6, v18

    .line 98
    .line 99
    move-wide/from16 v19, v10

    .line 100
    .line 101
    move v11, v7

    .line 102
    move-object v10, v9

    .line 103
    move v9, v8

    .line 104
    move-wide/from16 v7, v19

    .line 105
    .line 106
    :goto_1
    if-ge v2, v6, :cond_5

    .line 107
    .line 108
    const-wide/16 v14, 0xff

    .line 109
    .line 110
    and-long/2addr v14, v7

    .line 111
    const-wide/16 v16, 0x80

    .line 112
    .line 113
    cmp-long v14, v14, v16

    .line 114
    .line 115
    if-gez v14, :cond_2

    .line 116
    .line 117
    move v14, v5

    .line 118
    goto :goto_2

    .line 119
    :cond_2
    move v14, v4

    .line 120
    :goto_2
    if-eqz v14, :cond_4

    .line 121
    .line 122
    shl-int/lit8 v14, v9, 0x3

    .line 123
    .line 124
    add-int/2addr v14, v2

    .line 125
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/b;->f(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    iput-object v13, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v12, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput v11, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$0:I

    .line 134
    .line 135
    iput v9, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$1:I

    .line 136
    .line 137
    iput-wide v7, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->J$0:J

    .line 138
    .line 139
    iput v6, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$2:I

    .line 140
    .line 141
    iput v2, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->I$3:I

    .line 142
    .line 143
    iput v5, v10, Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;->label:I

    .line 144
    .line 145
    invoke-virtual {v13, v14, v10}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    if-ne v14, v1, :cond_3

    .line 150
    .line 151
    return-object v1

    .line 152
    :cond_3
    move/from16 v18, v11

    .line 153
    .line 154
    move-object v11, v10

    .line 155
    move/from16 v10, v18

    .line 156
    .line 157
    :goto_3
    move-object/from16 v18, v11

    .line 158
    .line 159
    move v11, v10

    .line 160
    move-object/from16 v10, v18

    .line 161
    .line 162
    :cond_4
    shr-long/2addr v7, v3

    .line 163
    add-int/2addr v2, v5

    .line 164
    goto :goto_1

    .line 165
    :cond_5
    if-ne v6, v3, :cond_7

    .line 166
    .line 167
    move v8, v9

    .line 168
    move-object v9, v10

    .line 169
    move v7, v11

    .line 170
    move-object v6, v12

    .line 171
    move-object v2, v13

    .line 172
    :cond_6
    if-eq v8, v7, :cond_7

    .line 173
    .line 174
    add-int/lit8 v8, v8, 0x1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_7
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 178
    .line 179
    return-object v1
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
.end method
