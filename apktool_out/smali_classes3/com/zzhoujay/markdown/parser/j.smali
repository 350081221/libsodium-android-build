.class public Lcom/zzhoujay/markdown/parser/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zzhoujay/markdown/parser/i;


# static fields
.field private static final A:Ljava/util/regex/Matcher;

.field private static final B:Ljava/util/regex/Matcher;

.field private static final C:Ljava/util/regex/Matcher;

.field private static final D:Ljava/util/regex/Matcher;

.field private static final E:Ljava/util/regex/Matcher;

.field private static final F:Ljava/util/regex/Matcher;

.field private static final G:Ljava/util/regex/Matcher;

.field private static final H:Ljava/util/regex/Matcher;

.field private static final I:Ljava/util/regex/Matcher;

.field private static final J:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/regex/Matcher;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/regex/Matcher;

.field private static final f:Ljava/util/regex/Matcher;

.field private static final g:Ljava/util/regex/Matcher;

.field private static final h:Ljava/util/regex/Matcher;

.field private static final i:Ljava/util/regex/Matcher;

.field private static final j:Ljava/util/regex/Matcher;

.field private static final k:Ljava/util/regex/Matcher;

.field private static final l:Ljava/util/regex/Matcher;

.field private static final m:Ljava/util/regex/Matcher;

.field private static final n:Ljava/util/regex/Matcher;

.field private static final o:Ljava/util/regex/Matcher;

.field private static final p:Ljava/util/regex/Matcher;

.field private static final q:Ljava/util/regex/Matcher;

.field private static final r:Ljava/util/regex/Matcher;

.field private static final s:Ljava/util/regex/Matcher;

.field private static final t:Ljava/util/regex/Matcher;

.field private static final u:Ljava/util/regex/Matcher;

.field private static final v:Ljava/util/regex/Matcher;

.field private static final w:Ljava/util/regex/Matcher;

.field private static final x:Ljava/util/regex/Matcher;

.field private static final y:Ljava/util/regex/Matcher;

.field private static final z:Ljava/util/regex/Matcher;


# instance fields
.field private a:Lcom/zzhoujay/markdown/parser/d;

