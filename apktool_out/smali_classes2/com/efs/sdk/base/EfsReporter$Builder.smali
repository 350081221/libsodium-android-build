.class public Lcom/efs/sdk/base/EfsReporter$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/base/EfsReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/EfsReporter$Builder$IPublicParams;
    }
.end annotation


# static fields
.field private static sInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/efs/sdk/base/EfsReporter;",
            ">;"
        }
    .end annotation
.end field

.field private static sUseAppContext:Z


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/efs/sdk/base/EfsReporter$Builder;->sInstanceMap:Ljava/util/Map;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Lcom/efs/sdk/base/EfsReporter$Builder;->sUseAppContext:Z

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/efs/sdk/base/EfsReporter$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "efs.reporter.builder"

    .line 3
    iput-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->TAG:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/efs/sdk/base/EfsReporter$Builder;->checkContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 5
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-direct {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 8
    iput-object p1, v0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    .line 9
    invoke-virtual {v0, p2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setAppid(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {p1, p3}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setSecret(Ljava/lang/String;)V

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "EfsReporter init, secret is empty"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "EfsReporter init, appid is empty"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static checkContext(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    sget-boolean v0, Lcom/efs/sdk/base/EfsReporter$Builder;->sUseAppContext:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v0, p0, Landroid/app/Application;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    instance-of v0, p0, Landroid/app/Application;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "Can not get Application context from given context!"

    .line 23
    .line 24
    invoke-static {p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    :goto_0
    return-object p0

    .line 34
    :cond_2
    const-string p0, "context can not be null!"

    .line 35
    .line 36
    invoke-static {p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0
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

.method private checkParam(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/efs/sdk/base/EfsReporter$Builder;->sInstanceMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/efs/sdk/base/EfsReporter;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/efs/sdk/base/EfsReporter;->access$100(Lcom/efs/sdk/base/EfsReporter;)Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p1, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v1, v1, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v1, "efs-core: duplicate init, but "

    .line 26
    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getSecret()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getSecret()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getSecret()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, "secret is different"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->isIntl()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->isIntl()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-ne v0, v2, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getUid()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getUid()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getUid()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_2

    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, " uid is different"

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "efs.reporter.builder"

    .line 145
    .line 146
    invoke-static {v1, v0}, Lcom/efs/sdk/base/core/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_2
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getPublicParamMap()Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_3

    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getPublicParamMap()Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-lez v0, :cond_3

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getPublicParamMap()Ljava/util/Map;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->addPublicParams(Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    :cond_3
    return-void

    .line 185
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    .line 186
    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v1, "intl setting is different"

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p1

    .line 208
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    .line 209
    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v1, "application context is different"

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p1
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


# virtual methods
.method public addEfsReporterObserver(Lcom/efs/sdk/base/observer/IEfsReporterObserver;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->addConfigObserver(Lcom/efs/sdk/base/observer/IEfsReporterObserver;)V

    return-object p0
.end method

.method public build()Lcom/efs/sdk/base/EfsReporter;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getAppid()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/efs/sdk/base/EfsReporter$Builder;->sInstanceMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-class v1, Lcom/efs/sdk/base/EfsReporter;

    .line 18
    .line 19
    monitor-enter v1

    .line 20
    :try_start_0
    sget-object v2, Lcom/efs/sdk/base/EfsReporter$Builder;->sInstanceMap:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Lcom/efs/sdk/base/EfsReporter;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, p0, v3}, Lcom/efs/sdk/base/EfsReporter;-><init>(Lcom/efs/sdk/base/EfsReporter$Builder;Lcom/efs/sdk/base/EfsReporter$1;)V

    .line 32
    .line 33
    .line 34
    sget-object v3, Lcom/efs/sdk/base/EfsReporter$Builder;->sInstanceMap:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    monitor-exit v1

    .line 40
    return-object v2

    .line 41
    :cond_0
    monitor-exit v1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw v0

    .line 46
    :cond_1
    :goto_0
    const-string v1, "efs.reporter.builder"

    .line 47
    .line 48
    const-string v2, "efs-core: duplicate init"

    .line 49
    .line 50
    invoke-static {v1, v2}, Lcom/efs/sdk/base/core/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0}, Lcom/efs/sdk/base/EfsReporter$Builder;->checkParam(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lcom/efs/sdk/base/EfsReporter$Builder;->sInstanceMap:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/efs/sdk/base/EfsReporter;

    .line 63
    .line 64
    return-object v0
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

.method public configRefreshAction(Lcom/efs/sdk/base/IConfigRefreshAction;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1
    .param p1    # Lcom/efs/sdk/base/IConfigRefreshAction;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object p1, v0, Lcom/efs/sdk/base/core/config/a/c;->b:Lcom/efs/sdk/base/IConfigRefreshAction;

    .line 6
    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
    .line 24
.end method

.method public configRefreshDelayMills(J)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    iput-wide p1, v0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->configRefreshDelayMills:J

    return-object p0
.end method

.method public debug(Z)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setDebug(Z)V

    return-object p0
.end method

.method public efsDirRootName(Ljava/lang/String;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 0

    invoke-static {p1}, Lcom/efs/sdk/base/core/util/a;->a(Ljava/lang/String;)V

    return-object p0
.end method

.method public enableSendLog(Z)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setEnableSendLog(Z)V

    return-object p0
.end method

.method public enableWaStat(Z)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setEnableWaStat(Z)V

    return-object p0
.end method

.method public getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    return-object v0
.end method

.method public intl(Z)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setIsIntl(Z)V

    return-object p0
.end method

.method public logEncryptAction(Lcom/efs/sdk/base/processor/action/ILogEncryptAction;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setLogEncryptAction(Lcom/efs/sdk/base/processor/action/ILogEncryptAction;)V

    return-object p0
.end method

.method public maxConcurrentUploadCnt(I)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/c/d;->a()Lcom/efs/sdk/base/core/c/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput p1, v0, Lcom/efs/sdk/base/core/c/d;->a:I

    .line 6
    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
    .line 24
.end method

.method public printLogDetail(Z)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setPrintLogDetail(Z)V

    return-object p0
.end method

.method public publicParams(Lcom/efs/sdk/base/EfsReporter$Builder$IPublicParams;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1
    .param p1    # Lcom/efs/sdk/base/EfsReporter$Builder$IPublicParams;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-interface {p1}, Lcom/efs/sdk/base/EfsReporter$Builder$IPublicParams;->getRecordHeaders()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/efs/sdk/base/EfsReporter$Builder$IPublicParams;->getRecordHeaders()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-interface {p1}, Lcom/efs/sdk/base/EfsReporter$Builder$IPublicParams;->getRecordHeaders()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->addPublicParams(Ljava/util/Map;)V

    :cond_0
    return-object p0
.end method

.method public publicParams(Ljava/util/Map;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/efs/sdk/base/EfsReporter$Builder;"
        }
    .end annotation

    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->addPublicParams(Ljava/util/Map;)V

    :cond_0
    return-object p0
.end method

.method public uid(Ljava/lang/String;)Lcom/efs/sdk/base/EfsReporter$Builder;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/EfsReporter$Builder;->mGlobalEnvStruct:Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->setUid(Ljava/lang/String;)V

    return-object p0
.end method
