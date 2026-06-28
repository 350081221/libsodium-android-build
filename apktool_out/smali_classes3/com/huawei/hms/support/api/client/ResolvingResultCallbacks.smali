.class public abstract Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;
.super Lcom/huawei/hms/support/api/client/ResultCallbacks;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/huawei/hms/support/api/client/Result;",
        ">",
        "Lcom/huawei/hms/support/api/client/ResultCallbacks<",
        "TR;>;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ResolvingResultCallbacks"


# instance fields
.field private final mActivity:Landroid/app/Activity;

.field private final requestCode:I


# direct methods
.method protected constructor <init>(Landroid/app/Activity;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/ResultCallbacks;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Activity must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/huawei/hms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;->mActivity:Landroid/app/Activity;

    .line 13
    .line 14
    iput p2, p0, Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;->requestCode:I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method


# virtual methods
.method public final onFailure(Lcom/huawei/hms/support/api/client/Status;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/client/Status;->hasResolution()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;->mActivity:Landroid/app/Activity;

    .line 8
    .line 9
    iget v1, p0, Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;->requestCode:I

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/huawei/hms/support/api/client/Status;->startResolutionForResult(Landroid/app/Activity;I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;->onUnresolvableFailure(Lcom/huawei/hms/support/api/client/Status;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Failed to start resolution: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "ResolvingResultCallbacks"

    .line 38
    .line 39
    invoke-static {v0, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lcom/huawei/hms/support/api/client/Status;->RESULT_INTERNAL_ERROR:Lcom/huawei/hms/support/api/client/Status;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/client/ResolvingResultCallbacks;->onUnresolvableFailure(Lcom/huawei/hms/support/api/client/Status;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
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

.method public abstract onSuccess(Lcom/huawei/hms/support/api/client/Result;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation
.end method

.method public abstract onUnresolvableFailure(Lcom/huawei/hms/support/api/client/Status;)V
.end method
