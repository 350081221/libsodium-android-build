.class Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$enqueue;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "enqueue"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$enqueue;->this$0:Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$enqueue;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;)V

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
    array-length p1, p3

    .line 2
    const/4 p2, 0x1

    .line 3
    const/4 v0, 0x2

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    move v0, p2

    .line 9
    move p2, p1

    .line 10
    :goto_0
    aget-object p1, p3, p2

    .line 11
    .line 12
    check-cast p1, Landroid/app/job/JobInfo;

    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    aget-object p3, p3, v0

    .line 19
    .line 20
    check-cast p3, Landroid/app/job/JobWorkItem;

    .line 21
    .line 22
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppPkg()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p2, p3, v0}, Lcom/lody/virtual/helper/compat/JobWorkItemCompat;->redirect(ILandroid/app/job/JobWorkItem;Ljava/lang/String;)Landroid/app/job/JobWorkItem;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {}, Lcom/lody/virtual/client/ipc/VJobScheduler;->get()Lcom/lody/virtual/client/ipc/VJobScheduler;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p3, p1, p2}, Lcom/lody/virtual/client/ipc/VJobScheduler;->enqueue(Landroid/app/job/JobInfo;Landroid/app/job/JobWorkItem;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
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

    const-string v0, "enqueue"

    return-object v0
.end method
