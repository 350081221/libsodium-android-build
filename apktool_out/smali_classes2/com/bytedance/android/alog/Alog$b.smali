.class public Lcom/bytedance/android/alog/Alog$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/android/alog/Alog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->b:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/bytedance/android/alog/Alog$b;->c:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/bytedance/android/alog/Alog$b;->e:Ljava/lang/String;

    .line 13
    .line 14
    const/high16 v1, 0x200000

    .line 15
    .line 16
    iput v1, p0, Lcom/bytedance/android/alog/Alog$b;->f:I

    .line 17
    .line 18
    const/high16 v1, 0x1400000

    .line 19
    .line 20
    iput v1, p0, Lcom/bytedance/android/alog/Alog$b;->g:I

    .line 21
    .line 22
    const/4 v1, 0x7

    .line 23
    iput v1, p0, Lcom/bytedance/android/alog/Alog$b;->h:I

    .line 24
    .line 25
    iput-object v0, p0, Lcom/bytedance/android/alog/Alog$b;->i:Ljava/lang/String;

    .line 26
    .line 27
    const/high16 v1, 0x10000

    .line 28
    .line 29
    iput v1, p0, Lcom/bytedance/android/alog/Alog$b;->j:I

    .line 30
    .line 31
    const/high16 v1, 0x30000

    .line 32
    .line 33
    iput v1, p0, Lcom/bytedance/android/alog/Alog$b;->k:I

    .line 34
    .line 35
    iput-object v0, p0, Lcom/bytedance/android/alog/Alog$b;->l:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->e()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->m:I

    .line 42
    .line 43
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->f()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->n:I

    .line 48
    .line 49
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->g()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->o:I

    .line 54
    .line 55
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->h()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->p:I

    .line 60
    .line 61
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->i()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->q:I

    .line 66
    .line 67
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->j()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, p0, Lcom/bytedance/android/alog/Alog$b;->r:I

    .line 72
    .line 73
    const-string v0, "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a"

    .line 74
    .line 75
    iput-object v0, p0, Lcom/bytedance/android/alog/Alog$b;->s:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    move-object p1, v0

    .line 84
    :cond_0
    iput-object p1, p0, Lcom/bytedance/android/alog/Alog$b;->a:Landroid/content/Context;

    .line 85
    .line 86
    return-void
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
.end method


# virtual methods
.method public a(I)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->b:I

    return-object p0
.end method

