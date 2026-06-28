.class public final Lcom/efs/sdk/base/core/e/a/b;
.super Lcom/efs/sdk/base/core/e/a/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/efs/sdk/base/core/e/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/core/d/b;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/efs/sdk/base/core/d/b;->b:Lcom/efs/sdk/base/core/d/c;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/efs/sdk/base/core/d/c;->a:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/efs/sdk/base/core/e/a/a;->b(Lcom/efs/sdk/base/core/d/b;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/efs/sdk/base/core/b/a$b;->a()Lcom/efs/sdk/base/core/b/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 18
    .line 19
    const-string/jumbo v2, "wa"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-static {}, Lcom/efs/sdk/base/core/b/c;->a()Lcom/efs/sdk/base/core/b/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-boolean v1, v1, Lcom/efs/sdk/base/core/b/c;->a:Z

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    iget-boolean p1, v0, Lcom/efs/sdk/base/core/b/a;->a:Z

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v1, v1, Lcom/efs/sdk/base/core/config/a/c;->d:Lcom/efs/sdk/base/core/config/a/b;

    .line 49
    .line 50
    iget v1, v1, Lcom/efs/sdk/base/core/config/a/b;->a:I

    .line 51
    .line 52
    iget-object v2, p1, Lcom/efs/sdk/base/core/f/f;->b:Lcom/efs/sdk/base/core/controller/ControllerCenter;

    .line 53
    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->isEnableWaStat()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    :cond_1
    iget-object v2, p1, Lcom/efs/sdk/base/core/f/f;->b:Lcom/efs/sdk/base/core/controller/ControllerCenter;

    .line 67
    .line 68
    const-string v3, "disk_limit"

    .line 69
    .line 70
    invoke-virtual {p1, v3, v1}, Lcom/efs/sdk/base/core/f/f;->a(Ljava/lang/String;I)Lcom/efs/sdk/base/core/f/b;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v2, p1}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, v0, Lcom/efs/sdk/base/core/b/a;->a:Z

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 82
    .line 83
    iget v2, v1, Lcom/efs/sdk/base/core/d/a;->c:I

    .line 84
    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    iget-object v2, p1, Lcom/efs/sdk/base/core/d/b;->c:[B

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    array-length v2, v2

    .line 92
    if-nez v2, :cond_5

    .line 93
    .line 94
    :cond_4
    return-void

    .line 95
    :cond_5
    iget-object v0, v0, Lcom/efs/sdk/base/core/b/a;->c:Lcom/efs/sdk/base/core/b/b;

    .line 96
    .line 97
    iget-byte v1, v1, Lcom/efs/sdk/base/core/d/a;->b:B

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/core/b/b;->a(B)Lcom/efs/sdk/base/core/b/e;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    invoke-interface {v0, p1}, Lcom/efs/sdk/base/core/b/e;->a(Lcom/efs/sdk/base/core/d/b;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    return-void
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
