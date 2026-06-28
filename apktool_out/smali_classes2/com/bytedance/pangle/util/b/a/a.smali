.class public final Lcom/bytedance/pangle/util/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/bytedance/pangle/util/b/b/d;
    .locals 8

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v2, "r"

    invoke-direct {v1, p0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x16

    cmp-long v0, v2, v4

    if-ltz v0, :cond_3

    .line 3
    new-instance v0, Lcom/bytedance/pangle/util/b/b/d;

    invoke-direct {v0, p0}, Lcom/bytedance/pangle/util/b/b/d;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    cmp-long p0, v2, v4

    if-ltz p0, :cond_2

    sub-long/2addr v2, v4

    .line 5
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 6
    iget-object p0, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 7
    invoke-virtual {p0, v1}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result p0

    int-to-long v4, p0

    const-wide/32 v6, 0x6054b50

    cmp-long p0, v4, v6

    if-nez p0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v1, v0}, Lcom/bytedance/pangle/util/b/a/a;->b(Ljava/io/RandomAccessFile;Lcom/bytedance/pangle/util/b/b/d;)J

    move-result-wide v2

    :goto_0
    const-wide/16 v4, 0x4

    add-long/2addr v2, v4

    .line 9
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 10
    new-instance p0, Lcom/bytedance/pangle/util/b/b/b;

    invoke-direct {p0}, Lcom/bytedance/pangle/util/b/b/b;-><init>()V

    const/4 v2, 0x6

    .line 11
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 12
    iget-object v2, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 13
    invoke-virtual {v2, v1}, Lcom/bytedance/pangle/util/b/a/c;->b(Ljava/io/RandomAccessFile;)I

    move-result v2

    .line 14
    iput v2, p0, Lcom/bytedance/pangle/util/b/b/b;->a:I

    const/4 v2, 0x4

    .line 15
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 16
    iget-object v2, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 17
    invoke-virtual {v2, v1}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result v2

    int-to-long v2, v2

    .line 18
    iput-wide v2, p0, Lcom/bytedance/pangle/util/b/b/b;->b:J

    .line 19
    iput-object p0, v0, Lcom/bytedance/pangle/util/b/b/d;->b:Lcom/bytedance/pangle/util/b/b/b;

    .line 20
    iget p0, p0, Lcom/bytedance/pangle/util/b/b/b;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p0, :cond_1

    .line 21
    :try_start_2
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-object v0

    .line 22
    :cond_1
    :try_start_3
    invoke-static {v1, v0}, Lcom/bytedance/pangle/util/b/a/a;->a(Ljava/io/RandomAccessFile;Lcom/bytedance/pangle/util/b/b/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    :try_start_4
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    return-object v0

    .line 24
    :cond_2
    :try_start_5
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Zip file size less than size of zip headers. Probably not a zip file."

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 25
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p0

    move-object v0, v1

    goto :goto_1

    :catchall_1
    move-exception p0

    :goto_1
    if-eqz v0, :cond_4

    .line 26
    :try_start_6
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 27
    :catch_2
    :cond_4
    throw p0
.end method

.method private static a(Ljava/io/RandomAccessFile;Lcom/bytedance/pangle/util/b/b/d;)V
    .locals 13

    .line 28
    new-instance v0, Lcom/bytedance/pangle/util/b/b/a;

    invoke-direct {v0}, Lcom/bytedance/pangle/util/b/b/a;-><init>()V

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    iget-object v2, p1, Lcom/bytedance/pangle/util/b/b/d;->b:Lcom/bytedance/pangle/util/b/b/b;

    .line 31
    iget-wide v3, v2, Lcom/bytedance/pangle/util/b/b/b;->b:J

    .line 32
    iget v2, v2, Lcom/bytedance/pangle/util/b/b/b;->a:I

    int-to-long v5, v2

    .line 33
    invoke-virtual {p0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, v5

    if-gez v3, :cond_3

    .line 34
    new-instance v3, Lcom/bytedance/pangle/util/b/b/c;

    invoke-direct {v3}, Lcom/bytedance/pangle/util/b/b/c;-><init>()V

    .line 35
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 36
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result v4

    int-to-long v7, v4

    const-wide/32 v9, 0x2014b50    # 1.6619997E-316

    cmp-long v4, v7, v9

    if-nez v4, :cond_2

    const/4 v4, 0x6

    .line 37
    invoke-virtual {p0, v4}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 38
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 39
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->b(Ljava/io/RandomAccessFile;)I

    move-result v4

    .line 40
    iput v4, v3, Lcom/bytedance/pangle/util/b/b/c;->a:I

    const/4 v4, 0x4

    .line 41
    invoke-virtual {p0, v4}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 42
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 43
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result v4

    int-to-long v7, v4

    .line 44
    iput-wide v7, v3, Lcom/bytedance/pangle/util/b/b/c;->b:J

    .line 45
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 46
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result v4

    int-to-long v7, v4

    .line 47
    iput-wide v7, v3, Lcom/bytedance/pangle/util/b/b/c;->c:J

    .line 48
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 49
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result v4

    int-to-long v7, v4

    .line 50
    iput-wide v7, v3, Lcom/bytedance/pangle/util/b/b/c;->d:J

    .line 51
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 52
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->b(Ljava/io/RandomAccessFile;)I

    move-result v4

    .line 53
    iput v4, v3, Lcom/bytedance/pangle/util/b/b/c;->e:I

    .line 54
    iget-object v7, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 55
    invoke-virtual {v7, p0}, Lcom/bytedance/pangle/util/b/a/c;->b(Ljava/io/RandomAccessFile;)I

    move-result v7

    .line 56
    iput v7, v3, Lcom/bytedance/pangle/util/b/b/c;->f:I

    .line 57
    iget-object v7, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 58
    invoke-virtual {v7, p0}, Lcom/bytedance/pangle/util/b/a/c;->b(Ljava/io/RandomAccessFile;)I

    move-result v7

    const/16 v8, 0x8

    .line 59
    invoke-virtual {p0, v8}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 60
    iget-object v8, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 61
    invoke-virtual {v8, p0}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    move-result v8

    int-to-long v8, v8

    .line 62
    iput-wide v8, v3, Lcom/bytedance/pangle/util/b/b/c;->i:J

    if-lez v4, :cond_1

    .line 63
    new-array v4, v4, [B

    .line 64
    invoke-virtual {p0, v4}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 65
    new-instance v8, Ljava/lang/String;

    const-string v9, "UTF-8"

    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v9

    invoke-direct {v8, v4, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 66
    iput-object v8, v3, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    .line 67
    iget v4, v3, Lcom/bytedance/pangle/util/b/b/c;->f:I

    .line 68
    invoke-virtual {p0, v4}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    if-lez v7, :cond_0

    .line 69
    invoke-virtual {p0, v7}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 70
    :cond_0
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v7

    .line 71
    iget-wide v9, v3, Lcom/bytedance/pangle/util/b/b/c;->i:J

    const-wide/16 v11, 0x1c

    add-long/2addr v9, v11

    .line 72
    invoke-virtual {p0, v9, v10}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 73
    iget-object v4, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 74
    invoke-virtual {v4, p0}, Lcom/bytedance/pangle/util/b/a/c;->b(Ljava/io/RandomAccessFile;)I

    move-result v4

    .line 75
    iput v4, v3, Lcom/bytedance/pangle/util/b/b/c;->g:I

    .line 76
    invoke-virtual {p0, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 77
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 78
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid entry name in file header"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 79
    :cond_2
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Expected central directory entry not found (#"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 80
    :cond_3
    iput-object v1, v0, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    .line 81
    iput-object v0, p1, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    return-void
.end method

.method private static b(Ljava/io/RandomAccessFile;Lcom/bytedance/pangle/util/b/b/d;)J
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x16

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/32 v4, 0x10000

    .line 13
    .line 14
    .line 15
    cmp-long v2, v2, v4

    .line 16
    .line 17
    if-gez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    :cond_0
    :goto_0
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v6, v4, v2

    .line 26
    .line 27
    if-lez v6, :cond_2

    .line 28
    .line 29
    cmp-long v2, v0, v2

    .line 30
    .line 31
    if-lez v2, :cond_2

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 37
    .line 38
    .line 39
    iget-object v6, p1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 40
    .line 41
    invoke-virtual {v6, p0}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/RandomAccessFile;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    int-to-long v6, v6

    .line 46
    const-wide/32 v8, 0x6054b50

    .line 47
    .line 48
    .line 49
    cmp-long v6, v6, v8

    .line 50
    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    return-wide v0

    .line 54
    :cond_1
    sub-long/2addr v4, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 57
    .line 58
    const-string p1, "Zip headers not found. Probably not a zip file"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
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
.end method
