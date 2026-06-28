.class public final Landroidx/compose/ui/focus/FocusRestorerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u0007\u001a\u000c\u0010\t\u001a\u00020\n*\u00020\u000bH\u0001\u001a\u000c\u0010\u000c\u001a\u00020\n*\u00020\u000bH\u0001\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\r"
    }
    d2 = {
        "PrevFocusedChild",
        "",
        "getPrevFocusedChild$annotations",
        "()V",
        "focusRestorer",
        "Landroidx/compose/ui/Modifier;",
        "onRestoreFailed",
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/focus/FocusRequester;",
        "restoreFocusedChild",
        "",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "saveFocusedChild",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nFocusRestorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,122:1\n90#2:123\n90#2:194\n276#3:124\n133#3:125\n134#3:127\n135#3,7:131\n142#3,9:139\n385#3,6:148\n395#3,2:155\n397#3,17:160\n414#3,8:180\n151#3,6:188\n276#3:195\n133#3:196\n134#3:198\n135#3,7:202\n142#3,9:210\n385#3,6:219\n395#3,2:226\n397#3,17:231\n414#3,8:251\n151#3,6:259\n1#4:126\n1#4:197\n1208#5:128\n1187#5,2:129\n1208#5:199\n1187#5,2:200\n48#6:138\n48#6:209\n261#7:154\n261#7:225\n234#8,3:157\n237#8,3:177\n234#8,3:228\n237#8,3:248\n*S KotlinDebug\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n*L\n35#1:123\n55#1:194\n35#1:124\n35#1:125\n35#1:127\n35#1:131,7\n35#1:139,9\n35#1:148,6\n35#1:155,2\n35#1:160,17\n35#1:180,8\n35#1:188,6\n55#1:195\n55#1:196\n55#1:198\n55#1:202,7\n55#1:210,9\n55#1:219,6\n55#1:226,2\n55#1:231,17\n55#1:251,8\n55#1:259,6\n35#1:126\n55#1:197\n35#1:128\n35#1:129,2\n55#1:199\n55#1:200,2\n35#1:138\n55#1:209\n35#1:154\n55#1:225\n35#1:157,3\n35#1:177,3\n55#1:228,3\n55#1:248,3\n*E\n"
    }
.end annotation


