.class public final Lcom/bytedance/sdk/openadsdk/TTAdSdk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/TTAdSdk$Callback;,
        Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;
    }
.end annotation


# static fields
.field public static final BRANCH:Ljava/lang/String; = ""

.field public static final BUILT_IN_PLUGIN_NAME:Ljava/lang/String; = "com.byted.pangle"

.field public static final C_H:Ljava/lang/String; = "b769000eae"

.field public static final EXT_API_VERSION_CODE:I = 0x3e7

.field public static final INCLUDE_LIVE:Z = true

.field public static final INITIALIZER_CLASS_NAME:Ljava/lang/String; = "com.bytedance.sdk.openadsdk.core.AdSdkInitializerHolder"

.field public static final IS_BOOST:Z = false

.field public static final IS_P:Z = true

.field public static final LIVE_PLUGIN_PACKAGE_NAME:Ljava/lang/String; = "com.byted.live.lite"

.field public static final ONLY_API:Z = false

.field public static final SDK_VERSION_CODE:I = 0x190f

.field public static final SDK_VERSION_NAME:Ljava/lang/String; = "6.4.1.5"

.field public static final S_C:Ljava/lang/String; = "main"

.field private static final a:Lcom/bytedance/sdk/openadsdk/api/a;

.field private static volatile b:Lcom/bytedance/sdk/openadsdk/TTAdConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/f;-><init>()V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/TTAdConfig;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/api/c;->a()V

    .line 3
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_1

    const-string v0, "Wrong Thread ! Please exec TTAdSdk.init in main thread."

    .line 4
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/c;->a(Ljava/lang/String;)V

    :cond_1
    const-string v0, "Context is null, please check."

    .line 5
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "TTAdConfig is null, please check."

    .line 6
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->setContext(Landroid/content/Context;)V

    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->updateConfigAuth(Lcom/bytedance/sdk/openadsdk/TTAdConfig;)V

    return-void
.end method

.method private static a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;
    .locals 1

    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/a;->b()Lcom/bytedance/sdk/openadsdk/api/a$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/IMediationManager;
    .locals 1

    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->getInstance()Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/IMediationManager;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static init(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/TTAdConfig;)Z
    .locals 0

    .line 1
    sput-object p1, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->b:Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    .line 2
    .line 3
    sget-object p1, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->b:Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/TTAdConfig;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
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
.end method

.method public static isInitSuccess()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/a;->a()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isOnePointFiveAdType(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)Z
    .locals 2

    .line 1
    const-string v0, "_tt_ad_type_onepointfive"

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->getMediaExtraInfo()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return p0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0
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

.method public static isSdkReady()Z
    .locals 1

    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/a;->a()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static start(Lcom/bytedance/sdk/openadsdk/TTAdSdk$Callback;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->b:Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    .line 2
    .line 3
    const-string v1, "TTAdConfig is null, please exec TTAdSdk.init before TTAdSdk.start."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x1004

    .line 13
    .line 14
    const-string v1, "Load initializer failed"

    .line 15
    .line 16
    invoke-interface {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;->fail(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->b:Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, p0}, Lcom/bytedance/sdk/openadsdk/api/a;->a(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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
.end method

.method public static updateAdConfig(Lcom/bytedance/sdk/openadsdk/TTAdConfig;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/a;->b()Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getData()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    const-string v2, "extra_data"

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getData()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getKeywords()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    const-string v2, "keywords"

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getKeywords()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    const-class v2, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 67
    .line 68
    invoke-interface {v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/IMediationManager;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/IMediationManager;->updatePrivacyConfig(Lcom/bytedance/sdk/openadsdk/TTCustomController;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getInitExtra()Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getInitExtra()Ljava/util/Map;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-interface {v0, p0}, Lcom/bytedance/sdk/openadsdk/mediation/IMediationManager;->updateLocalExtra(Ljava/util/Map;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    return-void
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

.method public static updateConfigAuth(Lcom/bytedance/sdk/openadsdk/TTAdConfig;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/live/c;->a()Lcom/bytedance/sdk/openadsdk/live/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig;->getInjectionAuth()Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/CSJConfig;->getInitExtra()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    const-string v0, "live_init"

    .line 22
    .line 23
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    instance-of v0, p0, Ljava/util/Map;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/live/c;->a()Lcom/bytedance/sdk/openadsdk/live/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast p0, Ljava/util/Map;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
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

.method public static updatePaid(Z)V
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/a;->b()Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "is_paid"

    .line 16
    .line 17
    invoke-virtual {v1, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    const-class p0, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 31
    .line 32
    invoke-interface {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
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
