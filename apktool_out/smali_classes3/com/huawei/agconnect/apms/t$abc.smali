.class public final Lcom/huawei/agconnect/apms/t$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/t;->abc(Lcom/squareup/okhttp/Request;Lcom/huawei/agconnect/apms/fed;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/squareup/okhttp/Request;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/fed;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/Request;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/t$abc;->abc:Lcom/squareup/okhttp/Request;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/t$abc;->bcd:Lcom/huawei/agconnect/apms/fed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/t$abc;->abc:Lcom/squareup/okhttp/Request;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/huawei/agconnect/apms/t$abc;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/edc;->abc(Ljava/lang/String;Lcom/huawei/agconnect/apms/fed;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/huawei/agconnect/apms/t$abc;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, v0, Lcom/huawei/agconnect/apms/fed;->mlk:Z

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method
