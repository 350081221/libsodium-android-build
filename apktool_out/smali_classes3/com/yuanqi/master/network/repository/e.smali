.class public final Lcom/yuanqi/master/network/repository/e;
.super Lcom/yuanqi/master/network/repository/a;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00070\u0004\u00a2\u0006\u0002\u0008\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\u000cJ\u001f\u0010\r\u001a\u00070\u0004\u00a2\u0006\u0002\u0008\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00100\u000fJ\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0012J\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001a\u001a\u00020\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/yuanqi/master/network/repository/MapApiRepository;",
        "Lcom/yuanqi/master/network/repository/BaseRepository;",
        "()V",
        "addHistory",
        "Lio/reactivex/rxjava3/disposables/Disposable;",
        "Lio/reactivex/rxjava3/annotations/NonNull;",
        "addHistoryLiveData",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "failed",
        "Lcom/yuanqi/master/tools/Failure;",
        "history",
        "Lcom/yuanqi/master/database/model/History;",
        "deleteAllHistory",
        "action",
        "Lkotlin/Function1;",
        "",
        "getHistoryList",
        "",
        "searchAddress",
        "Lretrofit2/Call;",
        "Lcom/yuanqi/master/network/model/response/GeocodingResponse;",
        "ds",
        "",
        "searchLatlng",
        "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;",
        "postStr",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:Lcom/yuanqi/master/network/repository/e;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/master/network/repository/e;

    invoke-direct {v0}, Lcom/yuanqi/master/network/repository/e;-><init>()V

    sput-object v0, Lcom/yuanqi/master/network/repository/e;->g:Lcom/yuanqi/master/network/repository/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/network/repository/a;-><init>()V

    return-void
.end method

.method public static synthetic g(Lv3/l;)V
    .locals 0

    invoke-static {p0}, Lcom/yuanqi/master/network/repository/e;->l(Lv3/l;)V

    return-void
.end method

.method public static synthetic h(Landroidx/lifecycle/MutableLiveData;)V
    .locals 0

    invoke-static {p0}, Lcom/yuanqi/master/network/repository/e;->j(Landroidx/lifecycle/MutableLiveData;)V

    return-void
.end method

.method private static final j(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1

    .line 1
    const-string v0, "$addHistoryLiveData"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private static final l(Lv3/l;)V
    .locals 1

    .line 1
    const-string v0, "$action"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public final i(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Lv2/c;)Lio/reactivex/rxjava3/disposables/e;
    .locals 2
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv2/c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/yuanqi/master/tools/r0;",
            ">;",
            "Lv2/c;",
            ")",
            "Lio/reactivex/rxjava3/disposables/e;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "addHistoryLiveData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "failed"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "history"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/yuanqi/master/database/a;->b:Lcom/yuanqi/master/database/a$b;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/yuanqi/master/database/a$b;->a()Lcom/yuanqi/master/database/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/database/a;->e(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0, p3}, Lcom/yuanqi/master/database/dao/e;->b(Lv2/c;)Lio/reactivex/rxjava3/core/c;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    new-instance v0, Lcom/yuanqi/master/network/repository/d;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lcom/yuanqi/master/network/repository/d;-><init>(Landroidx/lifecycle/MutableLiveData;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lcom/yuanqi/master/network/repository/e$a;

    .line 45
    .line 46
    invoke-direct {v1, p1, p2}, Lcom/yuanqi/master/network/repository/e$a;-><init>(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, v0, v1}, Lio/reactivex/rxjava3/core/c;->X0(Lm3/a;Lm3/g;)Lio/reactivex/rxjava3/disposables/e;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string p2, "subscribe(...)"

    .line 54
    .line 55
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final k(Lv3/l;)Lio/reactivex/rxjava3/disposables/e;
    .locals 3
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;)",
            "Lio/reactivex/rxjava3/disposables/e;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/database/a;->b:Lcom/yuanqi/master/database/a$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/yuanqi/master/database/a$b;->a()Lcom/yuanqi/master/database/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/database/a;->e(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lcom/yuanqi/master/database/dao/e;->deleteAll()Lio/reactivex/rxjava3/core/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lcom/yuanqi/master/network/repository/c;

    .line 30
    .line 31
    invoke-direct {v1, p1}, Lcom/yuanqi/master/network/repository/c;-><init>(Lv3/l;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lcom/yuanqi/master/network/repository/e$b;

    .line 35
    .line 36
    invoke-direct {v2, p1}, Lcom/yuanqi/master/network/repository/e$b;-><init>(Lv3/l;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lio/reactivex/rxjava3/core/c;->X0(Lm3/a;Lm3/g;)Lio/reactivex/rxjava3/disposables/e;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "subscribe(...)"

    .line 44
    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p1
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final m()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv2/c;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/yuanqi/master/database/a;->b:Lcom/yuanqi/master/database/a$b;

    invoke-virtual {v0}, Lcom/yuanqi/master/database/a$b;->a()Lcom/yuanqi/master/database/a;

    move-result-object v0

    sget-object v1, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    invoke-virtual {v1}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/database/a;->e(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/yuanqi/master/database/dao/e;->getAll()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final n(Ljava/lang/String;)Lretrofit2/Call;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/response/GeocodingResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "ds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->d()Lcom/yuanqi/master/network/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "93a9d4104ec84da5d1007e3bc510f636"

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Lcom/yuanqi/master/network/a;->k(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final o(Ljava/lang/String;)Lretrofit2/Call;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "postStr"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->d()Lcom/yuanqi/master/network/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "93a9d4104ec84da5d1007e3bc510f636"

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Lcom/yuanqi/master/network/a;->j(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
