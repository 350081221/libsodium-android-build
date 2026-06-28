.class public Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
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
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$1;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$1;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 12
    .line 13
    .line 14
    const v3, 0x407a5

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$3;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$3;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 23
    .line 24
    .line 25
    const v3, 0x407a6

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;->getMediationConfigUserInfoForSegment()Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;->getMediationConfigUserInfoForSegment()Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/c;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    const v2, 0x407a7

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 49
    .line 50
    .line 51
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$4;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$4;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 54
    .line 55
    .line 56
    const v2, 0x407a8

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 60
    .line 61
    .line 62
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$5;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$5;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 65
    .line 66
    .line 67
    const v2, 0x407a9

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 71
    .line 72
    .line 73
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$6;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$6;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 76
    .line 77
    .line 78
    const v2, 0x407aa

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 82
    .line 83
    .line 84
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$7;

    .line 85
    .line 86
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$7;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 87
    .line 88
    .line 89
    const v2, 0x407ab

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 93
    .line 94
    .line 95
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$8;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$8;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 98
    .line 99
    .line 100
    const v2, 0x407ac

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 104
    .line 105
    .line 106
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$9;

    .line 107
    .line 108
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$9;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 109
    .line 110
    .line 111
    const v2, 0x407ad

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 115
    .line 116
    .line 117
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$10;

    .line 118
    .line 119
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$10;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 120
    .line 121
    .line 122
    const v2, 0x407ae

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 126
    .line 127
    .line 128
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$2;

    .line 129
    .line 130
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/a$2;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    .line 131
    .line 132
    .line 133
    const p0, 0x407af

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p0, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0
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
