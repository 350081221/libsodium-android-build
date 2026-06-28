.class public final Landroidx/compose/ui/focus/FocusRequester;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusRequester$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0083\u0008J\u0006\u0010\u0008\u001a\u00020\u0007J\u000f\u0010\u000b\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u000c\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0008\u0010\u000e\u001a\u00020\u0004H\u0007J\u0008\u0010\u000f\u001a\u00020\u0004H\u0007R \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusRequester;",
        "",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "",
        "onFound",
        "findFocusTarget",
        "Lkotlin/r2;",
        "requestFocus",
        "focus$ui_release",
        "()Z",
        "focus",
        "captureFocus",
        "freeFocus",
        "saveFocusedChild",
        "restoreFocusedChild",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
        "focusRequesterNodes",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "getFocusRequesterNodes$ui_release",
        "()Landroidx/compose/runtime/collection/MutableVector;",
        "<init>",
        "()V",
        "Companion",
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
        "SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,252:1\n237#1:256\n238#1,4:258\n242#1:269\n243#1,5:299\n248#1:345\n249#1:350\n1208#2:253\n1187#2,2:254\n1208#2:274\n1187#2,2:275\n1208#2:408\n1187#2,2:409\n1#3:257\n1#3:351\n1#3:406\n460#4,7:262\n48#4:284\n467#4,4:346\n460#4,11:352\n460#4,11:363\n460#4,11:374\n460#4,11:385\n460#4,7:396\n48#4:418\n467#4,4:474\n90#5:270\n90#5:403\n276#6:271\n133#6,2:272\n135#6,7:277\n142#6,9:285\n385#6,5:294\n390#6:304\n395#6,2:306\n397#6,17:311\n414#6,8:331\n151#6,6:339\n276#6:404\n133#6:405\n134#6:407\n135#6,7:411\n142#6,9:419\n385#6,6:428\n395#6,2:435\n397#6,17:440\n414#6,8:460\n151#6,6:468\n261#7:305\n261#7:434\n234#8,3:308\n237#8,3:328\n234#8,3:437\n237#8,3:457\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n71#1:256\n71#1:258,4\n71#1:269\n71#1:299,5\n71#1:345\n71#1:350\n55#1:253\n55#1:254,2\n71#1:274\n71#1:275,2\n242#1:408\n242#1:409,2\n71#1:257\n242#1:406\n71#1:262,7\n71#1:284\n71#1:346,4\n100#1:352,11\n124#1:363,11\n145#1:374,11\n165#1:385,11\n241#1:396,7\n242#1:418\n241#1:474,4\n71#1:270\n242#1:403\n71#1:271\n71#1:272,2\n71#1:277,7\n71#1:285,9\n71#1:294,5\n71#1:304\n71#1:306,2\n71#1:311,17\n71#1:331,8\n71#1:339,6\n242#1:404\n242#1:405\n242#1:407\n242#1:411,7\n242#1:419,9\n242#1:428,6\n242#1:435,2\n242#1:440,17\n242#1:460,8\n242#1:468,6\n71#1:305\n242#1:434\n71#1:308,3\n71#1:328,3\n242#1:437,3\n242#1:457,3\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Cancel:Landroidx/compose/ui/focus/FocusRequester;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Default:Landroidx/compose/ui/focus/FocusRequester;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Default:Landroidx/compose/ui/focus/FocusRequester;

    .line 15
    .line 16
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 17
    .line 18
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Cancel:Landroidx/compose/ui/focus/FocusRequester;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
.end method

.method public static final synthetic access$getCancel$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Cancel:Landroidx/compose/ui/focus/FocusRequester;

    return-object v0
.end method

.method public static final synthetic access$getDefault$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Default:Landroidx/compose/ui/focus/FocusRequester;

    return-object v0
.end method

