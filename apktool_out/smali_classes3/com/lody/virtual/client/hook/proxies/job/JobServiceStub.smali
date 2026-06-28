.class public Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$enqueue;,
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getPendingJob;,
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$cancel;,
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$cancelAll;,
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getAllPendingJobs;,
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$ScheduleAsPackage;,
        Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$schedule;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/app/job/IJobScheduler$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "jobscheduler"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$schedule;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$schedule;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$ScheduleAsPackage;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$ScheduleAsPackage;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getAllPendingJobs;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getAllPendingJobs;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$cancelAll;

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$cancelAll;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$cancel;

    .line 38
    .line 39
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$cancel;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 43
    .line 44
    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    new-instance v2, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getPendingJob;

    .line 48
    .line 49
    invoke-direct {v2, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$getPendingJob;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 53
    .line 54
    .line 55
    const/16 v2, 0x1a

    .line 56
    .line 57
    if-lt v0, v2, :cond_0

    .line 58
    .line 59
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$enqueue;

    .line 60
    .line 61
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$enqueue;-><init>(Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub;Lcom/lody/virtual/client/hook/proxies/job/JobServiceStub$1;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void
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