# static fields
.field private static final PrevFocusedChild:Ljava/lang/String; = "previouslyFocusedChildHash"
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public static final focusRestorer(Landroidx/compose/ui/Modifier;Lv3/a;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/a<",
            "Landroidx/compose/ui/focus/FocusRequester;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/focus/FocusRestorerElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusRestorerElement;-><init>(Lv3/a;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic focusRestorer$default(Landroidx/compose/ui/Modifier;Lv3/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusRestorerKt;->focusRestorer(Landroidx/compose/ui/Modifier;Lv3/a;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic getPrevFocusedChild$annotations()V
    .locals 0

    return-void
.end method

.method public static final restoreFocusedChild(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 11
    .param p0    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getPreviouslyFocusedChildHash()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/saveable/SaveableStateRegistryKt;->getLocalSaveableStateRegistry()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "previouslyFocusedChildHash"

    .line 20
    .line 21
    invoke-interface {v0, v1}, Landroidx/compose/runtime/saveable/SaveableStateRegistry;->consumeRestored(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->setPreviouslyFocusedChildHash(I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getPreviouslyFocusedChildHash()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    return v1

    .line 44
    :cond_1
    const/16 v0, 0x400

    .line 45
    .line 46
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_12

    .line 59
    .line 60
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 61
    .line 62
    const/16 v3, 0x10

    .line 63
    .line 64
    new-array v4, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 65
    .line 66
    invoke-direct {v2, v4, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v4, :cond_2

    .line 78
    .line 79
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v2, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_11

    .line 95
    .line 96
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const/4 v5, 0x1

    .line 101
    sub-int/2addr v4, v5

    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Landroidx/compose/ui/Modifier$Node;

    .line 107
    .line 108
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    and-int/2addr v6, v0

    .line 113
    if-nez v6, :cond_4

    .line 114
    .line 115
    invoke-static {v2, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    :goto_1
    if-eqz v4, :cond_3

    .line 120
    .line 121
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    and-int/2addr v6, v0

    .line 126
    if-eqz v6, :cond_10

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    move-object v7, v6

    .line 130
    :goto_2
    if-eqz v4, :cond_3

    .line 131
    .line 132
    instance-of v8, v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 133
    .line 134
    if-eqz v8, :cond_7

    .line 135
    .line 136
    check-cast v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 137
    .line 138
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getCompositeKeyHash()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getPreviouslyFocusedChildHash()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-ne v8, v9, :cond_f

    .line 151
    .line 152
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRestorerKt;->restoreFocusedChild(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-nez p0, :cond_5

    .line 157
    .line 158
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_6

    .line 163
    .line 164
    :cond_5
    move v1, v5

    .line 165
    :cond_6
    return v1

    .line 166
    :cond_7
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    and-int/2addr v8, v0

    .line 171
    if-eqz v8, :cond_8

    .line 172
    .line 173
    move v8, v5

    .line 174
    goto :goto_3

    .line 175
    :cond_8
    move v8, v1

    .line 176
    :goto_3
    if-eqz v8, :cond_f

    .line 177
    .line 178
    instance-of v8, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 179
    .line 180
    if-eqz v8, :cond_f

    .line 181
    .line 182
    move-object v8, v4

    .line 183
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 184
    .line 185
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    move v9, v1

    .line 190
    :goto_4
    if-eqz v8, :cond_e

    .line 191
    .line 192
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    and-int/2addr v10, v0

    .line 197
    if-eqz v10, :cond_9

    .line 198
    .line 199
    move v10, v5

    .line 200
    goto :goto_5

    .line 201
    :cond_9
    move v10, v1

    .line 202
    :goto_5
    if-eqz v10, :cond_d

    .line 203
    .line 204
    add-int/lit8 v9, v9, 0x1

    .line 205
    .line 206
    if-ne v9, v5, :cond_a

    .line 207
    .line 208
    move-object v4, v8

    .line 209
    goto :goto_6

    .line 210
    :cond_a
    if-nez v7, :cond_b

    .line 211
    .line 212
    new-instance v7, Landroidx/compose/runtime/collection/MutableVector;

    .line 213
    .line 214
    new-array v10, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 215
    .line 216
    invoke-direct {v7, v10, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 217
    .line 218
    .line 219
    :cond_b
    if-eqz v4, :cond_c

    .line 220
    .line 221
    invoke-virtual {v7, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-object v4, v6

    .line 225
    :cond_c
    invoke-virtual {v7, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_d
    :goto_6
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    goto :goto_4

    .line 233
    :cond_e
    if-ne v9, v5, :cond_f

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_f
    invoke-static {v7}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    goto :goto_2

    .line 241
    :cond_10
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    goto :goto_1

    .line 246
    :cond_11
    return v1

    .line 247
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 248
    .line 249
    const-string/jumbo v0, "visitChildren called on an unattached node"

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw p0
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

.method public static final saveFocusedChild(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 11
    .param p0    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusStateImpl;->getHasFocus()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const/16 v0, 0x400

    .line 14
    .line 15
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_10

    .line 28
    .line 29
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    new-array v4, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 34
    .line 35
    invoke-direct {v2, v4, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v2, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_0
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_f

    .line 64
    .line 65
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v5, 0x1

    .line 70
    sub-int/2addr v4, v5

    .line 71
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Landroidx/compose/ui/Modifier$Node;

    .line 76
    .line 77
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    and-int/2addr v6, v0

    .line 82
    if-nez v6, :cond_3

    .line 83
    .line 84
    invoke-static {v2, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    :goto_1
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    and-int/2addr v6, v0

    .line 95
    if-eqz v6, :cond_e

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    move-object v7, v6

    .line 99
    :goto_2
    if-eqz v4, :cond_2

    .line 100
    .line 101
    instance-of v8, v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 102
    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    check-cast v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 106
    .line 107
    invoke-virtual {v4}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v8}, Landroidx/compose/ui/focus/FocusStateImpl;->getHasFocus()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_d

    .line 116
    .line 117
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getCompositeKeyHash()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->setPreviouslyFocusedChildHash(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Landroidx/compose/runtime/saveable/SaveableStateRegistryKt;->getLocalSaveableStateRegistry()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {p0, v0}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 137
    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    new-instance v1, Landroidx/compose/ui/focus/FocusRestorerKt$saveFocusedChild$1$1;

    .line 141
    .line 142
    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusRestorerKt$saveFocusedChild$1$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 143
    .line 144
    .line 145
    const-string p0, "previouslyFocusedChildHash"

    .line 146
    .line 147
    invoke-interface {v0, p0, v1}, Landroidx/compose/runtime/saveable/SaveableStateRegistry;->registerProvider(Ljava/lang/String;Lv3/a;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;

    .line 148
    .line 149
    .line 150
    :cond_4
    return v5

    .line 151
    :cond_5
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    and-int/2addr v8, v0

    .line 156
    if-eqz v8, :cond_6

    .line 157
    .line 158
    move v8, v5

    .line 159
    goto :goto_3

    .line 160
    :cond_6
    move v8, v1

    .line 161
    :goto_3
    if-eqz v8, :cond_d

    .line 162
    .line 163
    instance-of v8, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 164
    .line 165
    if-eqz v8, :cond_d

    .line 166
    .line 167
    move-object v8, v4

    .line 168
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 169
    .line 170
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    move v9, v1

    .line 175
    :goto_4
    if-eqz v8, :cond_c

    .line 176
    .line 177
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    and-int/2addr v10, v0

    .line 182
    if-eqz v10, :cond_7

    .line 183
    .line 184
    move v10, v5

    .line 185
    goto :goto_5

    .line 186
    :cond_7
    move v10, v1

    .line 187
    :goto_5
    if-eqz v10, :cond_b

    .line 188
    .line 189
    add-int/lit8 v9, v9, 0x1

    .line 190
    .line 191
    if-ne v9, v5, :cond_8

    .line 192
    .line 193
    move-object v4, v8

    .line 194
    goto :goto_6

    .line 195
    :cond_8
    if-nez v7, :cond_9

    .line 196
    .line 197
    new-instance v7, Landroidx/compose/runtime/collection/MutableVector;

    .line 198
    .line 199
    new-array v10, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 200
    .line 201
    invoke-direct {v7, v10, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 202
    .line 203
    .line 204
    :cond_9
    if-eqz v4, :cond_a

    .line 205
    .line 206
    invoke-virtual {v7, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-object v4, v6

    .line 210
    :cond_a
    invoke-virtual {v7, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :cond_b
    :goto_6
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    goto :goto_4

    .line 218
    :cond_c
    if-ne v9, v5, :cond_d

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_d
    invoke-static {v7}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    goto :goto_2

    .line 226
    :cond_e
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_f
    return v1

    .line 233
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    const-string/jumbo v0, "visitChildren called on an unattached node"

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p0
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
