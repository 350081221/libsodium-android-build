.class public abstract Landroidx/compose/ui/node/DelegatingNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u00086\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0019\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0010\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0015\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001a\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0004J$\u0010 \u001a\u00020\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u001cH\u0080\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010%\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008$\u0010\"J\u000f\u0010\'\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008&\u0010\"J\u000f\u0010)\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008(\u0010\"J\u000f\u0010+\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008*\u0010\"R \u0010,\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u0012\u0004\u00080\u0010\"\u001a\u0004\u0008.\u0010/R$\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105\u00a8\u00067"
    }
    d2 = {
        "Landroidx/compose/ui/node/DelegatingNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "",
        "delegateKindSet",
        "delegateNode",
        "Lkotlin/r2;",
        "validateDelegateKindSet",
        "newKindSet",
        "",
        "recalculateOwner",
        "updateNodeKindSet",
        "Landroidx/compose/ui/node/NodeCoordinator;",
        "coordinator",
        "updateCoordinator$ui_release",
        "(Landroidx/compose/ui/node/NodeCoordinator;)V",
        "updateCoordinator",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "T",
        "delegatableNode",
        "delegateUnprotected$ui_release",
        "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;",
        "delegateUnprotected",
        "instance",
        "undelegateUnprotected$ui_release",
        "(Landroidx/compose/ui/node/DelegatableNode;)V",
        "undelegateUnprotected",
        "delegate",
        "undelegate",
        "Lkotlin/Function1;",
        "block",
        "forEachImmediateDelegate$ui_release",
        "(Lv3/l;)V",
        "forEachImmediateDelegate",
        "markAsAttached$ui_release",
        "()V",
        "markAsAttached",
        "runAttachLifecycle$ui_release",
        "runAttachLifecycle",
        "runDetachLifecycle$ui_release",
        "runDetachLifecycle",
        "markAsDetached$ui_release",
        "markAsDetached",
        "reset$ui_release",
        "reset",
        "selfKindSet",
        "I",
        "getSelfKindSet$ui_release",
        "()I",
        "getSelfKindSet$ui_release$annotations",
        "Landroidx/compose/ui/Modifier$Node;",
        "getDelegate$ui_release",
        "()Landroidx/compose/ui/Modifier$Node;",
        "setDelegate$ui_release",
        "(Landroidx/compose/ui/Modifier$Node;)V",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,277:1\n234#1,6:278\n234#1,6:290\n234#1,6:296\n234#1,6:302\n234#1,6:308\n234#1,6:314\n72#2:284\n72#2:286\n72#2:288\n55#3:285\n55#3:287\n55#3:289\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n45#1:278,6\n243#1:290,6\n254#1:296,6\n262#1:302,6\n268#1:308,6\n274#1:314,6\n106#1:284\n162#1:286\n176#1:288\n106#1:285\n162#1:287\n176#1:289\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private delegate:Landroidx/compose/ui/Modifier$Node;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final selfKindSet:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/compose/ui/node/NodeKindKt;->calculateNodeKindSetFrom(Landroidx/compose/ui/Modifier$Node;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Landroidx/compose/ui/node/DelegatingNode;->selfKindSet:I

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public static synthetic getSelfKindSet$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method private final updateNodeKindSet(IZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/ui/Modifier$Node;->setKindSet$ui_release(I)V

    .line 6
    .line 7
    .line 8
    if-eq v0, p1, :cond_4

    .line 9
    .line 10
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->isDelegationRoot(Landroidx/compose/ui/node/DelegatableNode;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/compose/ui/Modifier$Node;->setAggregateChildKindSet$ui_release(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v1, p0

    .line 30
    :goto_0
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    or-int/2addr p1, v2

    .line 37
    invoke-virtual {v1, p1}, Landroidx/compose/ui/Modifier$Node;->setKindSet$ui_release(I)V

    .line 38
    .line 39
    .line 40
    if-eq v1, v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-eqz p2, :cond_2

    .line 48
    .line 49
    if-ne v1, v0, :cond_2

    .line 50
    .line 51
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->calculateNodeKindSetFromIncludingDelegates(Landroidx/compose/ui/Modifier$Node;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {v0, p1}, Landroidx/compose/ui/Modifier$Node;->setKindSet$ui_release(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    invoke-virtual {p2}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 p2, 0x0

    .line 72
    :goto_1
    or-int/2addr p1, p2

    .line 73
    :goto_2
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    or-int/2addr p1, p2

    .line 80
    invoke-virtual {v1, p1}, Landroidx/compose/ui/Modifier$Node;->setAggregateChildKindSet$ui_release(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    return-void
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
.end method

.method private final validateDelegateKindSet(ILandroidx/compose/ui/Modifier$Node;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    and-int/2addr p1, v2

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move p1, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p1, v3

    .line 18
    :goto_0
    if-eqz p1, :cond_3

    .line 19
    .line 20
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    and-int/2addr p1, v0

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v3

    .line 29
    :goto_1
    if-eqz v2, :cond_3

    .line 30
    .line 31
    instance-of p1, p0, Landroidx/compose/ui/node/LayoutModifierNode;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v0, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, "\nDelegate Node: "

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p2

    .line 71
    :cond_3
    :goto_2
    return-void
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
.end method


# virtual methods
.method protected final delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;
    .locals 8
    .param p1    # Landroidx/compose/ui/node/DelegatableNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/DelegatableNode;",
            ">(TT;)TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    move v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v2

    .line 12
    :goto_0
    const/4 v4, 0x0

    .line 13
    if-eqz v3, :cond_5

    .line 14
    .line 15
    instance-of v3, p1, Landroidx/compose/ui/Modifier$Node;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object v3, p1

    .line 20
    check-cast v3, Landroidx/compose/ui/Modifier$Node;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v3, v4

    .line 24
    :goto_1
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-ne v0, v3, :cond_3

    .line 35
    .line 36
    invoke-static {v4, p0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move v1, v2

    .line 44
    :goto_2
    if-eqz v1, :cond_4

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "Cannot delegate to an already delegated node"

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    xor-int/2addr v3, v1

    .line 64
    if-eqz v3, :cond_a

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v0, v3}, Landroidx/compose/ui/Modifier$Node;->setAsDelegateTo$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->calculateNodeKindSetFromIncludingDelegates(Landroidx/compose/ui/Modifier$Node;)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {v0, v5}, Landroidx/compose/ui/Modifier$Node;->setKindSet$ui_release(I)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v5, v0}, Landroidx/compose/ui/node/DelegatingNode;->validateDelegateKindSet(ILandroidx/compose/ui/Modifier$Node;)V

    .line 85
    .line 86
    .line 87
    iget-object v6, p0, Landroidx/compose/ui/node/DelegatingNode;->delegate:Landroidx/compose/ui/Modifier$Node;

    .line 88
    .line 89
    invoke-virtual {v0, v6}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Landroidx/compose/ui/node/DelegatingNode;->delegate:Landroidx/compose/ui/Modifier$Node;

    .line 93
    .line 94
    invoke-virtual {v0, p0}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    or-int/2addr v6, v5

    .line 102
    invoke-direct {p0, v6, v2}, Landroidx/compose/ui/node/DelegatingNode;->updateNodeKindSet(IZ)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_9

    .line 110
    .line 111
    const/4 v6, 0x2

    .line 112
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    and-int/2addr v5, v7

    .line 117
    if-eqz v5, :cond_6

    .line 118
    .line 119
    move v5, v1

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move v5, v2

    .line 122
    :goto_3
    if-eqz v5, :cond_8

    .line 123
    .line 124
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    and-int/2addr v3, v5

    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    move v1, v2

    .line 133
    :goto_4
    if-nez v1, :cond_8

    .line 134
    .line 135
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->syncCoordinators()V

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_8
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/DelegatingNode;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 159
    .line 160
    .line 161
    :goto_5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->markAsAttached$ui_release()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->runAttachLifecycle$ui_release()V

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateInsertedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    return-object p1

    .line 171
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string v0, "Cannot delegate to an already attached node"

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
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
.end method

.method public final delegateUnprotected$ui_release(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;
    .locals 0
    .param p1    # Landroidx/compose/ui/node/DelegatableNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/DelegatableNode;",
            ">(TT;)TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lp4/p;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    move-result-object p1

    return-object p1
.end method

.method public final forEachImmediateDelegate$ui_release(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/Modifier$Node;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
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
.end method

.method public final getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/DelegatingNode;->delegate:Landroidx/compose/ui/Modifier$Node;

    return-object v0
.end method

.method public final getSelfKindSet$ui_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/DelegatingNode;->selfKindSet:I

    return v0
.end method

.method public markAsAttached$ui_release()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/Modifier$Node;->markAsAttached$ui_release()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->markAsAttached$ui_release()V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
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
.end method

.method public markAsDetached$ui_release()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->markAsDetached$ui_release()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-super {p0}, Landroidx/compose/ui/Modifier$Node;->markAsDetached$ui_release()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
.end method

.method public reset$ui_release()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/Modifier$Node;->reset$ui_release()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->reset$ui_release()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
    .line 19
.end method

.method public runAttachLifecycle$ui_release()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->runAttachLifecycle$ui_release()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-super {p0}, Landroidx/compose/ui/Modifier$Node;->runAttachLifecycle$ui_release()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
.end method

.method public runDetachLifecycle$ui_release()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/Modifier$Node;->runDetachLifecycle$ui_release()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->runDetachLifecycle$ui_release()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
    .line 19
.end method

.method public final setDelegate$ui_release(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/node/DelegatingNode;->delegate:Landroidx/compose/ui/Modifier$Node;

    return-void
.end method

.method protected final undelegate(Landroidx/compose/ui/node/DelegatableNode;)V
    .locals 7
    .param p1    # Landroidx/compose/ui/node/DelegatableNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/DelegatingNode;->delegate:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v1

    .line 5
    :goto_0
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    if-ne v0, p1, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateRemovedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->runDetachLifecycle$ui_release()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->markAsDetached$ui_release()V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0, v0}, Landroidx/compose/ui/Modifier$Node;->setAsDelegateTo$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v4}, Landroidx/compose/ui/Modifier$Node;->setAggregateChildKindSet$ui_release(I)V

    .line 30
    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Landroidx/compose/ui/node/DelegatingNode;->delegate:Landroidx/compose/ui/Modifier$Node;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v2, v5}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 52
    .line 53
    .line 54
    move v0, v3

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v6, v2

    .line 61
    move-object v2, v0

    .line 62
    move-object v0, v6

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move v0, v4

    .line 65
    :goto_2
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p0}, Landroidx/compose/ui/node/NodeKindKt;->calculateNodeKindSetFromIncludingDelegates(Landroidx/compose/ui/Modifier$Node;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-direct {p0, v0, v3}, Landroidx/compose/ui/node/DelegatingNode;->updateNodeKindSet(IZ)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    and-int/2addr p1, v5

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    move p1, v3

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move p1, v4

    .line 95
    :goto_3
    if-eqz p1, :cond_6

    .line 96
    .line 97
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    and-int/2addr p1, v0

    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move v3, v4

    .line 106
    :goto_4
    if-nez v3, :cond_6

    .line 107
    .line 108
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeChain;->syncCoordinators()V

    .line 124
    .line 125
    .line 126
    :cond_6
    return-void

    .line 127
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    new-instance v1, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v2, "Could not find delegate: "

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0
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
.end method

.method public final undelegateUnprotected$ui_release(Landroidx/compose/ui/node/DelegatableNode;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/node/DelegatableNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/p;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->undelegate(Landroidx/compose/ui/node/DelegatableNode;)V

    return-void
.end method

.method public updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/NodeCoordinator;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
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
.end method
