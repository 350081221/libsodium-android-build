.class Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getAllPendingJobs;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "getAllPendingJobs"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getAllPendingJobs;->this$0:Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getAllPendingJobs;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/ipc/VJobScheduler;->get()Lcom/lody/virtual/client/ipc/VJobScheduler;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isQ()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    sget-object p2, Lmirror/android/content/pm/ParceledListSlice;->ctorQ:Lmirror/RefConstructor;

    .line 20
    .line 21
    const/4 p3, 0x1

    .line 22
    new-array p3, p3, [Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    aput-object p1, p3, v0

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    return-object p1
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
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getAllPendingJobs"

    return-object v0
.end method