.method public a(Lcom/bytedance/android/alog/Alog$a;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 15
    invoke-virtual {p1}, Lcom/bytedance/android/alog/Alog$a;->a()I

    move-result p1

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->r:I

    return-object p0
.end method

.method public a(Lcom/bytedance/android/alog/Alog$c;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/android/alog/Alog$c;->a()I

    move-result p1

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->p:I

    return-object p0
.end method

.method public a(Lcom/bytedance/android/alog/Alog$d;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/android/alog/Alog$d;->a()I

    move-result p1

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->m:I

    return-object p0
.end method

.method public a(Lcom/bytedance/android/alog/Alog$e;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/android/alog/Alog$e;->a()I

    move-result p1

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->o:I

    return-object p0
.end method

.method public a(Lcom/bytedance/android/alog/Alog$f;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/android/alog/Alog$f;->a()I

    move-result p1

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->q:I

    return-object p0
.end method

.method public a(Lcom/bytedance/android/alog/Alog$g;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 11
    invoke-virtual {p1}, Lcom/bytedance/android/alog/Alog$g;->a()I

    move-result p1

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->n:I

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/bytedance/android/alog/Alog$b;
    .locals 3

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "-"

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string v0, "_"

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 8
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    iput-object p1, p0, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    :cond_2
    return-object p0
.end method

.method public a(Z)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/android/alog/Alog$b;->c:Z

    return-object p0
.end method

.method public a()Lcom/bytedance/android/alog/Alog;
    .locals 23

    move-object/from16 v1, p0

    .line 16
    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "default"

    .line 17
    iput-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    .line 18
    :cond_0
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->k()Ljava/util/ArrayList;

    move-result-object v2

    monitor-enter v2

    .line 19
    :try_start_0
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 20
    iget-object v5, v1, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 21
    monitor-exit v2

    return-object v4

    .line 22
    :cond_2
    invoke-static {}, Lcom/bytedance/android/alog/Alog;->k()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v3, v1, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->e:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 25
    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/alog"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->e:Ljava/lang/String;

    goto :goto_0

    .line 27
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v1, Lcom/bytedance/android/alog/Alog$b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/alog"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->e:Ljava/lang/String;

    .line 28
    :cond_4
    :goto_0
    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->i:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v1, Lcom/bytedance/android/alog/Alog$b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/alog"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->i:Ljava/lang/String;

    .line 30
    :cond_5
    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->l:Ljava/lang/String;

    if-nez v0, :cond_6

    .line 31
    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bytedance/android/alog/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->l:Ljava/lang/String;

    .line 32
    :cond_6
    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->j:I

    const/16 v2, 0x1000

    div-int/2addr v0, v2

    mul-int/2addr v0, v2

    iput v0, v1, Lcom/bytedance/android/alog/Alog$b;->j:I

    .line 33
    iget v3, v1, Lcom/bytedance/android/alog/Alog$b;->k:I

    div-int/2addr v3, v2

    mul-int/2addr v3, v2

    iput v3, v1, Lcom/bytedance/android/alog/Alog$b;->k:I

    if-ge v0, v2, :cond_7

    .line 34
    iput v2, v1, Lcom/bytedance/android/alog/Alog$b;->j:I

    .line 35
    :cond_7
    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->j:I

    mul-int/lit8 v2, v0, 0x2

    if-ge v3, v2, :cond_8

    mul-int/lit8 v0, v0, 0x2

    .line 36
    iput v0, v1, Lcom/bytedance/android/alog/Alog$b;->k:I

    .line 37
    :cond_8
    new-instance v0, Lcom/bytedance/android/alog/Alog;

    move-object v2, v0

    iget-object v3, v1, Lcom/bytedance/android/alog/Alog$b;->a:Landroid/content/Context;

    iget v4, v1, Lcom/bytedance/android/alog/Alog$b;->b:I

    iget-boolean v5, v1, Lcom/bytedance/android/alog/Alog$b;->c:Z

    iget-object v6, v1, Lcom/bytedance/android/alog/Alog$b;->d:Ljava/lang/String;

    iget-object v7, v1, Lcom/bytedance/android/alog/Alog$b;->e:Ljava/lang/String;

    iget v8, v1, Lcom/bytedance/android/alog/Alog$b;->f:I

    iget v9, v1, Lcom/bytedance/android/alog/Alog$b;->g:I

    iget v10, v1, Lcom/bytedance/android/alog/Alog$b;->h:I

    iget-object v11, v1, Lcom/bytedance/android/alog/Alog$b;->i:Ljava/lang/String;

    iget v12, v1, Lcom/bytedance/android/alog/Alog$b;->j:I

    iget v13, v1, Lcom/bytedance/android/alog/Alog$b;->k:I

    iget-object v14, v1, Lcom/bytedance/android/alog/Alog$b;->l:Ljava/lang/String;

    iget v15, v1, Lcom/bytedance/android/alog/Alog$b;->m:I

    move-object/from16 v22, v0

    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->n:I

    move/from16 v16, v0

    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->o:I

    move/from16 v17, v0

    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->p:I

    move/from16 v18, v0

    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->q:I

    move/from16 v19, v0

    iget v0, v1, Lcom/bytedance/android/alog/Alog$b;->r:I

    move/from16 v20, v0

    iget-object v0, v1, Lcom/bytedance/android/alog/Alog$b;->s:Ljava/lang/String;

    move-object/from16 v21, v0

    invoke-direct/range {v2 .. v21}, Lcom/bytedance/android/alog/Alog;-><init>(Landroid/content/Context;IZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IILjava/lang/String;IIIIIILjava/lang/String;)V

    return-object v22

    :catchall_0
    move-exception v0

    .line 38
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(I)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->f:I

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/android/alog/Alog$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c(I)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->g:I

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/android/alog/Alog$b;->i:Ljava/lang/String;

    return-object p0
.end method

.method public d(I)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->h:I

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/android/alog/Alog$b;->s:Ljava/lang/String;

    return-object p0
.end method

.method public e(I)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->j:I

    return-object p0
.end method

.method public f(I)Lcom/bytedance/android/alog/Alog$b;
    .locals 0

    iput p1, p0, Lcom/bytedance/android/alog/Alog$b;->k:I

    return-object p0
.end method
