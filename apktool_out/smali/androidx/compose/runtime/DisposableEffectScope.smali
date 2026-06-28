.class public final Landroidx/compose/runtime/DisposableEffectScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0004\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onDisposeEffect",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "onDispose",
        "<init>",
        "()V",
        "runtime_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDispose(Lv3/a;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/runtime/DisposableEffectResult;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/runtime/DisposableEffectScope$onDispose$1;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/DisposableEffectScope$onDispose$1;-><init>(Lv3/a;)V

    return-object v0
.end method
