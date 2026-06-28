.class public final Lcom/yuanqi/master/location/MapViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/location/MapViewModel$b;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112&\u0010\u0013\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u000f0\u0014J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aJ$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000f0\u0014J,\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000f0\u0014R \u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\u0007\"\u0004\u0008\r\u0010\t\u00a8\u0006\""
    }
    d2 = {
        "Lcom/yuanqi/master/location/MapViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "()V",
        "failed",
        "Landroidx/lifecycle/MutableLiveData;",
        "Lcom/yuanqi/master/tools/Failure;",
        "getFailed",
        "()Landroidx/lifecycle/MutableLiveData;",
        "setFailed",
        "(Landroidx/lifecycle/MutableLiveData;)V",
        "saveHistoryLiveData",
        "",
        "getSaveHistoryLiveData",
        "setSaveHistoryLiveData",
        "getBaseStation",
        "",
        "lat",
        "",
        "lng",
        "action",
        "Lkotlin/Function1;",
        "Ljava/util/ArrayList;",
        "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;",
        "Lkotlin/collections/ArrayList;",
        "saveHistory",
        "history",
        "Lcom/yuanqi/master/database/model/History;",
        "searchAddress",
        "address",
        "",
        "Lcom/yuanqi/master/network/model/CustomAddress;",
        "searchLatlng",
        "lon",
        "Companion",
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
.field public static final c:Lcom/yuanqi/master/location/MapViewModel$b;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final d:I

.field private static final e:Lkotlin/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/d0<",
            "Lcom/yuanqi/master/location/MapViewModel;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private a:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private b:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/yuanqi/master/tools/r0;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/yuanqi/master/location/MapViewModel$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/yuanqi/master/location/MapViewModel$b;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/yuanqi/master/location/MapViewModel;->c:Lcom/yuanqi/master/location/MapViewModel$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/yuanqi/master/location/MapViewModel;->d:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/h0;->SYNCHRONIZED:Lkotlin/h0;

    .line 14
    .line 15
    sget-object v1, Lcom/yuanqi/master/location/MapViewModel$a;->INSTANCE:Lcom/yuanqi/master/location/MapViewModel$a;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/yuanqi/master/location/MapViewModel;->e:Lkotlin/d0;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/yuanqi/master/location/MapViewModel;->a:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/yuanqi/master/location/MapViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static final synthetic a()Lkotlin/d0;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/location/MapViewModel;->e:Lkotlin/d0;

    return-object v0
.end method


# virtual methods
.method public final b(DDLv3/l;)V
    .locals 1
    .param p5    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Lv3/l<",
            "-",
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;",
            ">;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/network/repository/b;->g:Lcom/yuanqi/master/network/repository/b;

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/network/repository/b;->g(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Lcom/yuanqi/master/location/MapViewModel$c;

    .line 21
    .line 22
    invoke-direct {p2, p5}, Lcom/yuanqi/master/location/MapViewModel$c;-><init>(Lv3/l;)V

    .line 23
    .line 24
    .line 25
    new-instance p3, Lcom/yuanqi/master/location/MapViewModel$d;

    .line 26
    .line 27
    invoke-direct {p3, p5}, Lcom/yuanqi/master/location/MapViewModel$d;-><init>(Lv3/l;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final c()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/yuanqi/master/tools/r0;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/location/MapViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final d()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/location/MapViewModel;->a:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final e(Lv2/c;)V
    .locals 3
    .param p1    # Lv2/c;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "history"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/network/repository/e;->g:Lcom/yuanqi/master/network/repository/e;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/yuanqi/master/location/MapViewModel;->a:Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/yuanqi/master/location/MapViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, p1}, Lcom/yuanqi/master/network/repository/e;->i(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Lv2/c;)Lio/reactivex/rxjava3/disposables/e;

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final f(Ljava/lang/String;Lv3/l;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-",
            "Lcom/yuanqi/master/network/model/CustomAddress;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "address"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "{\"keyWord\":\""

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "\"}"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Lcom/yuanqi/master/network/repository/e;->g:Lcom/yuanqi/master/network/repository/e;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lcom/yuanqi/master/network/repository/e;->n(Ljava/lang/String;)Lretrofit2/Call;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Lcom/yuanqi/master/location/MapViewModel$e;

    .line 40
    .line 41
    invoke-direct {v0, p2}, Lcom/yuanqi/master/location/MapViewModel$e;-><init>(Lv3/l;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lcom/yuanqi/master/location/MapViewModel$f;

    .line 45
    .line 46
    invoke-direct {v1, p2}, Lcom/yuanqi/master/location/MapViewModel$f;-><init>(Lv3/l;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0, v1}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 50
    .line 51
    .line 52
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Lv3/l;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-",
            "Lcom/yuanqi/master/network/model/CustomAddress;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "lat"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lon"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "action"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "{\"lon\":\""

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p2, "\",\"lat\":\""

    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, "\",\"ver\":\"1\"}"

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p2, Lcom/yuanqi/master/network/repository/e;->g:Lcom/yuanqi/master/network/repository/e;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Lcom/yuanqi/master/network/repository/e;->o(Ljava/lang/String;)Lretrofit2/Call;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance p2, Lcom/yuanqi/master/location/MapViewModel$g;

    .line 53
    .line 54
    invoke-direct {p2, p3}, Lcom/yuanqi/master/location/MapViewModel$g;-><init>(Lv3/l;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lcom/yuanqi/master/location/MapViewModel$h;

    .line 58
    .line 59
    invoke-direct {v0, p3}, Lcom/yuanqi/master/location/MapViewModel$h;-><init>(Lv3/l;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p2, v0}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 63
    .line 64
    .line 65
    return-void
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

.method public final h(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/yuanqi/master/tools/r0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/yuanqi/master/location/MapViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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

.method public final i(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/yuanqi/master/location/MapViewModel;->a:Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
