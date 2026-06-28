.class public final Lcom/huawei/hms/analytics/t;
.super Lcom/huawei/hms/common/internal/TaskApiCall;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/common/internal/TaskApiCall<",
        "Lcom/huawei/hms/analytics/q;",
        "Lcom/huawei/hms/analytics/s;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/common/internal/TaskApiCall;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final synthetic doExecute(Lcom/huawei/hms/common/internal/AnyClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V
    .locals 1

    const-string p1, "HiAnalyticsTaskApiRequire"

    if-eqz p2, :cond_4

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/huawei/hms/analytics/s;

    invoke-direct {v0, p3}, Lcom/huawei/hms/analytics/s;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getParcelable()Landroid/os/Parcelable;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getParcelable()Landroid/os/Parcelable;

    move-result-object p3

    instance-of p3, p3, Landroid/content/Intent;

    if-eqz p3, :cond_1

    const-string p3, "HMS API call succeed."

    invoke-static {p1, p3}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getParcelable()Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    new-instance p2, Lcom/huawei/hms/analytics/s;

    invoke-direct {p2, p1}, Lcom/huawei/hms/analytics/s;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p4, p2}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string p2, "HMS API call failed. header.getParcelable() is not Intent"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string p2, "HMS API call failed. header.getParcelable() is null"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string p3, "HMS API call failed. header.getErrorCode() != CommonCode.OK"

    invoke-static {p1, p3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/common/ApiException;

    new-instance p3, Lcom/huawei/hms/support/api/client/Status;

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    move-result v0

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorReason()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    invoke-direct {p1, p3}, Lcom/huawei/hms/common/ApiException;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    invoke-virtual {p4, p1}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    return-void

    :cond_4
    :goto_0
    const-string p2, "HMS API call failed. header or taskCompletionSource is null"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0x2625a00

    return v0
.end method
