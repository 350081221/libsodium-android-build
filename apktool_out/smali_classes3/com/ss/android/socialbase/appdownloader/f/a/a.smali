.class Lcom/ss/android/socialbase/appdownloader/f/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/f/a/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/appdownloader/f/a/a$a;
    }
.end annotation


# instance fields
.field private b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

.field private c:Z

.field private d:Lcom/ss/android/socialbase/appdownloader/f/a/f;

.field private e:[I

.field private f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

.field private g:Z

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:[I

.field private m:I

.field private n:I

.field private o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->c:Z

    .line 6
    .line 7
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->g()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private final e(I)I
    .locals 3

    .line 2
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    mul-int/lit8 v0, p1, 0x5

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    return v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid attribute index ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Current event is not START_TAG."

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final g()V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 3
    .line 4
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->i:I

    .line 5
    .line 6
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->j:I

    .line 7
    .line 8
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->k:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    .line 12
    .line 13
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->m:I

    .line 14
    .line 15
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->n:I

    .line 16
    .line 17
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->o:I

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private final h()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->d:Lcom/ss/android/socialbase/appdownloader/f/a/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 7
    .line 8
    const v2, 0x80003

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/appdownloader/f/a/b;->a(Lcom/ss/android/socialbase/appdownloader/f/a/d;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/f;->a(Lcom/ss/android/socialbase/appdownloader/f/a/d;)Lcom/ss/android/socialbase/appdownloader/f/a/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->d:Lcom/ss/android/socialbase/appdownloader/f/a/f;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->e()V

    .line 30
    .line 31
    .line 32
    iput-boolean v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->c:Z

    .line 33
    .line 34
    :cond_0
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_f

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->g()V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-boolean v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->g:Z

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iput-boolean v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->g:Z

    .line 47
    .line 48
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->f()V

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v2, 0x3

    .line 54
    if-ne v0, v2, :cond_2

    .line 55
    .line 56
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->d()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ne v4, v1, :cond_2

    .line 63
    .line 64
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_2
    const v4, 0x100102

    .line 77
    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    move v5, v4

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object v5, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 84
    .line 85
    invoke-virtual {v5}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    :goto_1
    const v6, 0x80180

    .line 90
    .line 91
    .line 92
    const/4 v7, 0x2

    .line 93
    const-string v8, ")."

    .line 94
    .line 95
    if-ne v5, v6, :cond_5

    .line 96
    .line 97
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    if-lt v2, v3, :cond_4

    .line 106
    .line 107
    rem-int/lit8 v3, v2, 0x4

    .line 108
    .line 109
    if-nez v3, :cond_4

    .line 110
    .line 111
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 112
    .line 113
    div-int/lit8 v2, v2, 0x4

    .line 114
    .line 115
    sub-int/2addr v2, v7

    .line 116
    invoke-virtual {v3, v2}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b(I)[I

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iput-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e:[I

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 124
    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v3, "Invalid resource ids size ("

    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_5
    const v6, 0x100100

    .line 150
    .line 151
    .line 152
    if-lt v5, v6, :cond_e

    .line 153
    .line 154
    const v9, 0x100104

    .line 155
    .line 156
    .line 157
    if-gt v5, v9, :cond_e

    .line 158
    .line 159
    if-ne v5, v4, :cond_6

    .line 160
    .line 161
    const/4 v8, -0x1

    .line 162
    if-ne v0, v8, :cond_6

    .line 163
    .line 164
    iput v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 165
    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :cond_6
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 169
    .line 170
    invoke-virtual {v3}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 171
    .line 172
    .line 173
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 174
    .line 175
    invoke-virtual {v3}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    iget-object v8, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 180
    .line 181
    invoke-virtual {v8}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 182
    .line 183
    .line 184
    if-eq v5, v6, :cond_c

    .line 185
    .line 186
    const v8, 0x100101

    .line 187
    .line 188
    .line 189
    if-ne v5, v8, :cond_7

    .line 190
    .line 191
    goto/16 :goto_4

    .line 192
    .line 193
    :cond_7
    iput v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->i:I

    .line 194
    .line 195
    if-ne v5, v4, :cond_9

    .line 196
    .line 197
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->k:I

    .line 204
    .line 205
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->j:I

    .line 212
    .line 213
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 216
    .line 217
    .line 218
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 219
    .line 220
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    ushr-int/lit8 v3, v0, 0x10

    .line 225
    .line 226
    sub-int/2addr v3, v1

    .line 227
    iput v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->m:I

    .line 228
    .line 229
    const v3, 0xffff

    .line 230
    .line 231
    .line 232
    and-int/2addr v0, v3

    .line 233
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 234
    .line 235
    invoke-virtual {v4}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    ushr-int/lit8 v5, v4, 0x10

    .line 240
    .line 241
    sub-int/2addr v5, v1

    .line 242
    iput v5, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->o:I

    .line 243
    .line 244
    and-int/2addr v3, v4

    .line 245
    sub-int/2addr v3, v1

    .line 246
    iput v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->n:I

    .line 247
    .line 248
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 249
    .line 250
    mul-int/lit8 v0, v0, 0x5

    .line 251
    .line 252
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b(I)[I

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    .line 257
    .line 258
    :goto_2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    .line 259
    .line 260
    array-length v1, v0

    .line 261
    if-ge v2, v1, :cond_8

    .line 262
    .line 263
    aget v1, v0, v2

    .line 264
    .line 265
    ushr-int/lit8 v1, v1, 0x18

    .line 266
    .line 267
    aput v1, v0, v2

    .line 268
    .line 269
    add-int/lit8 v2, v2, 0x5

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_8
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->e()V

    .line 275
    .line 276
    .line 277
    iput v7, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_9
    const v3, 0x100103

    .line 281
    .line 282
    .line 283
    if-ne v5, v3, :cond_a

    .line 284
    .line 285
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 286
    .line 287
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->k:I

    .line 292
    .line 293
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 294
    .line 295
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->j:I

    .line 300
    .line 301
    iput v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 302
    .line 303
    iput-boolean v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->g:Z

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_a
    if-eq v5, v9, :cond_b

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :cond_b
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 311
    .line 312
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->j:I

    .line 317
    .line 318
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 319
    .line 320
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 321
    .line 322
    .line 323
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 324
    .line 325
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 326
    .line 327
    .line 328
    const/4 v0, 0x4

    .line 329
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    .line 330
    .line 331
    :goto_3
    return-void

    .line 332
    :cond_c
    :goto_4
    if-ne v5, v6, :cond_d

    .line 333
    .line 334
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 341
    .line 342
    invoke-virtual {v3}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->b()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 347
    .line 348
    invoke-virtual {v4, v2, v3}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a(II)V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_0

    .line 352
    .line 353
    :cond_d
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 354
    .line 355
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 356
    .line 357
    .line 358
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 359
    .line 360
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->c()V

    .line 361
    .line 362
    .line 363
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    .line 364
    .line 365
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c()Z

    .line 366
    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 371
    .line 372
    new-instance v1, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    const-string v2, "Invalid chunk type ("

    .line 378
    .line 379
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v0

    .line 396
    :cond_f
    return-void
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
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
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1

    .line 11
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e(I)I

    move-result p1

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->d:Lcom/ss/android/socialbase/appdownloader/f/a/f;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/f;->a(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public a()V
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->c:Z

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/d;->a()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    .line 7
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->d:Lcom/ss/android/socialbase/appdownloader/f/a/f;

    .line 8
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e:[I

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->f:Lcom/ss/android/socialbase/appdownloader/f/a/a$a;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a()V

    .line 10
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->g()V

    :cond_0
    return-void
.end method

.method public a(Ljava/io/InputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a()V

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/f/a/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/ss/android/socialbase/appdownloader/f/a/d;-><init>(Ljava/io/InputStream;Z)V

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    :cond_0
    return-void
.end method

.method public b()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/appdownloader/f/a/h;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b:Lcom/ss/android/socialbase/appdownloader/f/a/d;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h()V

    .line 3
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a()V

    .line 5
    throw v0

    .line 6
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/f/a/h;

    const-string v1, "Parser is not opened."

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/ss/android/socialbase/appdownloader/f/a/h;-><init>(Ljava/lang/String;Lcom/ss/android/socialbase/appdownloader/f/a/g;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b(I)I
    .locals 1

    .line 7
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e(I)I

    move-result p1

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    add-int/lit8 p1, p1, 0x3

    aget p1, v0, p1

    return p1
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->i:I

    return v0
.end method

.method public c(I)I
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e(I)I

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    add-int/lit8 p1, p1, 0x4

    aget p1, v0, p1

    return p1
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "XML line #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Ljava/lang/String;
    .locals 3

    .line 2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e(I)I

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    add-int/lit8 v1, p1, 0x3

    aget v1, v0, v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    add-int/lit8 p1, p1, 0x2

    .line 4
    aget p1, v0, p1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->d:Lcom/ss/android/socialbase/appdownloader/f/a/f;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/f;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 p1, p1, 0x4

    .line 6
    aget p1, v0, p1

    const-string p1, ""

    return-object p1
.end method

.method public e()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->h:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a;->l:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x5

    :goto_0
    return v0
.end method

.method public f()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
