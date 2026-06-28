.class public Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub$GetCallStateUsingPackage;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/com/android/internal/telecom/ITelecomService$Stub;->TYPE:Ljava/lang/Class;

    const-string v1, "telecom"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub$1;

    .line 5
    .line 6
    const-string v1, "registerPhoneAccount"

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 15
    .line 16
    const-string v1, "showInCallScreen"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 25
    .line 26
    const-string v1, "getDefaultOutgoingPhoneAccount"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 35
    .line 36
    const-string v1, "getUserSelectedOutgoingPhoneAccount"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 45
    .line 46
    const-string v1, "getCallCapablePhoneAccounts"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 55
    .line 56
    const-string v1, "getSelfManagedPhoneAccounts"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 65
    .line 66
    const-string v1, "getOwnSelfManagedPhoneAccounts"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 75
    .line 76
    const-string v1, "getPhoneAccountsSupportingScheme"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 85
    .line 86
    const-string v1, "getPhoneAccountsForPackage"

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 95
    .line 96
    const-string v1, "getPhoneAccount"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 102
    .line 103
    .line 104
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 105
    .line 106
    const-string v1, "clearAccounts"

    .line 107
    .line 108
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 112
    .line 113
    .line 114
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 115
    .line 116
    const-string v1, "isVoiceMailNumber"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 122
    .line 123
    .line 124
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 125
    .line 126
    const-string v1, "getVoiceMailNumber"

    .line 127
    .line 128
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 132
    .line 133
    .line 134
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 135
    .line 136
    const-string v1, "getLine1Number"

    .line 137
    .line 138
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 142
    .line 143
    .line 144
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 145
    .line 146
    const-string v1, "silenceRinger"

    .line 147
    .line 148
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 152
    .line 153
    .line 154
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 155
    .line 156
    const-string v1, "isInCall"

    .line 157
    .line 158
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 162
    .line 163
    .line 164
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 165
    .line 166
    const-string v1, "hasManageOngoingCallsPermission"

    .line 167
    .line 168
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 172
    .line 173
    .line 174
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 175
    .line 176
    const-string v1, "isInManagedCall"

    .line 177
    .line 178
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 182
    .line 183
    .line 184
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 185
    .line 186
    const-string v1, "isRinging"

    .line 187
    .line 188
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 192
    .line 193
    .line 194
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 195
    .line 196
    const-string v1, "acceptRingingCall"

    .line 197
    .line 198
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 202
    .line 203
    .line 204
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 205
    .line 206
    const-string v1, "acceptRingingCallWithVideoState"

    .line 207
    .line 208
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 212
    .line 213
    .line 214
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 215
    .line 216
    const-string v1, "cancelMissedCallsNotification"

    .line 217
    .line 218
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 222
    .line 223
    .line 224
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 225
    .line 226
    const-string v1, "handlePinMmi"

    .line 227
    .line 228
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 232
    .line 233
    .line 234
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 235
    .line 236
    const-string v1, "handlePinMmiForPhoneAccount"

    .line 237
    .line 238
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 242
    .line 243
    .line 244
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 245
    .line 246
    const-string v1, "getAdnUriForPhoneAccount"

    .line 247
    .line 248
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 252
    .line 253
    .line 254
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 255
    .line 256
    const-string v1, "isTtySupported"

    .line 257
    .line 258
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 262
    .line 263
    .line 264
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 265
    .line 266
    const-string v1, "getCurrentTtyMode"

    .line 267
    .line 268
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 272
    .line 273
    .line 274
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 275
    .line 276
    const-string v1, "placeCall"

    .line 277
    .line 278
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 282
    .line 283
    .line 284
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub$GetCallStateUsingPackage;

    .line 285
    .line 286
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/telecom/TelecomManagerStub$GetCallStateUsingPackage;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 290
    .line 291
    .line 292
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 293
    .line 294
    const-string v1, "endCall"

    .line 295
    .line 296
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 300
    .line 301
    .line 302
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 303
    .line 304
    const-string v1, "startConference"

    .line 305
    .line 306
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 310
    .line 311
    .line 312
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 313
    .line 314
    const-string v1, "setDefaultDialer"

    .line 315
    .line 316
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 320
    .line 321
    .line 322
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 323
    .line 324
    const-string v1, "isIncomingCallPermitted"

    .line 325
    .line 326
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 330
    .line 331
    .line 332
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 333
    .line 334
    const-string v1, "isOutgoingCallPermitted"

    .line 335
    .line 336
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 340
    .line 341
    .line 342
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 343
    .line 344
    const-string v1, "isInSelfManagedCall"

    .line 345
    .line 346
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 350
    .line 351
    .line 352
    return-void
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
.end method
