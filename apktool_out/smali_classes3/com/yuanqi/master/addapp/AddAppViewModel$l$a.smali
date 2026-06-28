.class final Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/AddAppViewModel$l;->invoke(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.yuanqi.master.addapp.AddAppViewModel$showBackupFileDialog$1$1"
    f = "AddAppViewModel.kt"
    i = {}
    l = {
        0x36b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $it:Ljava/io/File;

.field label:I

.field final synthetic this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;Ljava/io/File;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->$it:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;

    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->$it:Ljava/io/File;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;Ljava/io/File;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    const/4 v1, 0x2

    .line 29
    const-string v3, "\u5f00\u59cb\u6062\u590d"

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static {v3, p1, v1, v4}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->F()Landroidx/compose/runtime/MutableState;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v1, "\u6062\u590d\u4e2d..."

    .line 42
    .line 43
    invoke-interface {p1, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->E()Landroidx/compose/runtime/MutableState;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {p1, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v1, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a$a;

    .line 64
    .line 65
    iget-object v3, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->$context:Landroid/content/Context;

    .line 66
    .line 67
    iget-object v5, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->$it:Ljava/io/File;

    .line 68
    .line 69
    iget-object v6, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 70
    .line 71
    invoke-direct {v1, v3, v5, v6, v4}, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a$a;-><init>(Landroid/content/Context;Ljava/io/File;Lcom/yuanqi/master/addapp/AddAppViewModel;Lkotlin/coroutines/d;)V

    .line 72
    .line 73
    .line 74
    iput v2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;->label:I

    .line 75
    .line 76
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/i;->h(Lkotlin/coroutines/g;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_2

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 84
    .line 85
    return-object p1
.end method
