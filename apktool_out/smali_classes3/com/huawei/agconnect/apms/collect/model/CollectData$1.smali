.class public Lcom/huawei/agconnect/apms/collect/model/CollectData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/collect/model/CollectData;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/huawei/agconnect/apms/collect/model/CollectData;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/collect/model/CollectData;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/CollectData$1;->this$0:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/CollectData$1;->this$0:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 2
    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getDeviceInformation()Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$002(Lcom/huawei/agconnect/apms/collect/model/CollectData;Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;)Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$100()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "failed to get DeviceInformation: "

    .line 17
    .line 18
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/CollectData$1;->this$0:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 26
    .line 27
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getPlatformInformation()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$202(Lcom/huawei/agconnect/apms/collect/model/CollectData;Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;)Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$100()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "failed to get PlatformInformation: "

    .line 41
    .line 42
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/CollectData$1;->this$0:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 50
    .line 51
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getUserSettingsInformation()Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$302(Lcom/huawei/agconnect/apms/collect/model/CollectData;Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;)Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_2
    move-exception v0

    .line 60
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$100()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "failed to get SettingsInformation: "

    .line 65
    .line 66
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 71
    .line 72
    .line 73
    :goto_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/CollectData$1;->this$0:Lcom/huawei/agconnect/apms/collect/model/CollectData;

    .line 74
    .line 75
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getApplicationInformation()Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/CollectData;->access$402(Lcom/huawei/agconnect/apms/collect/model/CollectData;Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;)Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    .line 80
    .line 81
    .line 82
    return-void
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
