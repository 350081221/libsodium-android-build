.class public Lcom/huawei/agconnect/https/Method$Get;
.super Lcom/huawei/agconnect/https/Method;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/https/Method;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Get"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<HttpsRequest:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/huawei/agconnect/https/Method;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(THttpsRequest;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/huawei/agconnect/https/Method;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/https/Method;->httpsRequest:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public create()Lokhttp3/Request$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/https/Method;->httpsRequest:Ljava/lang/Object;

    invoke-static {v0}, Lcom/huawei/agconnect/https/f;->a(Ljava/lang/Object;)Lcom/huawei/agconnect/https/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/https/f;->a()Lokhttp3/Request$Builder;

    move-result-object v0

    return-object v0
.end method
