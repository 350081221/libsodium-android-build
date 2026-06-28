.class final Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "TopBottomBoundsComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lkotlin/u0<",
        "+",
        "Landroidx/compose/ui/geometry/Rect;",
        "+",
        "Ljava/util/List<",
        "Landroidx/compose/ui/semantics/SemanticsNode;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ<\u0010\n\u001a\u00020\t2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;",
        "Ljava/util/Comparator;",
        "Lkotlin/u0;",
        "Landroidx/compose/ui/geometry/Rect;",
        "",
        "Landroidx/compose/ui/semantics/SemanticsNode;",
        "Lkotlin/Comparator;",
        "a",
        "b",
        "",
        "compare",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;

    invoke-direct {v0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;->INSTANCE:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lkotlin/u0;

    check-cast p2, Lkotlin/u0;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;->compare(Lkotlin/u0;Lkotlin/u0;)I

    move-result p1

    return p1
.end method

.method public compare(Lkotlin/u0;Lkotlin/u0;)I
    .locals 2
    .param p1    # Lkotlin/u0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/u0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/u0<",
            "Landroidx/compose/ui/geometry/Rect;",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            ">;>;",
            "Lkotlin/u0<",
            "Landroidx/compose/ui/geometry/Rect;",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            ">;>;)I"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lkotlin/u0;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v0

    invoke-virtual {p2}, Lkotlin/u0;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lkotlin/u0;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result p1

    invoke-virtual {p2}, Lkotlin/u0;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method
