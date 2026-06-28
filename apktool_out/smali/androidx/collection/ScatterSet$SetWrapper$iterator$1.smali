.class final Landroidx/collection/ScatterSet$SetWrapper$iterator$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/ScatterSet$SetWrapper;->iterator()Ljava/util/Iterator;
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
    c = "androidx.collection.ScatterSet$SetWrapper$iterator$1"
    f = "ScatterSet.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x1ef
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "k$iv",
        "m$iv$iv",
        "lastIndex$iv$iv",
        "i$iv$iv",
        "slot$iv$iv",
        "bitCount$iv$iv",
        "j$iv$iv"
    }
    s = {
        "L$0",
        "L$1",
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
        "SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#2,4:1085\n237#2,7:1089\n248#2,3:1097\n251#2,2:1101\n272#2,2:1103\n254#2,6:1105\n274#2:1111\n1810#3:1096\n1672#3:1100\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1085,4\n494#1:1089,7\n494#1:1097,3\n494#1:1101,2\n494#1:1103,2\n494#1:1105,6\n494#1:1111\n494#1:1096\n494#1:1100\n*E\n"
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

.field final synthetic this$0:Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/ScatterSet<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/collection/ScatterSet;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/collection/ScatterSet$SetWrapper$iterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->this$0:Landroidx/collection/ScatterSet;

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

    new-instance v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;

    iget-object v1, p0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->this$0:Landroidx/collection/ScatterSet;

    invoke-direct {v0, v1, p2}, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;-><init>(Landroidx/collection/ScatterSet;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/sequences/o;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->invoke(Lkotlin/sequences/o;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v2, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->label:I

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
    iget v2, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$3:I

    .line 18
    .line 19
    iget v6, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$2:I

    .line 20
    .line 21
    iget-wide v7, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->J$0:J

    .line 22
    .line 23
    iget v9, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$1:I

    .line 24
    .line 25
    iget v10, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$0:I

    .line 26
    .line 27
    iget-object v11, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$2:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v11, [J

    .line 30
    .line 31
    iget-object v12, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v12, [Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v13, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v13, Lkotlin/sequences/o;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v14, v13

    .line 43
    move-object v13, v12

    .line 44
    move-object v12, v0

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lkotlin/sequences/o;

    .line 61
    .line 62
    iget-object v6, v0, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->this$0:Landroidx/collection/ScatterSet;

    .line 63
    .line 64
    iget-object v7, v6, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v6, v6, Landroidx/collection/ScatterSet;->metadata:[J

    .line 67
    .line 68
    array-length v8, v6

    .line 69
    add-int/lit8 v8, v8, -0x2

    .line 70
    .line 71
    if-ltz v8, :cond_7

    .line 72
    .line 73
    move-object v10, v0

    .line 74
    move v9, v4

    .line 75
    :goto_0
    aget-wide v11, v6, v9

    .line 76
    .line 77
    not-long v13, v11

    .line 78
    const/4 v15, 0x7

    .line 79
    shl-long/2addr v13, v15

    .line 80
    and-long/2addr v13, v11

    .line 81
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v13, v15

    .line 87
    cmp-long v13, v13, v15

    .line 88
    .line 89
    if-eqz v13, :cond_6

    .line 90
    .line 91
    sub-int v13, v9, v8

    .line 92
    .line 93
    not-int v13, v13

    .line 94
    ushr-int/lit8 v13, v13, 0x1f

    .line 95
    .line 96
    rsub-int/lit8 v13, v13, 0x8

    .line 97
    .line 98
    move-object v14, v2

    .line 99
    move v2, v4

    .line 100
    move-wide/from16 v19, v11

    .line 101
    .line 102
    move-object v12, v6

    .line 103
    move-object v11, v10

    .line 104
    move v6, v13

    .line 105
    move-object v13, v7

    .line 106
    move v10, v8

    .line 107
    move-wide/from16 v7, v19

    .line 108
    .line 109
    :goto_1
    if-ge v2, v6, :cond_5

    .line 110
    .line 111
    const-wide/16 v15, 0xff

    .line 112
    .line 113
    and-long/2addr v15, v7

    .line 114
    const-wide/16 v17, 0x80

    .line 115
    .line 116
    cmp-long v15, v15, v17

    .line 117
    .line 118
    if-gez v15, :cond_2

    .line 119
    .line 120
    move v15, v5

    .line 121
    goto :goto_2

    .line 122
    :cond_2
    move v15, v4

    .line 123
    :goto_2
    if-eqz v15, :cond_4

    .line 124
    .line 125
    shl-int/lit8 v15, v9, 0x3

    .line 126
    .line 127
    add-int/2addr v15, v2

    .line 128
    aget-object v15, v13, v15

    .line 129
    .line 130
    iput-object v14, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v13, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v12, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->L$2:Ljava/lang/Object;

    .line 135
    .line 136
    iput v10, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$0:I

    .line 137
    .line 138
    iput v9, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$1:I

    .line 139
    .line 140
    iput-wide v7, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->J$0:J

    .line 141
    .line 142
    iput v6, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$2:I

    .line 143
    .line 144
    iput v2, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->I$3:I

    .line 145
    .line 146
    iput v5, v11, Landroidx/collection/ScatterSet$SetWrapper$iterator$1;->label:I

    .line 147
    .line 148
    invoke-virtual {v14, v15, v11}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    if-ne v15, v1, :cond_3

    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_3
    move-object/from16 v19, v12

    .line 156
    .line 157
    move-object v12, v11

    .line 158
    move-object/from16 v11, v19

    .line 159
    .line 160
    :goto_3
    move-object/from16 v19, v12

    .line 161
    .line 162
    move-object v12, v11

    .line 163
    move-object/from16 v11, v19

    .line 164
    .line 165
    :cond_4
    shr-long/2addr v7, v3

    .line 166
    add-int/2addr v2, v5

    .line 167
    goto :goto_1

    .line 168
    :cond_5
    if-ne v6, v3, :cond_7

    .line 169
    .line 170
    move v8, v10

    .line 171
    move-object v10, v11

    .line 172
    move-object v6, v12

    .line 173
    move-object v7, v13

    .line 174
    move-object v2, v14

    .line 175
    :cond_6
    if-eq v9, v8, :cond_7

    .line 176
    .line 177
    add-int/lit8 v9, v9, 0x1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_7
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 181
    .line 182
    return-object v1
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
