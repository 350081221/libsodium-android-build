.class public interface abstract Landroidx/compose/foundation/text/selection/SelectionRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008`\u0018\u0000 $2\u00020\u0001:\u0001$J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J2\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&JB\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00f8\u0001\u0001\u0082\u0002\r\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u0006%\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
        "",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "selectable",
        "subscribe",
        "Lkotlin/r2;",
        "unsubscribe",
        "",
        "nextSelectableId",
        "selectableId",
        "notifyPositionChange",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "layoutCoordinates",
        "Landroidx/compose/ui/geometry/Offset;",
        "startPosition",
        "Landroidx/compose/foundation/text/selection/SelectionAdjustment;",
        "adjustment",
        "",
        "isInTouchMode",
        "notifySelectionUpdateStart-ubNVwUQ",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V",
        "notifySelectionUpdateStart",
        "notifySelectionUpdateSelectAll",
        "newPosition",
        "previousPosition",
        "isStartHandle",
        "notifySelectionUpdate-njBpvok",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z",
        "notifySelectionUpdate",
        "notifySelectionUpdateEnd",
        "notifySelectableChange",
        "",
        "Landroidx/compose/foundation/text/selection/Selection;",
        "getSubselections",
        "()Ljava/util/Map;",
        "subselections",
        "Companion",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final InvalidSelectableId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;->$$INSTANCE:Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;

    sput-object v0, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->Companion:Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;

    return-void
.end method


# virtual methods
.method public abstract getSubselections()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract nextSelectableId()J
.end method

.method public abstract notifyPositionChange(J)V
.end method

.method public abstract notifySelectableChange(J)V
.end method

.method public abstract notifySelectionUpdate-njBpvok(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract notifySelectionUpdateEnd()V
.end method

.method public abstract notifySelectionUpdateSelectAll(JZ)V
.end method

.method public abstract notifySelectionUpdateStart-ubNVwUQ(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract subscribe(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;
    .param p1    # Landroidx/compose/foundation/text/selection/Selectable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract unsubscribe(Landroidx/compose/foundation/text/selection/Selectable;)V
    .param p1    # Landroidx/compose/foundation/text/selection/Selectable;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
