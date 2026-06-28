.class public Lcom/bytedance/tools/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Z = false

.field private static volatile b:Ljava/lang/String;

.field private static c:Lcom/bytedance/tools/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "com.byted.live.lite"

    .line 2
    .line 3
    const-string v1, "com.byted.pangle"

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "app_name"

    .line 11
    .line 12
    sget-object v4, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    const-string v3, "app_id"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-static {v4}, Lcom/bytedance/tools/b/b;->g(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    const-string v3, "device"

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    invoke-static {v4}, Lcom/bytedance/tools/b/b;->g(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v3, "os_api"

    .line 42
    .line 43
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    const-string v3, "os_version"

    .line 53
    .line 54
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    const-string v3, "manufacturer"

    .line 60
    .line 61
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    const-string v3, "imei"

    .line 67
    .line 68
    const/4 v4, 0x6

    .line 69
    invoke-static {v4}, Lcom/bytedance/tools/b/b;->g(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string v3, "oaid"

    .line 77
    .line 78
    const/4 v4, 0x7

    .line 79
    invoke-static {v4}, Lcom/bytedance/tools/b/b;->g(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    const-string v3, "android_id"

    .line 87
    .line 88
    const/16 v4, 0x9

    .line 89
    .line 90
    invoke-static {v4}, Lcom/bytedance/tools/b/b;->g(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    const-string v3, "did"

    .line 98
    .line 99
    const/16 v4, 0x10

    .line 100
    .line 101
    invoke-static {v4}, Lcom/bytedance/tools/b/b;->a(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    const-string v3, "sdk_version"

    .line 109
    .line 110
    invoke-static {v1}, Lcom/bytedance/tools/d/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v3, "sdk_api_version"

    .line 118
    .line 119
    invoke-static {v1}, Lcom/bytedance/tools/d/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    const-string v1, "live_sdk_version"

    .line 127
    .line 128
    invoke-static {v0}, Lcom/bytedance/tools/d/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    const-string v1, "live_sdk_api_version"

    .line 136
    .line 137
    invoke-static {v0}, Lcom/bytedance/tools/d/h;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    const-string v0, "msg"

    .line 145
    .line 146
    invoke-virtual {v2, v0, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 147
    .line 148
    .line 149
    const-string v0, "recordId"

    .line 150
    .line 151
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    .line 153
    .line 154
    invoke-static {v2}, Lcom/bytedance/tools/d/b;->e(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    return-object p0

    .line 163
    :catch_0
    move-exception p1

    .line 164
    const-string v0, "TT_TOOLS"

    .line 165
    .line 166
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 167
    .line 168
    .line 169
    return-object p0
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
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "TT_TOOLS"

    .line 2
    .line 3
    :try_start_0
    sget-boolean v1, Lcom/bytedance/tools/b/b;->a:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/bytedance/tools/b/b;->h(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sput-boolean p0, Lcom/bytedance/tools/b/b;->a:Z

    .line 12
    .line 13
    :cond_0
    sget-boolean p0, Lcom/bytedance/tools/b/b;->a:Z

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-string p0, "init clog failed"

    .line 18
    .line 19
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {}, Lcom/bytedance/tools/b/b;->i()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    sput-boolean p0, Lcom/bytedance/tools/b/b;->a:Z

    .line 28
    .line 29
    const-string p0, "init tool log success!"

    .line 30
    .line 31
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p0

    .line 36
    const/4 v1, 0x0

    .line 37
    sput-boolean v1, Lcom/bytedance/tools/b/b;->a:Z

    .line 38
    .line 39
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 40
    .line 41
    .line 42
    :goto_0
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

.method public static d(Lm1/a$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/tools/b/b;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v2, ".zip"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lcom/bytedance/tools/d/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/4 p1, -0x1

    .line 27
    const-string/jumbo p2, "zip file failed!"

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, p2}, Lm1/a$a;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v1, Lm1/a;

    .line 35
    .line 36
    invoke-direct {v1}, Lm1/a;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lcom/bytedance/tools/b/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance p2, Lcom/bytedance/tools/b/b$a;

    .line 44
    .line 45
    invoke-direct {p2, p0, v0}, Lcom/bytedance/tools/b/b$a;-><init>(Lm1/a$a;Ljava/io/File;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0, p1, p2}, Lm1/a;->d(Ljava/io/File;Ljava/lang/String;Lm1/a$a;)V

    .line 49
    .line 50
    .line 51
    return-void
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

.method public static e()Z
    .locals 1

    sget-boolean v0, Lcom/bytedance/tools/b/b;->a:Z

    return v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/bytedance/tools/b/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method private static g(I)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/bytedance/tools/d/c;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static h(Landroid/content/Context;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "init clog logBaseDir: "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "TT_TOOLS"

    .line 36
    .line 37
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v4, "init clog cacheBaseDir: "

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, "/tool_log"

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sput-object v2, Lcom/bytedance/tools/b/b;->b:Ljava/lang/String;

    .line 78
    .line 79
    new-instance v2, Lcom/a/a/a/b$b;

    .line 80
    .line 81
    invoke-direct {v2, p0}, Lcom/a/a/a/b$b;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v2, p0}, Lcom/a/a/a/b$b;->b(Ljava/lang/String;)Lcom/a/a/a/b$b;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object v0, Lcom/bytedance/tools/b/b;->b:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Lcom/a/a/a/b$b;->f(Ljava/lang/String;)Lcom/a/a/a/b$b;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const/4 v0, 0x1

    .line 110
    invoke-virtual {p0, v0}, Lcom/a/a/a/b$b;->c(Z)Lcom/a/a/a/b$b;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0, v0}, Lcom/a/a/a/b$b;->g(Z)Lcom/a/a/a/b$b;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const/4 v1, 0x2

    .line 119
    invoke-virtual {p0, v1}, Lcom/a/a/a/b$b;->j(I)Lcom/a/a/a/b$b;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    const/4 v1, 0x7

    .line 124
    invoke-virtual {p0, v1}, Lcom/a/a/a/b$b;->a(I)Lcom/a/a/a/b$b;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    const/high16 v1, 0x2800000

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lcom/a/a/a/b$b;->e(I)Lcom/a/a/a/b$b;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    const/high16 v1, 0x500000

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Lcom/a/a/a/b$b;->h(I)Lcom/a/a/a/b$b;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0, v0}, Lcom/a/a/a/b$b;->i(Z)Lcom/a/a/a/b$b;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Lcom/a/a/a/b$b;->d()Lcom/a/a/a/b;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lcom/a/a/a/a;->k(Lcom/a/a/a/b;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    return p0
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

.method private static i()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const-string v0, "com.byted.pangle"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/tools/d/h;->a(Ljava/lang/String;)Ljava/lang/ClassLoader;

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
    :try_start_0
    new-instance v1, Lcom/bytedance/tools/b/c;

    .line 11
    .line 12
    sget-object v2, Lcom/bytedance/tools/b/b;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lcom/bytedance/tools/b/c;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/bytedance/tools/b/b;->c:Lcom/bytedance/tools/b/c;

    .line 18
    .line 19
    const-string v1, "com.bytedance.sdk.openadsdk.tools.LogAdapter"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string/jumbo v1, "zzz"

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    new-array v3, v2, [Ljava/lang/Class;

    .line 30
    .line 31
    const-class v4, Lcom/bytedance/sdk/openadsdk/api/TTILog;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    aput-object v4, v3, v5

    .line 35
    .line 36
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 41
    .line 42
    .line 43
    new-array v1, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    sget-object v2, Lcom/bytedance/tools/b/b;->c:Lcom/bytedance/tools/b/c;

    .line 46
    .line 47
    aput-object v2, v1, v5

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void
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
