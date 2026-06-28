.class final Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;-><init>(Landroidx/collection/MutableScatterSet;)V
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
        "-TE;>;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1"
    f = "ScatterSet.kt"
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
        0x414
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
        "L$3",
        "I$0",
        "I$1",
        "J$0",
        "I$2",
        "I$3"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"
    }
    d2 = {
        "E",
        "Lkotlin/sequences/o;",
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
        "SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1041#1:1085,7\n1041#1:1093,3\n1041#1:1097,9\n1041#1:1092\n1041#1:1096\n*E\n"
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

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "TE;>;"
        }
    .end annotation
.end field

.field final synthetic this$1:Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterSet<",
            "TE;>;",
            "Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableScatterSet;

    iput-object p2, p0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->this$1:Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
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

    new-instance v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;

    iget-object v1, p0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableScatterSet;

    iget-object v2, p0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->this$1:Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;

    invoke-direct {v0, v1, v2, p2}, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;-><init>(Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/sequences/o;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->invoke(Lkotlin/sequences/o;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "-TE;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
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
    iget v2, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->label:I

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
    iget v2, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$3:I

    .line 17
    .line 18
    iget v6, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$2:I

    .line 19
    .line 20
    iget-wide v7, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->J$0:J

    .line 21
    .line 22
    iget v9, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$1:I

    .line 23
    .line 24
    iget v10, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$0:I

    .line 25
    .line 26
    iget-object v11, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$3:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v11, [J

    .line 29
    .line 30
    iget-object v12, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$2:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v12, Landroidx/collection/MutableScatterSet;

    .line 33
    .line 34
    iget-object v13, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$1:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v13, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;

    .line 37
    .line 38
    iget-object v14, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v14, Lkotlin/sequences/o;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v3, v0

    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lkotlin/sequences/o;

    .line 62
    .line 63
    iget-object v6, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableScatterSet;

    .line 64
    .line 65
    iget-object v7, v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->this$1:Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;

    .line 66
    .line 67
    iget-object v8, v6, Landroidx/collection/ScatterSet;->metadata:[J

    .line 68
    .line 69
    array-length v9, v8

    .line 70
    add-int/lit8 v9, v9, -0x2

    .line 71
    .line 72
    if-ltz v9, :cond_7

    .line 73
    .line 74
    move-object v11, v0

    .line 75
    const/4 v10, 0x0

    .line 76
    :goto_0
    aget-wide v12, v8, v10

    .line 77
    .line 78
    not-long v14, v12

    .line 79
    const/16 v16, 0x7

    .line 80
    .line 81
    shl-long v14, v14, v16

    .line 82
    .line 83
    and-long/2addr v14, v12

    .line 84
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long v14, v14, v16

    .line 90
    .line 91
    cmp-long v14, v14, v16

    .line 92
    .line 93
    if-eqz v14, :cond_6

    .line 94
    .line 95
    sub-int v14, v10, v9

    .line 96
    .line 97
    not-int v14, v14

    .line 98
    ushr-int/lit8 v14, v14, 0x1f

    .line 99
    .line 100
    rsub-int/lit8 v14, v14, 0x8

    .line 101
    .line 102
    move-object v15, v2

    .line 103
    const/4 v2, 0x0

    .line 104
    move-wide/from16 v20, v12

    .line 105
    .line 106
    move-object v13, v6

    .line 107
    move-object v12, v11

    .line 108
    move v6, v14

    .line 109
    move-object v14, v7

    .line 110
    move-object v11, v8

    .line 111
    move-wide/from16 v7, v20

    .line 112
    .line 113
    move/from16 v22, v10

    .line 114
    .line 115
    move v10, v9

    .line 116
    move/from16 v9, v22

    .line 117
    .line 118
    :goto_1
    if-ge v2, v6, :cond_5

    .line 119
    .line 120
    const-wide/16 v16, 0xff

    .line 121
    .line 122
    and-long v16, v7, v16

    .line 123
    .line 124
    const-wide/16 v18, 0x80

    .line 125
    .line 126
    cmp-long v16, v16, v18

    .line 127
    .line 128
    if-gez v16, :cond_2

    .line 129
    .line 130
    move/from16 v16, v5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    const/16 v16, 0x0

    .line 134
    .line 135
    :goto_2
    if-eqz v16, :cond_4

    .line 136
    .line 137
    shl-int/lit8 v16, v9, 0x3

    .line 138
    .line 139
    add-int v4, v16, v2

    .line 140
    .line 141
    invoke-virtual {v14, v4}, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;->setCurrent(I)V

    .line 142
    .line 143
    .line 144
    iget-object v3, v13, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 145
    .line 146
    aget-object v3, v3, v4

    .line 147
    .line 148
    iput-object v15, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v14, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v13, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$2:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v11, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->L$3:Ljava/lang/Object;

    .line 155
    .line 156
    iput v10, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$0:I

    .line 157
    .line 158
    iput v9, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$1:I

    .line 159
    .line 160
    iput-wide v7, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->J$0:J

    .line 161
    .line 162
    iput v6, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$2:I

    .line 163
    .line 164
    iput v2, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->I$3:I

    .line 165
    .line 166
    iput v5, v12, Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;->label:I

    .line 167
    .line 168
    invoke-virtual {v15, v3, v12}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    if-ne v3, v1, :cond_3

    .line 173
    .line 174
    return-object v1

    .line 175
    :cond_3
    move-object v3, v12

    .line 176
    move-object v12, v13

    .line 177
    move-object v13, v14

    .line 178
    move-object v14, v15

    .line 179
    :goto_3
    move-object v15, v14

    .line 180
    move-object v14, v13

    .line 181
    move-object v13, v12

    .line 182
    move-object v12, v3

    .line 183
    const/16 v3, 0x8

    .line 184
    .line 185
    :cond_4
    shr-long/2addr v7, v3

    .line 186
    add-int/2addr v2, v5

    .line 187
    goto :goto_1

    .line 188
    :cond_5
    if-ne v6, v3, :cond_7

    .line 189
    .line 190
    move-object v8, v11

    .line 191
    move-object v11, v12

    .line 192
    move-object v6, v13

    .line 193
    move-object v7, v14

    .line 194
    move-object v2, v15

    .line 195
    move/from16 v20, v10

    .line 196
    .line 197
    move v10, v9

    .line 198
    move/from16 v9, v20

    .line 199
    .line 200
    :cond_6
    if-eq v10, v9, :cond_7

    .line 201
    .line 202
    add-int/lit8 v10, v10, 0x1

    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_7
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 207
    .line 208
    return-object v1
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
