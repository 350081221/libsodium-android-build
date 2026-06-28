.class final Lkotlinx/coroutines/sync/b$a$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/sync/b$a;->j(Lkotlin/r2;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Throwable;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Lkotlin/r2;",
        "invoke",
        "(Ljava/lang/Throwable;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lkotlinx/coroutines/sync/b;

.field final synthetic this$1:Lkotlinx/coroutines/sync/b$a;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/sync/b$a;)V
    .locals 0

    iput-object p1, p0, Lkotlinx/coroutines/sync/b$a$b;->this$0:Lkotlinx/coroutines/sync/b;

    iput-object p2, p0, Lkotlinx/coroutines/sync/b$a$b;->this$1:Lkotlinx/coroutines/sync/b$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/sync/b$a$b;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    invoke-static {}, Lkotlinx/coroutines/sync/b;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a$b;->this$0:Lkotlinx/coroutines/sync/b;

    iget-object v1, p0, Lkotlinx/coroutines/sync/b$a$b;->this$1:Lkotlinx/coroutines/sync/b$a;

    iget-object v1, v1, Lkotlinx/coroutines/sync/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lkotlinx/coroutines/sync/b$a$b;->this$0:Lkotlinx/coroutines/sync/b;

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a$b;->this$1:Lkotlinx/coroutines/sync/b$a;

    iget-object v0, v0, Lkotlinx/coroutines/sync/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/sync/b;->g(Ljava/lang/Object;)V

    return-void
.end method
