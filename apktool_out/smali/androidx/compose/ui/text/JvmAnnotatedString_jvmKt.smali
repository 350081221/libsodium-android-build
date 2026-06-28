.class public final Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a,\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a*\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0006\u0018\u00010\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0008H\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/text/AnnotatedString;",
        "Lkotlin/Function3;",
        "",
        "",
        "transform",
        "",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "ranges",
        "Ljava/util/SortedSet;",
        "target",
        "Lkotlin/r2;",
        "collectRangeTransitions",
        "ui-text_release"
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
        "SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n256#2,3:115\n33#2,4:118\n259#2,2:122\n38#2:124\n261#2:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:115,3\n74#1:118,4\n74#1:122,2\n74#1:124\n74#1:125\n*E\n"
    }
.end annotation


# direct methods
.method private static final collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "*>;>;",
            "Ljava/util/SortedSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {p1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
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
.end method

.method public static final transform(Landroidx/compose/ui/text/AnnotatedString;Lv3/q;)Landroidx/compose/ui/text/AnnotatedString;
    .locals 12
    .param p0    # Landroidx/compose/ui/text/AnnotatedString;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lv3/q<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/compose/ui/text/AnnotatedString;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ljava/lang/Integer;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    aput-object v3, v0, v4

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/collections/j1;->h([Ljava/lang/Object;)Ljava/util/TreeSet;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getSpanStylesOrNull$ui_text_release()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, v5}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;->collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getParagraphStylesOrNull$ui_text_release()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, v5}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;->collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, v5}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;->collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lkotlin/jvm/internal/k1$h;

    .line 52
    .line 53
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v3, ""

    .line 57
    .line 58
    iput-object v3, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 59
    .line 60
    new-array v3, v4, [Lkotlin/u0;

    .line 61
    .line 62
    invoke-static {v2, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    aput-object v2, v3, v1

    .line 67
    .line 68
    invoke-static {v3}, Lkotlin/collections/x0;->j0([Lkotlin/u0;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const/4 v6, 0x2

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    new-instance v9, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt$transform$1;

    .line 76
    .line 77
    invoke-direct {v9, v0, p1, p0, v2}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt$transform$1;-><init>(Lkotlin/jvm/internal/k1$h;Lv3/q;Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)V

    .line 78
    .line 79
    .line 80
    const/4 v10, 0x6

    .line 81
    const/4 v11, 0x0

    .line 82
    invoke-static/range {v5 .. v11}, Lkotlin/collections/u;->d6(Ljava/lang/Iterable;IIZLv3/l;ILjava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getSpanStylesOrNull$ui_text_release()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const/4 v3, 0x0

    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    new-instance v4, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    move v6, v1

    .line 106
    :goto_0
    if-ge v6, v5, :cond_1

    .line 107
    .line 108
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    check-cast v7, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 113
    .line 114
    new-instance v8, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 115
    .line 116
    invoke-virtual {v7}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v7}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-static {v10}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    check-cast v10, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    invoke-virtual {v7}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-static {v7}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    check-cast v7, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    invoke-direct {v8, v9, v10, v7}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;II)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    add-int/lit8 v6, v6, 0x1

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_0
    move-object v4, v3

    .line 172
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getParagraphStylesOrNull$ui_text_release()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-eqz p1, :cond_2

    .line 177
    .line 178
    new-instance v5, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    move v7, v1

    .line 192
    :goto_1
    if-ge v7, v6, :cond_3

    .line 193
    .line 194
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    check-cast v8, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 199
    .line 200
    new-instance v9, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 201
    .line 202
    invoke-virtual {v8}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    invoke-virtual {v8}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-static {v11}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    check-cast v11, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    invoke-virtual {v8}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    invoke-static {v8}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    check-cast v8, Ljava/lang/Number;

    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-direct {v9, v10, v11, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;II)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    add-int/lit8 v7, v7, 0x1

    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_2
    move-object v5, v3

    .line 258
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    if-eqz p0, :cond_4

    .line 263
    .line 264
    new-instance v3, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 271
    .line 272
    .line 273
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    :goto_2
    if-ge v1, p1, :cond_4

    .line 278
    .line 279
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    check-cast v6, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 284
    .line 285
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 286
    .line 287
    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    invoke-static {v9}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    check-cast v9, Ljava/lang/Number;

    .line 307
    .line 308
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-static {v6}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    check-cast v6, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    invoke-direct {v7, v8, v9, v6}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;II)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    add-int/lit8 v1, v1, 0x1

    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_4
    new-instance p0, Landroidx/compose/ui/text/AnnotatedString;

    .line 343
    .line 344
    iget-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p1, Ljava/lang/String;

    .line 347
    .line 348
    invoke-direct {p0, p1, v4, v5, v3}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 349
    .line 350
    .line 351
    return-object p0
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
.end method
