.class Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/color/ColorResourcesTableCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TypeChunk"
.end annotation


# static fields
.field private static final CONFIG_SIZE:B = 0x40t

.field private static final HEADER_SIZE:S = 0x54s

.field private static final OFFSET_NO_ENTRY:I = -0x1


# instance fields
.field private final config:[B

.field private final entryCount:I

.field private final header:Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;

.field private final offsetTable:[I

.field private final resEntries:[Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/Set;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x40

    .line 5
    .line 6
    new-array v1, v0, [B

    .line 7
    .line 8
    iput-object v1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->config:[B

    .line 9
    .line 10
    iput p3, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->entryCount:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-byte v0, v1, v2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-array v0, v0, [Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->resEntries:[Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;

    .line 22
    .line 23
    move v0, v2

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ge v0, v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->resEntries:[Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;

    .line 37
    .line 38
    new-instance v4, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;

    .line 39
    .line 40
    invoke-static {v1}, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->access$1400(Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-direct {v4, v0, v1}, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;-><init>(II)V

    .line 45
    .line 46
    .line 47
    aput-object v4, v3, v0

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-array p1, p3, [I

    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->offsetTable:[I

    .line 55
    .line 56
    move p1, v2

    .line 57
    :goto_1
    if-ge v2, p3, :cond_2

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->offsetTable:[I

    .line 70
    .line 71
    aput p1, v0, v2

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x10

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->offsetTable:[I

    .line 77
    .line 78
    const/4 v1, -0x1

    .line 79
    aput v1, v0, v2

    .line 80
    .line 81
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    int-to-short v2, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance p1, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;

    .line 86
    .line 87
    const/16 p2, 0x54

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->getChunkSize()I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    const/16 v0, 0x201

    .line 94
    .line 95
    invoke-direct {p1, v0, p2, p3}, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;-><init>(SSI)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->header:Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;

    .line 99
    .line 100
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private getEntryStart()I
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->getOffsetTableSize()I

    move-result v0

    add-int/lit8 v0, v0, 0x54

    return v0
.end method

.method private getOffsetTableSize()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->offsetTable:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    return v0
.end method


# virtual methods
.method getChunkSize()I
    .locals 2

    invoke-direct {p0}, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->getEntryStart()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->resEntries:[Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    return v0
.end method

.method writeTo(Ljava/io/ByteArrayOutputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->header:Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->writeTo(Ljava/io/ByteArrayOutputStream;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$1300()B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    aput-byte v1, v0, v2

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    aput-byte v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    aput-byte v2, v0, v1

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    aput-byte v2, v0, v1

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->entryCount:I

    .line 29
    .line 30
    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->getEntryStart()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->config:[B

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->offsetTable:[I

    .line 54
    .line 55
    array-length v1, v0

    .line 56
    move v3, v2

    .line 57
    :goto_0
    if-ge v3, v1, :cond_0

    .line 58
    .line 59
    aget v4, v0, v3

    .line 60
    .line 61
    invoke-static {v4}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$TypeChunk;->resEntries:[Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;

    .line 72
    .line 73
    array-length v1, v0

    .line 74
    :goto_1
    if-ge v2, v1, :cond_1

    .line 75
    .line 76
    aget-object v3, v0, v2

    .line 77
    .line 78
    invoke-virtual {v3, p1}, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;->writeTo(Ljava/io/ByteArrayOutputStream;)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
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
.end method
