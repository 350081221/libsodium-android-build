.class public Lcom/bytedance/sdk/openadsdk/api/a/e;
.super Lcom/bytedance/sdk/openadsdk/api/b;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/download/DownloadStatusChangeListener;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/EventListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/b;->a:Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method


# virtual methods
.method public onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/d;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/d;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x36977

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const v1, 0x36978

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, p2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    const p2, 0x36972

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

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
.end method

.method public onDownloadFailed(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/d;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/d;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x36977

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    const v0, 0x36974

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public onDownloadFinished(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/d;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/d;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x36977

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    const v0, 0x36976

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public onDownloadPaused(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/d;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/d;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x36977

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const v1, 0x36978

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, p2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    const p2, 0x36973

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

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
.end method

.method public onDownloadStart(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 3
    .param p1    # Lcom/ss/android/download/api/download/DownloadModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ss/android/download/api/download/DownloadController;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/c;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/c;-><init>(Lcom/ss/android/download/api/download/DownloadModel;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x367e1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/a/a;

    .line 30
    .line 31
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/api/a/a;-><init>(Lcom/ss/android/download/api/download/DownloadController;)V

    .line 32
    .line 33
    .line 34
    const p2, 0x367e3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    const p2, 0x36971

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

    .line 57
    .line 58
    .line 59
    return-void
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
.end method

.method public onIdle()V
    .locals 1

    const v0, 0x36970

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/b;->a(I)V

    return-void
.end method

.method public onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/d;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/d;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x36977

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    const v0, 0x36975

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

    .line 45
    .line 46
    .line 47
    return-void
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
