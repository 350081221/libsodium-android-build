.class public final Landroidx/compose/ui/node/ObserverModifierNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\u000c\u0008\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/ObserverModifierNode;",
        "T",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "block",
        "observeReads",
        "(Landroidx/compose/ui/Modifier$Node;Lv3/a;)V",
        "ui_release"
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
        "SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"
    }
.end annotation


# direct methods
.method public static final observeReads(Landroidx/compose/ui/Modifier$Node;Lv3/a;)V
    .locals 2
    .param p0    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/compose/ui/Modifier$Node;",
            ":",
            "Landroidx/compose/ui/node/ObserverModifierNode;",
            ">(TT;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getOwnerScope$ui_release()Landroidx/compose/ui/node/ObserverNodeOwnerScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    check-cast v1, Landroidx/compose/ui/node/ObserverModifierNode;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/ObserverNodeOwnerScope;-><init>(Landroidx/compose/ui/node/ObserverModifierNode;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/compose/ui/Modifier$Node;->setOwnerScope$ui_release(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->Companion:Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;->getOnObserveReadsChanged$ui_release()Lv3/l;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0, v0, v1, p1}, Landroidx/compose/ui/node/OwnerSnapshotObserver;->observeReads$ui_release(Landroidx/compose/ui/node/OwnerScope;Lv3/l;Lv3/a;)V

    .line 33
    .line 34
    .line 35
    return-void
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