.field private b:Lcom/zzhoujay/markdown/parser/c$a;

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 32

    .line 1
    const-string v0, "^\\s*=+\\s*$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->e:Ljava/util/regex/Matcher;

    .line 14
    .line 15
    const-string v2, "^\\s*-+\\s*$"

    .line 16
    .line 17
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sput-object v2, Lcom/zzhoujay/markdown/parser/j;->f:Ljava/util/regex/Matcher;

    .line 26
    .line 27
    const-string v3, "^\\s*#{1,6}\\s*([^#]*)(\\s*#)?"

    .line 28
    .line 29
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sput-object v3, Lcom/zzhoujay/markdown/parser/j;->g:Ljava/util/regex/Matcher;

    .line 38
    .line 39
    const-string v4, "^\\s*#\\s*([^#]*)(\\s*#)?"

    .line 40
    .line 41
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, Lcom/zzhoujay/markdown/parser/j;->h:Ljava/util/regex/Matcher;

    .line 50
    .line 51
    const-string v5, "^\\s*#{2}\\s*([^#]*)(\\s*#)?"

    .line 52
    .line 53
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    sput-object v5, Lcom/zzhoujay/markdown/parser/j;->i:Ljava/util/regex/Matcher;

    .line 62
    .line 63
    const-string v6, "^\\s*#{3}\\s*([^#]*)(\\s*#)?"

    .line 64
    .line 65
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    sput-object v6, Lcom/zzhoujay/markdown/parser/j;->j:Ljava/util/regex/Matcher;

    .line 74
    .line 75
    const-string v7, "^\\s*#{4}\\s*([^#]*)(\\s*#)?"

    .line 76
    .line 77
    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v7, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    sput-object v7, Lcom/zzhoujay/markdown/parser/j;->k:Ljava/util/regex/Matcher;

    .line 86
    .line 87
    const-string v8, "^\\s*#{5}\\s*([^#]*)(\\s*#)?"

    .line 88
    .line 89
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {v8, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    sput-object v8, Lcom/zzhoujay/markdown/parser/j;->l:Ljava/util/regex/Matcher;

    .line 98
    .line 99
    const-string v9, "^\\s*#{6}\\s*([^#]*)(\\s*#)?"

    .line 100
    .line 101
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-virtual {v9, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    sput-object v9, Lcom/zzhoujay/markdown/parser/j;->m:Ljava/util/regex/Matcher;

    .line 110
    .line 111
    const-string v10, "^\\s{0,3}>\\s(.*)"

    .line 112
    .line 113
    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v10, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    sput-object v10, Lcom/zzhoujay/markdown/parser/j;->n:Ljava/util/regex/Matcher;

    .line 122
    .line 123
    const-string v11, "^\\s*[*+-]\\s+(.*)"

    .line 124
    .line 125
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    invoke-virtual {v11, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    sput-object v11, Lcom/zzhoujay/markdown/parser/j;->o:Ljava/util/regex/Matcher;

    .line 134
    .line 135
    const-string v12, "^\\s*\\d+\\.\\s+(.*)"

    .line 136
    .line 137
    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v12, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    sput-object v12, Lcom/zzhoujay/markdown/parser/j;->p:Ljava/util/regex/Matcher;

    .line 146
    .line 147
    const-string v13, "[^*_]*(([*_])([^*_].*?)\\2)"

    .line 148
    .line 149
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-virtual {v13, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    sput-object v13, Lcom/zzhoujay/markdown/parser/j;->q:Ljava/util/regex/Matcher;

    .line 158
    .line 159
    const-string v14, "[^*_]*(([*_])\\2([^*_].*?)\\2\\2)"

    .line 160
    .line 161
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    invoke-virtual {v14, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    sput-object v14, Lcom/zzhoujay/markdown/parser/j;->r:Ljava/util/regex/Matcher;

    .line 170
    .line 171
    const-string v15, "[^*_]*(([*_])\\2\\2([^*_].*?)\\2\\2\\2)"

    .line 172
    .line 173
    invoke-static {v15}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    invoke-virtual {v15, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    sput-object v15, Lcom/zzhoujay/markdown/parser/j;->s:Ljava/util/regex/Matcher;

    .line 182
    .line 183
    const-string v16, "[^~]*((~{2,4})([^~].*?)\\2)"

    .line 184
    .line 185
    move-object/from16 v17, v2

    .line 186
    .line 187
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    sput-object v2, Lcom/zzhoujay/markdown/parser/j;->t:Ljava/util/regex/Matcher;

    .line 196
    .line 197
    const-string v16, "[^`]*((`+)([^`].*?)\\2)"

    .line 198
    .line 199
    move-object/from16 v18, v0

    .line 200
    .line 201
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->u:Ljava/util/regex/Matcher;

    .line 210
    .line 211
    const-string v16, ".*?(\\[\\s*(.*?)\\s*]\\(\\s*(\\S*?)(\\s+([\'\"])(.*?)\\5)?\\s*?\\))"

    .line 212
    .line 213
    move-object/from16 v19, v0

    .line 214
    .line 215
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->v:Ljava/util/regex/Matcher;

    .line 224
    .line 225
    const-string v16, ".*?(!\\[\\s*(.*?)\\s*]\\(\\s*(\\S*?)(\\s+([\'\"])(.*?)\\5)?\\s*?\\))"

    .line 226
    .line 227
    move-object/from16 v20, v0

    .line 228
    .line 229
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->w:Ljava/util/regex/Matcher;

    .line 238
    .line 239
    const-string v16, ".*?(\\[\\s*(.*?)\\s*]\\s*\\[\\s*(.*?)\\s*])"

    .line 240
    .line 241
    move-object/from16 v21, v0

    .line 242
    .line 243
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->x:Ljava/util/regex/Matcher;

    .line 252
    .line 253
    const-string v16, "^\\s*\\[\\s*(.*?)\\s*]:\\s*(\\S+?)(\\s+([\'\"])(.*?)\\4)?\\s*$"

    .line 254
    .line 255
    move-object/from16 v22, v0

    .line 256
    .line 257
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->y:Ljava/util/regex/Matcher;

    .line 266
    .line 267
    const-string v16, ".*?(!\\[\\s*(.*?)\\s*]\\s*\\[\\s*(.*?)\\s*])"

    .line 268
    .line 269
    move-object/from16 v23, v0

    .line 270
    .line 271
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->z:Ljava/util/regex/Matcher;

    .line 280
    .line 281
    const-string v16, "^\\s*!\\[\\s*(.*?)\\s*]:\\s*(\\S+?)(\\s+([\'\"])(.*?)\\4)?\\s*$"

    .line 282
    .line 283
    move-object/from16 v24, v0

    .line 284
    .line 285
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->A:Ljava/util/regex/Matcher;

    .line 294
    .line 295
    const-string v16, ".*?(<(\\S+@\\S+\\.\\S+)>).*?"

    .line 296
    .line 297
    move-object/from16 v25, v0

    .line 298
    .line 299
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->B:Ljava/util/regex/Matcher;

    .line 308
    .line 309
    const-string v16, "((https|http|ftp|rtsp|mms)?://)[^\\s]+"

    .line 310
    .line 311
    move-object/from16 v26, v2

    .line 312
    .line 313
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    sput-object v2, Lcom/zzhoujay/markdown/parser/j;->C:Ljava/util/regex/Matcher;

    .line 322
    .line 323
    const-string v16, "(.*?) {2} *$"

    .line 324
    .line 325
    move-object/from16 v27, v2

    .line 326
    .line 327
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    sput-object v2, Lcom/zzhoujay/markdown/parser/j;->D:Ljava/util/regex/Matcher;

    .line 336
    .line 337
    const-string v16, "\\S*(\\s+)\\S+"

    .line 338
    .line 339
    move-object/from16 v28, v2

    .line 340
    .line 341
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    sput-object v2, Lcom/zzhoujay/markdown/parser/j;->E:Ljava/util/regex/Matcher;

    .line 350
    .line 351
    const-string v2, "^( {4}|\\t)(.*)"

    .line 352
    .line 353
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    sput-object v2, Lcom/zzhoujay/markdown/parser/j;->F:Ljava/util/regex/Matcher;

    .line 362
    .line 363
    const-string v16, "^\\s*```"

    .line 364
    .line 365
    move-object/from16 v29, v0

    .line 366
    .line 367
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    sput-object v0, Lcom/zzhoujay/markdown/parser/j;->G:Ljava/util/regex/Matcher;

    .line 376
    .line 377
    const-string v16, "^\\s*$"

    .line 378
    .line 379
    move-object/from16 v30, v15

    .line 380
    .line 381
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    invoke-virtual {v15, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 386
    .line 387
    .line 388
    move-result-object v15

    .line 389
    sput-object v15, Lcom/zzhoujay/markdown/parser/j;->H:Ljava/util/regex/Matcher;

    .line 390
    .line 391
    const-string v16, "^\\s*([-*]\\s*){3,}$"

    .line 392
    .line 393
    move-object/from16 v31, v15

    .line 394
    .line 395
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    invoke-virtual {v15, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    sput-object v1, Lcom/zzhoujay/markdown/parser/j;->I:Ljava/util/regex/Matcher;

    .line 404
    .line 405
    new-instance v15, Landroid/util/SparseArray;

    .line 406
    .line 407
    invoke-direct {v15}, Landroid/util/SparseArray;-><init>()V

    .line 408
    .line 409
    .line 410
    sput-object v15, Lcom/zzhoujay/markdown/parser/j;->J:Landroid/util/SparseArray;

    .line 411
    .line 412
    move-object/from16 v16, v1

    .line 413
    .line 414
    const/4 v1, 0x1

    .line 415
    invoke-virtual {v15, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    const/4 v1, 0x2

    .line 419
    invoke-virtual {v15, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    const/4 v0, 0x3

    .line 423
    invoke-virtual {v15, v0, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    const/4 v0, 0x4

    .line 427
    invoke-virtual {v15, v0, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    const/16 v0, 0x18

    .line 431
    .line 432
    invoke-virtual {v15, v0, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    const/4 v0, 0x5

    .line 436
    invoke-virtual {v15, v0, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    const/4 v0, 0x6

    .line 440
    invoke-virtual {v15, v0, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    const/4 v0, 0x7

    .line 444
    invoke-virtual {v15, v0, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    const/16 v0, 0x17

    .line 448
    .line 449
    invoke-virtual {v15, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    const/16 v0, 0x8

    .line 453
    .line 454
    invoke-virtual {v15, v0, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    const/16 v0, 0x9

    .line 458
    .line 459
    invoke-virtual {v15, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    const/16 v0, 0xa

    .line 463
    .line 464
    invoke-virtual {v15, v0, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    const/16 v0, 0xb

    .line 468
    .line 469
    invoke-virtual {v15, v0, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    const/16 v0, 0xc

    .line 473
    .line 474
    invoke-virtual {v15, v0, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    const/16 v0, 0xd

    .line 478
    .line 479
    move-object/from16 v1, v30

    .line 480
    .line 481
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    const/16 v0, 0xe

    .line 485
    .line 486
    move-object/from16 v1, v29

    .line 487
    .line 488
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    const/16 v0, 0xf

    .line 492
    .line 493
    move-object/from16 v1, v27

    .line 494
    .line 495
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    const/16 v0, 0x10

    .line 499
    .line 500
    move-object/from16 v1, v26

    .line 501
    .line 502
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    const/16 v0, 0x11

    .line 506
    .line 507
    move-object/from16 v1, v20

    .line 508
    .line 509
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    const/16 v0, 0x12

    .line 513
    .line 514
    move-object/from16 v1, v22

    .line 515
    .line 516
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    const/16 v0, 0x13

    .line 520
    .line 521
    move-object/from16 v1, v23

    .line 522
    .line 523
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    const/16 v0, 0x14

    .line 527
    .line 528
    move-object/from16 v1, v21

    .line 529
    .line 530
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    const/16 v0, 0x15

    .line 534
    .line 535
    move-object/from16 v1, v24

    .line 536
    .line 537
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    const/16 v0, 0x16

    .line 541
    .line 542
    move-object/from16 v1, v25

    .line 543
    .line 544
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    const/16 v0, 0x19

    .line 548
    .line 549
    move-object/from16 v1, v31

    .line 550
    .line 551
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    const/16 v0, 0x1a

    .line 555
    .line 556
    move-object/from16 v1, v28

    .line 557
    .line 558
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    const/16 v0, 0x1b

    .line 562
    .line 563
    move-object/from16 v1, v16

    .line 564
    .line 565
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    const/16 v0, 0x1c

    .line 569
    .line 570
    move-object/from16 v1, v18

    .line 571
    .line 572
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    const/16 v0, 0x1d

    .line 576
    .line 577
    move-object/from16 v1, v17

    .line 578
    .line 579
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    const/16 v0, 0x1e

    .line 583
    .line 584
    move-object/from16 v1, v19

    .line 585
    .line 586
    invoke-virtual {v15, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    return-void
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
.end method

.method public constructor <init>(Lcom/zzhoujay/markdown/parser/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/j;->d:Ljava/util/HashMap;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/j;->c:Ljava/util/HashMap;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private I(Landroid/text/SpannableStringBuilder;II)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Lc3/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Lc3/b;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v4, v0, v3

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-virtual {p1, v4}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-ge v5, p3, :cond_0

    .line 29
    .line 30
    if-le v4, p2, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return v2
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
.end method

.method private J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;
    .locals 2

    .line 1
    sget-object v0, Lcom/zzhoujay/markdown/parser/j;->J:Landroid/util/SparseArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/util/regex/Matcher;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p1
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
.end method

.method private K(Lcom/zzhoujay/markdown/parser/a;I)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_15

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-virtual {p1, v2}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/zzhoujay/markdown/parser/a;

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-direct {v4, v6}, Lcom/zzhoujay/markdown/parser/a;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-object v7, p0, Lcom/zzhoujay/markdown/parser/j;->b:Lcom/zzhoujay/markdown/parser/c$a;

    .line 40
    .line 41
    invoke-interface {v7}, Lcom/zzhoujay/markdown/parser/c$a;->getQueue()Lcom/zzhoujay/markdown/parser/b;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->w()Lcom/zzhoujay/markdown/parser/a;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-virtual {v9}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-ne v9, v5, :cond_0

    .line 58
    .line 59
    move v3, v5

    .line 60
    :cond_0
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->E(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Lcom/zzhoujay/markdown/parser/a;->D(I)V

    .line 66
    .line 67
    .line 68
    :cond_1
    if-eqz v8, :cond_5

    .line 69
    .line 70
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const/4 v10, 0x2

    .line 75
    if-eq v9, v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-ne v9, v10, :cond_5

    .line 82
    .line 83
    :cond_2
    if-lez p2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->start(I)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    sub-int/2addr v0, v10

    .line 102
    invoke-virtual {p2, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const-string v0, "\\t"

    .line 107
    .line 108
    const-string v9, "    "

    .line 109
    .line 110
    invoke-virtual {p2, v0, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    mul-int/2addr v9, v10

    .line 123
    add-int/2addr v9, v5

    .line 124
    if-le v0, v9, :cond_4

    .line 125
    .line 126
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    add-int/2addr p2, v5

    .line 131
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    div-int/2addr p2, v10

    .line 140
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_0
    if-eqz v8, :cond_6

    .line 144
    .line 145
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-ne p2, v2, :cond_6

    .line 150
    .line 151
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-ne p2, v0, :cond_6

    .line 160
    .line 161
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    add-int/2addr p2, v5

    .line 166
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->C(I)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_6
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->C(I)V

    .line 171
    .line 172
    .line 173
    :goto_1
    const-string p2, " "

    .line 174
    .line 175
    if-eqz v3, :cond_7

    .line 176
    .line 177
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_7
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    invoke-interface {v0, p2, v2, v8}, Lcom/zzhoujay/markdown/parser/d;->o(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 196
    .line 197
    .line 198
    :goto_2
    const/16 p2, 0x9

    .line 199
    .line 200
    invoke-virtual {p0, p2, v4}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    const/16 v0, 0x8

    .line 205
    .line 206
    if-eqz p2, :cond_c

    .line 207
    .line 208
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    add-int/2addr p2, v5

    .line 213
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->I()V

    .line 214
    .line 215
    .line 216
    if-eqz v6, :cond_a

    .line 217
    .line 218
    invoke-virtual {v6}, Lcom/zzhoujay/markdown/parser/a;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1, v4}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 226
    .line 227
    .line 228
    invoke-direct {p0, v4, p2}, Lcom/zzhoujay/markdown/parser/j;->N(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 229
    .line 230
    .line 231
    if-eqz v3, :cond_9

    .line 232
    .line 233
    :goto_3
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    if-eqz p2, :cond_8

    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    goto :goto_3

    .line 244
    :cond_8
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 245
    .line 246
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {p0, v0, p1, v5}, Lcom/zzhoujay/markdown/parser/j;->c(ILcom/zzhoujay/markdown/parser/a;I)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    sub-int/2addr v0, v5

    .line 255
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    invoke-interface {p2, v1, v0, v2}, Lcom/zzhoujay/markdown/parser/d;->p(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_9
    :goto_4
    if-eqz p1, :cond_b

    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-ne p2, v5, :cond_b

    .line 274
    .line 275
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 276
    .line 277
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-interface {p2, v0}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    goto :goto_4

    .line 293
    :cond_a
    invoke-virtual {p1, v4}, Lcom/zzhoujay/markdown/parser/a;->c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->N(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 304
    .line 305
    .line 306
    :cond_b
    :goto_5
    return v5

    .line 307
    :cond_c
    invoke-virtual {p0, v1, v4}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 308
    .line 309
    .line 310
    move-result p2

    .line 311
    if-eqz p2, :cond_11

    .line 312
    .line 313
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    add-int/2addr p2, v5

    .line 318
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->I()V

    .line 319
    .line 320
    .line 321
    if-eqz v6, :cond_f

    .line 322
    .line 323
    invoke-virtual {v6}, Lcom/zzhoujay/markdown/parser/a;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {p1, v4}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 331
    .line 332
    .line 333
    invoke-direct {p0, v4, p2}, Lcom/zzhoujay/markdown/parser/j;->K(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 334
    .line 335
    .line 336
    if-eqz v3, :cond_e

    .line 337
    .line 338
    :goto_6
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    if-eqz p2, :cond_d

    .line 343
    .line 344
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    goto :goto_6

    .line 349
    :cond_d
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 350
    .line 351
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-virtual {p0, v0, p1, v5}, Lcom/zzhoujay/markdown/parser/j;->c(ILcom/zzhoujay/markdown/parser/a;I)I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    sub-int/2addr v0, v5

    .line 360
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    invoke-interface {p2, v1, v0, v2, v3}, Lcom/zzhoujay/markdown/parser/d;->j(Ljava/lang/CharSequence;III)Landroid/text/SpannableStringBuilder;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 373
    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_e
    :goto_7
    if-eqz p1, :cond_10

    .line 377
    .line 378
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 379
    .line 380
    .line 381
    move-result p2

    .line 382
    if-ne p2, v5, :cond_10

    .line 383
    .line 384
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 385
    .line 386
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-interface {p2, v0}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    goto :goto_7

    .line 402
    :cond_f
    invoke-virtual {p1, v4}, Lcom/zzhoujay/markdown/parser/a;->c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 406
    .line 407
    .line 408
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->K(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 413
    .line 414
    .line 415
    :cond_10
    :goto_8
    return v5

    .line 416
    :cond_11
    invoke-virtual {p0, v4}, Lcom/zzhoujay/markdown/parser/j;->G(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    if-eqz p2, :cond_12

    .line 421
    .line 422
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 423
    .line 424
    .line 425
    move-result-object p2

    .line 426
    goto :goto_9

    .line 427
    :cond_12
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p2

    .line 431
    :goto_9
    instance-of v0, p2, Landroid/text/SpannableStringBuilder;

    .line 432
    .line 433
    if-eqz v0, :cond_13

    .line 434
    .line 435
    check-cast p2, Landroid/text/SpannableStringBuilder;

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_13
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 439
    .line 440
    invoke-direct {v0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 441
    .line 442
    .line 443
    move-object p2, v0

    .line 444
    :goto_a
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 448
    .line 449
    .line 450
    if-nez v3, :cond_14

    .line 451
    .line 452
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 453
    .line 454
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    invoke-interface {p2, v0, v1, v2}, Lcom/zzhoujay/markdown/parser/d;->o(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 467
    .line 468
    .line 469
    move-result-object p2

    .line 470
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    :cond_14
    return v5

    .line 474
    :cond_15
    return v3
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method

.method private L(Lcom/zzhoujay/markdown/parser/b;)V
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x19

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->m()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private M(Lcom/zzhoujay/markdown/parser/b;)V
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->k()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x19

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->k()Lcom/zzhoujay/markdown/parser/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->n()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private N(Lcom/zzhoujay/markdown/parser/a;I)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_14

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-virtual {p1, v2}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->k(Ljava/lang/String;)Lcom/zzhoujay/markdown/parser/a;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {p1, v3}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, p0, Lcom/zzhoujay/markdown/parser/j;->b:Lcom/zzhoujay/markdown/parser/c$a;

    .line 39
    .line 40
    invoke-interface {v7}, Lcom/zzhoujay/markdown/parser/c$a;->getQueue()Lcom/zzhoujay/markdown/parser/b;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->w()Lcom/zzhoujay/markdown/parser/a;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {v9}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-ne v9, v4, :cond_0

    .line 57
    .line 58
    move v3, v4

    .line 59
    :cond_0
    if-eqz v3, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1, v4}, Lcom/zzhoujay/markdown/parser/a;->E(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v2}, Lcom/zzhoujay/markdown/parser/a;->D(I)V

    .line 65
    .line 66
    .line 67
    :cond_1
    if-eqz v8, :cond_5

    .line 68
    .line 69
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    const/4 v10, 0x3

    .line 74
    if-eq v9, v10, :cond_2

    .line 75
    .line 76
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-ne v9, v2, :cond_5

    .line 81
    .line 82
    :cond_2
    if-lez p2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->start(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sub-int/2addr v0, v2

    .line 101
    invoke-virtual {p2, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const-string v0, "\\t"

    .line 106
    .line 107
    const-string v9, "    "

    .line 108
    .line 109
    invoke-virtual {p2, v0, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    mul-int/2addr v9, v2

    .line 122
    add-int/2addr v9, v4

    .line 123
    if-le v0, v9, :cond_4

    .line 124
    .line 125
    invoke-virtual {v8}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    add-int/2addr p2, v4

    .line 130
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    div-int/2addr p2, v2

    .line 139
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_0
    const-string p2, " "

    .line 143
    .line 144
    if-eqz v3, :cond_6

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-interface {v0, p2, v2}, Lcom/zzhoujay/markdown/parser/d;->k(Ljava/lang/CharSequence;I)Landroid/text/SpannableStringBuilder;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    :goto_1
    invoke-virtual {p0, v1, v5}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    const/16 v0, 0x8

    .line 168
    .line 169
    if-eqz p2, :cond_b

    .line 170
    .line 171
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    add-int/2addr p2, v4

    .line 176
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->I()V

    .line 177
    .line 178
    .line 179
    if-eqz v6, :cond_9

    .line 180
    .line 181
    invoke-virtual {v6}, Lcom/zzhoujay/markdown/parser/a;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 189
    .line 190
    .line 191
    invoke-direct {p0, v5, p2}, Lcom/zzhoujay/markdown/parser/j;->N(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 192
    .line 193
    .line 194
    if-eqz v3, :cond_8

    .line 195
    .line 196
    :goto_2
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    if-eqz p2, :cond_7

    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    goto :goto_2

    .line 207
    :cond_7
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 208
    .line 209
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p0, v0, p1, v4}, Lcom/zzhoujay/markdown/parser/j;->c(ILcom/zzhoujay/markdown/parser/a;I)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    sub-int/2addr v0, v4

    .line 218
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-interface {p2, v1, v0, v2}, Lcom/zzhoujay/markdown/parser/d;->p(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_8
    :goto_3
    if-eqz p1, :cond_a

    .line 231
    .line 232
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    if-ne p2, v4, :cond_a

    .line 237
    .line 238
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 239
    .line 240
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-interface {p2, v0}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    goto :goto_3

    .line 256
    :cond_9
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->N(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 267
    .line 268
    .line 269
    :cond_a
    :goto_4
    return v4

    .line 270
    :cond_b
    const/16 p2, 0xa

    .line 271
    .line 272
    invoke-virtual {p0, p2, v5}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-eqz p2, :cond_10

    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    add-int/2addr p2, v4

    .line 283
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->I()V

    .line 284
    .line 285
    .line 286
    if-eqz v6, :cond_e

    .line 287
    .line 288
    invoke-virtual {v6}, Lcom/zzhoujay/markdown/parser/a;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 296
    .line 297
    .line 298
    invoke-direct {p0, v5, p2}, Lcom/zzhoujay/markdown/parser/j;->K(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 299
    .line 300
    .line 301
    if-eqz v3, :cond_d

    .line 302
    .line 303
    :goto_5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    if-eqz p2, :cond_c

    .line 308
    .line 309
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    goto :goto_5

    .line 314
    :cond_c
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 315
    .line 316
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {p0, v0, p1, v4}, Lcom/zzhoujay/markdown/parser/j;->c(ILcom/zzhoujay/markdown/parser/a;I)I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    sub-int/2addr v0, v4

    .line 325
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-interface {p2, v1, v0, v2, v3}, Lcom/zzhoujay/markdown/parser/d;->j(Ljava/lang/CharSequence;III)Landroid/text/SpannableStringBuilder;

    .line 334
    .line 335
    .line 336
    move-result-object p2

    .line 337
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_d
    :goto_6
    if-eqz p1, :cond_f

    .line 342
    .line 343
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    if-ne p2, v4, :cond_f

    .line 348
    .line 349
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 350
    .line 351
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-interface {p2, v0}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 356
    .line 357
    .line 358
    move-result-object p2

    .line 359
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    goto :goto_6

    .line 367
    :cond_e
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->K(Lcom/zzhoujay/markdown/parser/a;I)Z

    .line 378
    .line 379
    .line 380
    :cond_f
    :goto_7
    return v4

    .line 381
    :cond_10
    invoke-virtual {p0, v5}, Lcom/zzhoujay/markdown/parser/j;->G(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 382
    .line 383
    .line 384
    move-result p2

    .line 385
    if-eqz p2, :cond_11

    .line 386
    .line 387
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 388
    .line 389
    .line 390
    move-result-object p2

    .line 391
    goto :goto_8

    .line 392
    :cond_11
    invoke-virtual {v5}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    :goto_8
    instance-of v0, p2, Landroid/text/SpannableStringBuilder;

    .line 397
    .line 398
    if-eqz v0, :cond_12

    .line 399
    .line 400
    check-cast p2, Landroid/text/SpannableStringBuilder;

    .line 401
    .line 402
    goto :goto_9

    .line 403
    :cond_12
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 404
    .line 405
    invoke-direct {v0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 406
    .line 407
    .line 408
    move-object p2, v0

    .line 409
    :goto_9
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 413
    .line 414
    .line 415
    if-nez v3, :cond_13

    .line 416
    .line 417
    iget-object p2, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 418
    .line 419
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    invoke-interface {p2, v0, v1}, Lcom/zzhoujay/markdown/parser/d;->k(Ljava/lang/CharSequence;I)Landroid/text/SpannableStringBuilder;

    .line 428
    .line 429
    .line 430
    move-result-object p2

    .line 431
    invoke-virtual {p1, p2}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 432
    .line 433
    .line 434
    :cond_13
    return v4

    .line 435
    :cond_14
    return v3
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method


# virtual methods
.method public A(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0xd

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {p0, v0, v3, v4}, Lcom/zzhoujay/markdown/parser/j;->I(Landroid/text/SpannableStringBuilder;II)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x3

    .line 40
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0, v4, v3}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 70
    .line 71
    invoke-interface {v4, v3}, Lcom/zzhoujay/markdown/parser/d;->l(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v1, v3}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->A(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_1
    const/4 p1, 0x0

    .line 83
    return p1
    .line 84
    .line 85
.end method

.method public B(ILcom/zzhoujay/markdown/parser/a;)Z
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->e(ILjava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public C(ILjava/lang/String;I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    return v0

    .line 12
    :cond_1
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2, p3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p0, p1, p2, p3}, Lcom/zzhoujay/markdown/parser/j;->C(ILjava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    return p1

    .line 29
    :cond_2
    return v0
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
.end method

.method public D(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x5

    .line 24
    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v3, p0, Lcom/zzhoujay/markdown/parser/j;->d:Ljava/util/HashMap;

    .line 29
    .line 30
    new-instance v4, Landroid/util/Pair;

    .line 31
    .line 32
    invoke-direct {v4, v2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return v0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return p1
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
.end method

.method public E(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x5

    .line 24
    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v3, p0, Lcom/zzhoujay/markdown/parser/j;->c:Ljava/util/HashMap;

    .line 29
    .line 30
    new-instance v4, Landroid/util/Pair;

    .line 31
    .line 32
    invoke-direct {v4, v2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return v0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return p1
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
.end method

.method public F(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x15

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v4, 0x3

    .line 30
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-object v5, p0, Lcom/zzhoujay/markdown/parser/j;->d:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Landroid/util/Pair;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-virtual {v0, v5, v6}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v5, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 61
    .line 62
    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Ljava/lang/String;

    .line 69
    .line 70
    invoke-interface {v5, v2, v6, v4}, Lcom/zzhoujay/markdown/parser/d;->f(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->F(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    return v3
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public G(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->d(Lcom/zzhoujay/markdown/parser/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->f(Lcom/zzhoujay/markdown/parser/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->i(Lcom/zzhoujay/markdown/parser/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->m(Lcom/zzhoujay/markdown/parser/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->p(Lcom/zzhoujay/markdown/parser/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->s(Lcom/zzhoujay/markdown/parser/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public H(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zzhoujay/markdown/parser/j;->b:Lcom/zzhoujay/markdown/parser/c$a;

    .line 10
    .line 11
    invoke-interface {p1}, Lcom/zzhoujay/markdown/parser/c$a;->getQueue()Lcom/zzhoujay/markdown/parser/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->b()Lcom/zzhoujay/markdown/parser/b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0, v0, v3}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v2}, Lcom/zzhoujay/markdown/parser/j;->M(Lcom/zzhoujay/markdown/parser/b;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->L(Lcom/zzhoujay/markdown/parser/b;)V

    .line 43
    .line 44
    .line 45
    move v0, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v1

    .line 52
    :goto_1
    if-eqz v0, :cond_3

    .line 53
    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->n()V

    .line 63
    .line 64
    .line 65
    :goto_2
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/16 v5, 0xa

    .line 74
    .line 75
    if-eq v1, v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->h()Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/b;->n()V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-direct {p0, v2}, Lcom/zzhoujay/markdown/parser/j;->L(Lcom/zzhoujay/markdown/parser/b;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v5}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lcom/zzhoujay/markdown/parser/b;->d()Lcom/zzhoujay/markdown/parser/a;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v1, v0}, Lcom/zzhoujay/markdown/parser/d;->c(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    return v4

    .line 126
    :cond_3
    return v1
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
.end method

.method public a(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->b:Lcom/zzhoujay/markdown/parser/c$a;

    .line 23
    .line 24
    invoke-interface {v4}, Lcom/zzhoujay/markdown/parser/c$a;->getQueue()Lcom/zzhoujay/markdown/parser/b;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/b;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    :goto_0
    if-eqz v5, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v1, v5, v2}, Lcom/zzhoujay/markdown/parser/j;->w(ILcom/zzhoujay/markdown/parser/a;I)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    const/16 v8, 0xa

    .line 49
    .line 50
    if-nez v7, :cond_0

    .line 51
    .line 52
    const/16 v7, 0x19

    .line 53
    .line 54
    invoke-virtual {p0, v7, v5}, Lcom/zzhoujay/markdown/parser/j;->B(ILcom/zzhoujay/markdown/parser/a;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-virtual {v0, v3, v5}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/b;->m()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/b;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    const/16 v0, 0xb

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->c(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    return v1

    .line 122
    :cond_3
    return v3
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
.end method

.method public b(ILjava/lang/CharSequence;I)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    return-object p1
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
.end method

.method public c(ILcom/zzhoujay/markdown/parser/a;I)I
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/zzhoujay/markdown/parser/j;->C(ILjava/lang/String;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public d(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x9

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->u(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return v1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
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
.end method

.method public e(ILjava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    :cond_1
    return v0
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
.end method

.method public f(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x6

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->v(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return v1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
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
.end method

.method public g(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->r(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->A(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v3

    .line 19
    :goto_1
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->o(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move v0, v2

    .line 29
    goto :goto_3

    .line 30
    :cond_3
    :goto_2
    move v0, v3

    .line 31
    :goto_3
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->y(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_5

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_4
    move v0, v2

    .line 41
    goto :goto_5

    .line 42
    :cond_5
    :goto_4
    move v0, v3

    .line 43
    :goto_5
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->j(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_7

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    goto :goto_6

    .line 52
    :cond_6
    move v0, v2

    .line 53
    goto :goto_7

    .line 54
    :cond_7
    :goto_6
    move v0, v3

    .line 55
    :goto_7
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->l(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_9

    .line 60
    .line 61
    if-eqz v0, :cond_8

    .line 62
    .line 63
    goto :goto_8

    .line 64
    :cond_8
    move v0, v2

    .line 65
    goto :goto_9

    .line 66
    :cond_9
    :goto_8
    move v0, v3

    .line 67
    :goto_9
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->z(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_b

    .line 72
    .line 73
    if-eqz v0, :cond_a

    .line 74
    .line 75
    goto :goto_a

    .line 76
    :cond_a
    move v0, v2

    .line 77
    goto :goto_b

    .line 78
    :cond_b
    :goto_a
    move v0, v3

    .line 79
    :goto_b
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->F(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_d

    .line 84
    .line 85
    if-eqz v0, :cond_c

    .line 86
    .line 87
    goto :goto_c

    .line 88
    :cond_c
    move v0, v2

    .line 89
    goto :goto_d

    .line 90
    :cond_d
    :goto_c
    move v0, v3

    .line 91
    :goto_d
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->q(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_f

    .line 96
    .line 97
    if-eqz v0, :cond_e

    .line 98
    .line 99
    goto :goto_e

    .line 100
    :cond_e
    move v0, v2

    .line 101
    goto :goto_f

    .line 102
    :cond_f
    :goto_e
    move v0, v3

    .line 103
    :goto_f
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->x(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_11

    .line 108
    .line 109
    if-eqz v0, :cond_10

    .line 110
    .line 111
    goto :goto_10

    .line 112
    :cond_10
    move v0, v2

    .line 113
    goto :goto_11

    .line 114
    :cond_11
    :goto_10
    move v0, v3

    .line 115
    :goto_11
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->v(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_12

    .line 120
    .line 121
    if-eqz v0, :cond_13

    .line 122
    .line 123
    :cond_12
    move v2, v3

    .line 124
    :cond_13
    return v2
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
.end method

.method public h(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/zzhoujay/markdown/parser/j;->K(Lcom/zzhoujay/markdown/parser/a;I)Z

    move-result p1

    return p1
.end method

.method public i(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x5

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x7

    .line 17
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->s(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    return p1
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
.end method

.method public j(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {p0, v0, v3, v4}, Lcom/zzhoujay/markdown/parser/j;->I(Landroid/text/SpannableStringBuilder;II)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x3

    .line 40
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0, v4, v3}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 70
    .line 71
    invoke-interface {v4, v3}, Lcom/zzhoujay/markdown/parser/d;->q(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v1, v3}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->j(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_1
    const/4 p1, 0x0

    .line 83
    return p1
    .line 84
    .line 85
.end method

.method public k(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->b:Lcom/zzhoujay/markdown/parser/c$a;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zzhoujay/markdown/parser/c$a;->getQueue()Lcom/zzhoujay/markdown/parser/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {p0, v2, v1}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_7

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {p1, v3}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->k(Ljava/lang/String;)Lcom/zzhoujay/markdown/parser/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->e()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->f()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/b;->k()Lcom/zzhoujay/markdown/parser/a;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-ne v5, v3, :cond_1

    .line 62
    .line 63
    new-instance v5, Landroid/text/SpannableStringBuilder;

    .line 64
    .line 65
    const-string v6, " "

    .line 66
    .line 67
    invoke-direct {v5, v6}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget-object v6, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 71
    .line 72
    invoke-interface {v6, v5}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 73
    .line 74
    .line 75
    :goto_0
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->h()Lcom/zzhoujay/markdown/parser/a;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_0

    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->h()Lcom/zzhoujay/markdown/parser/a;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Lcom/zzhoujay/markdown/parser/a;->t()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ne v6, v3, :cond_0

    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->h()Lcom/zzhoujay/markdown/parser/a;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    iget-object v6, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 96
    .line 97
    invoke-interface {v6, v5}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v4}, Lcom/zzhoujay/markdown/parser/a;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/b;->k()Lcom/zzhoujay/markdown/parser/a;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0, v5}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    invoke-virtual {p0, v1}, Lcom/zzhoujay/markdown/parser/j;->k(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_3

    .line 116
    .line 117
    invoke-virtual {p0, v1}, Lcom/zzhoujay/markdown/parser/j;->n(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_3

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Lcom/zzhoujay/markdown/parser/j;->h(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_3

    .line 128
    .line 129
    invoke-virtual {p0, v1}, Lcom/zzhoujay/markdown/parser/j;->G(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->q()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-ne v0, v3, :cond_6

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->v()Lcom/zzhoujay/markdown/parser/a;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-nez v0, :cond_5

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->p()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const/4 v4, 0x2

    .line 168
    if-ne v0, v4, :cond_4

    .line 169
    .line 170
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {p0, v2, p1, v3}, Lcom/zzhoujay/markdown/parser/j;->c(ILcom/zzhoujay/markdown/parser/a;I)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    sub-int/2addr v2, v3

    .line 181
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-interface {v0, v4, v2, v1}, Lcom/zzhoujay/markdown/parser/d;->p(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_4
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 194
    .line 195
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {p0, v2, p1, v3}, Lcom/zzhoujay/markdown/parser/j;->c(ILcom/zzhoujay/markdown/parser/a;I)I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    sub-int/2addr v2, v3

    .line 204
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-interface {v0, v4, v2, v5, v1}, Lcom/zzhoujay/markdown/parser/d;->j(Ljava/lang/CharSequence;III)Landroid/text/SpannableStringBuilder;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_5
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->p()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->D(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->n()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->B(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->o()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->C(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v3}, Lcom/zzhoujay/markdown/parser/a;->E(I)V

    .line 249
    .line 250
    .line 251
    :goto_2
    return v3

    .line 252
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 253
    .line 254
    invoke-virtual {v1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-interface {v0, v1}, Lcom/zzhoujay/markdown/parser/d;->h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    return v3

    .line 266
    :cond_7
    const/4 p1, 0x0

    .line 267
    return p1
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
.end method

.method public l(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0, v3, v2}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Landroid/text/SpannableStringBuilder;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 55
    .line 56
    invoke-interface {v4, v2}, Lcom/zzhoujay/markdown/parser/d;->m(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->l(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 64
    .line 65
    .line 66
    return v3

    .line 67
    :cond_0
    const/4 p1, 0x0

    .line 68
    return p1
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
.end method

.method public m(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->t(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return v1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
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
.end method

.method public n(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/zzhoujay/markdown/parser/j;->N(Lcom/zzhoujay/markdown/parser/a;I)Z

    move-result p1

    return p1
.end method

.method public o(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0xb

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {p0, v0, v3, v4}, Lcom/zzhoujay/markdown/parser/j;->I(Landroid/text/SpannableStringBuilder;II)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x3

    .line 40
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0, v4, v3}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 70
    .line 71
    invoke-interface {v4, v3}, Lcom/zzhoujay/markdown/parser/d;->a(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v1, v3}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->o(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_1
    const/4 p1, 0x0

    .line 83
    return p1
    .line 84
    .line 85
.end method

.method public p(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->b(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    return p1
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
.end method

.method public q(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x11

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x3

    .line 29
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x6

    .line 34
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->start(I)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->end(I)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v0, v6, v7}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->start(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v6, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 55
    .line 56
    invoke-interface {v6, v2, v3, v4}, Lcom/zzhoujay/markdown/parser/d;->i(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->q(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 64
    .line 65
    .line 66
    return v5

    .line 67
    :cond_0
    const/4 p1, 0x0

    .line 68
    return p1
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
.end method

.method public r(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x1e

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 45
    .line 46
    invoke-interface {v4, v2}, Lcom/zzhoujay/markdown/parser/d;->n(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->r(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 54
    .line 55
    .line 56
    return v3

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    return p1
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
.end method

.method public s(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    invoke-virtual {p1, v1}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->g(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v0, v2}, Lcom/zzhoujay/markdown/parser/d;->g(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return p1
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
.end method

.method public t(Lcom/zzhoujay/markdown/parser/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/j;->b:Lcom/zzhoujay/markdown/parser/c$a;

    return-void
.end method

.method public u(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x1b

    .line 10
    .line 11
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0xc

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->H(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/zzhoujay/markdown/parser/d;->d()Landroid/text/SpannableStringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Lcom/zzhoujay/markdown/parser/a;->G(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    return p1
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
.end method

.method public v(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v0, 0xf

    .line 12
    .line 13
    invoke-direct {p0, v0, p1}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p1, v2, v3}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget-object v3, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 44
    .line 45
    const-string v4, ""

    .line 46
    .line 47
    invoke-interface {v3, v1, v1, v4}, Lcom/zzhoujay/markdown/parser/d;->i(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v2, v1}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return v1
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
.end method

.method public w(ILcom/zzhoujay/markdown/parser/a;I)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p2}, Lcom/zzhoujay/markdown/parser/a;->r()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/zzhoujay/markdown/parser/j;->b(ILjava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public x(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x12

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v4, 0x3

    .line 30
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-object v5, p0, Lcom/zzhoujay/markdown/parser/j;->c:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Landroid/util/Pair;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-virtual {v0, v5, v6}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v5, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 61
    .line 62
    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Ljava/lang/String;

    .line 69
    .line 70
    invoke-interface {v5, v2, v6, v4}, Lcom/zzhoujay/markdown/parser/d;->i(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->x(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    return v3
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public y(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0xc

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {p0, v0, v3, v4}, Lcom/zzhoujay/markdown/parser/j;->I(Landroid/text/SpannableStringBuilder;II)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x3

    .line 40
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0, v4, v3}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->end(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->start(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v4, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 70
    .line 71
    invoke-interface {v4, v3}, Lcom/zzhoujay/markdown/parser/d;->e(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v1, v3}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->y(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_1
    const/4 p1, 0x0

    .line 83
    return p1
    .line 84
    .line 85
.end method

.method public z(Lcom/zzhoujay/markdown/parser/a;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->m()Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zzhoujay/markdown/parser/a;->s()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lcom/zzhoujay/markdown/parser/j;->J(ILjava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x3

    .line 29
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x6

    .line 34
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->start(I)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->end(I)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v0, v6, v7}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->start(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v6, p0, Lcom/zzhoujay/markdown/parser/j;->a:Lcom/zzhoujay/markdown/parser/d;

    .line 55
    .line 56
    invoke-interface {v6, v2, v3, v4}, Lcom/zzhoujay/markdown/parser/d;->f(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/j;->z(Lcom/zzhoujay/markdown/parser/a;)Z

    .line 64
    .line 65
    .line 66
    return v5

    .line 67
    :cond_0
    const/4 p1, 0x0

    .line 68
    return p1
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
.end method
