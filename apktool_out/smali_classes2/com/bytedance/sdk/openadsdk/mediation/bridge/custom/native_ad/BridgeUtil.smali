.class public Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/BridgeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildViewBinder(Lcom/bykv/vk/openvk/api/proto/Bridge;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getLayoutId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getCallToActionId()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->callToActionId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getExtras()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->addExtras(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getDecriptionTextId()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->descriptionTextId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getGroupImage1Id()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->groupImage1Id(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getGroupImage2Id()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->groupImage1Id(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getGroupImage3Id()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->groupImage1Id(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getIconImageId()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->iconImageId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getMainImageId()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->mainImageId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getMediaViewId()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->mediaViewIdId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getLogoLayoutId()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->logoLayoutId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getShakeViewContainerId()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->shakeViewContainerId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getTitleId()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->titleId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MApiIMediationViewBinderReversal;->getSourceId()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->sourceId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->build()Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
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
