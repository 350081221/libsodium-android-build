.class public final Landroidx/compose/material3/CalendarModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "DaysInWeek",
        "",
        "MillisecondsIn24Hours",
        "",
        "datePatternAsInputFormat",
        "Landroidx/compose/material3/DateInputFormat;",
        "localeFormat",
        "",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final DaysInWeek:I = 0x7

.field public static final MillisecondsIn24Hours:J = 0x5265c00L


# direct methods
.method public static final datePatternAsInputFormat(Ljava/lang/String;)Landroidx/compose/material3/DateInputFormat;
    .locals 8
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Lkotlin/text/r;

    .line 2
    .line 3
    const-string v1, "[^dMy/\\-.]"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lkotlin/text/r;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Lkotlin/text/r;

    .line 15
    .line 16
    const-string v1, "d{1,2}"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "dd"

    .line 22
    .line 23
    invoke-virtual {v0, p0, v1}, Lkotlin/text/r;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v0, Lkotlin/text/r;

    .line 28
    .line 29
    const-string v1, "M{1,2}"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "MM"

    .line 35
    .line 36
    invoke-virtual {v0, p0, v1}, Lkotlin/text/r;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, Lkotlin/text/r;

    .line 41
    .line 42
    const-string/jumbo v1, "y{1,4}"

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string/jumbo v1, "yyyy"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0, v1}, Lkotlin/text/r;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "My"

    .line 56
    .line 57
    const-string v4, "M/y"

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v6, 0x4

    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->i2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v0, "."

    .line 67
    .line 68
    invoke-static {p0, v0}, Lkotlin/text/v;->g4(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v0, Lkotlin/text/r;

    .line 73
    .line 74
    const-string v1, "[/\\-.]"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-static {v0, p0, v3, v1, v2}, Lkotlin/text/r;->find$default(Lkotlin/text/r;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/p;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0}, Lkotlin/text/p;->d()Lkotlin/text/n;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0, v3}, Lkotlin/text/n;->get(I)Lkotlin/text/m;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lkotlin/text/m;->e()Lkotlin/ranges/l;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Lkotlin/ranges/j;->e()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    add-int/lit8 v1, v0, 0x1

    .line 109
    .line 110
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Landroidx/compose/material3/DateInputFormat;

    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-direct {v1, p0, v0}, Landroidx/compose/material3/DateInputFormat;-><init>(Ljava/lang/String;C)V

    .line 126
    .line 127
    .line 128
    return-object v1
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
.end method
