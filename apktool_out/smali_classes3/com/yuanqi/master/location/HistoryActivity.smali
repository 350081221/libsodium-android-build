.class public final Lcom/yuanqi/master/location/HistoryActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/location/HistoryActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0014J\u0008\u0010\r\u001a\u00020\nH\u0014J\u0008\u0010\u000e\u001a\u00020\nH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/yuanqi/master/location/HistoryActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "historyViewModel",
        "Lcom/yuanqi/master/location/HistoryViewModel;",
        "getHistoryViewModel",
        "()Lcom/yuanqi/master/location/HistoryViewModel;",
        "historyViewModel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroy",
        "onResume",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,141:1\n75#2,13:142\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity\n*L\n53#1:142,13\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/yuanqi/master/location/HistoryActivity$a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final c:I

.field private static d:Lcom/yuanqi/master/location/HistoryActivity;
    .annotation build Lp4/m;
    .end annotation
.end field


# instance fields
.field private final a:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/yuanqi/master/location/HistoryActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yuanqi/master/location/HistoryActivity$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lcom/yuanqi/master/location/HistoryActivity;->b:Lcom/yuanqi/master/location/HistoryActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/yuanqi/master/location/HistoryActivity;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/yuanqi/master/location/HistoryActivity$b;->INSTANCE:Lcom/yuanqi/master/location/HistoryActivity$b;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/yuanqi/master/location/HistoryActivity$d;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/yuanqi/master/location/HistoryActivity$d;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 14
    .line 15
    const-class v2, Lcom/yuanqi/master/location/HistoryViewModel;

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, Lcom/yuanqi/master/location/HistoryActivity$e;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/yuanqi/master/location/HistoryActivity$e;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lcom/yuanqi/master/location/HistoryActivity$f;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v4, v5, p0}, Lcom/yuanqi/master/location/HistoryActivity$f;-><init>(Lv3/a;Landroidx/activity/ComponentActivity;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/yuanqi/master/location/HistoryActivity;->a:Lkotlin/d0;

    .line 36
    .line 37
    return-void
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
.end method

.method public static final synthetic C(Lcom/yuanqi/master/location/HistoryActivity;)Lcom/yuanqi/master/location/HistoryViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/location/HistoryActivity;->F()Lcom/yuanqi/master/location/HistoryViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D()Lcom/yuanqi/master/location/HistoryActivity;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/location/HistoryActivity;->d:Lcom/yuanqi/master/location/HistoryActivity;

    return-object v0
.end method

.method public static final synthetic E(Lcom/yuanqi/master/location/HistoryActivity;)V
    .locals 0

    sput-object p0, Lcom/yuanqi/master/location/HistoryActivity;->d:Lcom/yuanqi/master/location/HistoryActivity;

    return-void
.end method

.method private final F()Lcom/yuanqi/master/location/HistoryViewModel;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/location/HistoryActivity;->a:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/master/location/HistoryViewModel;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/yuanqi/master/location/HistoryActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    sput-object p0, Lcom/yuanqi/master/location/HistoryActivity;->d:Lcom/yuanqi/master/location/HistoryActivity;

    .line 14
    .line 15
    new-instance p1, Lcom/yuanqi/master/location/HistoryActivity$c;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lcom/yuanqi/master/location/HistoryActivity$c;-><init>(Lcom/yuanqi/master/location/HistoryActivity;)V

    .line 18
    .line 19
    .line 20
    const v0, -0x486a6dff

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-static {v0, v1, p1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p0, v0, p1, v1, v0}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lv3/p;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    const-string v1, "onDestroy"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/orhanobut/logger/j;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method protected onRestart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/location/HistoryActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    const-class v0, Lcom/yuanqi/master/location/HistoryActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    const-string v1, "onResume"

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/orhanobut/logger/j;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/yuanqi/master/location/HistoryActivity;->F()Lcom/yuanqi/master/location/HistoryViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/yuanqi/master/location/HistoryViewModel;->c()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
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
.end method

.method protected onStart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/location/HistoryActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
