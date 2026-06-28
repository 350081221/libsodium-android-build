.class Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->connect(Ljava/lang/String;IILandroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

.field final synthetic val$callbacks:Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;

.field final synthetic val$pid:I

.field final synthetic val$pkg:Ljava/lang/String;

.field final synthetic val$rootHints:Landroid/os/Bundle;

.field final synthetic val$uid:I


# direct methods
.method constructor <init>(Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;Ljava/lang/String;IILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    iput-object p2, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$callbacks:Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;

    iput-object p3, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pkg:Ljava/lang/String;

    iput p4, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pid:I

    iput p5, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$uid:I

    iput-object p6, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$rootHints:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$callbacks:Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 10
    .line 11
    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->mConnections:Landroidx/collection/ArrayMap;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/collection/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 19
    .line 20
    iget-object v3, v2, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 21
    .line 22
    iget-object v4, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pkg:Ljava/lang/String;

    .line 23
    .line 24
    iget v5, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pid:I

    .line 25
    .line 26
    iget v6, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$uid:I

    .line 27
    .line 28
    iget-object v7, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$rootHints:Landroid/os/Bundle;

    .line 29
    .line 30
    iget-object v8, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$callbacks:Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;

    .line 31
    .line 32
    move-object v2, v1

    .line 33
    invoke-direct/range {v2 .. v8}, Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;-><init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/String;IILandroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 37
    .line 38
    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 39
    .line 40
    iput-object v1, v2, Landroidx/media/MediaBrowserServiceCompat;->mCurConnection:Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pkg:Ljava/lang/String;

    .line 43
    .line 44
    iget v4, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$uid:I

    .line 45
    .line 46
    iget-object v5, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$rootHints:Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4, v5}, Landroidx/media/MediaBrowserServiceCompat;->onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v1, Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;->root:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    .line 53
    .line 54
    iget-object v3, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 55
    .line 56
    iget-object v3, v3, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    iput-object v4, v3, Landroidx/media/MediaBrowserServiceCompat;->mCurConnection:Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;

    .line 60
    .line 61
    const-string v4, "MBServiceCompat"

    .line 62
    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v1, "No root for client "

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pkg:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, " from service "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    :try_start_0
    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$callbacks:Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;

    .line 104
    .line 105
    invoke-interface {v0}, Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;->onConnectFailed()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v1, "Calling onConnectFailed() failed. Ignoring. pkg="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pkg:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_0
    :try_start_1
    iget-object v2, v3, Landroidx/media/MediaBrowserServiceCompat;->mConnections:Landroidx/collection/ArrayMap;

    .line 133
    .line 134
    invoke-virtual {v2, v0, v1}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 139
    .line 140
    .line 141
    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 142
    .line 143
    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 144
    .line 145
    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat;->mSession:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 146
    .line 147
    if-eqz v2, :cond_1

    .line 148
    .line 149
    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$callbacks:Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;

    .line 150
    .line 151
    iget-object v3, v1, Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;->root:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    .line 152
    .line 153
    invoke-virtual {v3}, Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;->getRootId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-object v5, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 158
    .line 159
    iget-object v5, v5, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 160
    .line 161
    iget-object v5, v5, Landroidx/media/MediaBrowserServiceCompat;->mSession:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 162
    .line 163
    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ConnectionRecord;->root:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    .line 164
    .line 165
    invoke-virtual {v1}, Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;->getExtras()Landroid/os/Bundle;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-interface {v2, v3, v5, v1}, Landroidx/media/MediaBrowserServiceCompat$ServiceCallbacks;->onConnect(Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v2, "Calling onConnect() failed. Dropping client. pkg="

    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->val$pkg:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl$1;->this$1:Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;

    .line 196
    .line 197
    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ServiceBinderImpl;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 198
    .line 199
    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->mConnections:Landroidx/collection/ArrayMap;

    .line 200
    .line 201
    invoke-virtual {v1, v0}, Landroidx/collection/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_1
    :goto_0
    return-void
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
.end method
