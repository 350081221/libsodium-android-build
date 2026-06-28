.class final Lcom/yuanqi/master/main/MainViewModel$f;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/main/MainViewModel;->V(Lcom/yuanqi/group/home/models/b;Ljava/lang/String;)V
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
    c = "com.yuanqi.master.main.MainViewModel$insertAppNote$1"
    f = "MainViewModel.kt"
    i = {}
    l = {}
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
.field final synthetic $appData:Lcom/yuanqi/group/home/models/b;

.field final synthetic $note:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;Ljava/lang/String;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/main/MainViewModel;",
            "Lcom/yuanqi/group/home/models/b;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/master/main/MainViewModel$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/main/MainViewModel$f;->this$0:Lcom/yuanqi/master/main/MainViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/main/MainViewModel$f;->$appData:Lcom/yuanqi/group/home/models/b;

    iput-object p3, p0, Lcom/yuanqi/master/main/MainViewModel$f;->$note:Ljava/lang/String;

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

    new-instance p1, Lcom/yuanqi/master/main/MainViewModel$f;

    iget-object v0, p0, Lcom/yuanqi/master/main/MainViewModel$f;->this$0:Lcom/yuanqi/master/main/MainViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/main/MainViewModel$f;->$appData:Lcom/yuanqi/group/home/models/b;

    iget-object v2, p0, Lcom/yuanqi/master/main/MainViewModel$f;->$note:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/yuanqi/master/main/MainViewModel$f;-><init>(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;Ljava/lang/String;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/main/MainViewModel$f;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/main/MainViewModel$f;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/main/MainViewModel$f;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/master/main/MainViewModel$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
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
    iget v0, p0, Lcom/yuanqi/master/main/MainViewModel$f;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/yuanqi/master/main/MainViewModel$f;->this$0:Lcom/yuanqi/master/main/MainViewModel;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/yuanqi/master/main/MainViewModel;->H()Lcom/yuanqi/master/database/dao/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lv2/b;

    .line 18
    .line 19
    invoke-direct {v0}, Lv2/b;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/yuanqi/master/main/MainViewModel$f;->$appData:Lcom/yuanqi/group/home/models/b;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/yuanqi/master/main/MainViewModel$f;->$note:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/yuanqi/group/home/models/b;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "getPackageName(...)"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lv2/b;->setPackageName(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/yuanqi/group/home/models/b;->getUserId()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1}, Lv2/b;->setUserId(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lv2/b;->setNoteName(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, Lcom/yuanqi/master/database/dao/c;->d(Lv2/b;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/yuanqi/master/main/MainViewModel$f;->this$0:Lcom/yuanqi/master/main/MainViewModel;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/yuanqi/master/main/MainViewModel;->H()Lcom/yuanqi/master/database/dao/c;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Lcom/yuanqi/master/database/dao/c;->getAll()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v0, p0, Lcom/yuanqi/master/main/MainViewModel$f;->this$0:Lcom/yuanqi/master/main/MainViewModel;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/yuanqi/master/main/MainViewModel;->I()Landroidx/lifecycle/MutableLiveData;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
