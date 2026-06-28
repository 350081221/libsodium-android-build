.class public final Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;
.super Landroidx/compose/ui/modifier/ModifierLocalMap;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\u0008\u00030\u0011\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J,\u0010\t\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J&\u0010\u000c\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0090\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR&\u0010\u0012\u001a\u0006\u0012\u0002\u0008\u00030\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;",
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
        "Landroidx/compose/ui/modifier/ModifierLocalProvider;",
        "element",
        "Landroidx/compose/ui/modifier/ModifierLocalProvider;",
        "getElement",
        "()Landroidx/compose/ui/modifier/ModifierLocalProvider;",
        "setElement",
        "(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private element:Landroidx/compose/ui/modifier/ModifierLocalProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/modifier/ModifierLocalProvider<",
            "*>;"
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

.method public constructor <init>(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/modifier/ModifierLocalProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/modifier/ModifierLocalProvider<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/modifier/ModifierLocalMap;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;->element:Landroidx/compose/ui/modifier/ModifierLocalProvider;

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

    iget-object v0, p0, Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;->element:Landroidx/compose/ui/modifier/ModifierLocalProvider;

    invoke-interface {v0}, Landroidx/compose/ui/modifier/ModifierLocalProvider;->getKey()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
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

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;->element:Landroidx/compose/ui/modifier/ModifierLocalProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/ui/modifier/ModifierLocalProvider;->getKey()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;->element:Landroidx/compose/ui/modifier/ModifierLocalProvider;

    .line 15
    .line 16
    invoke-interface {p1}, Landroidx/compose/ui/modifier/ModifierLocalProvider;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "Check failed."

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public final getElement()Landroidx/compose/ui/modifier/ModifierLocalProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/modifier/ModifierLocalProvider<",
            "*>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;->element:Landroidx/compose/ui/modifier/ModifierLocalProvider;

    return-object v0
.end method

.method public set$ui_release(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V
    .locals 0
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

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p2, "Set is not allowed on a backwards compat provider"

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p1
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
.end method

.method public final setElement(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/modifier/ModifierLocalProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/modifier/ModifierLocalProvider<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;->element:Landroidx/compose/ui/modifier/ModifierLocalProvider;

    return-void
.end method
