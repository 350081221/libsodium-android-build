.class public final Landroidx/activity/compose/ActivityResultRegistryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aO\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "I",
        "O",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "contract",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "onResult",
        "Landroidx/activity/compose/ManagedActivityResultLauncher;",
        "rememberLauncherForActivityResult",
        "(Landroidx/activity/result/contract/ActivityResultContract;Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;",
        "activity-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n955#2,6:162\n955#2,6:168\n955#2,6:174\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162,6\n98#1:168,6\n104#1:174,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;
    .locals 15
    .param p0    # Landroidx/activity/result/contract/ActivityResultContract;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "TI;TO;>;",
            "Lv3/l<",
            "-TO;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "TI;TO;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object v6, p0

    .line 2
    move-object/from16 v14, p2

    .line 3
    .line 4
    const v0, -0x53f413f7

    .line 5
    .line 6
    .line 7
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v0, p3, 0xe

    .line 11
    .line 12
    invoke-static {p0, v14, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    shr-int/lit8 v1, p3, 0x3

    .line 17
    .line 18
    and-int/lit8 v1, v1, 0xe

    .line 19
    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v1, 0x0

    .line 27
    new-array v7, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x0

    .line 31
    sget-object v10, Landroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1;->INSTANCE:Landroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1;

    .line 32
    .line 33
    const/16 v12, 0xc00

    .line 34
    .line 35
    const/4 v13, 0x6

    .line 36
    move-object/from16 v11, p2

    .line 37
    .line 38
    invoke-static/range {v7 .. v13}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v7, v1

    .line 43
    check-cast v7, Ljava/lang/String;

    .line 44
    .line 45
    sget-object v1, Landroidx/activity/compose/LocalActivityResultRegistryOwner;->INSTANCE:Landroidx/activity/compose/LocalActivityResultRegistryOwner;

    .line 46
    .line 47
    const/4 v8, 0x6

    .line 48
    invoke-virtual {v1, v14, v8}, Landroidx/activity/compose/LocalActivityResultRegistryOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    invoke-interface {v1}, Landroidx/activity/result/ActivityResultRegistryOwner;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    const v1, -0x63b461e4

    .line 59
    .line 60
    .line 61
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-ne v1, v3, :cond_0

    .line 75
    .line 76
    new-instance v1, Landroidx/activity/compose/ActivityResultLauncherHolder;

    .line 77
    .line 78
    invoke-direct {v1}, Landroidx/activity/compose/ActivityResultLauncherHolder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    check-cast v1, Landroidx/activity/compose/ActivityResultLauncherHolder;

    .line 85
    .line 86
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 87
    .line 88
    .line 89
    const v3, -0x63b4619a

    .line 90
    .line 91
    .line 92
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-ne v3, v4, :cond_1

    .line 104
    .line 105
    new-instance v3, Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 106
    .line 107
    invoke-direct {v3, v1, v0}, Landroidx/activity/compose/ManagedActivityResultLauncher;-><init>(Landroidx/activity/compose/ActivityResultLauncherHolder;Landroidx/compose/runtime/State;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    move-object v10, v3

    .line 114
    check-cast v10, Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 115
    .line 116
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 117
    .line 118
    .line 119
    const v0, -0x63b4608e

    .line 120
    .line 121
    .line 122
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    or-int/2addr v0, v3

    .line 134
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    or-int/2addr v0, v3

    .line 139
    invoke-interface {v14, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    or-int/2addr v0, v3

    .line 144
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    or-int/2addr v0, v3

    .line 149
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-nez v0, :cond_2

    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-ne v3, v0, :cond_3

    .line 160
    .line 161
    :cond_2
    new-instance v11, Landroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1;

    .line 162
    .line 163
    move-object v0, v11

    .line 164
    move-object v2, v9

    .line 165
    move-object v3, v7

    .line 166
    move-object v4, p0

    .line 167
    invoke-direct/range {v0 .. v5}, Landroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1;-><init>(Landroidx/activity/compose/ActivityResultLauncherHolder;Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/compose/runtime/State;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-object v3, v11

    .line 174
    :cond_3
    check-cast v3, Lv3/l;

    .line 175
    .line 176
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 177
    .line 178
    .line 179
    shl-int/lit8 v0, p3, 0x6

    .line 180
    .line 181
    and-int/lit16 v5, v0, 0x380

    .line 182
    .line 183
    move-object v0, v9

    .line 184
    move-object v1, v7

    .line 185
    move-object v2, p0

    .line 186
    move-object/from16 v4, p2

    .line 187
    .line 188
    invoke-static/range {v0 .. v5}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 189
    .line 190
    .line 191
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 192
    .line 193
    .line 194
    return-object v10

    .line 195
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 196
    .line 197
    const-string v1, "No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner"

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
