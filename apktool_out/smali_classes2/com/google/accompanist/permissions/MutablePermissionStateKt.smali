.class public final Lcom/google/accompanist/permissions/MutablePermissionStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "permission",
        "Lcom/google/accompanist/permissions/e;",
        "a",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/e;",
        "permissions_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/e;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lcom/google/accompanist/permissions/a;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string p2, "permission"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const p2, -0x716e8c9e

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Landroid/content/Context;

    .line 21
    .line 22
    const v0, -0x384212

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-ne v1, v0, :cond_1

    .line 45
    .line 46
    :cond_0
    new-instance v1, Lcom/google/accompanist/permissions/e;

    .line 47
    .line 48
    invoke-static {p2}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->h(Landroid/content/Context;)Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v1, p0, p2, v0}, Lcom/google/accompanist/permissions/e;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 59
    .line 60
    .line 61
    check-cast v1, Lcom/google/accompanist/permissions/e;

    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    const/4 p2, 0x2

    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-static {v1, v0, p1, p0, p2}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->c(Lcom/google/accompanist/permissions/e;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 70
    .line 71
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance p2, Lcom/google/accompanist/permissions/MutablePermissionStateKt$a;

    .line 75
    .line 76
    invoke-direct {p2, v1}, Lcom/google/accompanist/permissions/MutablePermissionStateKt$a;-><init>(Lcom/google/accompanist/permissions/e;)V

    .line 77
    .line 78
    .line 79
    const/16 v0, 0x8

    .line 80
    .line 81
    invoke-static {p0, p2, p1, v0}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p2, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;

    .line 86
    .line 87
    invoke-direct {p2, v1, p0}, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;-><init>(Lcom/google/accompanist/permissions/e;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    .line 88
    .line 89
    .line 90
    sget v0, Landroidx/activity/compose/ManagedActivityResultLauncher;->$stable:I

    .line 91
    .line 92
    shl-int/lit8 v0, v0, 0x3

    .line 93
    .line 94
    invoke-static {v1, p0, p2, p1, v0}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 98
    .line 99
    .line 100
    return-object v1
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
.end method
