.class public Lcom/bytedance/tools/b/a;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/tools/b/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/tools/b/a$a;
    }
.end annotation


# instance fields
.field private a:Lcom/bytedance/tools/b/d;

.field private b:Ljava/lang/String;

.field private c:Ljava/io/BufferedWriter;

.field private d:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "tt-tool-log"

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "init BigStringLogger :"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "TT_TOOLS"

    .line 25
    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/bytedance/tools/b/a;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 32
    .line 33
    .line 34
    return-void
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
.end method

.method private a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bytedance/tools/b/a;->b:Ljava/lang/String;

    const-string v2, "TOOL_LOG_BIG_STR"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 4
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v3, 0x500000

    cmp-long v0, v0, v3

    if-lez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    new-instance v1, Ljava/io/File;

    iget-object v3, p0, Lcom/bytedance/tools/b/a;->b:Ljava/lang/String;

    const-string v4, "TOOL_LOG_BIG_STR_BACK"

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 7
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bytedance/tools/b/a;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    .line 8
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    :cond_1
    return-void
.end method

.method private b(Lcom/bytedance/tools/b/a$a;)V
    .locals 7

    .line 1
    const-string v0, "]["

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const-wide/32 v3, 0x500000

    .line 18
    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/tools/b/a;->e()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/bytedance/tools/b/a;->d()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->newLine()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "["

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 50
    .line 51
    const-string/jumbo v4, "yyyy-MM-dd hh:mm:ss.S"

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Ljava/util/Date;

    .line 58
    .line 59
    iget-wide v5, p1, Lcom/bytedance/tools/b/a$a;->e:J

    .line 60
    .line 61
    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v3, p1, Lcom/bytedance/tools/b/a$a;->d:I

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v0, p1, Lcom/bytedance/tools/b/a$a;->b:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, "]"

    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 105
    .line 106
    iget-object v1, p1, Lcom/bytedance/tools/b/a$a;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 117
    .line 118
    iget-object p1, p1, Lcom/bytedance/tools/b/a$a;->c:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/io/BufferedWriter;->newLine()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :catch_0
    move-exception p1

    .line 130
    const-string v0, "TT_TOOLS"

    .line 131
    .line 132
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 133
    .line 134
    .line 135
    :cond_2
    :goto_0
    return-void
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

.method private d()V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/bytedance/tools/b/a;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/FileWriter;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/tools/b/a;->d:Ljava/io/File;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v0, v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/io/BufferedWriter;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    const-string v1, "TT_TOOLS"

    .line 22
    .line 23
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
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
.end method

.method private e()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->c:Ljava/io/BufferedWriter;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    const-string v1, "TT_TOOLS"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    return-void
    .line 21
.end method


# virtual methods
.method public a(Landroid/os/Message;)V
    .locals 1

    .line 9
    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/bytedance/tools/b/a$a;

    invoke-direct {p0, p1}, Lcom/bytedance/tools/b/a;->b(Lcom/bytedance/tools/b/a$a;)V

    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/b/a;->a:Lcom/bytedance/tools/b/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v9, Lcom/bytedance/tools/b/a$a;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v7

    .line 20
    move-object v1, v9

    .line 21
    move-object v2, p0

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    invoke-direct/range {v1 .. v8}, Lcom/bytedance/tools/b/a$a;-><init>(Lcom/bytedance/tools/b/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 26
    .line 27
    .line 28
    iput-object v9, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput p1, v0, Landroid/os/Message;->what:I

    .line 32
    .line 33
    iget-object p1, p0, Lcom/bytedance/tools/b/a;->a:Lcom/bytedance/tools/b/d;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 36
    .line 37
    .line 38
    return-void
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

.method protected onLooperPrepared()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/tools/b/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lcom/bytedance/tools/b/d;-><init>(Landroid/os/Looper;Lcom/bytedance/tools/b/d$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/tools/b/a;->a:Lcom/bytedance/tools/b/d;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/bytedance/tools/b/a;->d()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
