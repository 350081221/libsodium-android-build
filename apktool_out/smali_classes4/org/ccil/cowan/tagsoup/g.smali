.class public Lorg/ccil/cowan/tagsoup/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/ccil/cowan/tagsoup/n;
.implements Lorg/xml/sax/Locator;


# static fields
.field private static final A:I = 0x10

.field private static A0:[I = null

.field private static final B:I = 0x11

.field private static final B0:[Ljava/lang/String;

.field private static final C:I = 0x12

.field private static final C0:[Ljava/lang/String;

.field private static final D:I = 0x13

.field static D0:[[S = null

.field private static final E:I = 0x14

.field static E0:I = 0x0

.field private static final F:I = 0x15

.field private static final G:I = 0x16

.field private static final H:I = 0x17

.field private static final I:I = 0x18

.field private static final J:I = 0x19

.field private static final K:I = 0x1a

.field private static final L:I = 0x1b

.field private static final M:I = 0x1c

.field private static final N:I = 0x1d

.field private static final O:I = 0x1e

.field private static final P:I = 0x1f

.field private static final Q:I = 0x20

.field private static final R:I = 0x21

.field private static final S:I = 0x22

.field private static final T:I = 0x23

.field private static final U:I = 0x1

.field private static final V:I = 0x2

.field private static final W:I = 0x3

.field private static final X:I = 0x4

.field private static final Y:I = 0x5

.field private static final Z:I = 0x6

.field private static final a0:I = 0x7

.field private static final b0:I = 0x8

.field private static final c0:I = 0x9

.field private static final d0:I = 0xa

.field private static final e0:I = 0xb

.field private static final f0:I = 0xc

.field private static final g0:I = 0xd

.field private static final h0:I = 0xe

.field private static final i0:I = 0xf

.field private static final j0:I = 0x10

.field private static final k0:I = 0x11

.field private static final l:I = 0x1

.field private static final l0:I = 0x12

.field private static final m:I = 0x2

.field private static final m0:I = 0x13

.field private static final n:I = 0x3

.field private static final n0:I = 0x14

.field private static final o:I = 0x4

.field private static final o0:I = 0x15

.field private static final p:I = 0x5

.field private static final p0:I = 0x16

.field private static final q:I = 0x6

.field private static final q0:I = 0x17

.field private static final r:I = 0x7

.field private static final r0:I = 0x18

.field private static final s:I = 0x8

.field private static final s0:I = 0x19

.field private static final t:I = 0x9

.field private static final t0:I = 0x1a

.field private static final u:I = 0xa

.field private static final u0:I = 0x1b

.field private static final v:I = 0xb

.field private static final v0:I = 0x1c

.field private static final w:I = 0xc

.field private static final w0:I = 0x1d

.field private static final x:I = 0xd

.field private static final x0:I = 0x1e

.field private static final y:I = 0xe

.field private static final y0:I = 0x1f

.field private static final z:I = 0xf

.field private static final z0:I = 0x20


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field g:I

.field h:I

.field i:[C

.field j:I

.field k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 37

    .line 1
    const/16 v0, 0x254

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/ccil/cowan/tagsoup/g;->A0:[I

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    const-string v2, "A_ADUP"

    .line 13
    .line 14
    const-string v3, "A_ADUP_SAVE"

    .line 15
    .line 16
    const-string v4, "A_ADUP_STAGC"

    .line 17
    .line 18
    const-string v5, "A_ANAME"

    .line 19
    .line 20
    const-string v6, "A_ANAME_ADUP"

    .line 21
    .line 22
    const-string v7, "A_ANAME_ADUP_STAGC"

    .line 23
    .line 24
    const-string v8, "A_AVAL"

    .line 25
    .line 26
    const-string v9, "A_AVAL_STAGC"

    .line 27
    .line 28
    const-string v10, "A_CDATA"

    .line 29
    .line 30
    const-string v11, "A_CMNT"

    .line 31
    .line 32
    const-string v12, "A_DECL"

    .line 33
    .line 34
    const-string v13, "A_EMPTYTAG"

    .line 35
    .line 36
    const-string v14, "A_ENTITY"

    .line 37
    .line 38
    const-string v15, "A_ENTITY_START"

    .line 39
    .line 40
    const-string v16, "A_ETAG"

    .line 41
    .line 42
    const-string v17, "A_GI"

    .line 43
    .line 44
    const-string v18, "A_GI_STAGC"

    .line 45
    .line 46
    const-string v19, "A_LT"

    .line 47
    .line 48
    const-string v20, "A_LT_PCDATA"

    .line 49
    .line 50
    const-string v21, "A_MINUS"

    .line 51
    .line 52
    const-string v22, "A_MINUS2"

    .line 53
    .line 54
    const-string v23, "A_MINUS3"

    .line 55
    .line 56
    const-string v24, "A_PCDATA"

    .line 57
    .line 58
    const-string v25, "A_PI"

    .line 59
    .line 60
    const-string v26, "A_PITARGET"

    .line 61
    .line 62
    const-string v27, "A_PITARGET_PI"

    .line 63
    .line 64
    const-string v28, "A_SAVE"

    .line 65
    .line 66
    const-string v29, "A_SKIP"

    .line 67
    .line 68
    const-string v30, "A_SP"

    .line 69
    .line 70
    const-string v31, "A_STAGC"

    .line 71
    .line 72
    const-string v32, "A_UNGET"

    .line 73
    .line 74
    const-string v33, "A_UNSAVE_PCDATA"

    .line 75
    .line 76
    filled-new-array/range {v1 .. v33}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, Lorg/ccil/cowan/tagsoup/g;->B0:[Ljava/lang/String;

    .line 81
    .line 82
    const-string v1, ""

    .line 83
    .line 84
    const-string v2, "S_ANAME"

    .line 85
    .line 86
    const-string v3, "S_APOS"

    .line 87
    .line 88
    const-string v4, "S_AVAL"

    .line 89
    .line 90
    const-string v5, "S_BB"

    .line 91
    .line 92
    const-string v6, "S_BBC"

    .line 93
    .line 94
    const-string v7, "S_BBCD"

    .line 95
    .line 96
    const-string v8, "S_BBCDA"

    .line 97
    .line 98
    const-string v9, "S_BBCDAT"

    .line 99
    .line 100
    const-string v10, "S_BBCDATA"

    .line 101
    .line 102
    const-string v11, "S_CDATA"

    .line 103
    .line 104
    const-string v12, "S_CDATA2"

    .line 105
    .line 106
    const-string v13, "S_CDSECT"

    .line 107
    .line 108
    const-string v14, "S_CDSECT1"

    .line 109
    .line 110
    const-string v15, "S_CDSECT2"

    .line 111
    .line 112
    const-string v16, "S_COM"

    .line 113
    .line 114
    const-string v17, "S_COM2"

    .line 115
    .line 116
    const-string v18, "S_COM3"

    .line 117
    .line 118
    const-string v19, "S_COM4"

    .line 119
    .line 120
    const-string v20, "S_DECL"

    .line 121
    .line 122
    const-string v21, "S_DECL2"

    .line 123
    .line 124
    const-string v22, "S_DONE"

    .line 125
    .line 126
    const-string v23, "S_EMPTYTAG"

    .line 127
    .line 128
    const-string v24, "S_ENT"

    .line 129
    .line 130
    const-string v25, "S_EQ"

    .line 131
    .line 132
    const-string v26, "S_ETAG"

    .line 133
    .line 134
    const-string v27, "S_GI"

    .line 135
    .line 136
    const-string v28, "S_NCR"

    .line 137
    .line 138
    const-string v29, "S_PCDATA"

    .line 139
    .line 140
    const-string v30, "S_PI"

    .line 141
    .line 142
    const-string v31, "S_PITARGET"

    .line 143
    .line 144
    const-string v32, "S_QUOT"

    .line 145
    .line 146
    const-string v33, "S_STAGC"

    .line 147
    .line 148
    const-string v34, "S_TAG"

    .line 149
    .line 150
    const-string v35, "S_TAGWS"

    .line 151
    .line 152
    const-string v36, "S_XNCR"

    .line 153
    .line 154
    filled-new-array/range {v1 .. v36}, [Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sput-object v0, Lorg/ccil/cowan/tagsoup/g;->C0:[Ljava/lang/String;

    .line 159
    .line 160
    const/4 v0, -0x1

    .line 161
    const/4 v1, 0x0

    .line 162
    move v3, v0

    .line 163
    move v4, v3

    .line 164
    move v2, v1

    .line 165
    :goto_0
    sget-object v5, Lorg/ccil/cowan/tagsoup/g;->A0:[I

    .line 166
    .line 167
    array-length v6, v5

    .line 168
    if-ge v2, v6, :cond_2

    .line 169
    .line 170
    aget v6, v5, v2

    .line 171
    .line 172
    if-le v6, v4, :cond_0

    .line 173
    .line 174
    move v4, v6

    .line 175
    :cond_0
    add-int/lit8 v6, v2, 0x1

    .line 176
    .line 177
    aget v5, v5, v6

    .line 178
    .line 179
    if-le v5, v3, :cond_1

    .line 180
    .line 181
    move v3, v5

    .line 182
    :cond_1
    add-int/lit8 v2, v2, 0x4

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_2
    add-int/lit8 v2, v3, 0x1

    .line 186
    .line 187
    sput v2, Lorg/ccil/cowan/tagsoup/g;->E0:I

    .line 188
    .line 189
    add-int/lit8 v2, v4, 0x1

    .line 190
    .line 191
    add-int/lit8 v5, v3, 0x3

    .line 192
    .line 193
    const/4 v6, 0x2

    .line 194
    new-array v6, v6, [I

    .line 195
    .line 196
    const/4 v7, 0x1

    .line 197
    aput v5, v6, v7

    .line 198
    .line 199
    aput v2, v6, v1

    .line 200
    .line 201
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 202
    .line 203
    invoke-static {v2, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, [[S

    .line 208
    .line 209
    sput-object v2, Lorg/ccil/cowan/tagsoup/g;->D0:[[S

    .line 210
    .line 211
    move v2, v1

    .line 212
    :goto_1
    if-gt v2, v4, :cond_8

    .line 213
    .line 214
    const/4 v5, -0x2

    .line 215
    :goto_2
    if-gt v5, v3, :cond_7

    .line 216
    .line 217
    move v8, v0

    .line 218
    move v6, v1

    .line 219
    move v7, v6

    .line 220
    :goto_3
    sget-object v9, Lorg/ccil/cowan/tagsoup/g;->A0:[I

    .line 221
    .line 222
    array-length v10, v9

    .line 223
    if-ge v6, v10, :cond_6

    .line 224
    .line 225
    aget v10, v9, v6

    .line 226
    .line 227
    if-eq v2, v10, :cond_3

    .line 228
    .line 229
    if-eqz v7, :cond_5

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_3
    add-int/lit8 v10, v6, 0x1

    .line 233
    .line 234
    aget v10, v9, v10

    .line 235
    .line 236
    if-nez v10, :cond_4

    .line 237
    .line 238
    add-int/lit8 v7, v6, 0x2

    .line 239
    .line 240
    aget v7, v9, v7

    .line 241
    .line 242
    move v8, v6

    .line 243
    goto :goto_4

    .line 244
    :cond_4
    if-ne v10, v5, :cond_5

    .line 245
    .line 246
    add-int/lit8 v7, v6, 0x2

    .line 247
    .line 248
    aget v7, v9, v7

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_5
    :goto_4
    add-int/lit8 v6, v6, 0x4

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_6
    :goto_5
    move v6, v8

    .line 255
    :goto_6
    sget-object v7, Lorg/ccil/cowan/tagsoup/g;->D0:[[S

    .line 256
    .line 257
    aget-object v7, v7, v2

    .line 258
    .line 259
    add-int/lit8 v8, v5, 0x2

    .line 260
    .line 261
    int-to-short v6, v6

    .line 262
    aput-short v6, v7, v8

    .line 263
    .line 264
    add-int/lit8 v5, v5, 0x1

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_8
    return-void

    .line 271
    :array_0
    .array-data 4
        0x1
        0x2f
        0x5
        0x16
        0x1
        0x3d
        0x4
        0x3
        0x1
        0x3e
        0x6
        0x1c
        0x1
        0x0
        0x1b
        0x1
        0x1
        -0x1
        0x6
        0x15
        0x1
        0x20
        0x4
        0x18
        0x1
        0xa
        0x4
        0x18
        0x1
        0x9
        0x4
        0x18
        0x2
        0x27
        0x7
        0x22
        0x2
        0x0
        0x1b
        0x2
        0x2
        -0x1
        0x8
        0x15
        0x2
        0x20
        0x1d
        0x2
        0x2
        0xa
        0x1d
        0x2
        0x2
        0x9
        0x1d
        0x2
        0x3
        0x22
        0x1c
        0x1f
        0x3
        0x27
        0x1c
        0x2
        0x3
        0x3e
        0x8
        0x1c
        0x3
        0x0
        0x1b
        0x20
        0x3
        -0x1
        0x8
        0x15
        0x3
        0x20
        0x1c
        0x3
        0x3
        0xa
        0x1c
        0x3
        0x3
        0x9
        0x1c
        0x3
        0x4
        0x43
        0x1c
        0x5
        0x4
        0x0
        0x1c
        0x13
        0x4
        -0x1
        0x1c
        0x15
        0x5
        0x44
        0x1c
        0x6
        0x5
        0x0
        0x1c
        0x13
        0x5
        -0x1
        0x1c
        0x15
        0x6
        0x41
        0x1c
        0x7
        0x6
        0x0
        0x1c
        0x13
        0x6
        -0x1
        0x1c
        0x15
        0x7
        0x54
        0x1c
        0x8
        0x7
        0x0
        0x1c
        0x13
        0x7
        -0x1
        0x1c
        0x15
        0x8
        0x41
        0x1c
        0x9
        0x8
        0x0
        0x1c
        0x13
        0x8
        -0x1
        0x1c
        0x15
        0x9
        0x5b
        0x1c
        0xc
        0x9
        0x0
        0x1c
        0x13
        0x9
        -0x1
        0x1c
        0x15
        0xa
        0x3c
        0x1b
        0xb
        0xa
        0x0
        0x1b
        0xa
        0xa
        -0x1
        0x17
        0x15
        0xb
        0x2f
        0x20
        0x19
        0xb
        0x0
        0x1b
        0xa
        0xb
        -0x1
        0x20
        0x15
        0xc
        0x5d
        0x1b
        0xd
        0xc
        0x0
        0x1b
        0xc
        0xc
        -0x1
        0x1c
        0x15
        0xd
        0x5d
        0x1b
        0xe
        0xd
        0x0
        0x1b
        0xc
        0xd
        -0x1
        0x1c
        0x15
        0xe
        0x3e
        0x9
        0x1c
        0xe
        0x5d
        0x1b
        0xe
        0xe
        0x0
        0x1b
        0xc
        0xe
        -0x1
        0x1c
        0x15
        0xf
        0x2d
        0x1c
        0x10
        0xf
        0x0
        0x1b
        0x10
        0xf
        -0x1
        0xa
        0x15
        0x10
        0x2d
        0x1c
        0x11
        0x10
        0x0
        0x1b
        0x10
        0x10
        -0x1
        0xa
        0x15
        0x11
        0x2d
        0x1c
        0x12
        0x11
        0x0
        0x14
        0x10
        0x11
        -0x1
        0xa
        0x15
        0x12
        0x2d
        0x16
        0x12
        0x12
        0x3e
        0xa
        0x1c
        0x12
        0x0
        0x15
        0x10
        0x12
        -0x1
        0xa
        0x15
        0x13
        0x2d
        0x1c
        0xf
        0x13
        0x3e
        0x1c
        0x1c
        0x13
        0x5b
        0x1c
        0x4
        0x13
        0x0
        0x1b
        0x14
        0x13
        -0x1
        0x1c
        0x15
        0x14
        0x3e
        0xb
        0x1c
        0x14
        0x0
        0x1b
        0x14
        0x14
        -0x1
        0x1c
        0x15
        0x16
        0x3e
        0xc
        0x1c
        0x16
        0x0
        0x1b
        0x1
        0x16
        0x20
        0x1c
        0x22
        0x16
        0xa
        0x1c
        0x22
        0x16
        0x9
        0x1c
        0x22
        0x17
        0x0
        0xd
        0x17
        0x17
        -0x1
        0xd
        0x15
        0x18
        0x3d
        0x1c
        0x3
        0x18
        0x3e
        0x3
        0x1c
        0x18
        0x0
        0x2
        0x1
        0x18
        -0x1
        0x3
        0x15
        0x18
        0x20
        0x1c
        0x18
        0x18
        0xa
        0x1c
        0x18
        0x18
        0x9
        0x1c
        0x18
        0x19
        0x3e
        0xf
        0x1c
        0x19
        0x0
        0x1b
        0x19
        0x19
        -0x1
        0xf
        0x15
        0x19
        0x20
        0x1c
        0x19
        0x19
        0xa
        0x1c
        0x19
        0x19
        0x9
        0x1c
        0x19
        0x1a
        0x2f
        0x1c
        0x16
        0x1a
        0x3e
        0x11
        0x1c
        0x1a
        0x0
        0x1b
        0x1a
        0x1a
        -0x1
        0x1c
        0x15
        0x1a
        0x20
        0x10
        0x22
        0x1a
        0xa
        0x10
        0x22
        0x1a
        0x9
        0x10
        0x22
        0x1b
        0x0
        0xd
        0x1b
        0x1b
        -0x1
        0xd
        0x15
        0x1c
        0x26
        0xe
        0x17
        0x1c
        0x3c
        0x17
        0x21
        0x1c
        0x0
        0x1b
        0x1c
        0x1c
        -0x1
        0x17
        0x15
        0x1d
        0x3e
        0x18
        0x1c
        0x1d
        0x0
        0x1b
        0x1d
        0x1d
        -0x1
        0x18
        0x15
        0x1e
        0x3e
        0x1a
        0x1c
        0x1e
        0x0
        0x1b
        0x1e
        0x1e
        -0x1
        0x1a
        0x15
        0x1e
        0x20
        0x19
        0x1d
        0x1e
        0xa
        0x19
        0x1d
        0x1e
        0x9
        0x19
        0x1d
        0x1f
        0x22
        0x7
        0x22
        0x1f
        0x0
        0x1b
        0x1f
        0x1f
        -0x1
        0x8
        0x15
        0x1f
        0x20
        0x1d
        0x1f
        0x1f
        0xa
        0x1d
        0x1f
        0x1f
        0x9
        0x1d
        0x1f
        0x20
        0x3e
        0x8
        0x1c
        0x20
        0x0
        0x1b
        0x20
        0x20
        -0x1
        0x8
        0x15
        0x20
        0x20
        0x7
        0x22
        0x20
        0xa
        0x7
        0x22
        0x20
        0x9
        0x7
        0x22
        0x21
        0x21
        0x1c
        0x13
        0x21
        0x2f
        0x1c
        0x19
        0x21
        0x3c
        0x1b
        0x21
        0x21
        0x3f
        0x1c
        0x1e
        0x21
        0x0
        0x1b
        0x1a
        0x21
        -0x1
        0x13
        0x15
        0x21
        0x20
        0x12
        0x1c
        0x21
        0xa
        0x12
        0x1c
        0x21
        0x9
        0x12
        0x1c
        0x22
        0x2f
        0x1c
        0x16
        0x22
        0x3e
        0x1e
        0x1c
        0x22
        0x0
        0x1b
        0x1
        0x22
        -0x1
        0x1e
        0x15
        0x22
        0x20
        0x1c
        0x22
        0x22
        0xa
        0x1c
        0x22
        0x22
        0x9
        0x1c
        0x22
        0x23
        0x0
        0xd
        0x23
        0x23
        -0x1
        0xd
        0x15
    .end array-data
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
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc8

    .line 5
    .line 6
    new-array v0, v0, [C

    .line 7
    .line 8
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    .line 9
    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    fill-array-data v0, :array_0

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/g;->k:[I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 4
        0x20ac
        0xfffd
        0x201a
        0x192
        0x201e
        0x2026
        0x2020
        0x2021
        0x2c6
        0x2030
        0x160
        0x2039
        0x152
        0xfffd
        0x17d
        0xfffd
        0xfffd
        0x2018
        0x2019
        0x201c
        0x201d
        0x2022
        0x2013
        0x2014
        0x2dc
        0x2122
        0x161
        0x203a
        0x153
        0xfffd
        0x17e
        0x178
    .end array-data
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
.end method

.method public static c([Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance p0, Lorg/ccil/cowan/tagsoup/g;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/g;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/InputStreamReader;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 9
    .line 10
    const-string v2, "UTF-8"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 16
    .line 17
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    invoke-direct {v1, v3, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lorg/ccil/cowan/tagsoup/j;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Lorg/ccil/cowan/tagsoup/j;-><init>(Ljava/io/Writer;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0, v2}, Lorg/ccil/cowan/tagsoup/n;->a(Ljava/io/Reader;Lorg/ccil/cowan/tagsoup/m;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method private d()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/ccil/cowan/tagsoup/g;->f:I

    .line 2
    .line 3
    iput v0, p0, Lorg/ccil/cowan/tagsoup/g;->d:I

    .line 4
    .line 5
    iget v0, p0, Lorg/ccil/cowan/tagsoup/g;->e:I

    .line 6
    .line 7
    iput v0, p0, Lorg/ccil/cowan/tagsoup/g;->c:I

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method

.method private static e(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-string p0, "\\n"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/16 v0, 0x20

    .line 9
    .line 10
    if-ge p0, v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuffer;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "0x"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "\'"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    .line 43
    .line 44
    int-to-char p0, p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
    .line 56
    .line 57
    .line 58
.end method

.method private f(ILorg/ccil/cowan/tagsoup/m;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    add-int/lit8 v2, v2, -0x14

    .line 7
    .line 8
    if-lt v0, v2, :cond_2

    .line 9
    .line 10
    iget v2, p0, Lorg/ccil/cowan/tagsoup/g;->g:I

    .line 11
    .line 12
    const/16 v3, 0x1c

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eq v2, v3, :cond_1

    .line 16
    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    array-length p2, v1

    .line 23
    mul-int/lit8 p2, p2, 0x2

    .line 24
    .line 25
    new-array p2, p2, [C

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    invoke-static {v1, v4, p2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p2, v1, v4, v0}, Lorg/ccil/cowan/tagsoup/m;->g([CII)V

    .line 36
    .line 37
    .line 38
    iput v4, p0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 39
    .line 40
    :cond_2
    :goto_1
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    .line 41
    .line 42
    iget v0, p0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x1

    .line 45
    .line 46
    iput v1, p0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 47
    .line 48
    int-to-char p1, p1

    .line 49
    aput-char p1, p2, v0

    .line 50
    .line 51
    return-void
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

.method private g(Ljava/io/PushbackReader;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/io/PushbackReader;->unread(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/io/Reader;Lorg/ccil/cowan/tagsoup/m;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v3, 0x1c

    .line 1
    iput v3, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    .line 2
    instance-of v4, v1, Ljava/io/BufferedReader;

    const/4 v5, 0x5

    if-eqz v4, :cond_0

    .line 3
    new-instance v4, Ljava/io/PushbackReader;

    invoke-direct {v4, v1, v5}, Ljava/io/PushbackReader;-><init>(Ljava/io/Reader;I)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v4, Ljava/io/PushbackReader;

    new-instance v6, Ljava/io/BufferedReader;

    invoke-direct {v6, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-direct {v4, v6, v5}, Ljava/io/PushbackReader;-><init>(Ljava/io/Reader;I)V

    .line 5
    :goto_0
    invoke-virtual {v4}, Ljava/io/PushbackReader;->read()I

    move-result v1

    const v5, 0xfeff

    if-eq v1, v5, :cond_1

    .line 6
    invoke-direct {v0, v4, v1}, Lorg/ccil/cowan/tagsoup/g;->g(Ljava/io/PushbackReader;I)V

    .line 7
    :cond_1
    :goto_1
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    const/16 v5, 0x15

    const/4 v6, 0x0

    if-eq v1, v5, :cond_18

    .line 8
    invoke-virtual {v4}, Ljava/io/PushbackReader;->read()I

    move-result v1

    const/16 v5, 0x9f

    const/16 v7, 0x80

    if-lt v1, v7, :cond_2

    if-gt v1, v5, :cond_2

    .line 9
    iget-object v8, v0, Lorg/ccil/cowan/tagsoup/g;->k:[I

    add-int/lit8 v1, v1, -0x80

    aget v1, v8, v1

    :cond_2
    const/16 v8, 0xd

    const/16 v9, 0xa

    if-ne v1, v8, :cond_3

    .line 10
    invoke-virtual {v4}, Ljava/io/PushbackReader;->read()I

    move-result v1

    if-eq v1, v9, :cond_3

    .line 11
    invoke-direct {v0, v4, v1}, Lorg/ccil/cowan/tagsoup/g;->g(Ljava/io/PushbackReader;I)V

    move v1, v9

    :cond_3
    const/4 v8, 0x1

    if-ne v1, v9, :cond_4

    .line 12
    iget v10, v0, Lorg/ccil/cowan/tagsoup/g;->e:I

    add-int/2addr v10, v8

    iput v10, v0, Lorg/ccil/cowan/tagsoup/g;->e:I

    .line 13
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    goto :goto_2

    .line 14
    :cond_4
    iget v10, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    add-int/2addr v10, v8

    iput v10, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    :goto_2
    const/4 v10, -0x1

    const/16 v11, 0x20

    if-ge v1, v11, :cond_5

    if-eq v1, v9, :cond_5

    const/16 v9, 0x9

    if-eq v1, v9, :cond_5

    if-eq v1, v10, :cond_5

    goto :goto_1

    :cond_5
    if-lt v1, v10, :cond_6

    .line 15
    sget v9, Lorg/ccil/cowan/tagsoup/g;->E0:I

    if-ge v1, v9, :cond_6

    move v9, v1

    goto :goto_3

    :cond_6
    const/4 v9, -0x2

    .line 16
    :goto_3
    sget-object v12, Lorg/ccil/cowan/tagsoup/g;->D0:[[S

    iget v13, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    aget-object v12, v12, v13

    add-int/lit8 v9, v9, 0x2

    aget-short v9, v12, v9

    if-eq v9, v10, :cond_7

    .line 17
    sget-object v12, Lorg/ccil/cowan/tagsoup/g;->A0:[I

    add-int/lit8 v13, v9, 0x2

    aget v13, v12, v13

    add-int/lit8 v9, v9, 0x3

    .line 18
    aget v9, v12, v9

    iput v9, v0, Lorg/ccil/cowan/tagsoup/g;->h:I

    goto :goto_4

    :cond_7
    move v13, v6

    :goto_4
    const/16 v9, 0x3c

    const/16 v12, 0x2d

    packed-switch v13, :pswitch_data_0

    .line 19
    new-instance v1, Ljava/lang/Error;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Can\'t process state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v1

    .line 20
    :pswitch_0
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    if-lez v1, :cond_8

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 21
    :cond_8
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->g([CII)V

    .line 22
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 23
    :pswitch_1
    invoke-direct {v0, v4, v1}, Lorg/ccil/cowan/tagsoup/g;->g(Ljava/io/PushbackReader;I)V

    .line 24
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    sub-int/2addr v1, v8

    iput v1, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    goto/16 :goto_8

    .line 25
    :pswitch_2
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->p([CII)V

    .line 26
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 27
    :pswitch_3
    invoke-direct {v0, v11, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    .line 28
    :pswitch_4
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    .line 29
    :pswitch_5
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->a([CII)V

    .line 30
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 31
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->l([CII)V

    goto/16 :goto_8

    .line 32
    :pswitch_6
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->a([CII)V

    .line 33
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 34
    :pswitch_7
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 35
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->l([CII)V

    .line 36
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 37
    :pswitch_8
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 38
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->g([CII)V

    .line 39
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 40
    :pswitch_9
    invoke-direct {v0, v12, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    .line 41
    invoke-direct {v0, v11, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    .line 42
    :pswitch_a
    invoke-direct {v0, v12, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    .line 43
    invoke-direct {v0, v11, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    .line 44
    :pswitch_b
    invoke-direct {v0, v12, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    .line 45
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    .line 46
    :pswitch_c
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 47
    invoke-direct {v0, v9, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    .line 48
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->g([CII)V

    .line 49
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 50
    :pswitch_d
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 51
    invoke-direct {v0, v9, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    .line 52
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    .line 53
    :pswitch_e
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->f([CII)V

    .line 54
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 55
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->p([CII)V

    goto/16 :goto_8

    .line 56
    :pswitch_f
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->f([CII)V

    .line 57
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 58
    :pswitch_10
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->m([CII)V

    .line 59
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 60
    :pswitch_11
    iget-object v5, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v7, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v5, v6, v7}, Lorg/ccil/cowan/tagsoup/m;->g([CII)V

    .line 61
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 62
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    .line 63
    :pswitch_12
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    int-to-char v9, v1

    .line 64
    iget v12, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    const/16 v13, 0x17

    const/16 v14, 0x23

    const/16 v15, 0x1b

    if-ne v12, v13, :cond_9

    if-ne v9, v14, :cond_9

    .line 65
    iput v15, v0, Lorg/ccil/cowan/tagsoup/g;->h:I

    .line 66
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto/16 :goto_8

    :cond_9
    if-ne v12, v15, :cond_b

    const/16 v3, 0x78

    if-eq v9, v3, :cond_a

    const/16 v3, 0x58

    if-ne v9, v3, :cond_b

    .line 67
    :cond_a
    iput v14, v0, Lorg/ccil/cowan/tagsoup/g;->h:I

    .line 68
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    :goto_5
    const/16 v3, 0x1c

    goto/16 :goto_8

    :cond_b
    if-ne v12, v13, :cond_c

    .line 69
    invoke-static {v9}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 70
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto :goto_5

    .line 71
    :cond_c
    iget v3, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    if-ne v3, v15, :cond_d

    invoke-static {v9}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 72
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto :goto_5

    .line 73
    :cond_d
    iget v3, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    if-ne v3, v14, :cond_f

    invoke-static {v9}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, "abcdefABCDEF"

    invoke-virtual {v3, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-eq v3, v10, :cond_f

    .line 74
    :cond_e
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto :goto_5

    .line 75
    :cond_f
    iget-object v3, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v9, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    sub-int/2addr v9, v8

    invoke-interface {v2, v3, v8, v9}, Lorg/ccil/cowan/tagsoup/m;->b([CII)V

    .line 76
    invoke-interface/range {p2 .. p2}, Lorg/ccil/cowan/tagsoup/m;->h()I

    move-result v3

    if-eqz v3, :cond_14

    .line 77
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    if-lt v3, v7, :cond_10

    if-gt v3, v5, :cond_10

    .line 78
    iget-object v5, v0, Lorg/ccil/cowan/tagsoup/g;->k:[I

    add-int/lit8 v3, v3, -0x80

    aget v3, v5, v3

    :cond_10
    if-ge v3, v11, :cond_11

    goto :goto_6

    :cond_11
    const v5, 0xd800

    if-lt v3, v5, :cond_12

    const v6, 0xdfff

    if-gt v3, v6, :cond_12

    goto :goto_6

    :cond_12
    const v6, 0xffff

    if-gt v3, v6, :cond_13

    .line 79
    invoke-direct {v0, v3, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto :goto_6

    :cond_13
    const/high16 v6, 0x10000

    sub-int/2addr v3, v6

    shr-int/lit8 v6, v3, 0xa

    add-int/2addr v6, v5

    .line 80
    invoke-direct {v0, v6, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    and-int/lit16 v3, v3, 0x3ff

    const v5, 0xdc00

    add-int/2addr v3, v5

    .line 81
    invoke-direct {v0, v3, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    :goto_6
    const/16 v3, 0x3b

    if-eq v1, v3, :cond_15

    .line 82
    invoke-direct {v0, v4, v1}, Lorg/ccil/cowan/tagsoup/g;->g(Ljava/io/PushbackReader;I)V

    .line 83
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    sub-int/2addr v1, v8

    iput v1, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    goto :goto_7

    .line 84
    :cond_14
    invoke-direct {v0, v4, v1}, Lorg/ccil/cowan/tagsoup/g;->g(Ljava/io/PushbackReader;I)V

    .line 85
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    sub-int/2addr v1, v8

    iput v1, v0, Lorg/ccil/cowan/tagsoup/g;->f:I

    :cond_15
    :goto_7
    const/16 v3, 0x1c

    .line 86
    iput v3, v0, Lorg/ccil/cowan/tagsoup/g;->h:I

    goto/16 :goto_8

    .line 87
    :pswitch_13
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 88
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    if-lez v1, :cond_16

    iget-object v5, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v5, v6, v1}, Lorg/ccil/cowan/tagsoup/m;->f([CII)V

    .line 89
    :cond_16
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 90
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->i([CII)V

    goto/16 :goto_8

    .line 91
    :pswitch_14
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->j([CII)V

    .line 92
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 93
    :pswitch_15
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 94
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->n([CII)V

    .line 95
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto/16 :goto_8

    .line 96
    :pswitch_16
    invoke-direct/range {p0 .. p0}, Lorg/ccil/cowan/tagsoup/g;->d()V

    .line 97
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    if-le v1, v8, :cond_17

    add-int/lit8 v1, v1, -0x2

    iput v1, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 98
    :cond_17
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->g([CII)V

    .line 99
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto :goto_8

    .line 100
    :pswitch_17
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->e([CII)V

    .line 101
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 102
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->p([CII)V

    goto :goto_8

    .line 103
    :pswitch_18
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->e([CII)V

    .line 104
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto :goto_8

    .line 105
    :pswitch_19
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->o([CII)V

    .line 106
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 107
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->d([CII)V

    .line 108
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->p([CII)V

    goto :goto_8

    .line 109
    :pswitch_1a
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->o([CII)V

    .line 110
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 111
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->d([CII)V

    goto :goto_8

    .line 112
    :pswitch_1b
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->o([CII)V

    .line 113
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    goto :goto_8

    .line 114
    :pswitch_1c
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->d([CII)V

    .line 115
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 116
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->p([CII)V

    goto :goto_8

    .line 117
    :pswitch_1d
    iget-object v5, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v7, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v5, v6, v7}, Lorg/ccil/cowan/tagsoup/m;->d([CII)V

    .line 118
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 119
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/g;->f(ILorg/ccil/cowan/tagsoup/m;)V

    goto :goto_8

    .line 120
    :pswitch_1e
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    iget v5, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    invoke-interface {v2, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/m;->d([CII)V

    .line 121
    iput v6, v0, Lorg/ccil/cowan/tagsoup/g;->j:I

    .line 122
    :goto_8
    :pswitch_1f
    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->h:I

    iput v1, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    goto/16 :goto_1

    .line 123
    :pswitch_20
    new-instance v2, Ljava/lang/Error;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "HTMLScanner can\'t cope with "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " in state "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, v0, Lorg/ccil/cowan/tagsoup/g;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v2

    .line 124
    :cond_18
    iget-object v1, v0, Lorg/ccil/cowan/tagsoup/g;->i:[C

    invoke-interface {v2, v1, v6, v6}, Lorg/ccil/cowan/tagsoup/m;->k([CII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_1f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/g;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/g;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lorg/ccil/cowan/tagsoup/g;->f:I

    .line 7
    .line 8
    iput p1, p0, Lorg/ccil/cowan/tagsoup/g;->e:I

    .line 9
    .line 10
    iput p1, p0, Lorg/ccil/cowan/tagsoup/g;->d:I

    .line 11
    .line 12
    iput p1, p0, Lorg/ccil/cowan/tagsoup/g;->c:I

    .line 13
    .line 14
    return-void
    .line 15
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

.method public getColumnNumber()I
    .locals 1

    iget v0, p0, Lorg/ccil/cowan/tagsoup/g;->d:I

    return v0
.end method

.method public getLineNumber()I
    .locals 1

    iget v0, p0, Lorg/ccil/cowan/tagsoup/g;->c:I

    return v0
.end method

.method public getPublicId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public startCDATA()V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lorg/ccil/cowan/tagsoup/g;->h:I

    return-void
.end method
