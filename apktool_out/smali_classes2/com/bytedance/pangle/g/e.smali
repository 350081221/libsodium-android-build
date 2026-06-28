.class public final Lcom/bytedance/pangle/g/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 1
    const-string v0, "ApkSignatureVerify verify plugin signature error : "

    .line 2
    .line 3
    const-string v1, "Zeus/install_pangle"

    .line 4
    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v3

    .line 13
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/bytedance/pangle/util/i;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Lcom/bytedance/pangle/g/d;->a(Ljava/lang/String;)Lcom/bytedance/pangle/g/o;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p0}, Lcom/bytedance/pangle/g/a;->a(Ljava/lang/String;)Lcom/bytedance/pangle/g/o;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    if-eqz v2, :cond_2

    .line 29
    .line 30
    iget-object v2, v2, Lcom/bytedance/pangle/g/o;->b:[Landroid/content/pm/Signature;
    :try_end_0
    .catch Lcom/bytedance/pangle/g/q; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 v2, 0x0

    .line 34
    :goto_1
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, Lcom/bytedance/pangle/plugin/Plugin;->mSignature:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_7

    .line 45
    .line 46
    array-length v4, p1

    .line 47
    if-nez v4, :cond_3

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_3
    array-length v4, v2

    .line 51
    move v5, v3

    .line 52
    move v6, v5

    .line 53
    :goto_2
    if-ge v5, v4, :cond_4

    .line 54
    .line 55
    aget-object v7, v2, v5

    .line 56
    .line 57
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    array-length v7, v7

    .line 62
    add-int/2addr v6, v7

    .line 63
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    new-array v4, v6, [B

    .line 67
    .line 68
    array-length v5, v2

    .line 69
    move v6, v3

    .line 70
    move v7, v6

    .line 71
    :goto_3
    if-ge v6, v5, :cond_5

    .line 72
    .line 73
    aget-object v8, v2, v6

    .line 74
    .line 75
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    array-length v10, v10

    .line 84
    invoke-static {v9, v3, v4, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    array-length v8, v8

    .line 92
    add-int/2addr v7, v8

    .line 93
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    invoke-static {v4, p1}, Lcom/bytedance/pangle/g/o;->a([B[B)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {v1, p0}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    return p1

    .line 114
    :cond_7
    :goto_4
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string p1, "ApkSignatureVerify get hostSignature error : "

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {v1, p0}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return v3

    .line 128
    :catch_0
    move-exception p1

    .line 129
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {v1, p0, p1}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    return v3
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
.end method
