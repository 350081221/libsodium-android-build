.class public Lcom/lody/virtual/server/pm/installer/FileBridge;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# static fields
.field private static final CMD_CLOSE:I = 0x3

.field private static final CMD_FSYNC:I = 0x2

.field private static final CMD_WRITE:I = 0x1

.field private static final MSG_LENGTH:I = 0x8

.field private static final TAG:Ljava/lang/String; = "FileBridge"


# instance fields
.field private final mClient:Ljava/io/FileDescriptor;

.field private volatile mClosed:Z

.field private final mServer:Ljava/io/FileDescriptor;

.field private mTarget:Ljava/io/FileDescriptor;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/FileDescriptor;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/io/FileDescriptor;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mServer:Ljava/io/FileDescriptor;

    .line 10
    .line 11
    new-instance v1, Ljava/io/FileDescriptor;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/io/FileDescriptor;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mClient:Ljava/io/FileDescriptor;

    .line 17
    .line 18
    :try_start_0
    sget v2, Landroid/system/OsConstants;->AF_UNIX:I

    .line 19
    .line 20
    sget v3, Landroid/system/OsConstants;->SOCK_STREAM:I

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v3, v4, v0, v1}, Landroid/system/Os;->socketpair(IIILjava/io/FileDescriptor;Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 28
    .line 29
    const-string v1, "Failed to create bridge"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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
.end method

.method public static closeQuietly(Ljava/io/FileDescriptor;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/FileDescriptor;->valid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {p0}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    return-void
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
.end method

.method public static read(Ljava/io/FileDescriptor;[BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {v0, p2, p3}, Lcom/lody/virtual/helper/utils/ArrayUtils;->checkOffsetAndCount(III)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Landroid/system/Os;->read(Ljava/io/FileDescriptor;[BII)I

    .line 10
    .line 11
    .line 12
    move-result p0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    :cond_1
    return p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    iget p1, p0, Landroid/system/ErrnoException;->errno:I

    .line 19
    .line 20
    sget p2, Landroid/system/OsConstants;->EAGAIN:I

    .line 21
    .line 22
    if-ne p1, p2, :cond_2

    .line 23
    .line 24
    return v0

    .line 25
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.end method

.method public static write(Ljava/io/FileDescriptor;[BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {v0, p2, p3}, Lcom/lody/virtual/helper/utils/ArrayUtils;->checkOffsetAndCount(III)V

    .line 3
    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :goto_0
    if-lez p3, :cond_1

    .line 9
    .line 10
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Landroid/system/Os;->write(Ljava/io/FileDescriptor;[BII)I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    sub-int/2addr p3, v0

    .line 15
    add-int/2addr p2, v0

    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance p1, Ljava/io/IOException;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    return-void
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
.end method


# virtual methods
.method public forceClose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mTarget:Ljava/io/FileDescriptor;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/FileBridge;->closeQuietly(Ljava/io/FileDescriptor;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mServer:Ljava/io/FileDescriptor;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/FileBridge;->closeQuietly(Ljava/io/FileDescriptor;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mClient:Ljava/io/FileDescriptor;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/FileBridge;->closeQuietly(Ljava/io/FileDescriptor;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mClosed:Z

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getClientSocket()Ljava/io/FileDescriptor;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mClient:Ljava/io/FileDescriptor;

    return-object v0
.end method

.method public isClosed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mClosed:Z

    return v0
.end method

.method public run()V
    .locals 7

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mServer:Ljava/io/FileDescriptor;

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v2, v1, v4, v3}, Lcom/lody/virtual/server/pm/installer/FileBridge;->read(Ljava/io/FileDescriptor;[BII)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ne v2, v3, :cond_4

    .line 15
    .line 16
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 17
    .line 18
    invoke-static {v1, v4, v2}, Lcom/lody/virtual/helper/utils/FileUtils;->peekInt([BILjava/nio/ByteOrder;)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x1

    .line 23
    if-ne v5, v6, :cond_2

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    invoke-static {v1, v3, v2}, Lcom/lody/virtual/helper/utils/FileUtils;->peekInt([BILjava/nio/ByteOrder;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_1
    if-lez v2, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mServer:Ljava/io/FileDescriptor;

    .line 33
    .line 34
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v3, v1, v4, v5}, Lcom/lody/virtual/server/pm/installer/FileBridge;->read(Ljava/io/FileDescriptor;[BII)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v5, -0x1

    .line 43
    if-eq v3, v5, :cond_1

    .line 44
    .line 45
    iget-object v5, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mTarget:Ljava/io/FileDescriptor;

    .line 46
    .line 47
    invoke-static {v5, v1, v4, v3}, Lcom/lody/virtual/server/pm/installer/FileBridge;->write(Ljava/io/FileDescriptor;[BII)V

    .line 48
    .line 49
    .line 50
    sub-int/2addr v2, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v3, "Unexpected EOF; still expected "

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, " bytes"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    const/4 v2, 0x2

    .line 81
    if-ne v5, v2, :cond_3

    .line 82
    .line 83
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mTarget:Ljava/io/FileDescriptor;

    .line 84
    .line 85
    invoke-static {v2}, Landroid/system/Os;->fsync(Ljava/io/FileDescriptor;)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mServer:Ljava/io/FileDescriptor;

    .line 89
    .line 90
    invoke-static {v2, v1, v4, v3}, Lcom/lody/virtual/server/pm/installer/FileBridge;->write(Ljava/io/FileDescriptor;[BII)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/4 v2, 0x3

    .line 95
    if-ne v5, v2, :cond_0

    .line 96
    .line 97
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mTarget:Ljava/io/FileDescriptor;

    .line 98
    .line 99
    invoke-static {v0}, Landroid/system/Os;->fsync(Ljava/io/FileDescriptor;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mTarget:Ljava/io/FileDescriptor;

    .line 103
    .line 104
    invoke-static {v0}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V

    .line 105
    .line 106
    .line 107
    iput-boolean v6, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mClosed:Z

    .line 108
    .line 109
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mServer:Ljava/io/FileDescriptor;

    .line 110
    .line 111
    invoke-static {v0, v1, v4, v3}, Lcom/lody/virtual/server/pm/installer/FileBridge;->write(Ljava/io/FileDescriptor;[BII)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/installer/FileBridge;->forceClose()V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_5

    .line 120
    :catch_0
    move-exception v0

    .line 121
    goto :goto_3

    .line 122
    :catch_1
    move-exception v0

    .line 123
    :goto_3
    :try_start_1
    const-string v1, "FileBridge"

    .line 124
    .line 125
    const-string v2, "Failed during bridge"

    .line 126
    .line 127
    invoke-static {v1, v2, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :goto_4
    return-void

    .line 132
    :goto_5
    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/installer/FileBridge;->forceClose()V

    .line 133
    .line 134
    .line 135
    throw v0
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
.end method

.method public setTargetFile(Ljava/io/FileDescriptor;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/FileBridge;->mTarget:Ljava/io/FileDescriptor;

    return-void
.end method
