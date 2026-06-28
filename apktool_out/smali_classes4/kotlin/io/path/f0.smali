.class public final Lkotlin/io/path/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/sequences/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/sequences/m<",
        "Ljava/nio/file/Path;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010(\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002JE\u0010\u0018\u001a\u00020\u0019*\u0008\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0!\u0012\u0004\u0012\u00020\u00190 H\u0082H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u0014\u0010\u0008\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006#"
    }
    d2 = {
        "Lkotlin/io/path/PathTreeWalk;",
        "Lkotlin/sequences/Sequence;",
        "Ljava/nio/file/Path;",
        "start",
        "options",
        "",
        "Lkotlin/io/path/PathWalkOption;",
        "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V",
        "followLinks",
        "",
        "getFollowLinks",
        "()Z",
        "includeDirectories",
        "getIncludeDirectories",
        "isBFS",
        "linkOptions",
        "Ljava/nio/file/LinkOption;",
        "getLinkOptions",
        "()[Ljava/nio/file/LinkOption;",
        "[Lkotlin/io/path/PathWalkOption;",
        "bfsIterator",
        "",
        "dfsIterator",
        "iterator",
        "yieldIfNeeded",
        "",
        "Lkotlin/sequences/SequenceScope;",
        "node",
        "Lkotlin/io/path/PathNode;",
        "entriesReader",
        "Lkotlin/io/path/DirectoryEntriesReader;",
        "entriesAction",
        "Lkotlin/Function1;",
        "",
        "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "kotlin-stdlib-jdk7"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/io/path/o;
.end annotation


# instance fields
.field private final a:Ljava/nio/file/Path;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:[Lkotlin/io/path/j0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/nio/file/Path;[Lkotlin/io/path/j0;)V
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [Lkotlin/io/path/j0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "start"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkotlin/io/path/f0;->a:Ljava/nio/file/Path;

    .line 15
    .line 16
    iput-object p2, p0, Lkotlin/io/path/f0;->b:[Lkotlin/io/path/j0;

    .line 17
    .line 18
    return-void
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
.end method

.method public static final synthetic c(Lkotlin/io/path/f0;)Z
    .locals 0

    invoke-direct {p0}, Lkotlin/io/path/f0;->i()Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lkotlin/io/path/f0;)Z
    .locals 0

    invoke-direct {p0}, Lkotlin/io/path/f0;->j()Z

    move-result p0

    return p0
.end method

.method public static final synthetic e(Lkotlin/io/path/f0;)[Ljava/nio/file/LinkOption;
    .locals 0

    invoke-direct {p0}, Lkotlin/io/path/f0;->k()[Ljava/nio/file/LinkOption;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lkotlin/io/path/f0;)Ljava/nio/file/Path;
    .locals 0

    iget-object p0, p0, Lkotlin/io/path/f0;->a:Ljava/nio/file/Path;

    return-object p0
.end method

.method private final g()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlin/io/path/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/io/path/f0$a;-><init>(Lkotlin/io/path/f0;Lkotlin/coroutines/d;)V

    invoke-static {v0}, Lkotlin/sequences/p;->a(Lv3/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method private final h()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlin/io/path/f0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/io/path/f0$b;-><init>(Lkotlin/io/path/f0;Lkotlin/coroutines/d;)V

    invoke-static {v0}, Lkotlin/sequences/p;->a(Lv3/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method private final i()Z
    .locals 2

    iget-object v0, p0, Lkotlin/io/path/f0;->b:[Lkotlin/io/path/j0;

    sget-object v1, Lkotlin/io/path/j0;->FOLLOW_LINKS:Lkotlin/io/path/j0;

    invoke-static {v0, v1}, Lkotlin/collections/l;->s8([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final j()Z
    .locals 2

    iget-object v0, p0, Lkotlin/io/path/f0;->b:[Lkotlin/io/path/j0;

    sget-object v1, Lkotlin/io/path/j0;->INCLUDE_DIRECTORIES:Lkotlin/io/path/j0;

    invoke-static {v0, v1}, Lkotlin/collections/l;->s8([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final k()[Ljava/nio/file/LinkOption;
    .locals 2

    sget-object v0, Lkotlin/io/path/t;->a:Lkotlin/io/path/t;

    invoke-direct {p0}, Lkotlin/io/path/f0;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Lkotlin/io/path/t;->a(Z)[Ljava/nio/file/LinkOption;

    move-result-object v0

    return-object v0
.end method

.method private final l()Z
    .locals 2

    iget-object v0, p0, Lkotlin/io/path/f0;->b:[Lkotlin/io/path/j0;

    sget-object v1, Lkotlin/io/path/j0;->BREADTH_FIRST:Lkotlin/io/path/j0;

    invoke-static {v0, v1}, Lkotlin/collections/l;->s8([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final m(Lkotlin/sequences/o;Lkotlin/io/path/v;Lkotlin/io/path/i;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/o<",
            "-",
            "Ljava/nio/file/Path;",
            ">;",
            "Lkotlin/io/path/v;",
            "Lkotlin/io/path/i;",
            "Lv3/l<",
            "-",
            "Ljava/util/List<",
            "Lkotlin/io/path/v;",
            ">;",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lkotlin/io/path/v;->d()Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lkotlin/io/path/f0;->e(Lkotlin/io/path/f0;)[Ljava/nio/file/LinkOption;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v2, v1

    .line 10
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, [Ljava/nio/file/LinkOption;

    .line 15
    .line 16
    array-length v2, v1

    .line 17
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, [Ljava/nio/file/LinkOption;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/io/path/c;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-static {p2}, Lkotlin/io/path/i0;->a(Lkotlin/io/path/v;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    invoke-static {p0}, Lkotlin/io/path/f0;->d(Lkotlin/io/path/f0;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-static {v2}, Lkotlin/jvm/internal/i0;->e(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, p5}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Lkotlin/jvm/internal/i0;->e(I)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {p0}, Lkotlin/io/path/f0;->e(Lkotlin/io/path/f0;)[Ljava/nio/file/LinkOption;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    array-length p5, p1

    .line 57
    invoke-static {p1, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, [Ljava/nio/file/LinkOption;

    .line 62
    .line 63
    array-length p5, p1

    .line 64
    invoke-static {p1, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, [Ljava/nio/file/LinkOption;

    .line 69
    .line 70
    invoke-static {v0, p1}, Lkotlin/io/path/c;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p3, p2}, Lkotlin/io/path/i;->c(Lkotlin/io/path/v;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p4, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    new-instance p1, Ljava/nio/file/FileSystemLoopException;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-direct {p1, p2}, Ljava/nio/file/FileSystemLoopException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_2
    new-array p2, v3, [Ljava/nio/file/LinkOption;

    .line 95
    .line 96
    invoke-static {}, Lkotlin/io/path/d;->a()Ljava/nio/file/LinkOption;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    aput-object p3, p2, v2

    .line 101
    .line 102
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, [Ljava/nio/file/LinkOption;

    .line 107
    .line 108
    invoke-static {v0, p2}, Lkotlin/io/path/e0;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_3

    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/jvm/internal/i0;->e(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0, p5}, Lkotlin/sequences/o;->b(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, Lkotlin/jvm/internal/i0;->e(I)V

    .line 121
    .line 122
    .line 123
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_3
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 127
    .line 128
    return-object p1
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
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-direct {p0}, Lkotlin/io/path/f0;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkotlin/io/path/f0;->g()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lkotlin/io/path/f0;->h()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0
.end method
