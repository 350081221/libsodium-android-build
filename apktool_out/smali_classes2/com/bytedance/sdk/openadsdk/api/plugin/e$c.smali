.class final Lcom/bytedance/sdk/openadsdk/api/plugin/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/EventListener;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "com.byted.pangle"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    :cond_0
    return-void
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


# virtual methods
.method public onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 7

    .line 1
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_5

    .line 7
    .line 8
    const-string p1, "plugin update start"

    .line 9
    .line 10
    const-string v2, "plugin_download"

    .line 11
    .line 12
    invoke-static {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lcom/bykv/vk/openvk/api/proto/Result;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const-string/jumbo p1, "valueSet empty"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_0
    const/4 v4, 0x3

    .line 30
    invoke-interface {p1, v4}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {p2}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-interface {p2}, Lcom/bykv/vk/openvk/api/proto/Result;->isSuccess()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const-string v6, "TTPluginManager"

    .line 43
    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    const-string p1, "plugin update received failed"

    .line 47
    .line 48
    invoke-static {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v6, p1}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4, v5}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_1
    const/4 p2, 0x2

    .line 59
    invoke-interface {p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p2, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v3, "plugin update received: "

    .line 84
    .line 85
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v4, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {v2, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance p2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v3, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {v6, p2}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/bytedance/pangle/download/PluginDownloadBean;->isRevert()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    new-instance p2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v1, "plugin revert "

    .line 132
    .line 133
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    iget-object v1, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-static {v2, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$c;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;)V

    .line 155
    .line 156
    .line 157
    const-string p2, "plugin install"

    .line 158
    .line 159
    invoke-static {v2, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_5

    .line 167
    .line 168
    const/4 p1, 0x4

    .line 169
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    :goto_0
    const-string p1, "plugin update received with invalid config"

    .line 174
    .line 175
    invoke-static {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v6, p1}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object v3

    .line 182
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    return-object p1
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
