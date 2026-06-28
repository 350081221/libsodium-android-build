.class public Lcom/huawei/agconnect/apms/APMSRegistrar$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/APMSRegistrar;->initHiAnalyticsManager(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/APMSRegistrar;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Lcom/huawei/agconnect/apms/APMSRegistrar$bcd;->abc:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/huawei/agconnect/apms/APMSRegistrar$bcd;->abc:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->init(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lcom/huawei/agconnect/apms/APMS;->getInstance()Lcom/huawei/agconnect/apms/APMS;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/APMS;->isUserPrivacyAgreed()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->setAnalyticsEnable(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    invoke-static {}, Lcom/huawei/agconnect/apms/APMSRegistrar;->access$100()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "exception occurred while init HiAnalyticsManager: "

    .line 32
    .line 33
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
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
