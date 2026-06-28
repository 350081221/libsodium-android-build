.class public final Ls0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ls0/c;->a:Z

    .line 5
    .line 6
    const/16 p1, 0x18

    .line 7
    .line 8
    invoke-static {p1}, La1/n;->j(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ls0/c;->b:Ljava/lang/String;

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
.end method

.method public static a(Ljava/lang/String;)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "%05d"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1}, Lo0/d;->a(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;[BLjava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lo0/e;->b(Ljava/lang/String;[BLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static varargs g([[B)[B
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_5

    .line 8
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    new-instance v2, Ljava/io/DataOutputStream;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    :try_start_2
    array-length v3, p0

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_1

    .line 21
    .line 22
    aget-object v5, p0, v4

    .line 23
    .line 24
    array-length v6, v5

    .line 25
    invoke-static {v6}, Ls0/c;->b(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v2, v6}, Ljava/io/OutputStream;->write([B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v5}, Ljava/io/OutputStream;->write([B)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 49
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 50
    .line 51
    .line 52
    :catch_0
    move-object v0, p0

    .line 53
    goto :goto_3

    .line 54
    :catch_1
    move-exception p0

    .line 55
    goto :goto_2

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    move-object v2, v0

    .line 58
    :goto_1
    move-object v0, v1

    .line 59
    goto :goto_4

    .line 60
    :catch_2
    move-exception p0

    .line 61
    move-object v2, v0

    .line 62
    goto :goto_2

    .line 63
    :catchall_1
    move-exception p0

    .line 64
    move-object v2, v0

    .line 65
    goto :goto_4

    .line 66
    :catch_3
    move-exception p0

    .line 67
    move-object v1, v0

    .line 68
    move-object v2, v1

    .line 69
    :goto_2
    :try_start_4
    invoke-static {p0}, La1/e;->d(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 70
    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 75
    .line 76
    .line 77
    :catch_4
    :cond_2
    if-eqz v2, :cond_3

    .line 78
    .line 79
    :goto_3
    :try_start_6
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 80
    .line 81
    .line 82
    :catch_5
    :cond_3
    return-object v0

    .line 83
    :catchall_2
    move-exception p0

    .line 84
    goto :goto_1

    .line 85
    :goto_4
    if-eqz v0, :cond_4

    .line 86
    .line 87
    :try_start_7
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 88
    .line 89
    .line 90
    :catch_6
    :cond_4
    if-eqz v2, :cond_5

    .line 91
    .line 92
    :try_start_8
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 93
    .line 94
    .line 95
    :catch_7
    :cond_5
    throw p0

    .line 96
    :cond_6
    :goto_5
    return-object v0
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

.method public static h(Ljava/lang/String;[BLjava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lo0/e;->d(Ljava/lang/String;[BLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(Ls0/d;Ljava/lang/String;)Ls0/b;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 3
    .line 4
    invoke-virtual {p1}, Ls0/d;->a()[B

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    :try_start_1
    new-array v3, v2, [B

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    .line 15
    .line 16
    .line 17
    new-instance v4, Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v4}, Ls0/c;->a(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    new-array v3, v3, [B

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    .line 29
    .line 30
    .line 31
    new-instance v4, Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    :try_start_2
    new-array v2, v2, [B

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    .line 39
    .line 40
    .line 41
    new-instance v3, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Ls0/c;->a(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-lez v2, :cond_2

    .line 51
    .line 52
    new-array v2, v2, [B

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    .line 55
    .line 56
    .line 57
    iget-boolean v3, p0, Ls0/c;->a:Z

    .line 58
    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    iget-object v3, p0, Ls0/c;->b:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v3, v2, p2}, Ls0/c;->f(Ljava/lang/String;[BLjava/lang/String;)[B

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :cond_0
    invoke-virtual {p1}, Ls0/d;->b()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-static {v2}, Lo0/b;->b([B)[B

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {p1, v2}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    move-object p1, v0

    .line 84
    :goto_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catch_0
    move-exception p1

    .line 89
    goto :goto_1

    .line 90
    :catch_1
    move-exception p1

    .line 91
    move-object v4, v0

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_3

    .line 95
    :catch_2
    move-exception p1

    .line 96
    move-object v1, v0

    .line 97
    move-object v4, v1

    .line 98
    :goto_1
    :try_start_4
    invoke-static {p1}, La1/e;->d(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 99
    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 104
    .line 105
    .line 106
    :catch_3
    :cond_3
    move-object p1, v0

    .line 107
    :catch_4
    :goto_2
    if-nez v4, :cond_4

    .line 108
    .line 109
    if-nez p1, :cond_4

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_4
    new-instance p2, Ls0/b;

    .line 113
    .line 114
    invoke-direct {p2, v4, p1}, Ls0/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object p2

    .line 118
    :catchall_1
    move-exception p1

    .line 119
    move-object v0, v1

    .line 120
    :goto_3
    if-eqz v0, :cond_5

    .line 121
    .line 122
    :try_start_6
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 123
    .line 124
    .line 125
    :catch_5
    :cond_5
    throw p1
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

.method public d(Ls0/b;ZLjava/lang/String;)Ls0/d;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Ls0/b;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ls0/b;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lo0/b;->a([B)[B

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move p2, v1

    .line 30
    :cond_1
    :goto_0
    iget-boolean v2, p0, Ls0/c;->a:Z

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Ls0/c;->b:Ljava/lang/String;

    .line 37
    .line 38
    sget-object v5, Lk0/a;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v2, v5}, Ls0/c;->e(Ljava/lang/String;Ljava/lang/String;)[B

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v5, p0, Ls0/c;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v5, p1, p3}, Ls0/c;->h(Ljava/lang/String;[BLjava/lang/String;)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 p3, 0x3

    .line 51
    new-array p3, p3, [[B

    .line 52
    .line 53
    aput-object v0, p3, v1

    .line 54
    .line 55
    aput-object v2, p3, v3

    .line 56
    .line 57
    aput-object p1, p3, v4

    .line 58
    .line 59
    invoke-static {p3}, Ls0/c;->g([[B)[B

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-array p3, v4, [[B

    .line 65
    .line 66
    aput-object v0, p3, v1

    .line 67
    .line 68
    aput-object p1, p3, v3

    .line 69
    .line 70
    invoke-static {p3}, Ls0/c;->g([[B)[B

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    new-instance p3, Ls0/d;

    .line 75
    .line 76
    invoke-direct {p3, p2, p1}, Ls0/d;-><init>(Z[B)V

    .line 77
    .line 78
    .line 79
    return-object p3
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
