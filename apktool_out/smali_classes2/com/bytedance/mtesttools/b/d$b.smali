.class Lcom/bytedance/mtesttools/b/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/d;->c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/d;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/b/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "onAdFailedToLoad"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, Lcom/bytedance/mtesttools/b/a;

    .line 27
    .line 28
    invoke-direct {v2, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1, v2}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public onNativeExpressAdLoad(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/b/d;->o(Lcom/bytedance/mtesttools/b/d;Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->r(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/bytedance/mtesttools/b/d;->f:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;

    .line 30
    .line 31
    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->r(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/d;->s(Lcom/bytedance/mtesttools/b/d;)Landroid/app/Activity;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lcom/bytedance/mtesttools/b/d$b$a;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/b/d$b$a;-><init>(Lcom/bytedance/mtesttools/b/d$b;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->setDislikeCallback(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_0

    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "onAdLoaded"

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-nez p1, :cond_2

    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$b;->a:Lcom/bytedance/mtesttools/b/d;

    .line 86
    .line 87
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v0, Lcom/bytedance/mtesttools/b/a;

    .line 92
    .line 93
    invoke-direct {v0}, Lcom/bytedance/mtesttools/b/a;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v1, "onAdFailedToLoad"

    .line 97
    .line 98
    invoke-interface {p1, v1, v0}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    return-void
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
