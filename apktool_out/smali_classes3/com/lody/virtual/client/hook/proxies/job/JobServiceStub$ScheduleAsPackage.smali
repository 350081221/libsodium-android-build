.class Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$ScheduleAsPackage;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ScheduleAsPackage"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$ScheduleAsPackage;->this$0:Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$ScheduleAsPackage;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const-class v0, Landroid/app/job/JobInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p3, v0, v1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Class;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    aget-object p1, p3, v0

    .line 11
    .line 12
    check-cast p1, Landroid/app/job/JobInfo;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    add-int/2addr v0, p2

    .line 16
    aget-object p3, p3, v0

    .line 17
    .line 18
    check-cast p3, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppPkg(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lcom/lody/virtual/client/ipc/VJobScheduler;->get()Lcom/lody/virtual/client/ipc/VJobScheduler;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2, p1}, Lcom/lody/virtual/client/ipc/VJobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "scheduleAsPackage"

    return-object v0
.end method
