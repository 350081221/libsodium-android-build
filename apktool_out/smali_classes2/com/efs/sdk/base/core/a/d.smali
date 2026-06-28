.class public final Lcom/efs/sdk/base/core/a/d;
.super Lcom/efs/sdk/base/http/AbsHttpListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/core/a/d$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/efs/sdk/base/http/AbsHttpListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/core/a/d;-><init>()V

    return-void
.end method

.method public static a()Lcom/efs/sdk/base/core/a/d;
    .locals 1

    .line 6
    invoke-static {}, Lcom/efs/sdk/base/core/a/d$a;->a()Lcom/efs/sdk/base/core/a/d;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/efs/sdk/base/http/HttpResponse;)V
    .locals 2
    .param p0    # Lcom/efs/sdk/base/http/HttpResponse;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string/jumbo v0, "upload result : "

    if-nez p0, :cond_0

    .line 8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "false"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/efs/sdk/base/core/d/d;->succ:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", resp is "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/efs/sdk/base/http/HttpResponse;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v0, "efs.px.api"

    .line 10
    invoke-static {v0, p0}, Lcom/efs/sdk/base/core/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static b(Lcom/efs/sdk/base/http/HttpResponse;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/efs/sdk/base/http/HttpResponse;->getHttpCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lcom/efs/sdk/base/http/HttpResponse;->getBizCode()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/efs/sdk/base/http/HttpResponse;->getReqUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v0, v1, v2, p0}, Lcom/efs/sdk/base/core/f/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static c(Lcom/efs/sdk/base/http/HttpResponse;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    const-string v1, "cver"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, Lcom/efs/sdk/base/core/config/a/c;->d:Lcom/efs/sdk/base/core/config/a/b;

    .line 40
    .line 41
    iget v0, v0, Lcom/efs/sdk/base/core/config/a/b;->a:I

    .line 42
    .line 43
    if-le p0, v0, :cond_2

    .line 44
    .line 45
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, p0}, Lcom/efs/sdk/base/core/config/a/c;->a(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
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


# virtual methods
.method public final synthetic a(Lcom/efs/sdk/base/core/util/concurrent/c;Ljava/lang/Object;)V
    .locals 2
    .param p1    # Lcom/efs/sdk/base/core/util/concurrent/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/efs/sdk/base/http/HttpResponse;

    if-eqz p2, :cond_0

    .line 2
    check-cast p1, Lcom/efs/sdk/base/core/util/a/b;

    .line 3
    iget-object v0, p2, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p1, Lcom/efs/sdk/base/core/util/a/b;->f:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 4
    iget-object p1, p1, Lcom/efs/sdk/base/core/util/a/b;->f:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 5
    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    invoke-static {p2}, Lcom/efs/sdk/base/core/a/a;->a(Lcom/efs/sdk/base/http/HttpResponse;)V

    :cond_0
    return-void
.end method

.method public final onError(Lcom/efs/sdk/base/http/HttpResponse;)V
    .locals 0
    .param p1    # Lcom/efs/sdk/base/http/HttpResponse;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/efs/sdk/base/core/a/d;->a(Lcom/efs/sdk/base/http/HttpResponse;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/efs/sdk/base/core/a/d;->b(Lcom/efs/sdk/base/http/HttpResponse;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/efs/sdk/base/core/a/d;->c(Lcom/efs/sdk/base/http/HttpResponse;)V

    .line 11
    .line 12
    .line 13
    return-void
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
    .line 24
.end method

.method public final onSuccess(Lcom/efs/sdk/base/http/HttpResponse;)V
    .locals 5
    .param p1    # Lcom/efs/sdk/base/http/HttpResponse;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p1, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    const-string v1, "flow_limit"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p1, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    :cond_0
    iget-object v0, p1, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/Map;

    .line 36
    .line 37
    const-string/jumbo v1, "type"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p1, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v0, ""

    .line 58
    .line 59
    :goto_0
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/util/Map;

    .line 62
    .line 63
    const-string v2, "size"

    .line 64
    .line 65
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v3, 0x0

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/d;->extra:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Ljava/util/Map;

    .line 75
    .line 76
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    move v1, v3

    .line 94
    :goto_1
    invoke-static {}, Lcom/efs/sdk/base/core/c/b;->a()Lcom/efs/sdk/base/core/c/b;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput v3, v4, Landroid/os/Message;->what:I

    .line 103
    .line 104
    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 105
    .line 106
    iput v1, v4, Landroid/os/Message;->arg1:I

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 109
    .line 110
    .line 111
    :cond_3
    invoke-static {p1}, Lcom/efs/sdk/base/core/a/d;->b(Lcom/efs/sdk/base/http/HttpResponse;)V

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v0, v0, Lcom/efs/sdk/base/core/f/f;->c:Lcom/efs/sdk/base/core/f/d;

    .line 119
    .line 120
    iget-object v0, v0, Lcom/efs/sdk/base/core/f/d;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Lcom/efs/sdk/base/core/a/d;->c(Lcom/efs/sdk/base/http/HttpResponse;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lcom/efs/sdk/base/core/a/d;->a(Lcom/efs/sdk/base/http/HttpResponse;)V

    .line 129
    .line 130
    .line 131
    return-void
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
