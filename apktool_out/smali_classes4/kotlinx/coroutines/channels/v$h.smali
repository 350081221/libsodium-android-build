.class final Lkotlinx/coroutines/channels/v$h;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/v;->j(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/p;)Lkotlinx/coroutines/channels/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/channels/e0<",
        "Ljava/lang/Object;",
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
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x3,
        0x4
    }
    l = {
        0xb5,
        0xb6,
        0xb7,
        0xbb,
        0xbc
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "$this$produce",
        "e",
        "$this$produce",
        "$this$produce",
        "$this$produce"
    }
    s = {
        "L$0",
        "L$0",
        "L$2",
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"
    }
    d2 = {
        "E",
        "Lkotlinx/coroutines/channels/e0;",
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


# instance fields
.field final synthetic $predicate:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_dropWhile:Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/g0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/g0<",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/p<",
            "Ljava/lang/Object;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/channels/v$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/v$h;->$this_dropWhile:Lkotlinx/coroutines/channels/g0;

    iput-object p2, p0, Lkotlinx/coroutines/channels/v$h;->$predicate:Lv3/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v0, Lkotlinx/coroutines/channels/v$h;

    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->$this_dropWhile:Lkotlinx/coroutines/channels/g0;

    iget-object v2, p0, Lkotlinx/coroutines/channels/v$h;->$predicate:Lv3/p;

    invoke-direct {v0, v1, v2, p2}, Lkotlinx/coroutines/channels/v$h;-><init>(Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$h;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/channels/e0;
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
            "Lkotlinx/coroutines/channels/e0<",
            "Ljava/lang/Object;",
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

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$h;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/v$h;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/v$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lkotlinx/coroutines/channels/v$h;->label:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    if-eq v1, v6, :cond_4

    .line 16
    .line 17
    if-eq v1, v5, :cond_3

    .line 18
    .line 19
    if-eq v1, v4, :cond_2

    .line 20
    .line 21
    if-eq v1, v3, :cond_1

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 28
    .line 29
    iget-object v4, p0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Lkotlinx/coroutines/channels/e0;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v1

    .line 37
    move-object v9, v4

    .line 38
    move-object v1, v0

    .line 39
    move-object v0, p0

    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 53
    .line 54
    iget-object v4, p0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Lkotlinx/coroutines/channels/e0;

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v9, v4

    .line 62
    move-object v4, v1

    .line 63
    move-object v1, v0

    .line 64
    move-object v0, p0

    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_2
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lkotlinx/coroutines/channels/e0;

    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v10, v1

    .line 75
    move-object v1, v0

    .line 76
    move-object v0, p0

    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_3
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v8, p0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v8, Lkotlinx/coroutines/channels/n;

    .line 84
    .line 85
    iget-object v9, p0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v9, Lkotlinx/coroutines/channels/e0;

    .line 88
    .line 89
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v10, v9

    .line 93
    move-object v9, v1

    .line 94
    move-object v1, v0

    .line 95
    move-object v0, p0

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 100
    .line 101
    iget-object v8, p0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v8, Lkotlinx/coroutines/channels/e0;

    .line 104
    .line 105
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object v9, v8

    .line 109
    move-object v8, v1

    .line 110
    move-object v1, v0

    .line 111
    move-object v0, p0

    .line 112
    goto :goto_1

    .line 113
    :cond_5
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 119
    .line 120
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$h;->$this_dropWhile:Lkotlinx/coroutines/channels/g0;

    .line 121
    .line 122
    invoke-interface {v1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    move-object v8, p1

    .line 127
    move-object p1, p0

    .line 128
    :goto_0
    iput-object v8, p1, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v1, p1, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v7, p1, Lkotlinx/coroutines/channels/v$h;->L$2:Ljava/lang/Object;

    .line 133
    .line 134
    iput v6, p1, Lkotlinx/coroutines/channels/v$h;->label:I

    .line 135
    .line 136
    invoke-interface {v1, p1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    if-ne v9, v0, :cond_6

    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_6
    move-object v11, v0

    .line 144
    move-object v0, p1

    .line 145
    move-object p1, v9

    .line 146
    move-object v9, v8

    .line 147
    move-object v8, v1

    .line 148
    move-object v1, v11

    .line 149
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_a

    .line 156
    .line 157
    invoke-interface {v8}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object v10, v0, Lkotlinx/coroutines/channels/v$h;->$predicate:Lv3/p;

    .line 162
    .line 163
    iput-object v9, v0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$h;->L$2:Ljava/lang/Object;

    .line 168
    .line 169
    iput v5, v0, Lkotlinx/coroutines/channels/v$h;->label:I

    .line 170
    .line 171
    invoke-interface {v10, p1, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    if-ne v10, v1, :cond_7

    .line 176
    .line 177
    return-object v1

    .line 178
    :cond_7
    move-object v11, v9

    .line 179
    move-object v9, p1

    .line 180
    move-object p1, v10

    .line 181
    move-object v10, v11

    .line 182
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_9

    .line 189
    .line 190
    iput-object v10, v0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$h;->L$2:Ljava/lang/Object;

    .line 195
    .line 196
    iput v4, v0, Lkotlinx/coroutines/channels/v$h;->label:I

    .line 197
    .line 198
    invoke-interface {v10, v9, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-ne p1, v1, :cond_8

    .line 203
    .line 204
    return-object v1

    .line 205
    :cond_8
    :goto_3
    move-object v9, v10

    .line 206
    goto :goto_4

    .line 207
    :cond_9
    move-object p1, v0

    .line 208
    move-object v0, v1

    .line 209
    move-object v1, v8

    .line 210
    move-object v8, v10

    .line 211
    goto :goto_0

    .line 212
    :cond_a
    :goto_4
    iget-object p1, v0, Lkotlinx/coroutines/channels/v$h;->$this_dropWhile:Lkotlinx/coroutines/channels/g0;

    .line 213
    .line 214
    invoke-interface {p1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :goto_5
    iput-object v9, v0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 221
    .line 222
    iput v3, v0, Lkotlinx/coroutines/channels/v$h;->label:I

    .line 223
    .line 224
    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    if-ne v4, v1, :cond_b

    .line 229
    .line 230
    return-object v1

    .line 231
    :cond_b
    move-object v11, v4

    .line 232
    move-object v4, p1

    .line 233
    move-object p1, v11

    .line 234
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-eqz p1, :cond_d

    .line 241
    .line 242
    invoke-interface {v4}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput-object v9, v0, Lkotlinx/coroutines/channels/v$h;->L$0:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v4, v0, Lkotlinx/coroutines/channels/v$h;->L$1:Ljava/lang/Object;

    .line 249
    .line 250
    iput v2, v0, Lkotlinx/coroutines/channels/v$h;->label:I

    .line 251
    .line 252
    invoke-interface {v9, p1, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-ne p1, v1, :cond_c

    .line 257
    .line 258
    return-object v1

    .line 259
    :cond_c
    move-object p1, v4

    .line 260
    goto :goto_5

    .line 261
    :cond_d
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 262
    .line 263
    return-object p1
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
.end method
