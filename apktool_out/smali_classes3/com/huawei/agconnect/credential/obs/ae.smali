.class public Lcom/huawei/agconnect/credential/obs/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field domain:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "domain"
    .end annotation
.end field

.field siteCode:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "siteCode"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ae;->siteCode:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ae;->domain:Ljava/lang/String;

    return-object v0
.end method
