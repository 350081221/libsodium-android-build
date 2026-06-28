.class public final Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aR\u0010\u000c\u001a\u0016\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Landroidx/compose/ui/text/font/Font;",
        "Landroidx/compose/ui/text/font/TypefaceRequest;",
        "typefaceRequest",
        "Landroidx/compose/ui/text/font/AsyncTypefaceCache;",
        "asyncTypefaceCache",
        "Landroidx/compose/ui/text/font/PlatformFontLoader;",
        "platformFontLoader",
        "Lkotlin/Function1;",
        "",
        "createDefaultTypeface",
        "Lkotlin/u0;",
        "firstImmediatelyAvailable",
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
        "SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n26#3:434\n26#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$firstImmediatelyAvailable(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lv3/l;)Lkotlin/u0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt;->firstImmediatelyAvailable(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lv3/l;)Lkotlin/u0;

    move-result-object p0

    return-object p0
.end method

.method private static final firstImmediatelyAvailable(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lv3/l;)Lkotlin/u0;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/font/Font;",
            ">;",
            "Landroidx/compose/ui/text/font/TypefaceRequest;",
            "Landroidx/compose/ui/text/font/AsyncTypefaceCache;",
            "Landroidx/compose/ui/text/font/PlatformFontLoader;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/font/TypefaceRequest;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlin/u0<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/font/Font;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p3

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v9

    .line 7
    const/4 v10, 0x0

    .line 8
    const/4 v11, 0x0

    .line 9
    move-object v13, v10

    .line 10
    move v12, v11

    .line 11
    :goto_0
    if-ge v12, v9, :cond_e

    .line 12
    .line 13
    move-object/from16 v14, p0

    .line 14
    .line 15
    invoke-interface {v14, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v15, v0

    .line 20
    check-cast v15, Landroidx/compose/ui/text/font/Font;

    .line 21
    .line 22
    invoke-interface {v15}, Landroidx/compose/ui/text/font/Font;->getLoadingStrategy-PKNRLFQ()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sget-object v1, Landroidx/compose/ui/text/font/FontLoadingStrategy;->Companion:Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;->getBlocking-PKNRLFQ()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v0, v2}, Landroidx/compose/ui/text/font/FontLoadingStrategy;->equals-impl0(II)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->access$getCacheLock$p(Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/platform/SynchronizedObject;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    monitor-enter v1

    .line 43
    :try_start_0
    new-instance v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;

    .line 44
    .line 45
    invoke-interface/range {p3 .. p3}, Landroidx/compose/ui/text/font/PlatformFontLoader;->getCacheKey()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v0, v15, v2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;-><init>(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->access$getResultCache$p(Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/LruCache;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2, v0}, Landroidx/compose/ui/text/caches/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->access$getPermanentCache$p(Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/SimpleArrayMap;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, v0}, Landroidx/compose/ui/text/caches/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    move-object v2, v0

    .line 73
    check-cast v2, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;

    .line 74
    .line 75
    :cond_0
    if-eqz v2, :cond_1

    .line 76
    .line 77
    invoke-virtual {v2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;->unbox-impl()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    monitor-exit v1

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    :try_start_1
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    monitor-exit v1

    .line 86
    :try_start_2
    invoke-interface {v8, v15}, Landroidx/compose/ui/text/font/PlatformFontLoader;->loadBlocking(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/16 v6, 0x8

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    move-object/from16 v1, p2

    .line 95
    .line 96
    move-object v2, v15

    .line 97
    move-object/from16 v3, p3

    .line 98
    .line 99
    move-object v4, v0

    .line 100
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->put$default(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Ljava/lang/Object;ZILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :goto_1
    if-eqz v0, :cond_2

    .line 104
    .line 105
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontSynthesis-GVVA2EU()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontStyle-_-LCdwA()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-static {v1, v0, v15, v2, v3}, Landroidx/compose/ui/text/font/FontSynthesis_androidKt;->synthesizeTypeface-FxwP2eA(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v13, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v2, "Unable to load font "

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :catch_0
    move-exception v0

    .line 150
    move-object v1, v0

    .line 151
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    new-instance v2, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v3, "Unable to load font "

    .line 159
    .line 160
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    monitor-exit v1

    .line 176
    throw v0

    .line 177
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;->getOptionalLocal-PKNRLFQ()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-static {v0, v2}, Landroidx/compose/ui/text/font/FontLoadingStrategy;->equals-impl0(II)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_8

    .line 186
    .line 187
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->access$getCacheLock$p(Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/platform/SynchronizedObject;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    monitor-enter v1

    .line 192
    :try_start_3
    new-instance v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;

    .line 193
    .line 194
    invoke-interface/range {p3 .. p3}, Landroidx/compose/ui/text/font/PlatformFontLoader;->getCacheKey()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-direct {v0, v15, v2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;-><init>(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->access$getResultCache$p(Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/LruCache;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v2, v0}, Landroidx/compose/ui/text/caches/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;

    .line 210
    .line 211
    if-nez v2, :cond_4

    .line 212
    .line 213
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->access$getPermanentCache$p(Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/SimpleArrayMap;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2, v0}, Landroidx/compose/ui/text/caches/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    move-object v2, v0

    .line 222
    check-cast v2, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;

    .line 223
    .line 224
    :cond_4
    if-eqz v2, :cond_5

    .line 225
    .line 226
    invoke-virtual {v2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;->unbox-impl()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 230
    monitor-exit v1

    .line 231
    goto :goto_3

    .line 232
    :cond_5
    :try_start_4
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 233
    .line 234
    monitor-exit v1

    .line 235
    :try_start_5
    sget-object v0, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 236
    .line 237
    invoke-interface {v8, v15}, Landroidx/compose/ui/text/font/PlatformFontLoader;->loadBlocking(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 245
    goto :goto_2

    .line 246
    :catchall_1
    move-exception v0

    .line 247
    sget-object v1, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 248
    .line 249
    invoke-static {v0}, Lkotlin/e1;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    :goto_2
    invoke-static {v0}, Lkotlin/d1;->isFailure-impl(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_6

    .line 262
    .line 263
    move-object v0, v10

    .line 264
    :cond_6
    const/4 v5, 0x0

    .line 265
    const/16 v6, 0x8

    .line 266
    .line 267
    const/4 v7, 0x0

    .line 268
    move-object/from16 v1, p2

    .line 269
    .line 270
    move-object v2, v15

    .line 271
    move-object/from16 v3, p3

    .line 272
    .line 273
    move-object v4, v0

    .line 274
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->put$default(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Ljava/lang/Object;ZILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_3
    if-eqz v0, :cond_7

    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontSynthesis-GVVA2EU()I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontStyle-_-LCdwA()I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-static {v1, v0, v15, v2, v3}, Landroidx/compose/ui/text/font/FontSynthesis_androidKt;->synthesizeTypeface-FxwP2eA(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v13, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0

    .line 300
    :cond_7
    move-object/from16 v1, p2

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :catchall_2
    move-exception v0

    .line 304
    monitor-exit v1

    .line 305
    throw v0

    .line 306
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;->getAsync-PKNRLFQ()I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-static {v0, v1}, Landroidx/compose/ui/text/font/FontLoadingStrategy;->equals-impl0(II)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_d

    .line 315
    .line 316
    move-object/from16 v1, p2

    .line 317
    .line 318
    invoke-virtual {v1, v15, v8}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->get-1ASDuI8(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-nez v0, :cond_a

    .line 323
    .line 324
    if-nez v13, :cond_9

    .line 325
    .line 326
    const/4 v0, 0x1

    .line 327
    new-array v0, v0, [Landroidx/compose/ui/text/font/Font;

    .line 328
    .line 329
    aput-object v15, v0, v11

    .line 330
    .line 331
    invoke-static {v0}, Lkotlin/collections/u;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v13

    .line 335
    goto :goto_4

    .line 336
    :cond_9
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_a
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;->unbox-impl()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-static {v2}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;->isPermanentFailure-impl(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    if-eqz v2, :cond_b

    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_b
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;->unbox-impl()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-eqz v2, :cond_c

    .line 356
    .line 357
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontSynthesis-GVVA2EU()I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;->unbox-impl()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontStyle-_-LCdwA()I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    invoke-static {v1, v0, v15, v2, v3}, Landroidx/compose/ui/text/font/FontSynthesis_androidKt;->synthesizeTypeface-FxwP2eA(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v13, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    return-object v0

    .line 382
    :cond_c
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 387
    .line 388
    new-instance v1, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    const-string v2, "Unknown font type "

    .line 394
    .line 395
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :cond_e
    move-object/from16 v1, p1

    .line 410
    .line 411
    move-object/from16 v2, p4

    .line 412
    .line 413
    invoke-interface {v2, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v13, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    return-object v0
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
.end method
