.class final synthetic Landroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\u0007H\u0086\n\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "value",
        "Landroidx/compose/runtime/MutableIntState;",
        "mutableIntStateOf",
        "Landroidx/compose/runtime/IntState;",
        "",
        "thisObj",
        "Lkotlin/reflect/o;",
        "property",
        "getValue",
        "Lkotlin/r2;",
        "setValue",
        "runtime_release"
    }
    k = 0x5
    mv = {
        0x1,
        0x8,
        0x0
    }
    xs = "androidx/compose/runtime/SnapshotIntStateKt"
.end annotation


# direct methods
.method public static final getValue(Landroidx/compose/runtime/IntState;Ljava/lang/Object;Lkotlin/reflect/o;)I
    .locals 0
    .param p0    # Landroidx/compose/runtime/IntState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/o;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/IntState;",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/o<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    move-result p0

    return p0
.end method

.method public static final mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;
    .locals 0
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/ActualAndroid_androidKt;->createSnapshotMutableIntState(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object p0

    return-object p0
.end method

.method public static final setValue(Landroidx/compose/runtime/MutableIntState;Ljava/lang/Object;Lkotlin/reflect/o;I)V
    .locals 0
    .param p0    # Landroidx/compose/runtime/MutableIntState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/o;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableIntState;",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/o<",
            "*>;I)V"
        }
    .end annotation

    invoke-interface {p0, p3}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    return-void
.end method
