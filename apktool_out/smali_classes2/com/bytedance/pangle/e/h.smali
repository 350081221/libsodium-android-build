.class public final Lcom/bytedance/pangle/e/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/e/h$c;,
        Lcom/bytedance/pangle/e/h$b;,
        Lcom/bytedance/pangle/e/h$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/io/FileInputStream;

.field private b:Lcom/bytedance/pangle/e/h$a;

.field private c:[Lcom/bytedance/pangle/e/h$b;

.field private d:[Lcom/bytedance/pangle/e/h$c;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/pangle/e/h$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/io/File;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->c:[Lcom/bytedance/pangle/e/h$b;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->d:[Lcom/bytedance/pangle/e/h$c;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->e:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/io/FileInputStream;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->a:Ljava/io/FileInputStream;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Lcom/bytedance/pangle/e/h$a;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p1, v1}, Lcom/bytedance/pangle/e/h$a;-><init>(Ljava/nio/channels/FileChannel;B)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 36
    .line 37
    const/16 v0, 0x80

    .line 38
    .line 39
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 44
    .line 45
    iget-short v2, v2, Lcom/bytedance/pangle/e/h$a;->j:S

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 51
    .line 52
    iget-object v2, v2, Lcom/bytedance/pangle/e/h$a;->a:[B

    .line 53
    .line 54
    const/4 v3, 0x5

    .line 55
    aget-byte v2, v2, v3

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-ne v2, v3, :cond_0

    .line 59
    .line 60
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 69
    .line 70
    iget-wide v2, v2, Lcom/bytedance/pangle/e/h$a;->f:J

    .line 71
    .line 72
    invoke-virtual {p1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 76
    .line 77
    iget-short v2, v2, Lcom/bytedance/pangle/e/h$a;->k:S

    .line 78
    .line 79
    new-array v2, v2, [Lcom/bytedance/pangle/e/h$b;

    .line 80
    .line 81
    iput-object v2, p0, Lcom/bytedance/pangle/e/h;->c:[Lcom/bytedance/pangle/e/h$b;

    .line 82
    .line 83
    move v2, v1

    .line 84
    :goto_1
    iget-object v3, p0, Lcom/bytedance/pangle/e/h;->c:[Lcom/bytedance/pangle/e/h$b;

    .line 85
    .line 86
    array-length v3, v3

    .line 87
    const/4 v4, 0x4

    .line 88
    if-ge v2, v3, :cond_1

    .line 89
    .line 90
    const-string v3, "failed to read phdr."

    .line 91
    .line 92
    invoke-static {p1, v0, v3}, Lcom/bytedance/pangle/e/h;->b(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Lcom/bytedance/pangle/e/h;->c:[Lcom/bytedance/pangle/e/h$b;

    .line 96
    .line 97
    new-instance v5, Lcom/bytedance/pangle/e/h$b;

    .line 98
    .line 99
    iget-object v6, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 100
    .line 101
    iget-object v6, v6, Lcom/bytedance/pangle/e/h$a;->a:[B

    .line 102
    .line 103
    aget-byte v4, v6, v4

    .line 104
    .line 105
    invoke-direct {v5, v0, v4, v1}, Lcom/bytedance/pangle/e/h$b;-><init>(Ljava/nio/ByteBuffer;IB)V

    .line 106
    .line 107
    .line 108
    aput-object v5, v3, v2

    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 114
    .line 115
    iget-wide v2, v2, Lcom/bytedance/pangle/e/h$a;->g:J

    .line 116
    .line 117
    invoke-virtual {p1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 118
    .line 119
    .line 120
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 121
    .line 122
    iget-short v2, v2, Lcom/bytedance/pangle/e/h$a;->l:S

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 128
    .line 129
    iget-short v2, v2, Lcom/bytedance/pangle/e/h$a;->m:S

    .line 130
    .line 131
    new-array v2, v2, [Lcom/bytedance/pangle/e/h$c;

    .line 132
    .line 133
    iput-object v2, p0, Lcom/bytedance/pangle/e/h;->d:[Lcom/bytedance/pangle/e/h$c;

    .line 134
    .line 135
    move v2, v1

    .line 136
    :goto_2
    iget-object v3, p0, Lcom/bytedance/pangle/e/h;->d:[Lcom/bytedance/pangle/e/h$c;

    .line 137
    .line 138
    array-length v5, v3

    .line 139
    if-ge v2, v5, :cond_2

    .line 140
    .line 141
    const-string v3, "failed to read shdr."

    .line 142
    .line 143
    invoke-static {p1, v0, v3}, Lcom/bytedance/pangle/e/h;->b(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v3, p0, Lcom/bytedance/pangle/e/h;->d:[Lcom/bytedance/pangle/e/h$c;

    .line 147
    .line 148
    new-instance v5, Lcom/bytedance/pangle/e/h$c;

    .line 149
    .line 150
    iget-object v6, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 151
    .line 152
    iget-object v6, v6, Lcom/bytedance/pangle/e/h$a;->a:[B

    .line 153
    .line 154
    aget-byte v6, v6, v4

    .line 155
    .line 156
    invoke-direct {v5, v0, v6, v1}, Lcom/bytedance/pangle/e/h$c;-><init>(Ljava/nio/ByteBuffer;IB)V

    .line 157
    .line 158
    .line 159
    aput-object v5, v3, v2

    .line 160
    .line 161
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_2
    iget-object p1, p0, Lcom/bytedance/pangle/e/h;->b:Lcom/bytedance/pangle/e/h$a;

    .line 165
    .line 166
    iget-short p1, p1, Lcom/bytedance/pangle/e/h$a;->n:S

    .line 167
    .line 168
    if-lez p1, :cond_3

    .line 169
    .line 170
    aget-object p1, v3, p1

    .line 171
    .line 172
    iget-wide v2, p1, Lcom/bytedance/pangle/e/h$c;->f:J

    .line 173
    .line 174
    long-to-int v0, v2

    .line 175
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->a:Ljava/io/FileInputStream;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget-wide v3, p1, Lcom/bytedance/pangle/e/h$c;->e:J

    .line 186
    .line 187
    invoke-virtual {v2, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 188
    .line 189
    .line 190
    iget-object v2, p0, Lcom/bytedance/pangle/e/h;->a:Ljava/io/FileInputStream;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    new-instance v3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v4, "failed to read section: "

    .line 199
    .line 200
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-object p1, p1, Lcom/bytedance/pangle/e/h$c;->k:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-static {v2, v0, p1}, Lcom/bytedance/pangle/e/h;->b(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lcom/bytedance/pangle/e/h;->d:[Lcom/bytedance/pangle/e/h$c;

    .line 216
    .line 217
    array-length v2, p1

    .line 218
    :goto_3
    if-ge v1, v2, :cond_3

    .line 219
    .line 220
    aget-object v3, p1, v1

    .line 221
    .line 222
    iget v4, v3, Lcom/bytedance/pangle/e/h$c;->a:I

    .line 223
    .line 224
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 225
    .line 226
    .line 227
    invoke-static {v0}, Lcom/bytedance/pangle/e/h;->a(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iput-object v4, v3, Lcom/bytedance/pangle/e/h$c;->k:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v5, p0, Lcom/bytedance/pangle/e/h;->e:Ljava/util/Map;

    .line 234
    .line 235
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    add-int/lit8 v1, v1, 0x1

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_3
    return-void
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

.method private static a(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 4

    .line 6
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    .line 8
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    aget-byte v2, v0, v2

    if-eqz v2, :cond_0

    .line 9
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 11
    new-instance v2, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result p0

    sub-int/2addr p0, v1

    add-int/lit8 p0, p0, -0x1

    const-string v3, "ASCII"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v2, v0, v1, p0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v2
.end method

.method static synthetic a(IILjava/lang/String;)V
    .locals 0

    if-lez p0, :cond_0

    if-gt p0, p1, :cond_0

    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static synthetic a(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/bytedance/pangle/e/h;->b(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/io/File;)Z
    .locals 2

    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lcom/bytedance/pangle/e/h;

    invoke-direct {v1, p0}, Lcom/bytedance/pangle/e/h;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-static {v1}, Lcom/bytedance/pangle/util/g;->a(Ljava/io/Closeable;)V

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    invoke-static {v0}, Lcom/bytedance/pangle/util/g;->a(Ljava/io/Closeable;)V

    .line 4
    throw p0

    .line 5
    :catch_0
    invoke-static {v0}, Lcom/bytedance/pangle/util/g;->a(Ljava/io/Closeable;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static b(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, " Rest bytes insufficient, expect to read "

    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " bytes but only "

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p0, " bytes were read."

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
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
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/e/h;->a:Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/pangle/e/h;->e:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->c:[Lcom/bytedance/pangle/e/h$b;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/bytedance/pangle/e/h;->d:[Lcom/bytedance/pangle/e/h$c;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
