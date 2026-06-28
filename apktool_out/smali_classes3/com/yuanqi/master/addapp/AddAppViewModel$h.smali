.class final Lcom/yuanqi/master/addapp/AddAppViewModel$h;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/AddAppViewModel;->W(Landroid/content/Context;)V
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
    c = "com.yuanqi.master.addapp.AddAppViewModel$requestAllApp$1"
    f = "AddAppViewModel.kt"
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAddAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel$requestAllApp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1103:1\n1549#2:1104\n1620#2,3:1105\n1855#2,2:1108\n*S KotlinDebug\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel$requestAllApp$1\n*L\n340#1:1104\n340#1:1105,3\n342#1:1108,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $tempList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/yuanqi/master/addapp/AddAppViewModel;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/master/addapp/AddAppViewModel$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method

.method public static synthetic h(Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->invokeSuspend$lambda$0(Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I

    move-result p0

    return p0
.end method

.method private static final invokeSuspend$lambda$0(Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I
    .locals 3

    .line 1
    const-string v0, "pinyinName"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 5
    .line 6
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p1, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 20
    .line 21
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object p0, p0, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    .line 38
    .line 39
    const-string v0, "packageName"

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    :goto_0
    move v1, p0

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 51
    .line 52
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v2}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v2, p1, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 66
    .line 67
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-static {v2}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    iget-object v2, p0, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 82
    .line 83
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v2}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    iget-object v2, p1, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 97
    .line 98
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-static {v2}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    const/4 p0, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    iget-object p0, p0, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    iget-object p1, p1, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 120
    .line 121
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 129
    .line 130
    .line 131
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_0

    .line 133
    :catch_0
    :goto_2
    return v1
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

.method private static final invokeSuspend$lambda$1(Lv3/l;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Lv3/l;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->invokeSuspend$lambda$1(Lv3/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
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

    new-instance p1, Lcom/yuanqi/master/addapp/AddAppViewModel$h;

    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/yuanqi/master/addapp/AddAppViewModel;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/addapp/AddAppViewModel$h;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "#"

    .line 2
    .line 3
    const-string v1, "name"

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->label:I

    .line 9
    .line 10
    if-nez v2, :cond_9

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$context:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p1, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v3, "getInstalledPackages(...)"

    .line 27
    .line 28
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroid/content/pm/PackageInfo;

    .line 46
    .line 47
    invoke-static {}, Lcom/yuanqi/master/config/c;->a()[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v4, v5}, Lkotlin/collections/l;->s8([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance v4, Lcom/yuanqi/group/home/models/c;

    .line 61
    .line 62
    invoke-direct {v4}, Lcom/yuanqi/group/home/models/c;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 66
    .line 67
    iget-object v6, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$context:Landroid/content/Context;

    .line 68
    .line 69
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v5, v6}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iput-object v5, v4, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 82
    .line 83
    :try_start_0
    invoke-static {v5, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v5}, Lkotlin/text/v;->S6(Ljava/lang/CharSequence;)C

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-static {v5}, Lcom/github/promeg/pinyinhelper/c;->e(C)Z

    .line 91
    .line 92
    .line 93
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    const-string v6, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    .line 95
    .line 96
    if-eqz v5, :cond_2

    .line 97
    .line 98
    :try_start_1
    iget-object v5, v4, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 99
    .line 100
    invoke-static {v5, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v5}, Lkotlin/text/v;->S6(Ljava/lang/CharSequence;)C

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {v5}, Lcom/github/promeg/pinyinhelper/c;->g(C)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    const-string v7, "toPinyin(...)"

    .line 112
    .line 113
    invoke-static {v5, v7}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v5}, Lkotlin/text/v;->S6(Ljava/lang/CharSequence;)C

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    int-to-char v5, v5

    .line 121
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    const-string v7, "null cannot be cast to non-null type java.lang.String"

    .line 126
    .line 127
    invoke-static {v5, v7}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 131
    .line 132
    invoke-virtual {v5, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    iget-object v5, v4, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 141
    .line 142
    invoke-static {v5, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v5}, Lkotlin/text/v;->S6(Ljava/lang/CharSequence;)C

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    int-to-char v5, v5

    .line 150
    invoke-static {v5}, Lcom/yuanqi/master/config/c;->f(C)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_3

    .line 155
    .line 156
    iget-object v5, v4, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 157
    .line 158
    invoke-static {v5, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v5}, Lkotlin/text/v;->S6(Ljava/lang/CharSequence;)C

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 170
    .line 171
    invoke-virtual {v5, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :catch_0
    move-exception v5

    .line 180
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 181
    .line 182
    .line 183
    :cond_3
    move-object v5, v0

    .line 184
    :goto_1
    invoke-static {v5}, Lkotlin/text/v;->S6(Ljava/lang/CharSequence;)C

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/b;->c(C)Ljava/lang/Character;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    iput-object v5, v4, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 193
    .line 194
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 195
    .line 196
    iput-object v5, v4, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    .line 197
    .line 198
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 199
    .line 200
    iget-object v6, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$context:Landroid/content/Context;

    .line 201
    .line 202
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v5, v6}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    iput-object v5, v4, Lcom/yuanqi/group/home/models/c;->d:Landroid/graphics/drawable/Drawable;

    .line 211
    .line 212
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 213
    .line 214
    iget v5, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 215
    .line 216
    and-int/lit8 v5, v5, 0x1

    .line 217
    .line 218
    if-eqz v5, :cond_4

    .line 219
    .line 220
    invoke-static {}, Lcom/yuanqi/master/config/c;->d()[Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v5, v3}, Lkotlin/collections/l;->s8([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_0

    .line 231
    .line 232
    :cond_4
    iget-object v3, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_5
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    .line 240
    .line 241
    new-instance v0, Lcom/yuanqi/master/addapp/d;

    .line 242
    .line 243
    invoke-direct {v0}, Lcom/yuanqi/master/addapp/d;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-static {p1, v0}, Lkotlin/collections/u;->m0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    .line 250
    .line 251
    new-instance v0, Lcom/yuanqi/master/addapp/AddAppViewModel$h$a;

    .line 252
    .line 253
    iget-object v1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$context:Landroid/content/Context;

    .line 254
    .line 255
    invoke-direct {v0, v1}, Lcom/yuanqi/master/addapp/AddAppViewModel$h$a;-><init>(Landroid/content/Context;)V

    .line 256
    .line 257
    .line 258
    new-instance v1, Lcom/yuanqi/master/addapp/e;

    .line 259
    .line 260
    invoke-direct {v1, v0}, Lcom/yuanqi/master/addapp/e;-><init>(Lv3/l;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    .line 267
    .line 268
    new-instance v0, Ljava/util/ArrayList;

    .line 269
    .line 270
    const/16 v1, 0xa

    .line 271
    .line 272
    invoke-static {p1, v1}, Lkotlin/collections/u;->Y(Ljava/lang/Iterable;I)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_6

    .line 288
    .line 289
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, Lcom/yuanqi/group/home/models/c;

    .line 294
    .line 295
    iget-object v1, v1, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 296
    .line 297
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_6
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 302
    .line 303
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_8

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Ljava/lang/Character;

    .line 318
    .line 319
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->v()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->contains(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-nez v3, :cond_7

    .line 328
    .line 329
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->v()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_8
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 341
    .line 342
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->k()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->$tempList:Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 349
    .line 350
    .line 351
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 352
    .line 353
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->l()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 358
    .line 359
    .line 360
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 361
    .line 362
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->l()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 367
    .line 368
    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->k()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->toList()Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    check-cast v0, Ljava/util/Collection;

    .line 377
    .line 378
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 379
    .line 380
    .line 381
    iget-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 382
    .line 383
    invoke-virtual {p1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->E()Landroidx/compose/runtime/MutableState;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 395
    .line 396
    return-object p1

    .line 397
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 398
    .line 399
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 400
    .line 401
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw p1
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
.end method
