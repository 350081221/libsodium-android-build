.class public Lcom/efs/sdk/h5pagesdk/H5Manager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "H5Manager"

.field private static g:Lcom/efs/sdk/base/EfsReporter; = null

.field private static h:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger; = null

.field public static isDebug:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getH5ConfigMananger()Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;
    .locals 1

    sget-object v0, Lcom/efs/sdk/h5pagesdk/H5Manager;->h:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    return-object v0
.end method

.method public static getReporter()Lcom/efs/sdk/base/EfsReporter;
    .locals 1

    sget-object v0, Lcom/efs/sdk/h5pagesdk/H5Manager;->g:Lcom/efs/sdk/base/EfsReporter;

    return-object v0
.end method

.method public static init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sput-object p1, Lcom/efs/sdk/h5pagesdk/H5Manager;->g:Lcom/efs/sdk/base/EfsReporter;

    .line 7
    .line 8
    new-instance v0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/efs/sdk/h5pagesdk/H5Manager;->h:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    :goto_0
    const-string p0, "H5Manager"

    .line 17
    .line 18
    const-string p1, "init H5 manager error! parameter is null!"

    .line 19
    .line 20
    invoke-static {p0, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public static setWebView(Landroid/view/View;)V
    .locals 10

    .line 1
    const-string v0, "H5Manager"

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    sget-object v1, Lcom/efs/sdk/h5pagesdk/H5Manager;->h:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->isH5TracerEnable()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-boolean p0, Lcom/efs/sdk/h5pagesdk/H5Manager;->isDebug:Z

    .line 23
    .line 24
    if-eqz p0, :cond_4

    .line 25
    .line 26
    new-instance p0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string/jumbo v1, "\u672a\u6ce8\u5165JavascriptInterface\uff1aH5\u547d\u4e2d\u72b6\u6001="

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Lcom/efs/sdk/h5pagesdk/H5Manager;->h:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->isH5TracerEnable()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "; \u96c6\u6210\u6d4b\u8bd5\u72b6\u6001="

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {v0, p0}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    :goto_0
    new-instance v0, Lcom/efs/sdk/h5pagesdk/UApmJSBridge;

    .line 64
    .line 65
    invoke-direct {v0}, Lcom/efs/sdk/h5pagesdk/UApmJSBridge;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v1, "UAPM_JSBridge"

    .line 69
    .line 70
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    const/4 v3, 0x1

    .line 75
    const/4 v4, 0x0

    .line 76
    :try_start_1
    const-string v5, "getSettings"

    .line 77
    .line 78
    new-array v6, v4, [Ljava/lang/Class;

    .line 79
    .line 80
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-array v6, v4, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const-string v7, "setJavaScriptEnabled"

    .line 97
    .line 98
    new-array v8, v3, [Ljava/lang/Class;

    .line 99
    .line 100
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 101
    .line 102
    aput-object v9, v8, v4

    .line 103
    .line 104
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    new-array v7, v3, [Ljava/lang/Object;

    .line 109
    .line 110
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 111
    .line 112
    aput-object v8, v7, v4

    .line 113
    .line 114
    invoke-virtual {v6, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    :catchall_0
    :cond_2
    :try_start_2
    const-string v5, "addJavascriptInterface"

    .line 118
    .line 119
    const/4 v6, 0x2

    .line 120
    new-array v7, v6, [Ljava/lang/Class;

    .line 121
    .line 122
    const-class v8, Ljava/lang/Object;

    .line 123
    .line 124
    aput-object v8, v7, v4

    .line 125
    .line 126
    const-class v8, Ljava/lang/String;

    .line 127
    .line 128
    aput-object v8, v7, v3

    .line 129
    .line 130
    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    new-array v5, v6, [Ljava/lang/Object;

    .line 135
    .line 136
    aput-object v0, v5, v4

    .line 137
    .line 138
    aput-object v1, v5, v3

    .line 139
    .line 140
    invoke-virtual {v2, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 141
    .line 142
    .line 143
    :catchall_1
    return-void

    .line 144
    :cond_3
    sget-boolean p0, Lcom/efs/sdk/h5pagesdk/H5Manager;->isDebug:Z

    .line 145
    .line 146
    if-eqz p0, :cond_4

    .line 147
    .line 148
    const-string/jumbo p0, "webView\u4e3anull\uff0c\u6216H5\u529f\u80fd\u672a\u521d\u59cb\u5316\u5b8c\u6210"

    .line 149
    .line 150
    .line 151
    invoke-static {v0, p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_4
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
