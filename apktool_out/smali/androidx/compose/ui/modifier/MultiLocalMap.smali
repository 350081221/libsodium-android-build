.class public final Landroidx/compose/ui/modifier/MultiLocalMap;
.super Landroidx/compose/ui/modifier/ModifierLocalMap;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B?\u00126\u0010\u0017\u001a\u001c\u0012\u0018\u0008\u0001\u0012\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00160\u0015\"\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J,\u0010\t\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J&\u0010\u000c\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0090\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR&\u0010\u0013\u001a\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/modifier/MultiLocalMap;",
        "Landroidx/compose/ui/modifier/ModifierLocalMap;",
        "T",
        "Landroidx/compose/ui/modifier/ModifierLocal;",
        "key",
        "value",
        "Lkotlin/r2;",
        "set$ui_release",
        "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V",
        "set",
        "get$ui_release",
        "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;",
        "get",
        "",
        "contains$ui_release",
        "(Landroidx/compose/ui/modifier/ModifierLocal;)Z",
        "contains",
        "Landroidx/compose/runtime/snapshots/SnapshotStateMap;",
        "",
        "map",
        "Landroidx/compose/runtime/snapshots/SnapshotStateMap;",
        "",
        "Lkotlin/u0;",
        "entries",
        "<init>",
        "([Lkotlin/u0;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final map:Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Landroidx/compose/ui/modifier/ModifierLocal<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public varargs constructor <init>([Lkotlin/u0;)V
    .locals 1
    .param p1    # [Lkotlin/u0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/u0<",
            "+",
            "Landroidx/compose/ui/modifier/ModifierLocal<",
            "*>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/modifier/ModifierLocalMap;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateMapOf()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Landroidx/compose/ui/modifier/MultiLocalMap;->map:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/collections/x0;->H0([Lkotlin/u0;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->putAll(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
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


# virtual methods
.method public contains$ui_release(Landroidx/compose/ui/modifier/ModifierLocal;)Z
    .locals 1
    .param p1    # Landroidx/compose/ui/modifier/ModifierLocal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/modifier/ModifierLocal<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/modifier/MultiLocalMap;->map:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get$ui_release(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroidx/compose/ui/modifier/ModifierLocal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/modifier/ModifierLocal<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/modifier/MultiLocalMap;->map:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public set$ui_release(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/modifier/ModifierLocal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/modifier/ModifierLocal<",
            "TT;>;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/modifier/MultiLocalMap;->map:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
