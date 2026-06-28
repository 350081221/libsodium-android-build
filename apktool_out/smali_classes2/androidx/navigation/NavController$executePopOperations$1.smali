.class final Landroidx/navigation/NavController$executePopOperations$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/navigation/NavController;->executePopOperations(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/navigation/NavBackStackEntry;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/navigation/NavBackStackEntry;",
        "entry",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/navigation/NavBackStackEntry;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $popped:Lkotlin/jvm/internal/k1$a;

.field final synthetic $receivedPop:Lkotlin/jvm/internal/k1$a;

.field final synthetic $saveState:Z

.field final synthetic $savedState:Lkotlin/collections/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/k<",
            "Landroidx/navigation/NavBackStackEntryState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/navigation/NavController;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$a;Lkotlin/jvm/internal/k1$a;Landroidx/navigation/NavController;ZLkotlin/collections/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$a;",
            "Lkotlin/jvm/internal/k1$a;",
            "Landroidx/navigation/NavController;",
            "Z",
            "Lkotlin/collections/k<",
            "Landroidx/navigation/NavBackStackEntryState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/NavController$executePopOperations$1;->$receivedPop:Lkotlin/jvm/internal/k1$a;

    iput-object p2, p0, Landroidx/navigation/NavController$executePopOperations$1;->$popped:Lkotlin/jvm/internal/k1$a;

    iput-object p3, p0, Landroidx/navigation/NavController$executePopOperations$1;->this$0:Landroidx/navigation/NavController;

    iput-boolean p4, p0, Landroidx/navigation/NavController$executePopOperations$1;->$saveState:Z

    iput-object p5, p0, Landroidx/navigation/NavController$executePopOperations$1;->$savedState:Lkotlin/collections/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/navigation/NavBackStackEntry;

    invoke-virtual {p0, p1}, Landroidx/navigation/NavController$executePopOperations$1;->invoke(Landroidx/navigation/NavBackStackEntry;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/navigation/NavBackStackEntry;)V
    .locals 3
    .param p1    # Landroidx/navigation/NavBackStackEntry;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/navigation/NavController$executePopOperations$1;->$receivedPop:Lkotlin/jvm/internal/k1$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 3
    iget-object v0, p0, Landroidx/navigation/NavController$executePopOperations$1;->$popped:Lkotlin/jvm/internal/k1$a;

    iput-boolean v1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 4
    iget-object v0, p0, Landroidx/navigation/NavController$executePopOperations$1;->this$0:Landroidx/navigation/NavController;

    iget-boolean v1, p0, Landroidx/navigation/NavController$executePopOperations$1;->$saveState:Z

    iget-object v2, p0, Landroidx/navigation/NavController$executePopOperations$1;->$savedState:Lkotlin/collections/k;

    invoke-static {v0, p1, v1, v2}, Landroidx/navigation/NavController;->access$popEntryFromBackStack(Landroidx/navigation/NavController;Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/k;)V

    return-void
.end method
