.class public Lcom/bytedance/sdk/openadsdk/CSJConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/AdConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/CSJConfig$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:Z

.field private i:[I

.field private j:Z

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/bytedance/sdk/openadsdk/TTCustomController;

.field private m:I

.field private n:I

.field private o:I

.field private p:Z

.field private q:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->c:Z

    .line 6
    .line 7
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->f:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->g:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->h:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->j:Z

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->a(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->b(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->c(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->c:Z

    .line 33
    .line 34
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->d(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->e(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->e:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->f(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->f:I

    .line 51
    .line 52
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->g(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->g:Z

    .line 57
    .line 58
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->h(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->h:Z

    .line 63
    .line 64
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->i(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)[I

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->i:[I

    .line 69
    .line 70
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->j(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->j:Z

    .line 75
    .line 76
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->k(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->l:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->l(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->m:I

    .line 87
    .line 88
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->m(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->o:I

    .line 93
    .line 94
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->n(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->n:I

    .line 99
    .line 100
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->o(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->p:Z

    .line 105
    .line 106
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->p(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->q:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    .line 111
    .line 112
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$a;->q(Lcom/bytedance/sdk/openadsdk/CSJConfig$a;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Ljava/util/Map;

    .line 117
    .line 118
    return-void
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
.method public getAgeGroup()I
    .locals 1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->o:I

    return v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->l:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    return-object v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getDirectDownloadNetworkType()[I
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->i:[I

    return-object v0
.end method

.method public getExtra(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
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

.method public getInitExtra()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Ljava/util/Map;

    return-object v0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getMediationConfig()Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->q:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    return-object v0
.end method

.method public getPluginUpdateConfig()I
    .locals 1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->n:I

    return v0
.end method

.method public getThemeStatus()I
    .locals 1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->m:I

    return v0
.end method

.method public getTitleBarTheme()I
    .locals 1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->f:I

    return v0
.end method

.method public isAllowShowNotify()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->g:Z

    return v0
.end method

.method public isDebug()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->h:Z

    return v0
.end method

.method public isPaid()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->c:Z

    return v0
.end method

.method public isSupportMultiProcess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->j:Z

    return v0
.end method

.method public isUseMediation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->p:Z

    return v0
.end method

.method public setAgeGroup(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->o:I

    return-void
.end method

.method public setAllowShowNotify(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->g:Z

    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->a:Ljava/lang/String;

    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->b:Ljava/lang/String;

    return-void
.end method

.method public setCustomController(Lcom/bytedance/sdk/openadsdk/TTCustomController;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->l:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->e:Ljava/lang/String;

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->h:Z

    return-void
.end method

.method public varargs setDirectDownloadNetworkType([I)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->i:[I

    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->d:Ljava/lang/String;

    return-void
.end method

.method public setPaid(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->c:Z

    return-void
.end method

.method public setSupportMultiProcess(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->j:Z

    return-void
.end method

.method public setThemeStatus(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->m:I

    return-void
.end method

.method public setTitleBarTheme(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->f:I

    return-void
.end method
