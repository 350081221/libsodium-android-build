.class public final Lcom/google/accompanist/permissions/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/accompanist/permissions/f;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation build Lcom/google/accompanist/permissions/a;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008+\u0010,J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0012R+\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR+\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u0008\u0010\u0018\"\u0004\u0008\u001d\u0010\u001aR+\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\u0016\u001a\u0004\u0008\u000e\u0010\u0018\"\u0004\u0008 \u0010\u001aR*\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010#\u001a\u0004\u0008\u001f\u0010$\"\u0004\u0008%\u0010&R$\u0010*\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00148V@PX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u0018\"\u0004\u0008)\u0010\u001a\u00a8\u0006-"
    }
    d2 = {
        "Lcom/google/accompanist/permissions/e;",
        "Lcom/google/accompanist/permissions/f;",
        "Lkotlin/r2;",
        "i",
        "c",
        "h",
        "()V",
        "",
        "a",
        "Ljava/lang/String;",
        "d",
        "()Ljava/lang/String;",
        "permission",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/Activity;",
        "Landroid/app/Activity;",
        "activity",
        "",
        "<set-?>",
        "Landroidx/compose/runtime/MutableState;",
        "g",
        "()Z",
        "n",
        "(Z)V",
        "_hasPermission",
        "e",
        "m",
        "shouldShowRationale",
        "f",
        "l",
        "permissionRequested",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "()Landroidx/activity/result/ActivityResultLauncher;",
        "k",
        "(Landroidx/activity/result/ActivityResultLauncher;)V",
        "launcher",
        "value",
        "j",
        "hasPermission",
        "<init>",
        "(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Landroid/content/Context;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final c:Landroid/app/Activity;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final d:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final e:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final f:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private g:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "permission"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "activity"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/google/accompanist/permissions/e;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/google/accompanist/permissions/e;->b:Landroid/content/Context;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/google/accompanist/permissions/e;->c:Landroid/app/Activity;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/accompanist/permissions/e;->d()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p2, p1}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->g(Landroid/content/Context;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 p2, 0x0

    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lcom/google/accompanist/permissions/e;->d:Landroidx/compose/runtime/MutableState;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/accompanist/permissions/e;->d()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p3, p1}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->i(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lcom/google/accompanist/permissions/e;->e:Landroidx/compose/runtime/MutableState;

    .line 62
    .line 63
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lcom/google/accompanist/permissions/e;->f:Landroidx/compose/runtime/MutableState;

    .line 70
    .line 71
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
.end method

.method private final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->d:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private final i()V
    .locals 2

    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->c:Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/google/accompanist/permissions/e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->i(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/accompanist/permissions/e;->m(Z)V

    return-void
.end method

.method private m(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->e:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private final n(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->d:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->e:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->f:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/google/accompanist/permissions/e;->d()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 15
    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "ActivityResultLauncher cannot be null"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
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
.end method

.method public d()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/accompanist/permissions/e;->g()Z

    move-result v0

    return v0
.end method

.method public final f()Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->g:Landroidx/activity/result/ActivityResultLauncher;

    return-object v0
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->b:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/google/accompanist/permissions/e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/accompanist/permissions/e;->j(Z)V

    return-void
.end method

.method public j(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/accompanist/permissions/e;->n(Z)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/accompanist/permissions/e;->i()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final k(Landroidx/activity/result/ActivityResultLauncher;)V
    .locals 0
    .param p1    # Landroidx/activity/result/ActivityResultLauncher;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/accompanist/permissions/e;->g:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public l(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/permissions/e;->f:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
