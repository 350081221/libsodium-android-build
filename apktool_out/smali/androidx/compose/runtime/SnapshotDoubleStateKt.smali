.class public final Landroidx/compose/runtime/SnapshotDoubleStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"
    }
    k = 0x4
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getValue(Landroidx/compose/runtime/DoubleState;Ljava/lang/Object;Lkotlin/reflect/o;)D
    .locals 0
    .param p0    # Landroidx/compose/runtime/DoubleState;
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
            "Landroidx/compose/runtime/DoubleState;",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/o<",
            "*>;)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt;->getValue(Landroidx/compose/runtime/DoubleState;Ljava/lang/Object;Lkotlin/reflect/o;)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final mutableDoubleStateOf(D)Landroidx/compose/runtime/MutableDoubleState;
    .locals 0
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt;->mutableDoubleStateOf(D)Landroidx/compose/runtime/MutableDoubleState;

    move-result-object p0

    return-object p0
.end method

.method public static final setValue(Landroidx/compose/runtime/MutableDoubleState;Ljava/lang/Object;Lkotlin/reflect/o;D)V
    .locals 0
    .param p0    # Landroidx/compose/runtime/MutableDoubleState;
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
            "Landroidx/compose/runtime/MutableDoubleState;",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/o<",
            "*>;D)V"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt;->setValue(Landroidx/compose/runtime/MutableDoubleState;Ljava/lang/Object;Lkotlin/reflect/o;D)V

    return-void
.end method
