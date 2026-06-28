.class public final Lcom/efs/sdk/base/core/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/core/c/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/core/d/b;Z)Lcom/efs/sdk/base/http/HttpResponse;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/a/c;->a()Lcom/efs/sdk/base/core/a/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/efs/sdk/base/core/d/a;->d:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v2, v0, Lcom/efs/sdk/base/core/a/c;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget v2, v1, Lcom/efs/sdk/base/core/d/a;->e:I

    .line 12
    .line 13
    iput v2, v0, Lcom/efs/sdk/base/core/a/c;->e:I

    .line 14
    .line 15
    iget-byte v2, v1, Lcom/efs/sdk/base/core/d/a;->b:B

    .line 16
    .line 17
    iput-byte v2, v0, Lcom/efs/sdk/base/core/a/c;->g:B

    .line 18
    .line 19
    iget-object v1, v1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, v0, Lcom/efs/sdk/base/core/a/c;->h:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/d/b;->a()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    iput-wide v1, v0, Lcom/efs/sdk/base/core/a/c;->m:J

    .line 28
    .line 29
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v2}, Lcom/efs/sdk/base/core/config/a/c;->a(Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 39
    .line 40
    iget v2, v2, Lcom/efs/sdk/base/core/d/a;->c:I

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v4, p1, Lcom/efs/sdk/base/core/d/b;->c:[B

    .line 50
    .line 51
    iget-object v5, p1, Lcom/efs/sdk/base/core/d/b;->b:Lcom/efs/sdk/base/core/d/c;

    .line 52
    .line 53
    iget-boolean v5, v5, Lcom/efs/sdk/base/core/d/c;->b:Z

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/a/c;->b()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v1, v0}, Lcom/efs/sdk/base/core/a/a;->a(Ljava/lang/String;Lcom/efs/sdk/base/core/a/c;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-boolean v2, v2, Lcom/efs/sdk/base/core/a/a;->a:Z

    .line 64
    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string/jumbo v7, "upload buffer file, url is "

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v7, "efs.px.api"

    .line 79
    .line 80
    invoke-static {v7, v2}, Lcom/efs/sdk/base/core/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 86
    .line 87
    .line 88
    const-string/jumbo v7, "wpk-header"

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    new-instance v6, Lcom/efs/sdk/base/core/util/a/d;

    .line 95
    .line 96
    invoke-direct {v6, v1}, Lcom/efs/sdk/base/core/util/a/d;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v2}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/util/Map;)Lcom/efs/sdk/base/core/util/a/d;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v2, v1, Lcom/efs/sdk/base/core/util/a/d;->a:Lcom/efs/sdk/base/core/util/a/b;

    .line 104
    .line 105
    iput-object v4, v2, Lcom/efs/sdk/base/core/util/a/b;->c:[B

    .line 106
    .line 107
    iput-boolean v3, v2, Lcom/efs/sdk/base/core/util/a/b;->g:Z

    .line 108
    .line 109
    const-string/jumbo v2, "type"

    .line 110
    .line 111
    .line 112
    iget-object v3, v0, Lcom/efs/sdk/base/core/a/c;->h:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v1, v2, v3}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/core/util/a/d;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-wide v3, v0, Lcom/efs/sdk/base/core/a/c;->m:J

    .line 124
    .line 125
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v2, "size"

    .line 133
    .line 134
    invoke-virtual {v1, v2, v0}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/core/util/a/d;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v1, "flow_limit"

    .line 139
    .line 140
    invoke-static {v5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/core/util/a/d;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {}, Lcom/efs/sdk/base/core/a/d;->a()Lcom/efs/sdk/base/core/a/d;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/core/util/a/d;->a(Lcom/efs/sdk/base/http/AbsHttpListener;)Lcom/efs/sdk/base/core/util/a/d;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/util/a/d;->a()Lcom/efs/sdk/base/core/util/a/c;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/util/a/c;->b()Lcom/efs/sdk/base/http/HttpResponse;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    goto :goto_0

    .line 165
    :cond_1
    if-ne v3, v2, :cond_2

    .line 166
    .line 167
    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object v3, p1, Lcom/efs/sdk/base/core/d/b;->d:Ljava/io/File;

    .line 172
    .line 173
    iget-object v4, p1, Lcom/efs/sdk/base/core/d/b;->b:Lcom/efs/sdk/base/core/d/c;

    .line 174
    .line 175
    iget-boolean v4, v4, Lcom/efs/sdk/base/core/d/c;->b:Z

    .line 176
    .line 177
    invoke-virtual {v2, v1, v0, v3, v4}, Lcom/efs/sdk/base/core/a/a;->a(Ljava/lang/String;Lcom/efs/sdk/base/core/a/c;Ljava/io/File;Z)Lcom/efs/sdk/base/http/HttpResponse;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto :goto_0

    .line 182
    :cond_2
    new-instance v0, Lcom/efs/sdk/base/http/HttpResponse;

    .line 183
    .line 184
    invoke-direct {v0}, Lcom/efs/sdk/base/http/HttpResponse;-><init>()V

    .line 185
    .line 186
    .line 187
    :goto_0
    iget-boolean v1, v0, Lcom/efs/sdk/base/core/d/d;->succ:Z

    .line 188
    .line 189
    if-eqz v1, :cond_3

    .line 190
    .line 191
    if-eqz p2, :cond_3

    .line 192
    .line 193
    iget-object p1, p1, Lcom/efs/sdk/base/core/d/b;->d:Ljava/io/File;

    .line 194
    .line 195
    invoke-static {p1}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/io/File;)V

    .line 196
    .line 197
    .line 198
    :cond_3
    return-object v0
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
