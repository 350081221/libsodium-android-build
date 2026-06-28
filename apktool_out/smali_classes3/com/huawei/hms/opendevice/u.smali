.class public Lcom/huawei/hms/opendevice/u;
.super Lcom/huawei/hms/support/api/PendingResultImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApiImpl;->getOdid(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/PendingResultImpl<",
        "Lcom/huawei/hms/support/api/opendevice/OdidResult;",
        "Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApiImpl;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApiImpl;Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/opendevice/u;->a:Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApiImpl;

    invoke-direct {p0, p2, p3, p4}, Lcom/huawei/hms/support/api/PendingResultImpl;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;)Lcom/huawei/hms/support/api/opendevice/OdidResult;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "OpenIdentifierApiImpl"

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, "getOdid OaidResp is null"

    .line 7
    .line 8
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hms/core/aidl/AbstractMessageEntity;->getCommonStatus()Lcom/huawei/hms/support/api/client/Status;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    const-string p1, "getOdid commonStatus is null"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "getOdid onComplete:"

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lcom/huawei/hms/support/api/opendevice/OdidResult;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/huawei/hms/support/api/opendevice/OdidResult;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lcom/huawei/hms/support/api/client/Result;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;->getId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, Lcom/huawei/hms/support/api/opendevice/OdidResult;->setId(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v0
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

.method public bridge synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 0

    check-cast p1, Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;

    invoke-virtual {p0, p1}, Lcom/huawei/hms/opendevice/u;->a(Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;)Lcom/huawei/hms/support/api/opendevice/OdidResult;

    move-result-object p1

    return-object p1
.end method
