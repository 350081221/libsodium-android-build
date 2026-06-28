.class final Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/grid/LazyGridState;-><init>(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Integer;",
        "Ljava/util/List<",
        "+",
        "Lkotlin/u0<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Landroidx/compose/ui/unit/Constraints;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "",
        "Lkotlin/u0;",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke",
        "(I)Ljava/util/List;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;

    invoke-direct {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;-><init>()V

    sput-object v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;->invoke(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/Constraints;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
