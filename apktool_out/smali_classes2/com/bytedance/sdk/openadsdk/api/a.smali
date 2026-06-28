.class public abstract Lcom/bytedance/sdk/openadsdk/api/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/api/a$a;,
        Lcom/bytedance/sdk/openadsdk/api/a$b;,
        Lcom/bytedance/sdk/openadsdk/api/a$e;,
        Lcom/bytedance/sdk/openadsdk/api/a$c;,
        Lcom/bytedance/sdk/openadsdk/api/a$d;
    }
.end annotation


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/a/c;->a()Lcom/bytedance/sdk/openadsdk/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/a;->c()Lcom/bytedance/sdk/openadsdk/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/a/c;->a(Lcom/bytedance/sdk/openadsdk/a/b;)V

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/a;->a:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    .line 4
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/c/a/c/a;->a(Lcom/bytedance/sdk/openadsdk/AdConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p3

    invoke-static {p3}, Lcom/bykv/a/a/a/a/b;->j(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/b;

    move-result-object p3

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p3, v2, v0, v1}, Lcom/bykv/a/a/a/a/b;->f(IJ)Lcom/bykv/a/a/a/a/b;

    const/4 v0, 0x5

    const-string v1, "main"

    .line 6
    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p3, v0, v2}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    const/4 v0, 0x6

    const/16 v1, 0x3e7

    .line 8
    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    const/16 v0, 0xa

    const/16 v1, 0x190f

    .line 9
    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    const/16 v0, 0xb

    const-string v1, "6.4.1.5"

    .line 10
    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    const/16 v0, 0xc

    const-string v1, "com.byted.pangle"

    .line 11
    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    const/16 v0, 0xe

    const/4 v1, 0x0

    .line 12
    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    const/16 v0, 0x10

    .line 13
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/a/c;->a()Lcom/bytedance/sdk/openadsdk/a/c;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    .line 16
    invoke-virtual {p3, v3, v1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->getPriority()I

    move-result v0

    const/4 v1, 0x3

    .line 18
    invoke-virtual {p3, v1, v0}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 19
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/api/a$d;-><init>(Lcom/bytedance/sdk/openadsdk/api/a;Lcom/bytedance/sdk/openadsdk/api/a$1;)V

    const/16 v1, 0xf

    invoke-virtual {p3, v1, v0}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 20
    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitCLassLoader;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitCLassLoader;-><init>()V

    const/16 v1, 0x206d

    invoke-virtual {p3, v1, v0}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 21
    instance-of v0, p2, Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    if-eqz v0, :cond_1

    .line 22
    move-object v0, p2

    check-cast v0, Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    .line 23
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationTTLiveTokenInjectionAuthImpl;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig;->getInjectionAuth()Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationTTLiveTokenInjectionAuthImpl;-><init>(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)V

    const/16 v0, 0x207e

    invoke-virtual {p3, v0, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    :cond_1
    if-eqz p2, :cond_2

    .line 24
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isDebug()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->setDebug(Ljava/lang/Boolean;)V

    .line 25
    :cond_2
    invoke-virtual {p0, p1, p3}, Lcom/bytedance/sdk/openadsdk/api/a;->a(Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 26
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/e/a;->a()Lcom/bytedance/sdk/openadsdk/e/a;

    move-result-object p2

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/bytedance/sdk/openadsdk/api/a$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/a;Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)V

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Ljava/lang/Runnable;)V

    .line 27
    :cond_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/a;->b()Lcom/bytedance/sdk/openadsdk/api/a$c;

    move-result-object p1

    .line 28
    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Z)V

    return-void
.end method

.method protected a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    const-string v0, "_tt_ad_sdk_"

    const-string/jumbo v1, "update manager"

    .line 29
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/a;->b()Lcom/bytedance/sdk/openadsdk/api/a$c;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bykv/vk/openvk/api/proto/Manager;)V

    .line 31
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/a;->b()Lcom/bytedance/sdk/openadsdk/api/a$c;

    move-result-object p1

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/a/c;->a()Lcom/bytedance/sdk/openadsdk/a/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/a$c;->register(Ljava/lang/Object;)V

    return-void
.end method

.method protected a(Lcom/bykv/vk/openvk/api/proto/Result;)V
    .locals 0

    return-void
.end method

.method public abstract a()Z
.end method

.method public abstract a(Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)Z
.end method

.method public abstract b()Lcom/bytedance/sdk/openadsdk/api/a$c;
.end method

.method public abstract b(Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)V
.end method

.method protected b(Lcom/bykv/vk/openvk/api/proto/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a;->a(Lcom/bykv/vk/openvk/api/proto/Result;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->isSuccess()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "_tt_ad_sdk_"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string p1, "init sdk success "

    .line 13
    .line 14
    invoke-static {v1, p1}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a;->a:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;->success()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "int sdk failed, code: "

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, ", message: "

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a;->a:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const-string p1, ""

    .line 81
    .line 82
    :goto_0
    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;->fail(ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a;->a:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    .line 87
    .line 88
    return-void
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

.method protected b(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected abstract c()Lcom/bytedance/sdk/openadsdk/a/b;
.end method
