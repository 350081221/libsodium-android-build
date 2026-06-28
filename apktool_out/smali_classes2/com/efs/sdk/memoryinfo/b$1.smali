.class final Lcom/efs/sdk/memoryinfo/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/observer/IConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/memoryinfo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/efs/sdk/memoryinfo/b;


# direct methods
.method constructor <init>(Lcom/efs/sdk/memoryinfo/b;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/b$1;->c:Lcom/efs/sdk/memoryinfo/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChange(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$1;->c:Lcom/efs/sdk/memoryinfo/b;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/efs/sdk/memoryinfo/b;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "apm_memperf_sampling_rate"

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    const/16 v2, 0x64

    .line 29
    .line 30
    if-ne v0, v2, :cond_2

    .line 31
    .line 32
    :goto_0
    move v0, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    new-instance v3, Ljava/util/Random;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/util/Random;->nextInt(I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-gt v2, v0, :cond_4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    const/4 v0, 0x0

    .line 54
    :goto_1
    if-nez v0, :cond_5

    .line 55
    .line 56
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_5

    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    const-string v0, "apm_memperf_collect_interval"

    .line 64
    .line 65
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    return-void

    .line 72
    :cond_6
    const-string v2, "apm_memperf_collect_max_period_sec"

    .line 73
    .line 74
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-nez p1, :cond_7

    .line 79
    .line 80
    return-void

    .line 81
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    new-instance v2, Landroid/os/HandlerThread;

    .line 98
    .line 99
    const-string v3, "mem-info"

    .line 100
    .line 101
    invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 105
    .line 106
    .line 107
    new-instance v3, Lcom/efs/sdk/memoryinfo/b$1$1;

    .line 108
    .line 109
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-direct {v3, p0, v4, v2}, Lcom/efs/sdk/memoryinfo/b$1$1;-><init>(Lcom/efs/sdk/memoryinfo/b$1;Landroid/os/Looper;Landroid/os/HandlerThread;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, Lcom/efs/sdk/memoryinfo/b$1$2;

    .line 117
    .line 118
    invoke-direct {v2, p0, v3, v0, p1}, Lcom/efs/sdk/memoryinfo/b$1$2;-><init>(Lcom/efs/sdk/memoryinfo/b$1;Landroid/os/Handler;II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/efs/sdk/memoryinfo/b$1;->c:Lcom/efs/sdk/memoryinfo/b;

    .line 125
    .line 126
    iput-boolean v1, p1, Lcom/efs/sdk/memoryinfo/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    return-void

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    const-string v0, "collect "

    .line 131
    .line 132
    invoke-static {v0, p1}, Lcom/efs/sdk/memoryinfo/f;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
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
