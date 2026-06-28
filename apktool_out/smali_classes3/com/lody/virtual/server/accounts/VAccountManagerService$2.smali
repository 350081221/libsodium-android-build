.class Lcom/lody/virtual/server/accounts/VAccountManagerService$2;
.super Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;->getAuthToken(ILandroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Ljava/lang/String;ZZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

.field final synthetic val$account:Landroid/accounts/Account;

.field final synthetic val$authTokenType:Ljava/lang/String;

.field final synthetic val$callerPkg:Ljava/lang/String;

.field final synthetic val$customTokens:Z

.field final synthetic val$loginOptions:Landroid/os/Bundle;

.field final synthetic val$notifyOnAuthFailure:Z

.field final synthetic val$userId:I


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;ZZILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    iput-object p8, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$account:Landroid/accounts/Account;

    iput-object p9, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$authTokenType:Ljava/lang/String;

    iput-object p10, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$loginOptions:Landroid/os/Bundle;

    iput-boolean p11, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$notifyOnAuthFailure:Z

    iput-boolean p12, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$customTokens:Z

    iput p13, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$userId:I

    iput-object p14, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$callerPkg:Ljava/lang/String;

    invoke-direct/range {p0 .. p7}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;-><init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onResult(Landroid/os/Bundle;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    const-string v0, "authtoken"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    if-eqz v6, :cond_5

    .line 10
    .line 11
    const-string v0, "authAccount"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "accountType"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_4

    .line 28
    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    iget-boolean v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$customTokens:Z

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 42
    .line 43
    invoke-static {v2}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$100(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Landroid/util/SparseArray;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    monitor-enter v2

    .line 48
    :try_start_0
    iget-object v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 49
    .line 50
    iget v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$userId:I

    .line 51
    .line 52
    invoke-static {v3, v4, v0, v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$200(Lcom/lody/virtual/server/accounts/VAccountManagerService;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/accounts/VAccount;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 59
    .line 60
    invoke-static {v3}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$100(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Landroid/util/SparseArray;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$userId:I

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/util/List;

    .line 71
    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    new-instance v3, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 80
    .line 81
    invoke-static {v4}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$100(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Landroid/util/SparseArray;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget v5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$userId:I

    .line 86
    .line 87
    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    new-instance v4, Lcom/lody/virtual/server/accounts/VAccount;

    .line 91
    .line 92
    iget v5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$userId:I

    .line 93
    .line 94
    new-instance v7, Landroid/accounts/Account;

    .line 95
    .line 96
    invoke-direct {v7, v0, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v4, v5, v7}, Lcom/lody/virtual/server/accounts/VAccount;-><init>(ILandroid/accounts/Account;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 106
    .line 107
    invoke-static {v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$300(Lcom/lody/virtual/server/accounts/VAccountManagerService;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    monitor-exit v2

    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    throw p1

    .line 115
    :cond_3
    :goto_0
    const-string v0, "android.accounts.expiry"

    .line 116
    .line 117
    const-wide/16 v1, 0x0

    .line 118
    .line 119
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    iget-boolean v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$customTokens:Z

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    cmp-long v0, v7, v0

    .line 132
    .line 133
    if-lez v0, :cond_5

    .line 134
    .line 135
    new-instance v0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;

    .line 136
    .line 137
    iget v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$userId:I

    .line 138
    .line 139
    iget-object v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$account:Landroid/accounts/Account;

    .line 140
    .line 141
    iget-object v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$authTokenType:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$callerPkg:Ljava/lang/String;

    .line 144
    .line 145
    move-object v1, v0

    .line 146
    invoke-direct/range {v1 .. v8}, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;-><init>(ILandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 150
    .line 151
    invoke-static {v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$400(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedList;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    monitor-enter v1

    .line 156
    :try_start_1
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 157
    .line 158
    invoke-static {v2}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$400(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedList;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 166
    .line 167
    invoke-static {v2}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$400(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedList;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    monitor-exit v1

    .line 175
    goto :goto_2

    .line 176
    :catchall_1
    move-exception p1

    .line 177
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    throw p1

    .line 179
    :cond_4
    :goto_1
    const/4 p1, 0x5

    .line 180
    const-string v0, "the type and name should not be empty"

    .line 181
    .line 182
    invoke-virtual {p0, p1, v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->onError(ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_5
    :goto_2
    const-string v0, "intent"

    .line 187
    .line 188
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Landroid/content/Intent;

    .line 193
    .line 194
    :cond_6
    invoke-super {p0, p1}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->onResult(Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    return-void
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
.end method

.method public run()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$account:Landroid/accounts/Account;

    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$authTokenType:Ljava/lang/String;

    iget-object v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$loginOptions:Landroid/os/Bundle;

    invoke-interface {v0, p0, v1, v2, v3}, Landroid/accounts/IAccountAuthenticator;->getAuthToken(Landroid/accounts/IAccountAuthenticatorResponse;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method protected toDebugString(J)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0, p1, p2}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->toDebugString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", getAuthToken, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$account:Landroid/accounts/Account;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", authTokenType "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$authTokenType:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", loginOptions "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$loginOptions:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", notifyOnAuthFailure "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$2;->val$notifyOnAuthFailure:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