.method private final findFocusTarget(Lv3/l;)Z
    .locals 17
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    move v2, v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v3

    .line 16
    :goto_0
    const-string v5, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 17
    .line 18
    if-eqz v2, :cond_15

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    move v1, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v3

    .line 29
    :goto_1
    if-eqz v1, :cond_14

    .line 30
    .line 31
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_13

    .line 38
    .line 39
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-lez v2, :cond_12

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move v5, v3

    .line 52
    move v6, v5

    .line 53
    :cond_2
    aget-object v7, v1, v5

    .line 54
    .line 55
    check-cast v7, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 56
    .line 57
    const/16 v8, 0x400

    .line 58
    .line 59
    invoke-static {v8}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    invoke-interface {v7}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_11

    .line 72
    .line 73
    new-instance v9, Landroidx/compose/runtime/collection/MutableVector;

    .line 74
    .line 75
    const/16 v10, 0x10

    .line 76
    .line 77
    new-array v11, v10, [Landroidx/compose/ui/Modifier$Node;

    .line 78
    .line 79
    invoke-direct {v9, v11, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v7}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    if-nez v11, :cond_3

    .line 91
    .line 92
    invoke-interface {v7}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v9, v7}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-virtual {v9, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :goto_2
    invoke-virtual {v9}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_10

    .line 108
    .line 109
    invoke-virtual {v9}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    sub-int/2addr v7, v4

    .line 114
    invoke-virtual {v9, v7}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    check-cast v7, Landroidx/compose/ui/Modifier$Node;

    .line 119
    .line 120
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    and-int/2addr v11, v8

    .line 125
    if-nez v11, :cond_4

    .line 126
    .line 127
    invoke-static {v9, v7}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    :goto_3
    if-eqz v7, :cond_f

    .line 132
    .line 133
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    and-int/2addr v11, v8

    .line 138
    if-eqz v11, :cond_e

    .line 139
    .line 140
    const/4 v12, 0x0

    .line 141
    :goto_4
    if-eqz v7, :cond_f

    .line 142
    .line 143
    instance-of v13, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 144
    .line 145
    if-eqz v13, :cond_5

    .line 146
    .line 147
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 148
    .line 149
    move-object/from16 v13, p1

    .line 150
    .line 151
    invoke-interface {v13, v7}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-eqz v7, :cond_d

    .line 162
    .line 163
    move v6, v4

    .line 164
    goto/16 :goto_9

    .line 165
    .line 166
    :cond_5
    move-object/from16 v13, p1

    .line 167
    .line 168
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    and-int/2addr v14, v8

    .line 173
    if-eqz v14, :cond_6

    .line 174
    .line 175
    move v14, v4

    .line 176
    goto :goto_5

    .line 177
    :cond_6
    move v14, v3

    .line 178
    :goto_5
    if-eqz v14, :cond_d

    .line 179
    .line 180
    instance-of v14, v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 181
    .line 182
    if-eqz v14, :cond_d

    .line 183
    .line 184
    move-object v14, v7

    .line 185
    check-cast v14, Landroidx/compose/ui/node/DelegatingNode;

    .line 186
    .line 187
    invoke-virtual {v14}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    move v15, v3

    .line 192
    :goto_6
    if-eqz v14, :cond_c

    .line 193
    .line 194
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 195
    .line 196
    .line 197
    move-result v16

    .line 198
    and-int v16, v16, v8

    .line 199
    .line 200
    if-eqz v16, :cond_7

    .line 201
    .line 202
    move/from16 v16, v4

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_7
    move/from16 v16, v3

    .line 206
    .line 207
    :goto_7
    if-eqz v16, :cond_b

    .line 208
    .line 209
    add-int/lit8 v15, v15, 0x1

    .line 210
    .line 211
    if-ne v15, v4, :cond_8

    .line 212
    .line 213
    move-object v7, v14

    .line 214
    goto :goto_8

    .line 215
    :cond_8
    if-nez v12, :cond_9

    .line 216
    .line 217
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 218
    .line 219
    new-array v11, v10, [Landroidx/compose/ui/Modifier$Node;

    .line 220
    .line 221
    invoke-direct {v12, v11, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 222
    .line 223
    .line 224
    :cond_9
    if-eqz v7, :cond_a

    .line 225
    .line 226
    invoke-virtual {v12, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    :cond_a
    invoke-virtual {v12, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    :cond_b
    :goto_8
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    goto :goto_6

    .line 238
    :cond_c
    if-ne v15, v4, :cond_d

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_d
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    goto :goto_4

    .line 246
    :cond_e
    move-object/from16 v13, p1

    .line 247
    .line 248
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    goto :goto_3

    .line 253
    :cond_f
    move-object/from16 v13, p1

    .line 254
    .line 255
    goto/16 :goto_2

    .line 256
    .line 257
    :cond_10
    move-object/from16 v13, p1

    .line 258
    .line 259
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 260
    .line 261
    if-lt v5, v2, :cond_2

    .line 262
    .line 263
    move v3, v6

    .line 264
    goto :goto_a

    .line 265
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 266
    .line 267
    const-string/jumbo v2, "visitChildren called on an unattached node"

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v1

    .line 278
    :cond_12
    :goto_a
    return v3

    .line 279
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    const-string v2, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v1

    .line 291
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v1

    .line 301
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 302
    .line 303
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v1
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


# virtual methods
.method public final captureFocus()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-lez v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move v3, v2

    .line 23
    :cond_0
    aget-object v4, v0, v3

    .line 24
    .line 25
    check-cast v4, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 26
    .line 27
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->captureFocus(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    if-lt v3, v1, :cond_0

    .line 38
    .line 39
    :cond_2
    return v2

    .line 40
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public final focus$ui_release()Z
    .locals 15

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq p0, v1, :cond_0

    .line 10
    .line 11
    move v1, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    const-string v4, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 15
    .line 16
    if-eqz v1, :cond_16

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    move v0, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, v2

    .line 27
    :goto_1
    if-eqz v0, :cond_15

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_14

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-lez v1, :cond_13

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move v4, v2

    .line 50
    move v5, v4

    .line 51
    :cond_2
    aget-object v6, v0, v4

    .line 52
    .line 53
    check-cast v6, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 54
    .line 55
    const/16 v7, 0x400

    .line 56
    .line 57
    invoke-static {v7}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_12

    .line 70
    .line 71
    new-instance v8, Landroidx/compose/runtime/collection/MutableVector;

    .line 72
    .line 73
    const/16 v9, 0x10

    .line 74
    .line 75
    new-array v10, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 76
    .line 77
    invoke-direct {v8, v10, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    if-nez v10, :cond_3

    .line 89
    .line 90
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static {v8, v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_2
    invoke-virtual {v8}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_11

    .line 106
    .line 107
    invoke-virtual {v8}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    sub-int/2addr v6, v3

    .line 112
    invoke-virtual {v8, v6}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Landroidx/compose/ui/Modifier$Node;

    .line 117
    .line 118
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    and-int/2addr v10, v7

    .line 123
    if-nez v10, :cond_5

    .line 124
    .line 125
    invoke-static {v8, v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    :goto_3
    if-eqz v6, :cond_4

    .line 130
    .line 131
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    and-int/2addr v10, v7

    .line 136
    if-eqz v10, :cond_10

    .line 137
    .line 138
    const/4 v10, 0x0

    .line 139
    move-object v11, v10

    .line 140
    :goto_4
    if-eqz v6, :cond_4

    .line 141
    .line 142
    instance-of v12, v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 143
    .line 144
    if-eqz v12, :cond_7

    .line 145
    .line 146
    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 147
    .line 148
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    invoke-interface {v12}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-eqz v12, :cond_6

    .line 157
    .line 158
    invoke-static {v6}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    goto :goto_5

    .line 163
    :cond_6
    sget-object v12, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 164
    .line 165
    invoke-virtual {v12}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    sget-object v13, Landroidx/compose/ui/focus/FocusRequester$focus$1$1;->INSTANCE:Landroidx/compose/ui/focus/FocusRequester$focus$1$1;

    .line 170
    .line 171
    invoke-static {v6, v12, v13}, Landroidx/compose/ui/focus/TwoDimensionalFocusSearchKt;->findChildCorrespondingToFocusEnter--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    :goto_5
    if-eqz v6, :cond_f

    .line 176
    .line 177
    move v5, v3

    .line 178
    goto :goto_a

    .line 179
    :cond_7
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    and-int/2addr v12, v7

    .line 184
    if-eqz v12, :cond_8

    .line 185
    .line 186
    move v12, v3

    .line 187
    goto :goto_6

    .line 188
    :cond_8
    move v12, v2

    .line 189
    :goto_6
    if-eqz v12, :cond_f

    .line 190
    .line 191
    instance-of v12, v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 192
    .line 193
    if-eqz v12, :cond_f

    .line 194
    .line 195
    move-object v12, v6

    .line 196
    check-cast v12, Landroidx/compose/ui/node/DelegatingNode;

    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    move v13, v2

    .line 203
    :goto_7
    if-eqz v12, :cond_e

    .line 204
    .line 205
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 206
    .line 207
    .line 208
    move-result v14

    .line 209
    and-int/2addr v14, v7

    .line 210
    if-eqz v14, :cond_9

    .line 211
    .line 212
    move v14, v3

    .line 213
    goto :goto_8

    .line 214
    :cond_9
    move v14, v2

    .line 215
    :goto_8
    if-eqz v14, :cond_d

    .line 216
    .line 217
    add-int/lit8 v13, v13, 0x1

    .line 218
    .line 219
    if-ne v13, v3, :cond_a

    .line 220
    .line 221
    move-object v6, v12

    .line 222
    goto :goto_9

    .line 223
    :cond_a
    if-nez v11, :cond_b

    .line 224
    .line 225
    new-instance v11, Landroidx/compose/runtime/collection/MutableVector;

    .line 226
    .line 227
    new-array v14, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 228
    .line 229
    invoke-direct {v11, v14, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 230
    .line 231
    .line 232
    :cond_b
    if-eqz v6, :cond_c

    .line 233
    .line 234
    invoke-virtual {v11, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-object v6, v10

    .line 238
    :cond_c
    invoke-virtual {v11, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    :cond_d
    :goto_9
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    goto :goto_7

    .line 246
    :cond_e
    if-ne v13, v3, :cond_f

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_f
    invoke-static {v11}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    goto :goto_4

    .line 254
    :cond_10
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    goto/16 :goto_3

    .line 259
    .line 260
    :cond_11
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 261
    .line 262
    if-lt v4, v1, :cond_2

    .line 263
    .line 264
    move v2, v5

    .line 265
    goto :goto_b

    .line 266
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 267
    .line 268
    const-string/jumbo v1, "visitChildren called on an unattached node"

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v0

    .line 279
    :cond_13
    :goto_b
    return v2

    .line 280
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 281
    .line 282
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v0

    .line 292
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 293
    .line 294
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method public final freeFocus()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-lez v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move v3, v2

    .line 23
    :cond_0
    aget-object v4, v0, v3

    .line 24
    .line 25
    check-cast v4, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 26
    .line 27
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->freeFocus(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    if-lt v3, v1, :cond_0

    .line 38
    .line 39
    :cond_2
    return v2

    .line 40
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public final getFocusRequesterNodes$ui_release()Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    return-object v0
.end method

.method public final requestFocus()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusRequester;->focus$ui_release()Z

    return-void
.end method

.method public final restoreFocusedChild()Z
    .locals 6
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-lez v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move v3, v2

    .line 23
    move v4, v3

    .line 24
    :cond_0
    aget-object v5, v0, v3

    .line 25
    .line 26
    check-cast v5, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 27
    .line 28
    invoke-static {v5}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->restoreFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v4, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v4, 0x1

    .line 40
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    if-lt v3, v1, :cond_0

    .line 43
    .line 44
    move v2, v4

    .line 45
    :cond_3
    return v2

    .line 46
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
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

.method public final saveFocusedChild()Z
    .locals 5
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-lez v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move v3, v2

    .line 23
    :cond_0
    aget-object v4, v0, v3

    .line 24
    .line 25
    check-cast v4, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 26
    .line 27
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->saveFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    if-lt v3, v1, :cond_0

    .line 38
    .line 39
    :cond_2
    return v2

    .line 40
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
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
