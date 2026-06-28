.class public final Lcom/huawei/agconnect/apms/a0;
.super Lokhttp3/EventListener;
.source "SourceFile"


# instance fields
.field public abc:Lokhttp3/EventListener;

.field public bcd:Lcom/huawei/agconnect/apms/fed;


# direct methods
.method public constructor <init>(Lokhttp3/EventListener;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/EventListener;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 12
    .line 13
    const-string p2, "eventListener is null."

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
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


# virtual methods
.method public final abc()I
    .locals 4

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 6
    iget-wide v2, v2, Lcom/huawei/agconnect/apms/fed;->xyz:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final abc(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    move-result-object v0

    .line 4
    iput-object v0, p1, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public callEnd(Lokhttp3/Call;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->abc(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->callEnd(Lokhttp3/Call;)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public callFailed(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->abc(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->callFailed(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public callStart(Lokhttp3/Call;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    .line 3
    :try_start_1
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v2, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    .line 18
    .line 19
    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    :catchall_0
    :cond_0
    const-string v1, ""

    .line 26
    .line 27
    :cond_1
    :try_start_2
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    iput-object v1, v0, Lcom/huawei/agconnect/apms/fed;->hij:Ljava/lang/String;

    .line 34
    .line 35
    :cond_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->cde(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v0

    .line 46
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->callStart(Lokhttp3/Call;)V

    .line 52
    .line 53
    .line 54
    return-void
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
.end method

.method public connectEnd(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/huawei/agconnect/apms/fed;->ijk:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->cde(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->efg()Lcom/huawei/agconnect/apms/p;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput v1, v0, Lcom/huawei/agconnect/apms/p;->cde:I

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/p;->abc()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p4}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, v0, Lcom/huawei/agconnect/apms/p;->ghi:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    iput-boolean v1, v0, Lcom/huawei/agconnect/apms/p;->jkl:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2, p3, p4}, Lokhttp3/EventListener;->connectEnd(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V

    .line 58
    .line 59
    .line 60
    return-void
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
.end method

.method public connectFailed(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->efg()Lcom/huawei/agconnect/apms/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/p;->cde:I

    .line 14
    .line 15
    invoke-virtual {p5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, v0, Lcom/huawei/agconnect/apms/p;->klm:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/p;->abc()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-boolean v1, v0, Lcom/huawei/agconnect/apms/p;->jkl:Z

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget v1, v0, Lcom/huawei/agconnect/apms/fed;->uts:I

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->uts:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 47
    .line 48
    move-object v2, p1

    .line 49
    move-object v3, p2

    .line 50
    move-object v4, p3

    .line 51
    move-object v5, p4

    .line 52
    move-object v6, p5

    .line 53
    invoke-virtual/range {v1 .. v6}, Lokhttp3/EventListener;->connectFailed(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 54
    .line 55
    .line 56
    return-void
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
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
.end method

.method public connectStart(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lcom/huawei/agconnect/apms/p;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/apms/p;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v1, Lcom/huawei/agconnect/apms/fed;->srq:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget v0, v1, Lcom/huawei/agconnect/apms/fed;->vut:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    iput v0, v1, Lcom/huawei/agconnect/apms/fed;->vut:I

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    iget v1, v0, Lcom/huawei/agconnect/apms/fed;->tsr:I

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->tsr:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 53
    .line 54
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->connectStart(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 55
    .line 56
    .line 57
    return-void
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
.end method

.method public connectionAcquired(Lokhttp3/Call;Lokhttp3/Connection;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p2}, Lokhttp3/Connection;->socket()Ljava/net/Socket;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-interface {p2}, Lokhttp3/Connection;->socket()Ljava/net/Socket;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    invoke-interface {p2}, Lokhttp3/Connection;->route()Lokhttp3/Route;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    invoke-interface {p2}, Lokhttp3/Connection;->route()Lokhttp3/Route;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lokhttp3/Route;->socketAddress()Ljava/net/InetSocketAddress;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    invoke-virtual {v0}, Lokhttp3/Route;->socketAddress()Ljava/net/InetSocketAddress;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-virtual {v0}, Lokhttp3/Route;->socketAddress()Ljava/net/InetSocketAddress;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    :goto_0
    const-string v0, ""

    .line 71
    .line 72
    :goto_1
    :try_start_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_5

    .line 77
    .line 78
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/fed;->cde(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v2, Lcom/huawei/agconnect/apms/edc;->bcd:Ljava/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 106
    .line 107
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->connectionAcquired(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 108
    .line 109
    .line 110
    return-void
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
.end method

.method public connectionReleased(Lokhttp3/Call;Lokhttp3/Connection;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->connectionReleased(Lokhttp3/Call;Lokhttp3/Connection;)V

    return-void
.end method

.method public dnsEnd(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->def()Lcom/huawei/agconnect/apms/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/o;->cde:I

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, v0, Lcom/huawei/agconnect/apms/o;->def:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, v0, Lcom/huawei/agconnect/apms/o;->efg:Z

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->nop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->dnsEnd(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method public dnsStart(Lokhttp3/Call;Ljava/lang/String;)V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Lcom/huawei/agconnect/apms/o;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, p2, v1}, Lcom/huawei/agconnect/apms/o;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/fed;->abc(Lcom/huawei/agconnect/apms/o;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->hij()V

    .line 18
    .line 19
    .line 20
    iget v1, v0, Lcom/huawei/agconnect/apms/fed;->zab:I

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    iget v1, v0, Lcom/huawei/agconnect/apms/fed;->zyx:I

    .line 25
    .line 26
    int-to-long v1, v1

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v1, v1, v3

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ghi()V

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v1, -0x1

    .line 37
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->bcd(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->dnsStart(Lokhttp3/Call;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public requestBodyEnd(Lokhttp3/Call;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->pqr:I

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->requestBodyEnd(Lokhttp3/Call;J)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public requestBodyStart(Lokhttp3/Call;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->opq:I

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->requestBodyStart(Lokhttp3/Call;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public requestHeadersEnd(Lokhttp3/Call;Lokhttp3/Request;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->nop:I

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->requestHeadersEnd(Lokhttp3/Call;Lokhttp3/Request;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public requestHeadersStart(Lokhttp3/Call;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->mno:I

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->requestHeadersStart(Lokhttp3/Call;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public responseBodyEnd(Lokhttp3/Call;J)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->responseBodyEnd(Lokhttp3/Call;J)V

    return-void
.end method

.method public responseBodyStart(Lokhttp3/Call;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->responseBodyStart(Lokhttp3/Call;)V

    return-void
.end method

.method public responseHeadersEnd(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->stu:I

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Lokhttp3/Response;->isRedirect()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    iget v1, v0, Lcom/huawei/agconnect/apms/fed;->wxy:I

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->wxy:I

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->responseHeadersEnd(Lokhttp3/Call;Lokhttp3/Response;)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public responseHeadersStart(Lokhttp3/Call;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->rst:I

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->responseHeadersStart(Lokhttp3/Call;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public secureConnectEnd(Lokhttp3/Call;Lokhttp3/Handshake;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->efg()Lcom/huawei/agconnect/apms/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/p;->efg:I

    .line 14
    .line 15
    invoke-virtual {p2}, Lokhttp3/Handshake;->tlsVersion()Lokhttp3/TlsVersion;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lokhttp3/TlsVersion;->javaName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lcom/huawei/agconnect/apms/p;->hij:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2}, Lokhttp3/Handshake;->cipherSuite()Lokhttp3/CipherSuite;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lokhttp3/CipherSuite;->javaName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, v0, Lcom/huawei/agconnect/apms/p;->ijk:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 41
    .line 42
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->secureConnectEnd(Lokhttp3/Call;Lokhttp3/Handshake;)V

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public secureConnectStart(Lokhttp3/Call;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->efg()Lcom/huawei/agconnect/apms/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a0;->abc()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Lcom/huawei/agconnect/apms/p;->def:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a0;->abc(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a0;->abc:Lokhttp3/EventListener;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->secureConnectStart(Lokhttp3/Call;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method
