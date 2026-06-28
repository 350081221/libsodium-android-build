.class public Lcom/huawei/agconnect/credential/obs/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private access_token:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "access_token"
    .end annotation
.end field

.field private expires_in:J
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "expires_in"
    .end annotation
.end field

.field private ret:Lcom/huawei/agconnect/credential/obs/aa;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "ret"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/z;->access_token:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiresIn()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/agconnect/credential/obs/z;->expires_in:J

    return-wide v0
.end method

.method public getRet()Lcom/huawei/agconnect/credential/obs/aa;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/z;->ret:Lcom/huawei/agconnect/credential/obs/aa;

    return-object v0
.end method
