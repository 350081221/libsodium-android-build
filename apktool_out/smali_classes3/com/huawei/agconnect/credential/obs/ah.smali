.class public Lcom/huawei/agconnect/credential/obs/ah;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private backDomain:Ljava/util/List;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "backDomain"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/credential/obs/ae;",
            ">;"
        }
    .end annotation
.end field

.field private mainDomain:Ljava/util/List;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "mainDomain"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/credential/obs/ae;",
            ">;"
        }
    .end annotation
.end field

.field private ret:Lcom/huawei/agconnect/credential/obs/aa;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "ret"
    .end annotation
.end field

.field ttl:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Result;
        value = "ttl"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/agconnect/credential/obs/aa;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ah;->ret:Lcom/huawei/agconnect/credential/obs/aa;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/credential/obs/ae;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ah;->mainDomain:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/credential/obs/ae;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ah;->backDomain:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ah;->ttl:Ljava/lang/String;

    return-object v0
.end method
