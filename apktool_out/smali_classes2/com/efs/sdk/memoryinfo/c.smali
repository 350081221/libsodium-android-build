.class final Lcom/efs/sdk/memoryinfo/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final activity:Ljava/lang/String;

.field final bg:Ljava/lang/String;

.field final n:J

.field final o:J

.field final p:J

.field final q:J

.field final r:F

.field final s:J

.field final t:J


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    const-string v1, "activity"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/app/ActivityManager;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    new-array v2, v2, [I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput v1, v2, v3

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Landroid/app/ActivityManager;->getProcessMemoryInfo([I)[Landroid/os/Debug$MemoryInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    array-length v1, p1

    .line 32
    if-lez v1, :cond_0

    .line 33
    .line 34
    aget-object p1, p1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    move-object v0, p1

    .line 37
    :catchall_0
    :cond_0
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Landroid/os/Debug$MemoryInfo;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/os/Debug$MemoryInfo;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Landroid/os/Debug;->getMemoryInfo(Landroid/os/Debug$MemoryInfo;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-static {}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitor;->get()Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;->isForeground()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    const-string p1, "fg"

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const-string p1, "bg"

    .line 61
    .line 62
    :goto_0
    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/c;->bg:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/os/Debug$MemoryInfo;->getTotalPss()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    int-to-long v1, p1

    .line 69
    const-wide/16 v3, 0x400

    .line 70
    .line 71
    mul-long/2addr v1, v3

    .line 72
    iput-wide v1, p0, Lcom/efs/sdk/memoryinfo/c;->n:J

    .line 73
    .line 74
    iget p1, v0, Landroid/os/Debug$MemoryInfo;->dalvikPss:I

    .line 75
    .line 76
    int-to-long v1, p1

    .line 77
    mul-long/2addr v1, v3

    .line 78
    iput-wide v1, p0, Lcom/efs/sdk/memoryinfo/c;->o:J

    .line 79
    .line 80
    iget p1, v0, Landroid/os/Debug$MemoryInfo;->nativePss:I

    .line 81
    .line 82
    int-to-long v1, p1

    .line 83
    mul-long/2addr v1, v3

    .line 84
    iput-wide v1, p0, Lcom/efs/sdk/memoryinfo/c;->p:J

    .line 85
    .line 86
    invoke-static {v0}, Lcom/efs/sdk/memoryinfo/f;->a(Landroid/os/Debug$MemoryInfo;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    mul-long/2addr v0, v3

    .line 91
    iput-wide v0, p0, Lcom/efs/sdk/memoryinfo/c;->s:J

    .line 92
    .line 93
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Runtime;->totalMemory()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Runtime;->freeMemory()J

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    sub-long/2addr v0, v5

    .line 110
    iput-wide v0, p0, Lcom/efs/sdk/memoryinfo/c;->q:J

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Runtime;->maxMemory()J

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    const-wide/16 v7, 0x0

    .line 121
    .line 122
    cmp-long p1, v5, v7

    .line 123
    .line 124
    const/high16 v2, 0x3f800000    # 1.0f

    .line 125
    .line 126
    if-eqz p1, :cond_3

    .line 127
    .line 128
    long-to-float p1, v0

    .line 129
    mul-float/2addr p1, v2

    .line 130
    long-to-float v0, v5

    .line 131
    div-float/2addr p1, v0

    .line 132
    iput p1, p0, Lcom/efs/sdk/memoryinfo/c;->r:F

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    iput v2, p0, Lcom/efs/sdk/memoryinfo/c;->r:F

    .line 136
    .line 137
    :goto_1
    invoke-static {}, Lcom/efs/sdk/memoryinfo/f;->a()J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    mul-long/2addr v0, v3

    .line 142
    iput-wide v0, p0, Lcom/efs/sdk/memoryinfo/c;->t:J

    .line 143
    .line 144
    invoke-static {}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitor;->get()Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-interface {p1}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;->getCurrentActivity()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/c;->activity:Ljava/lang/String;

    .line 153
    .line 154
    return-void
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
