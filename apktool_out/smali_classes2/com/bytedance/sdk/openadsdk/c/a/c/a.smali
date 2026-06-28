.class public Lcom/bytedance/sdk/openadsdk/c/a/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/bytedance/sdk/openadsdk/AdConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const v2, 0x3fb89

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getAppId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 17
    .line 18
    .line 19
    const v2, 0x3fb8a

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getAppName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 27
    .line 28
    .line 29
    const v2, 0x3fb8b

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isPaid()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 37
    .line 38
    .line 39
    const v2, 0x3fb8c

    .line 40
    .line 41
    .line 42
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getKeywords()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 47
    .line 48
    .line 49
    const v2, 0x3fb8d

    .line 50
    .line 51
    .line 52
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getData()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 57
    .line 58
    .line 59
    const v2, 0x3fb8e

    .line 60
    .line 61
    .line 62
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getTitleBarTheme()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 67
    .line 68
    .line 69
    const v2, 0x3fb8f

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isAllowShowNotify()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 77
    .line 78
    .line 79
    const v2, 0x3fb90

    .line 80
    .line 81
    .line 82
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isDebug()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 87
    .line 88
    .line 89
    const v2, 0x3fb91

    .line 90
    .line 91
    .line 92
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getDirectDownloadNetworkType()[I

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 97
    .line 98
    .line 99
    const v2, 0x3fb93

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isSupportMultiProcess()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {v0, v2, v3}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/c/a/c/d;->a(Lcom/bytedance/sdk/openadsdk/TTCustomController;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    goto :goto_0

    .line 124
    :cond_1
    move-object v2, v1

    .line 125
    :goto_0
    const v3, 0x3fb94

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 129
    .line 130
    .line 131
    new-instance v2, Lcom/bytedance/sdk/openadsdk/c/a/c/a$1;

    .line 132
    .line 133
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/c/a/c/a$1;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    .line 134
    .line 135
    .line 136
    const v3, 0x3fb95

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 140
    .line 141
    .line 142
    new-instance v2, Lcom/bytedance/sdk/openadsdk/c/a/c/a$2;

    .line 143
    .line 144
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/c/a/c/a$2;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    .line 145
    .line 146
    .line 147
    const v3, 0x3fb96

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 151
    .line 152
    .line 153
    new-instance v2, Lcom/bytedance/sdk/openadsdk/c/a/c/a$3;

    .line 154
    .line 155
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/c/a/c/a$3;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    .line 156
    .line 157
    .line 158
    const v3, 0x3fb97

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 162
    .line 163
    .line 164
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getMediationConfig()Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_2

    .line 169
    .line 170
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getMediationConfig()Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :cond_2
    const v2, 0x3fb98

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 182
    .line 183
    .line 184
    const v1, 0x3fb99

    .line 185
    .line 186
    .line 187
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isUseMediation()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 192
    .line 193
    .line 194
    new-instance v1, Lcom/bytedance/sdk/openadsdk/c/a/c/a$4;

    .line 195
    .line 196
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/c/a/c/a$4;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    .line 197
    .line 198
    .line 199
    const p0, 0x3fb9a

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p0, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0
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
