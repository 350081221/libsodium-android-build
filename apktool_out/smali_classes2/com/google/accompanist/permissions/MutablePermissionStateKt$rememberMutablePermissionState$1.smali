.class final Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/accompanist/permissions/MutablePermissionStateKt;->a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $launcher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $permissionState:Lcom/google/accompanist/permissions/e;


# direct methods
.method constructor <init>(Lcom/google/accompanist/permissions/e;Landroidx/activity/compose/ManagedActivityResultLauncher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/accompanist/permissions/e;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;->$permissionState:Lcom/google/accompanist/permissions/e;

    iput-object p2, p0, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;->$launcher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1
    .param p1    # Landroidx/compose/runtime/DisposableEffectScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;->$permissionState:Lcom/google/accompanist/permissions/e;

    iget-object v0, p0, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;->$launcher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-virtual {p1, v0}, Lcom/google/accompanist/permissions/e;->k(Landroidx/activity/result/ActivityResultLauncher;)V

    .line 3
    iget-object p1, p0, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;->$permissionState:Lcom/google/accompanist/permissions/e;

    .line 4
    new-instance v0, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1$invoke$$inlined$onDispose$1;

    invoke-direct {v0, p1}, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1$invoke$$inlined$onDispose$1;-><init>(Lcom/google/accompanist/permissions/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-virtual {p0, p1}, Lcom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
