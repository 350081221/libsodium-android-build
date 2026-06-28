.class public final Lcom/yuanqi/master/ViewModelFactoryKt$ViewModelFactory$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/ViewModelFactoryKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u0002H\u0003\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "com/yuanqi/master/ViewModelFactoryKt$ViewModelFactory$1",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "extras",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;",
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


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/viewmodel/CreationExtras;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ")TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "extras"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-class p2, Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p1, Lcom/yuanqi/master/addapp/AddAppViewModel;->A:Lcom/yuanqi/master/addapp/AddAppViewModel$b;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$b;->b()Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-class p2, Lcom/yuanqi/group/home/HomeViewModel;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    sget-object p1, Lcom/yuanqi/group/home/HomeViewModel;->A:Lcom/yuanqi/group/home/HomeViewModel$b;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel$b;->c()Lcom/yuanqi/group/home/HomeViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const-class p2, Lcom/yuanqi/master/main/MainViewModel;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    sget-object p1, Lcom/yuanqi/master/main/MainViewModel;->l:Lcom/yuanqi/master/main/MainViewModel$c;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/yuanqi/master/main/MainViewModel$c;->a()Lcom/yuanqi/master/main/MainViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const-class p2, Lcom/yuanqi/master/mine/MineViewModel;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    sget-object p1, Lcom/yuanqi/master/mine/MineViewModel;->q:Lcom/yuanqi/master/mine/MineViewModel$b;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineViewModel$b;->a()Lcom/yuanqi/master/mine/MineViewModel;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-class p2, Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_4

    .line 78
    .line 79
    sget-object p1, Lcom/yuanqi/master/manager/ManagerViewModel;->o:Lcom/yuanqi/master/manager/ManagerViewModel$b;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/yuanqi/master/manager/ManagerViewModel$b;->a()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    const-class p2, Lcom/yuanqi/master/location/MapViewModel;

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    sget-object p1, Lcom/yuanqi/master/location/MapViewModel;->c:Lcom/yuanqi/master/location/MapViewModel$b;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/yuanqi/master/location/MapViewModel$b;->a()Lcom/yuanqi/master/location/MapViewModel;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_0

    .line 101
    :cond_5
    const-class p2, Lcom/yuanqi/master/location/HistoryViewModel;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_6

    .line 108
    .line 109
    sget-object p1, Lcom/yuanqi/master/location/HistoryViewModel;->d:Lcom/yuanqi/master/location/HistoryViewModel$b;

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/yuanqi/master/location/HistoryViewModel$b;->a()Lcom/yuanqi/master/location/HistoryViewModel;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :goto_0
    const-string p2, "null cannot be cast to non-null type T of com.yuanqi.master.ViewModelFactoryKt.<clinit>.<no name provided>.create$lambda$0"

    .line 116
    .line 117
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v1, "Unknown ViewModel class: "

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p2
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
