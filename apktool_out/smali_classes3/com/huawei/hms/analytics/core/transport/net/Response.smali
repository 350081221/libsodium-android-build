.class public Lcom/huawei/hms/analytics/core/transport/net/Response;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private content:Ljava/lang/String;

.field private httpCode:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/huawei/hms/analytics/core/transport/net/Response;->httpCode:I

    iput-object p2, p0, Lcom/huawei/hms/analytics/core/transport/net/Response;->content:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/Response;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getHttpCode()I
    .locals 1

    iget v0, p0, Lcom/huawei/hms/analytics/core/transport/net/Response;->httpCode:I

    return v0
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/Response;->content:Ljava/lang/String;

    return-void
.end method

.method public setHttpCode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hms/analytics/core/transport/net/Response;->httpCode:I

    return-void
.end method
