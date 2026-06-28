.class public final Lcom/bytedance/pangle/util/b/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/bytedance/pangle/util/b/b/d;Ljava/io/ByteArrayOutputStream;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/bytedance/pangle/util/b/b/c;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    new-array v3, v3, [B

    .line 43
    .line 44
    fill-array-data v3, :array_0

    .line 45
    .line 46
    .line 47
    const v4, 0x2014b50

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 61
    .line 62
    .line 63
    iget v5, v1, Lcom/bytedance/pangle/util/b/b/c;->a:I

    .line 64
    .line 65
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 66
    .line 67
    .line 68
    const/16 v5, 0x821

    .line 69
    .line 70
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 71
    .line 72
    .line 73
    const/16 v5, 0x221

    .line 74
    .line 75
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 76
    .line 77
    .line 78
    iget-wide v5, v1, Lcom/bytedance/pangle/util/b/b/c;->b:J

    .line 79
    .line 80
    long-to-int v5, v5

    .line 81
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 82
    .line 83
    .line 84
    iget-wide v5, v1, Lcom/bytedance/pangle/util/b/b/c;->c:J

    .line 85
    .line 86
    long-to-int v5, v5

    .line 87
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 88
    .line 89
    .line 90
    iget-wide v5, v1, Lcom/bytedance/pangle/util/b/b/c;->d:J

    .line 91
    .line 92
    long-to-int v5, v5

    .line 93
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 94
    .line 95
    .line 96
    new-array v5, v4, [B

    .line 97
    .line 98
    iget-object v6, v1, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-lez v6, :cond_2

    .line 111
    .line 112
    iget-object v5, v1, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    .line 113
    .line 114
    const-string v6, "UTF-8"

    .line 115
    .line 116
    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    :cond_2
    array-length v6, v5

    .line 125
    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 126
    .line 127
    .line 128
    iget v6, v1, Lcom/bytedance/pangle/util/b/b/c;->f:I

    .line 129
    .line 130
    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 146
    .line 147
    .line 148
    iget-wide v3, v1, Lcom/bytedance/pangle/util/b/b/c;->i:J

    .line 149
    .line 150
    long-to-int v1, v3

    .line 151
    invoke-virtual {v2, p1, v1}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 152
    .line 153
    .line 154
    array-length v1, v5

    .line 155
    if-lez v1, :cond_3

    .line 156
    .line 157
    invoke-virtual {p1, v5}, Ljava/io/OutputStream;->write([B)V

    .line 158
    .line 159
    .line 160
    :cond_3
    if-lez v6, :cond_1

    .line 161
    .line 162
    new-array v1, v6, [B

    .line 163
    .line 164
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 170
    .line 171
    const-string p1, "input parameters is null, cannot write local file header"

    .line 172
    .line 173
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p0

    .line 177
    :cond_5
    :goto_1
    return-void

    .line 178
    nop

    .line 179
    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
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
