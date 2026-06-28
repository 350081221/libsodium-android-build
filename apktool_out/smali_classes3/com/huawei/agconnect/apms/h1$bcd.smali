.class public Lcom/huawei/agconnect/apms/h1$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/h1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "bcd"
.end annotation


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/h1$abc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->cde()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/r1;->abc()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/r1;->cde()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
.end method
