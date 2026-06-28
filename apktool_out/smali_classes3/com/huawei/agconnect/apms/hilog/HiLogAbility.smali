.class public Lcom/huawei/agconnect/apms/hilog/HiLogAbility;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final def:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:J

.field public final bcd:Landroid/os/HandlerThread;

.field public final cde:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const-string v0, "hilog"

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    .line 7
    .line 8
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->initNative(Ljava/lang/String;ILjava/lang/String;Z)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iput-wide p1, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    sget-object p2, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 17
    .line 18
    const-string p3, "HiLogAbility"

    .line 19
    .line 20
    invoke-interface {p2, p3, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-wide p1, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    .line 24
    .line 25
    cmp-long p1, p1, v0

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    sget-object p1, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 30
    .line 31
    const-string p2, "HiLogAbility HiLog init fail"

    .line 32
    .line 33
    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    new-instance p1, Landroid/os/HandlerThread;

    .line 37
    .line 38
    const-string p2, "hilog"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->bcd:Landroid/os/HandlerThread;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 46
    .line 47
    .line 48
    new-instance p2, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde:Landroid/os/Handler;

    .line 58
    .line 59
    return-void
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

.method public static synthetic a(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde()V

    return-void
.end method

.method public static synthetic b(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def()V

    return-void
.end method

.method private synthetic cde()V
    .locals 3

    .line 1
    :try_start_0
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->flushAsyncNative(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    sget-object v1, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "HiLogAbility"

    invoke-interface {v1, v2, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic cde(Ljava/lang/String;)V
    .locals 2

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->changeLogPathNative(JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    sget-object v0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "HiLogAbility"

    invoke-interface {v0, v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic def()V
    .locals 3

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->releaseNative(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    sget-object v1, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "HiLogAbility"

    invoke-interface {v1, v2, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->bcd:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    return-void
.end method

.method private synthetic def(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->writeNative(JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    sget-object v0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "HiLogAbility"

    invoke-interface {v0, v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static native enableDebugNative()V
.end method

.method public static native initNative(Ljava/lang/String;ILjava/lang/String;Z)J
.end method


# virtual methods
.method public abc()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde:Landroid/os/Handler;

    new-instance v1, Lt1/c;

    invoke-direct {v1, p0}, Lt1/c;-><init>(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public abc(Ljava/lang/String;)V
    .locals 4

    .line 3
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde:Landroid/os/Handler;

    new-instance v1, Lt1/a;

    invoke-direct {v1, p0, p1}, Lt1/a;-><init>(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public bcd()V
    .locals 4

    .line 3
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde:Landroid/os/Handler;

    new-instance v1, Lt1/b;

    invoke-direct {v1, p0}, Lt1/b;-><init>(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public bcd(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->cde:Landroid/os/Handler;

    new-instance v1, Lt1/d;

    invoke-direct {v1, p0, p1}, Lt1/d;-><init>(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final native changeLogPathNative(JLjava/lang/String;)V
.end method

.method public final native flushAsyncNative(J)V
.end method

.method public final native releaseNative(J)V
.end method

.method public final native writeNative(JLjava/lang/String;)V
.end method
