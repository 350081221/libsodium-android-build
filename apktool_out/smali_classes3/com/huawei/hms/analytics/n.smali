.class public final Lcom/huawei/hms/analytics/n;
.super Lcom/huawei/hms/common/internal/AbstractClientBuilder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/common/internal/AbstractClientBuilder<",
        "Lcom/huawei/hms/analytics/q;",
        "Lcom/huawei/hms/api/Api$ApiOptions$NoOptions;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/common/internal/AbstractClientBuilder;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Lcom/huawei/hms/common/internal/ClientSettings;Lcom/huawei/hms/common/internal/BaseHmsClient$OnConnectionFailedListener;Lcom/huawei/hms/common/internal/BaseHmsClient$ConnectionCallbacks;)Lcom/huawei/hms/common/internal/AnyClient;
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/q;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/huawei/hms/analytics/q;-><init>(Landroid/content/Context;Lcom/huawei/hms/common/internal/ClientSettings;Lcom/huawei/hms/common/internal/BaseHmsClient$OnConnectionFailedListener;Lcom/huawei/hms/common/internal/BaseHmsClient$ConnectionCallbacks;)V

    return-object v0
.end method
